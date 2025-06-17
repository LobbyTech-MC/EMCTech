package io.github.sefiraat.emctech.slimefun.items;

import org.bukkit.Material;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.inventory.ItemStack;

import io.github.sefiraat.emctech.utils.Theme;
import io.github.thebusybiscuit.slimefun4.api.items.SlimefunItemStack;
import io.github.thebusybiscuit.slimefun4.libraries.dough.collections.Pair;

import dev.sefiraat.sefilib.itemstacks.ItemStackGenerators;

public class EmcStacks {

    private EmcStacks() {
        throw new IllegalStateException("Utility class");
    }

    // Vanilla
    public static final ItemStack VANILLA_COAL = new ItemStack(Material.COAL);

    // Materials
    public static final SlimefunItemStack UNORTHODOX_COAL;
    public static final SlimefunItemStack UNORTHODOX_COAL_DUST;
    public static final SlimefunItemStack TIGHTLY_PACKED_UNORTHODOX_COAL;
    public static final SlimefunItemStack UNORTHODOX_COAL_BLOCK;
    public static final SlimefunItemStack DEVIANT_COAL;
    public static final SlimefunItemStack DEVIANT_COAL_DUST;
    public static final SlimefunItemStack TIGHTLY_PACKED_DEVIANT_COAL;
    public static final SlimefunItemStack DEVIANT_COAL_BLOCK;
    public static final SlimefunItemStack DIVERGENT_COAL;
    public static final SlimefunItemStack DIVERGENT_COAL_DUST;
    public static final SlimefunItemStack TIGHTLY_PACKED_DIVERGENT_COAL;
    public static final SlimefunItemStack DIVERGENT_COAL_BLOCK;
    public static final SlimefunItemStack ANOMALOUS_COAL;
    public static final SlimefunItemStack ANOMALOUS_COAL_DUST;
    public static final SlimefunItemStack TIGHTLY_PACKED_ANOMALOUS_COAL;
    public static final SlimefunItemStack ANOMALOUS_COAL_BLOCK;
    public static final SlimefunItemStack PERFECTED_COAL;

    // Components
    public static final SlimefunItemStack UNORTHODOX_FRAME;
    public static final SlimefunItemStack DEVIANT_FRAME;
    public static final SlimefunItemStack DIVERGENT_FRAME;
    public static final SlimefunItemStack ANOMALOUS_FRAME;
    public static final SlimefunItemStack PERFECTED_FRAME;
    public static final SlimefunItemStack UNORTHODOX_MACHINE_FRAME;
    public static final SlimefunItemStack DEVIANT_MACHINE_FRAME;
    public static final SlimefunItemStack DIVERGENT_MACHINE_FRAME;
    public static final SlimefunItemStack ANOMALOUS_MACHINE_FRAME;
    public static final SlimefunItemStack PERFECTED_MACHINE_FRAME;

    // Machines
    public static final SlimefunItemStack EMC_DEMATERIALIZER_1;
    public static final SlimefunItemStack EMC_DEMATERIALIZER_2;
    public static final SlimefunItemStack EMC_DEMATERIALIZER_3;
    public static final SlimefunItemStack EMC_DEMATERIALIZER_4;
    public static final SlimefunItemStack EMC_DEMATERIALIZER_5;

    public static final SlimefunItemStack EMC_MATERIALIZER_1;
    public static final SlimefunItemStack EMC_MATERIALIZER_2;
    public static final SlimefunItemStack EMC_MATERIALIZER_3;
    public static final SlimefunItemStack EMC_MATERIALIZER_4;
    public static final SlimefunItemStack EMC_MATERIALIZER_5;

    public static final SlimefunItemStack EMC_NETWORK_MATERIALIZER;

