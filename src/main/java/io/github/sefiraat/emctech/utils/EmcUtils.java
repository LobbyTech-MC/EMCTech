package io.github.sefiraat.emctech.utils;

import io.github.sefiraat.emctech.EmcTech;
import io.github.sefiraat.emctech.emc.EmcCalculator;
import io.github.sefiraat.emctech.managers.SupportedPluginManager;
import io.github.thebusybiscuit.slimefun4.api.items.SlimefunItem;
import io.github.thebusybiscuit.slimefun4.api.recipes.RecipeType;
import org.bukkit.inventory.ItemStack;

import javax.annotation.Nonnull;
import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

public final class EmcUtils {

    private EmcUtils() {
        throw new IllegalStateException("Utility class");
    }

    public static final NumberFormat EMC_FORMAT;
    public static final NumberFormat EMC_FORMAT_GUIDE = new DecimalFormat("#,###");

    public static final List<RecipeType> ALLOWABLE_RECIPE_TYPES = new ArrayList<>();

    static {
        EMC_FORMAT = NumberFormat.getCompactNumberInstance(Locale.ROOT, NumberFormat.Style.SHORT);
        EMC_FORMAT.setMinimumFractionDigits(2);
        EMC_FORMAT.setMaximumFractionDigits(2);

        ALLOWABLE_RECIPE_TYPES.add(RecipeType.ENHANCED_CRAFTING_TABLE);
        ALLOWABLE_RECIPE_TYPES.add(RecipeType.SMELTERY);
        ALLOWABLE_RECIPE_TYPES.add(RecipeType.GOLD_PAN);
        ALLOWABLE_RECIPE_TYPES.add(RecipeType.ORE_CRUSHER);
        ALLOWABLE_RECIPE_TYPES.add(RecipeType.ORE_WASHER);
        ALLOWABLE_RECIPE_TYPES.add(RecipeType.PRESSURE_CHAMBER);
        ALLOWABLE_RECIPE_TYPES.add(RecipeType.HEATED_PRESSURE_CHAMBER);
        ALLOWABLE_RECIPE_TYPES.add(RecipeType.COMPRESSOR);
        ALLOWABLE_RECIPE_TYPES.add(RecipeType.ANCIENT_ALTAR);
        ALLOWABLE_RECIPE_TYPES.add(RecipeType.MAGIC_WORKBENCH);
        ALLOWABLE_RECIPE_TYPES.add(RecipeType.REFINERY);
        ALLOWABLE_RECIPE_TYPES.add(RecipeType.GRIND_STONE);

        final EmcTech plugin = EmcTech.getInstance();

        if (SupportedPluginManager.isDankTech2()) {
            EmcUtils.addValidRecipeType(SlimefunItem.getById("DK2_PACK_1").getRecipeType());
            plugin.getLogger().info("正在添加来自 DankTech2 的配方");
        }
        if (SupportedPluginManager.isInfinityExpansion()) {
            EmcUtils.addValidRecipeType(SlimefunItem.getById("INFINITY_DUST_EXTRACTOR").getRecipeType());
            plugin.getLogger().info("正在添加来自 InfinityExpansion 的配方");
        }
    }

    public static boolean canEmc(@Nonnull ItemStack itemStack) {
        return !itemStack.hasItemMeta() || SlimefunItem.getByItem(itemStack) != null;
    }

    public static boolean hasEmcValue(@Nonnull ItemStack itemStack) {
        return getEmcValue(itemStack) > 0;
    }

    public static double getEmcValue(@Nonnull ItemStack itemStack) {
        final SlimefunItem slimefunItem = SlimefunItem.getByItem(itemStack);

        if (slimefunItem == null) {
            return EmcCalculator.getVanillaEmcValuesFiltered().getOrDefault(itemStack.getType().name(), 0.00);
        } else {
            return EmcCalculator.getSlimefunEmcValuesFiltered().getOrDefault(slimefunItem.getId(), 0.00);
        }
    }

    public static double getEmcValue(@Nonnull String string) {
        return EmcCalculator.getVanillaEmcValuesFiltered().getOrDefault(string, 0.00);
    }

    public static double getEmcValue(@Nonnull String string, boolean vanilla) {
        if (vanilla) {
            return EmcCalculator.getVanillaEmcValuesFiltered().getOrDefault(string, 0.00);
        } else {
            return EmcCalculator.getSlimefunEmcValuesFiltered().getOrDefault(string, 0.00);
        }
    }

    public static double getEmcValue(@Nonnull SlimefunItem slimefunItem) {
        return EmcCalculator.getSlimefunEmcValuesFiltered().getOrDefault(slimefunItem.getId(), 0.00);
    }

    public static double getEmcValueMultiplied(@Nonnull ItemStack itemStack) {
        final SlimefunItem slimefunItem = SlimefunItem.getByItem(itemStack);

        if (slimefunItem == null) {
            return EmcCalculator.getMultipliedVanillaEmcValuesFiltered().getOrDefault(itemStack.getType().name(), 0.00);
        } else {
            return EmcCalculator.getMultipliedSlimefunEmcValuesFiltered().getOrDefault(slimefunItem.getId(), 0.00);
        }
    }

    public static double getEmcValueMultiplied(@Nonnull String string) {
        return EmcCalculator.getMultipliedVanillaEmcValuesFiltered().getOrDefault(string, 0.00);
    }

    public static double getEmcValueMultiplied(@Nonnull String string, boolean vanilla) {
        if (vanilla) {
            return EmcCalculator.getMultipliedVanillaEmcValuesFiltered().getOrDefault(string, 0.00);
        } else {
            return EmcCalculator.getMultipliedSlimefunEmcValuesFiltered().getOrDefault(string, 0.00);
        }
    }

    public static double getEmcValueMultiplied(@Nonnull SlimefunItem slimefunItem) {
        return EmcCalculator.getMultipliedSlimefunEmcValuesFiltered().getOrDefault(slimefunItem.getId(), 0.00);
    }

    public static void addValidRecipeType(@Nonnull RecipeType recipeType) {
        ALLOWABLE_RECIPE_TYPES.add(recipeType);
    }

}
