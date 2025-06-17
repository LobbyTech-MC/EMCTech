package io.github.sefiraat.emctech;


import java.text.MessageFormat;
import java.util.logging.Level;

import javax.annotation.Nonnull;
import javax.annotation.Nullable;

import org.bstats.bukkit.Metrics;
import org.bukkit.plugin.PluginManager;
import org.bukkit.plugin.java.JavaPlugin;

import io.github.sefiraat.emctech.commands.EmcTechMain;
import io.github.sefiraat.emctech.emc.EmcCalculator;
import io.github.sefiraat.emctech.managers.ConfigManager;
import io.github.sefiraat.emctech.managers.ListenerManager;
import io.github.sefiraat.emctech.managers.RunnableManager;
import io.github.sefiraat.emctech.managers.SupportedPluginManager;
import io.github.sefiraat.emctech.slimefun.items.EmcItems;
import io.github.thebusybiscuit.slimefun4.api.SlimefunAddon;

import co.aikar.commands.PaperCommandManager;

import net.guizhanss.guizhanlibplugin.updater.GuizhanUpdater;

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

        if (!getServer().getPluginManager().isPluginEnabled("GuizhanLibPlugin")) {
            getLogger().log(Level.SEVERE, "本插件需要 鬼斩前置库插件(GuizhanLibPlugin) 才能运行!");
            getLogger().log(Level.SEVERE, "从此处下载: https://50L.cc/gzlib");
            getServer().getPluginManager().disablePlugin(this);
            return;
        }

        getLogger().info("########################################");
        getLogger().info("           EMCTech by Sefiraat          ");
        getLogger().info("     EMC科技 汉化：SlimefunGuguProject    ");
        getLogger().info("########################################");

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
            GuizhanUpdater.start(this, getFile(), this.username, this.repo, this.branch);
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