    static {

        // region Crafting Materials

        UNORTHODOX_COAL = Theme.themedSlimefunItemStack(
            "ETC_UNORTHODOX_COAL",
            ItemStackGenerators.createEnchantedItemStack(Material.COAL, true, new Pair<>(Enchantment.LURE, 1)),
            Theme.CRAFTING,
            "奇怪的煤炭",
            "这种煤炭的分子进行了重组.",
            "似乎只有一点点的能量."
        );

        UNORTHODOX_COAL_DUST = Theme.themedSlimefunItemStack(
            "ETC_UNORTHODOX_COAL_DUST",
            ItemStackGenerators.createEnchantedItemStack(Material.GUNPOWDER, true, new Pair<>(Enchantment.LURE, 1)),
            Theme.CRAFTING,
            "奇怪的煤炭粉",
            "将奇怪的煤炭碾碎成粉."
        );

        TIGHTLY_PACKED_UNORTHODOX_COAL = Theme.themedSlimefunItemStack(
            "ETC_TIGHTLY_PACKED_UNORTHODOX_COAL",
            ItemStackGenerators.createEnchantedItemStack(
                Material.POLISHED_BLACKSTONE_BUTTON,
                true,
                new Pair<>(Enchantment.LURE, 1)
            ),
            Theme.CRAFTING,
            "奇怪的煤炭粉 (已压缩)",
            "紧密压缩后的奇怪的煤炭."
        );

        UNORTHODOX_COAL_BLOCK = Theme.themedSlimefunItemStack(
            "ETC_UNORTHODOX_COAL_BLOCK",
            ItemStackGenerators.createEnchantedItemStack(Material.COAL_BLOCK, true, new Pair<>(Enchantment.LURE, 1)),
            Theme.CRAFTING,
            "奇怪的煤炭块",
            "一整块奇怪的煤炭."
        );

        DEVIANT_COAL = Theme.themedSlimefunItemStack(
            "ETC_DEVIANT_COAL",
            ItemStackGenerators.createEnchantedItemStack(Material.COAL, true, new Pair<>(Enchantment.LURE, 1)),
            Theme.CRAFTING,
            "不正常的煤炭",
            "这种煤炭的分子进行了重组.",
            "你可以感受到其中微弱的能量."
        );

        DEVIANT_COAL_DUST = Theme.themedSlimefunItemStack(
            "ETC_DEVIANT_COAL_DUST",
            ItemStackGenerators.createEnchantedItemStack(Material.GUNPOWDER, true, new Pair<>(Enchantment.LURE, 1)),
            Theme.CRAFTING,
            "不正常的煤炭粉",
            "将不正常的煤炭碾碎成粉."
        );

        TIGHTLY_PACKED_DEVIANT_COAL = Theme.themedSlimefunItemStack(
            "ETC_TIGHTLY_PACKED_DEVIANT_COAL",
            ItemStackGenerators.createEnchantedItemStack(
                Material.POLISHED_BLACKSTONE_BUTTON,
                true,
                new Pair<>(Enchantment.LURE, 1)
            ),
            Theme.CRAFTING,
            "不正常的煤炭粉 (已压缩)",
            "紧密压缩后的不正常的煤炭."
        );

        DEVIANT_COAL_BLOCK = Theme.themedSlimefunItemStack(
            "ETC_DEVIANT_COAL_BLOCK",
            ItemStackGenerators.createEnchantedItemStack(Material.COAL_BLOCK, true, new Pair<>(Enchantment.LURE, 1)),
            Theme.CRAFTING,
            "不正常的煤炭块",
            "一整块不正常的煤炭."
        );

        DIVERGENT_COAL = Theme.themedSlimefunItemStack(
            "ETC_DIVERGENT_COAL",
            ItemStackGenerators.createEnchantedItemStack(Material.COAL, true, new Pair<>(Enchantment.LURE, 1)),
            Theme.CRAFTING,
            "发散的煤炭",
            "这种煤炭的分子进行了重组.",
            "你可以感受到其中强大的能量."
        );

        DIVERGENT_COAL_DUST = Theme.themedSlimefunItemStack(
            "ETC_DIVERGENT_COAL_DUST",
            ItemStackGenerators.createEnchantedItemStack(Material.GUNPOWDER, true, new Pair<>(Enchantment.LURE, 1)),
            Theme.CRAFTING,
            "发散的煤炭粉",
            "将发散的煤炭碾碎成粉."
        );

        TIGHTLY_PACKED_DIVERGENT_COAL = Theme.themedSlimefunItemStack(
            "ETC_TIGHTLY_PACKED_DIVERGENT_COAL",
            ItemStackGenerators.createEnchantedItemStack(
                Material.POLISHED_BLACKSTONE_BUTTON,
                true,
                new Pair<>(Enchantment.LURE, 1)
            ),
            Theme.CRAFTING,
            "发散的煤炭粉 (已压缩)",
            "紧密压缩后的发散的煤炭."
        );

        DIVERGENT_COAL_BLOCK = Theme.themedSlimefunItemStack(
            "ETC_DIVERGENT_COAL_BLOCK",
            ItemStackGenerators.createEnchantedItemStack(Material.COAL_BLOCK, true, new Pair<>(Enchantment.LURE, 1)),
            Theme.CRAFTING,
            "发散的煤炭块",
            "一整块发散的煤炭."
        );

        ANOMALOUS_COAL = Theme.themedSlimefunItemStack(
            "ETC_ANOMALOUS_COAL",
            ItemStackGenerators.createEnchantedItemStack(Material.COAL, true, new Pair<>(Enchantment.LURE, 1)),
            Theme.CRAFTING,
            "异常的煤炭",
            "这种煤炭的分子进行了重组.",
            "你可以感受到其中非常强大的能量."
        );

        ANOMALOUS_COAL_DUST = Theme.themedSlimefunItemStack(
            "ETC_ANOMALOUS_COAL_DUST",
            ItemStackGenerators.createEnchantedItemStack(Material.GUNPOWDER, true, new Pair<>(Enchantment.LURE, 1)),
            Theme.CRAFTING,
            "异常的煤炭粉",
            "将异常的煤炭碾碎成粉."
        );

        TIGHTLY_PACKED_ANOMALOUS_COAL = Theme.themedSlimefunItemStack(
            "ETC_TIGHTLY_PACKED_ANOMALOUS_COAL",
            ItemStackGenerators.createEnchantedItemStack(
                Material.POLISHED_BLACKSTONE_BUTTON,
                true,
                new Pair<>(Enchantment.LURE, 1)
            ),
            Theme.CRAFTING,
            "异常的煤炭粉 (已压缩)",
            "紧密压缩后的异常的煤炭."
        );

        ANOMALOUS_COAL_BLOCK = Theme.themedSlimefunItemStack(
            "ETC_ANOMALOUS_COAL_BLOCK",
            ItemStackGenerators.createEnchantedItemStack(Material.COAL_BLOCK, true, new Pair<>(Enchantment.LURE, 1)),
            Theme.CRAFTING,
            "异常的煤炭块",
            "一整块异常的煤炭."
        );

        PERFECTED_COAL = Theme.themedSlimefunItemStack(
            "ETC_PERFECTED_COAL",
            ItemStackGenerators.createEnchantedItemStack(Material.COAL, true, new Pair<>(Enchantment.LURE, 1)),
            Theme.CRAFTING,
            "完美的煤炭",
            "这种煤炭的分子进行了重组.",
            "其中的能量已经被隐藏起来."
        );

        // endregion

        // region Components

        UNORTHODOX_FRAME = Theme.themedSlimefunItemStack(
            "ETC_UNORTHADOX_FRAME",
            new ItemStack(Material.BLACK_STAINED_GLASS),
            Theme.CRAFTING,
            "奇怪的框架",
            "一个简易的框架",
            "可用于制作置换机器"
        );

        DEVIANT_FRAME = Theme.themedSlimefunItemStack(
            "ETC_DEVIANT_FRAME",
            new ItemStack(Material.BLACK_STAINED_GLASS),
            Theme.CRAFTING,
            "不正常的框架",
            "一个简易的框架",
            "可用于制作置换机器"
        );

        DIVERGENT_FRAME = Theme.themedSlimefunItemStack(
            "ETC_DIVERGENT_FRAME",
            new ItemStack(Material.BLACK_STAINED_GLASS),
            Theme.CRAFTING,
            "发散的框架",
            "一个进阶的框架",
            "可用于制作置换机器"
        );

        ANOMALOUS_FRAME = Theme.themedSlimefunItemStack(
            "ETC_ANOMALOUS_FRAME",
            new ItemStack(Material.BLACK_STAINED_GLASS),
            Theme.CRAFTING,
            "异常的框架",
            "一个高级的框架",
            "可用于制作置换机器"
        );

        PERFECTED_FRAME = Theme.themedSlimefunItemStack(
            "ETC_PERFECTED_FRAME",
            new ItemStack(Material.BLACK_STAINED_GLASS),
            Theme.CRAFTING,
            "完美的框架",
            "一个完美的框架",
            "可用于制作置换机器"
        );

        UNORTHODOX_MACHINE_FRAME = Theme.themedSlimefunItemStack(
            "ETC_UNORTHADOX_MACHINE_FRAME",
            new ItemStack(Material.BLUE_STAINED_GLASS),
            Theme.CRAFTING,
            "奇怪的机器框架",
            "一个简易的机器框架",
            "适合制作置换机器"
        );

        DEVIANT_MACHINE_FRAME = Theme.themedSlimefunItemStack(
            "ETC_DEVIANT_MACHINE_FRAME",
            new ItemStack(Material.BLUE_STAINED_GLASS),
            Theme.CRAFTING,
            "不正常的机器框架",
            "一个简易的机器框架",
            "适合制作置换机器"
        );

        DIVERGENT_MACHINE_FRAME = Theme.themedSlimefunItemStack(
            "ETC_DIVERGENT_MACHINE_FRAME",
            new ItemStack(Material.BLUE_STAINED_GLASS),
            Theme.CRAFTING,
            "发散的机器框架",
            "一个进阶的机器框架",
            "适合制作置换机器"
        );

        ANOMALOUS_MACHINE_FRAME = Theme.themedSlimefunItemStack(
            "ETC_ANOMALOUS_MACHINE_FRAME",
            new ItemStack(Material.BLUE_STAINED_GLASS),
            Theme.CRAFTING,
            "异常的机器框架",
            "一个高级的机器框架",
            "适合制作置换机器"
        );

        PERFECTED_MACHINE_FRAME = Theme.themedSlimefunItemStack(
            "ETC_PERFECTED_MACHINE_FRAME",
            new ItemStack(Material.BLUE_STAINED_GLASS),
            Theme.CRAFTING,
            "完美的机器框架",
            "一个完美的机器框架",
            "适合制作置换机器"
        );

        // endregion

        // region Machines

        EMC_DEMATERIALIZER_1 = Theme.themedSlimefunItemStack(
            "ETC_DEMATERIALIZER_1",
            new ItemStack(Material.LIGHT_GRAY_WOOL),
            Theme.MACHINE,
            "解构机 ➊",
            "这个机器可以缓慢地解构物品",
            "并将获得的EMC存入玩家的EMC池中",
            "",
            Theme.CLICK_INFO.applyAsTitle("速率", "1 物品 / 5 粘液刻"),
            Theme.CLICK_INFO.applyAsTitle("可存储", "1,000 J"),
            Theme.CLICK_INFO.applyAsTitle("电力消耗", "物品的EMC值 / 10")
        );

        EMC_DEMATERIALIZER_2 = Theme.themedSlimefunItemStack(
            "ETC_DEMATERIALIZER_2",
            new ItemStack(Material.LIME_WOOL),
            Theme.MACHINE,
            "解构机 ➋",
            "这个机器可以缓慢地解构物品",
            "并将获得的EMC存入玩家的EMC池中",
            "",
            Theme.CLICK_INFO.applyAsTitle("速率", "1 物品 / 4 粘液刻"),
            Theme.CLICK_INFO.applyAsTitle("可存储", "10,000 J"),
            Theme.CLICK_INFO.applyAsTitle("电力消耗", "物品的EMC值 / 10")
        );

        EMC_DEMATERIALIZER_3 = Theme.themedSlimefunItemStack(
            "ETC_DEMATERIALIZER_3",
            new ItemStack(Material.LIGHT_BLUE_WOOL),
            Theme.MACHINE,
            "解构机 ➌",
            "这个机器可以缓慢地解构物品",
            "并将获得的EMC存入玩家的EMC池中",
            "",
            Theme.CLICK_INFO.applyAsTitle("速率", "1 物品 / 3 粘液刻"),
            Theme.CLICK_INFO.applyAsTitle("可存储", "100,000 J"),
            Theme.CLICK_INFO.applyAsTitle("电力消耗", "物品的EMC值 / 10")
        );

        EMC_DEMATERIALIZER_4 = Theme.themedSlimefunItemStack(
            "ETC_DEMATERIALIZER_4",
            new ItemStack(Material.PURPLE_WOOL),
            Theme.MACHINE,
            "解构机 ➍",
            "这个机器可以缓慢地解构物品",
            "并将获得的EMC存入玩家的EMC池中",
            "",
            Theme.CLICK_INFO.applyAsTitle("速率", "1 物品 / 2 粘液刻"),
            Theme.CLICK_INFO.applyAsTitle("可存储", "1,000,000 J"),
            Theme.CLICK_INFO.applyAsTitle("电力消耗", "物品的EMC值 / 10")
        );

        EMC_DEMATERIALIZER_5 = Theme.themedSlimefunItemStack(
            "ETC_DEMATERIALIZER_5",
            new ItemStack(Material.RED_WOOL),
            Theme.MACHINE,
            "解构机 ➎",
            "这个机器可以缓慢地解构物品",
            "并将获得的EMC存入玩家的EMC池中",
            "",
            Theme.CLICK_INFO.applyAsTitle("速率", "1 物品 / 粘液刻"),
            Theme.CLICK_INFO.applyAsTitle("可存储", "10,000,000 J"),
            Theme.CLICK_INFO.applyAsTitle("电力消耗", "物品的EMC值 / 10 (不超过电容量上限)")
        );

        EMC_MATERIALIZER_1 = Theme.themedSlimefunItemStack(
            "ETC_MATERIALIZER_1",
            new ItemStack(Material.LIGHT_GRAY_CONCRETE),
            Theme.MACHINE,
            "重构机 ➊",
            "这个机器可以缓慢地重构物品",
            "将消耗玩家的EMC池.",
            "",
            Theme.CLICK_INFO.applyAsTitle("速率", "1 物品 / 5 粘液刻"),
            Theme.CLICK_INFO.applyAsTitle("可存储", "1,000 J"),
            Theme.CLICK_INFO.applyAsTitle("电力消耗", "物品的EMC值")
        );

        EMC_MATERIALIZER_2 = Theme.themedSlimefunItemStack(
            "ETC_MATERIALIZER_2",
            new ItemStack(Material.LIME_CONCRETE),
            Theme.MACHINE,
            "重构机 ➋",
            "这个机器可以缓慢地重构物品",
            "将消耗玩家的EMC池.",
            "",
            Theme.CLICK_INFO.applyAsTitle("速率", "1 物品 / 4 粘液刻"),
            Theme.CLICK_INFO.applyAsTitle("可存储", "10,000 J"),
            Theme.CLICK_INFO.applyAsTitle("电力消耗", "物品的EMC值")
        );

        EMC_MATERIALIZER_3 = Theme.themedSlimefunItemStack(
            "ETC_MATERIALIZER_3",
            new ItemStack(Material.LIGHT_BLUE_CONCRETE),
            Theme.MACHINE,
            "重构机 ➌",
            "这个机器可以缓慢地重构物品",
            "将消耗玩家的EMC池.",
            "",
            Theme.CLICK_INFO.applyAsTitle("速率", "1 物品 / 3 粘液刻"),
            Theme.CLICK_INFO.applyAsTitle("可存储", "100,000 J"),
            Theme.CLICK_INFO.applyAsTitle("电力消耗", "物品的EMC值")
        );

        EMC_MATERIALIZER_4 = Theme.themedSlimefunItemStack(
            "ETC_MATERIALIZER_4",
            new ItemStack(Material.PURPLE_CONCRETE),
            Theme.MACHINE,
            "重构机 ➍",
            "这个机器可以缓慢地重构物品",
            "将消耗玩家的EMC池.",
            "",
            Theme.CLICK_INFO.applyAsTitle("速率", "1 物品 / 2 粘液刻"),
            Theme.CLICK_INFO.applyAsTitle("可存储", "1,000,000 J"),
            Theme.CLICK_INFO.applyAsTitle("电力消耗", "物品的EMC值")
        );

        EMC_MATERIALIZER_5 = Theme.themedSlimefunItemStack(
            "ETC_MATERIALIZER_5",
            new ItemStack(Material.RED_CONCRETE),
            Theme.MACHINE,
            "重构机 ➎",
            "这个机器可以缓慢地重构物品",
            "将消耗玩家的EMC池.",
            "",
            Theme.CLICK_INFO.applyAsTitle("速率", "1 物品 / 粘液刻"),
            Theme.CLICK_INFO.applyAsTitle("可存储", "10,000,000 J"),
            Theme.CLICK_INFO.applyAsTitle("电力消耗", "物品的EMC值 (不超过电容量上限)")
        );

        EMC_NETWORK_MATERIALIZER = Theme.themedSlimefunItemStack(
            "ETC_NETWORK_MATERIALIZER",
            new ItemStack(Material.YELLOW_STAINED_GLASS),
            Theme.MACHINE,
            "网络 EMC 重构机",
            "这个机器可以缓慢地重构物品",
            "将消耗玩家的EMC池.",
            "",
            "生成的物品在网络中可见",
            "但不会自动存入网络",
            "",
            Theme.CLICK_INFO.applyAsTitle("速率", "1 物品 / 粘液刻"),
            Theme.CLICK_INFO.applyAsTitle("可存储", "10,000,000 J"),
            Theme.CLICK_INFO.applyAsTitle("电力消耗", "物品的EMC值 (不超过电容量上限)")
        );

        // endregion
    }
}
