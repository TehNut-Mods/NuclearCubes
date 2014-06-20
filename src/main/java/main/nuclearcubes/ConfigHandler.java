package main.nuclearcubes;

import net.minecraftforge.common.config.Configuration;

public class ConfigHandler {

	//Categories
	public static String general = "1 - General";
	public static String recipes = "2 - Recipes";
	public static String worldgen = "3 - World Generation";
	public static String humor = "4 - Humor";
	public static String debug = "5 - Debug";

	//Options
	public static boolean enableWorldGen;
	public static boolean enableWorldGenInNegativeDimensions;

	public static boolean registerCoalFurnaceRecipe;
	public static boolean registerCharcoalFurnaceRecipe;
	public static boolean registerCoalCraftingRecipe;
	public static boolean registerCharcoalCraftingRecipe;
	public static boolean registerYelloriteSmeltToUranium;

	public static boolean useSteelForIron;
	public static boolean useExpensiveGlass;

	public static boolean enableCyaniteFromYelloriumRecipe;

	public static boolean enableCapes;
	public static boolean useHighResTextures;
	public static boolean useConnectedTextures;

	public static boolean enablePlayerEffects;
	public static boolean registerOwnSteam;

	public static boolean steamySteam;
	public static boolean aprilFools;

	public static boolean showOredictTooltips;
	public static boolean enableDebugTools;

	public static void init(Configuration config) {
		config.load();

		enableWorldGen = config.get(worldgen, "enableWorldGen", true, "If false, disables all world gen from Big Reactors; all other worldgen settings are automatically overridden [DEFAULT- TRUE]").getBoolean(enableWorldGen);
		enableWorldGenInNegativeDimensions = config.get(worldgen, "enableWorldGenInNegativeDims", false, "Run BR world generation in negative dimension IDs? If you don't know what this is, leave it alone. [DEFAULT- FALSE]").getBoolean(enableWorldGenInNegativeDimensions);

		registerCoalFurnaceRecipe = config.get(recipes, "registerCoalForSmelting", true, "If set, coal will be smeltable into graphite bars. Disable this if other mods need to smelt coal into their own products. [DEFAULT- TRUE]").getBoolean(registerCoalFurnaceRecipe);
		registerCharcoalFurnaceRecipe = config.get(recipes, "registerCharcoalForSmelting", true, "If set, charcoal will be smeltable into graphite bars. Disable this if other mods need to smelt charcoal into their own products. [DEFAULT- TRUE]").getBoolean(registerCharcoalFurnaceRecipe);
		registerCoalCraftingRecipe = config.get(recipes, "registerGraphiteCoalCraftingRecipes", false, "If set, graphite bars can be crafted from 2 gravel, 1 coal. Use this if other mods interfere with the smelting recipe. [DEFAULT- FALSE]").getBoolean(registerCoalCraftingRecipe);
		registerCharcoalCraftingRecipe = config.get(recipes, "registerGraphiteCharcoalCraftingRecipes", false, "If set, graphite bars can be crafted from 2 gravel, 1 charcoal. Use this if other mods interfere with the smelting recipe. [DEFAULT- FALSE]").getBoolean(registerCharcoalCraftingRecipe);
		registerYelloriteSmeltToUranium = config.get(recipes, "registerYelloriteSmeltToUranium", false, "If set, yellorite ore will smelt into whichever item is registered as ingotUranium in the ore dictionary. If false, it will smelt into ingotYellorium. [DEFAULT- FALSE]").getBoolean(registerYelloriteSmeltToUranium);

		useSteelForIron = config.get(recipes, "requireSteelInsteadOfIron", false, "If set, then all Big Reactors components will require steel ingots (ingotSteel) in place of iron ingots. Will be ignored if no other mod registers steel ingots. [DEFAULT- FALSE]").getBoolean(useSteelForIron);
		useExpensiveGlass = config.get(recipes, "requireObsidianGlass", false, "If set, then Big Reactors will require hardened or reinforced glass (glassHardened or glassReinforced) instead of plain glass. Will be ignored if no other mod registers those glass types. [DEFAULT- FALSE]").getBoolean(useExpensiveGlass);

		enableCyaniteFromYelloriumRecipe = config.get(recipes, "enableCyaniteFromYelloriumRecipe", true, "If set, cyanite will be craftable from yellorium ingots and sand. [DEFAULT- TRUE]").getBoolean(enableCyaniteFromYelloriumRecipe);

		enableCapes = config.get(general, "enableCapes", true, "Enable capes for developers/contributors. You should really only disable this if there is a conflicting cape. Or you find them annoying... Or whatever.").getBoolean(enableCapes);
		useHighResTextures = config.get(general, "useHighResTextures", true, "Enable 32x32 textures. Else enable 16x16 textures. Change to false on slower computers. [DEFAULT- TRUE]").getBoolean(useHighResTextures);
		useConnectedTextures = config.get(general, "useConnectedTextures", true, "Enable connected textures for (non-)multiblock blocks. [DEFAULT- TRUE]").getBoolean(useConnectedTextures);

		enablePlayerEffects = config.get(general, "enablePlayerEffects", true, "Negative effects given to player if they enter a radiation zone. [DEFAULT- TRUE]").getBoolean(enablePlayerEffects);
		registerOwnSteam = config.get(general, "registerOwnSteam", true, "Register BR steam if nothing else adds Steam. [DEFAULT- TRUE]").getBoolean(registerOwnSteam);

		steamySteam = config.get(humor, "steamySteam", false, "Steamify your steam [DEFAULT- FALSE]").getBoolean(steamySteam);
		aprilFools = config.get(humor, "trolololol", true, "trololololololololollolololololololloollololololololololol [does nothing... yet... [DEFAULT- TRUE]").getBoolean(aprilFools);

		showOredictTooltips = config.get(debug, "showOredictTooltips", false, "For debugging porpoises. Adds tooltips to all registered items with their OreDictionary entry. [CURRENTLY BROKEN] [DEFAULT- FALSE]").getBoolean(showOredictTooltips);
		enableDebugTools = config.get(debug, "enableDebugTools", false, "For debugging porpoises. Adds some blocks/items for easy testing. [DEFAULT- FALSE]").getBoolean(enableDebugTools);

		if (config.hasChanged()) {
			config.save();
		}
	}
}
