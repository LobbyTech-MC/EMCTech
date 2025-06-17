package io.github.sefiraat.emctech.utils;

import java.text.MessageFormat;

import javax.annotation.Nonnull;
import javax.annotation.ParametersAreNonnullByDefault;

import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;

import io.github.thebusybiscuit.slimefun4.libraries.dough.items.CustomItemStack;

import dev.sefiraat.sefilib.string.TextUtils;
import net.md_5.bungee.api.ChatColor;

public final class GuiElements {

    private GuiElements() {
        throw new IllegalStateException("Utility class");
    }

    public static final ItemStack TEMPLATE_BACKGROUND = new CustomItemStack(
        Material.BLACK_STAINED_GLASS_PANE,
        Theme.PASSIVE + "模版物品",
        Theme.PASSIVE + "符合模版的物品才会被机器或货运处理"
    );

    public static final ItemStack TEMPLATE_INPUT_CARGO = new CustomItemStack(
        Material.BLUE_STAINED_GLASS_PANE,
        Theme.PASSIVE + "输入",
        Theme.PASSIVE + "在这里放入物品",
        Theme.PASSIVE + "可以接收来自货运的输入"
    );

    public static final ItemStack TEMPLATE_INPUT_NO_CARGO = new CustomItemStack(
        Material.BLUE_STAINED_GLASS_PANE,
        Theme.PASSIVE + "输入",
        Theme.PASSIVE + "在这里放入物品",
        Theme.PASSIVE + "无法接收来自货运的输入"
    );

    public static final ItemStack TEMPLATE_OUTPUT_CARGO = new CustomItemStack(
        Material.ORANGE_STAINED_GLASS_PANE,
        Theme.PASSIVE + "输出",
        Theme.PASSIVE + "物品将在这里输出",
        Theme.PASSIVE + "可通过货运取出"
    );

    public static final ItemStack TEMPLATE_OUTPUT_NO_CARGO = new CustomItemStack(
        Material.ORANGE_STAINED_GLASS_PANE,
        Theme.PASSIVE + "输出",
        Theme.PASSIVE + "物品将在这里输出",
        Theme.PASSIVE + "无法通过货运取出."
    );

    public static final ItemStack INFO_NOT_WORKING = new CustomItemStack(
        Material.RED_STAINED_GLASS_PANE,
        Theme.PASSIVE + "未运行",
        Theme.PASSIVE + "该机器不在运行."
    );

    public static final ItemStack INFO_INVALID_ITEM = new CustomItemStack(
        Material.ORANGE_STAINED_GLASS_PANE,
        Theme.PASSIVE + "无效的物品",
        Theme.PASSIVE + "该物品无法与EMC转换."
    );

    public static final ItemStack INFO_UNLEARNED_ITEM = new CustomItemStack(
        Material.ORANGE_STAINED_GLASS_PANE,
        Theme.PASSIVE + "未解锁物品",
        Theme.PASSIVE + "该物品暂未解锁."
    );

    public static final ItemStack INFO_PLAYER_OFFLINE = new CustomItemStack(
        Material.ORANGE_STAINED_GLASS_PANE,
        Theme.PASSIVE + "机器拥有者离线",
        Theme.PASSIVE + "该机器的拥有者不在线."
    );

    public static ItemStack getWorkingOnIcon(@Nonnull String name,
                                             double emcValue,
                                             int powerRequirement,
                                             int currentPower
    ) {
        return new CustomItemStack(
            Material.GREEN_STAINED_GLASS_PANE,
            Theme.PASSIVE + "正在运行",
            Theme.CLICK_INFO.applyAsTitle("物品", name),
            Theme.CLICK_INFO.applyAsTitle("EMC值", emcValue),
            Theme.CLICK_INFO.applyAsTitle("每次操作所需电力", powerRequirement),
            Theme.CLICK_INFO.applyAsTitle("已存储电力", currentPower)
        );
    }

    @ParametersAreNonnullByDefault
    public static ItemStack getItemLearnedIcon(@Nonnull ItemStack itemStack,
                                               @Nonnull String name,
                                               double emcValue,
                                               double emcValueLarge
    ) {
        return new CustomItemStack(
            itemStack,
            Theme.SUCCESS + name,
            Theme.CLICK_INFO.applyAsTitle("EMC（解构）", EmcUtils.EMC_FORMAT_GUIDE.format(emcValue)),
            Theme.CLICK_INFO.applyAsTitle("EMC（重构）", EmcUtils.EMC_FORMAT_GUIDE.format(emcValueLarge))
        );
    }

    @ParametersAreNonnullByDefault
    public static ItemStack getItemLearnedIcon(@Nonnull Material material,
                                               @Nonnull String name,
                                               double emcValue,
                                               double emcValueLarge
    ) {
        return new CustomItemStack(
            material,
            Theme.SUCCESS + TextUtils.toTitleCase(name),
            Theme.CLICK_INFO.applyAsTitle("EMC（解构）", EmcUtils.EMC_FORMAT_GUIDE.format(emcValue)),
            Theme.CLICK_INFO.applyAsTitle("EMC（重构）", EmcUtils.EMC_FORMAT_GUIDE.format(emcValueLarge))
        );
    }

    @ParametersAreNonnullByDefault
    public static ItemStack getItemNotLearnedIcon(@Nonnull String name) {
        return new CustomItemStack(
            Material.BARRIER,
            Theme.ERROR + name,
            MessageFormat.format("{0}{1}未解锁", Theme.RESEARCH.getColor(), ChatColor.BOLD),
            Theme.ERROR + "该物品暂未解锁."
        );
    }

}
