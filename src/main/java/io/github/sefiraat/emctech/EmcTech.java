package io.github.sefiraat.emctech;


import java.text.MessageFormat;

import javax.annotation.Nonnull;
import javax.annotation.Nullable;

import org.bstats.bukkit.Metrics;
import org.bukkit.plugin.PluginManager;
import org.bukkit.plugin.java.JavaPlugin;

import co.aikar.commands.PaperCommandManager;
import io.github.sefiraat.emctech.commands.EmcTechMain;
import io.github.sefiraat.emctech.emc.EmcCalculator;
import io.github.sefiraat.emctech.managers.ConfigManager;
import io.github.sefiraat.emctech.managers.ListenerManager;
import io.github.sefiraat.emctech.managers.RunnableManager;
import io.github.sefiraat.emctech.managers.SupportedPluginManager;
import io.github.sefiraat.emctech.slimefun.items.EmcItems;
import io.github.thebusybiscuit.slimefun4.api.SlimefunAddon;
import net.guizhanss.guizhanlib.updater.GuizhanBuildsUpdater;

public class EmcTech extends JavaPlugin implements SlimefunAddon {
    private static EmcTech instance;

    private final String username;
    private final String repo;
    private final String branch;

    private ConfigManager configManager;
    private ListenerManager listenerManager;
    private SupportedPluginManager supportedPluginManager;
    private RunnableManager runnableManager;
    private PaperCommandManager commandManager;

    public EmcTech() {
        this.username = "SlimefunGuguProject";
        this.repo = "EMCTech";
        this.branch = "master";
    }

    @Override
    public void onEnable() {
        instance = this;

        getLogger().info("##########################################");
        getLogger().info("     EMCTech              EMC科技          ");
        getLogger().info(" 作者: Sefiraat 汉化: SlimefunGuguProject   ");
        getLogger().info("##########################################");

        saveDefaultConfig();
        tryUpdate();

        this.configManager = new ConfigManager();
        this.supportedPluginManager = new SupportedPluginManager();
        this.runnableManager = new RunnableManager();
        this.commandManager = new PaperCommandManager(this);

        commandManager.registerCommand(new EmcTechMain());

        EmcItems.setup();
        EmcCalculator.setup();
        setupBstats();
    }

    @Override
    public void onDisable() {
        ConfigManager.getInstance().saveAll();
    }

    public void tryUpdate() {
        if (getConfig().getBoolean("auto-update")
            && getDescription().getVersion().startsWith("Build")
        ) {
            new GuizhanBuildsUpdater(this, getFile(), this.username, this.repo, this.branch, false, "zh-CN").start();
        }
    }

    @Nonnull
    @Override
    public JavaPlugin getJavaPlugin() {
        return this;
    }

    @Nullable
    @Override
    public String getBugTrackerURL() {
        return MessageFormat.format("https://github.com/{0}/{1}/issues/", this.username, this.repo);
    }

    private void setupBstats() {
        Metrics metrics = new Metrics(this, 15351);
    }

    public static EmcTech getInstance() {
        return EmcTech.instance;
    }

    @Nonnull
    public static PluginManager getPluginManager() {
        return EmcTech.getInstance().getServer().getPluginManager();
    }

    public static ConfigManager getConfigManager() {
        return EmcTech.getInstance().configManager;
    }

    public static ListenerManager getListenerManager() {
        return EmcTech.getInstance().listenerManager;
    }

    public static SupportedPluginManager getSupportedPluginManager() {
        return EmcTech.getInstance().supportedPluginManager;
    }

    public static RunnableManager getRunnableManager() {
        return EmcTech.getInstance().runnableManager;
    }
}
