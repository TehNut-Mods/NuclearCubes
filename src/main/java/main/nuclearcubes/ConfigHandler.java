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

		enableWorldGen = config.get(worldgen, "enableWorldGen", true, "If false, disables all world gen from Big Reactors; all other worldgen settings are automatically overridden [DEFAULT- TRUE]").getBoolean(true);
		enableWorldGenInNegativeDimensions = config.get(worldgen, "enableWorldGenInNegativeDims", false, "Run BR world generation in negative dimension IDs? If you don't know what this is, leave it alone. [DEFAULT- FALSE]").getBoolean(false);
//		enableWorldRegeneration = config.get(worldgen, "enableWorldRegeneration", false, "Run BR World Generation in chunks that have already been generated, but have not been modified by Big Reactors before. This is largely useful for worlds that existed before NuclearCubes was released.").getBoolean(false);
//		userWorldGenVersion = config.get(worldgen, "userWorldGenVersion", 0, "User-set world generation version. Increase this by 1 if you want Big Reactors to re-run world generation in your world.").getInt();

		registerCoalFurnaceRecipe = config.get(recipes, "registerCoalForSmelting", true, "If set, coal will be smeltable into graphite bars. Disable this if other mods need to smelt coal into their own products. [DEFAULT- TRUE]").getBoolean(true);
		registerCharcoalFurnaceRecipe = config.get(recipes, "registerCharcoalForSmelting", true, "If set, charcoal will be smeltable into graphite bars. Disable this if other mods need to smelt charcoal into their own products. [DEFAULT- TRUE]").getBoolean(true);
		registerCoalCraftingRecipe = config.get(recipes, "registerGraphiteCoalCraftingRecipes", false, "If set, graphite bars can be crafted from 2 gravel, 1 coal. Use this if other mods interfere with the smelting recipe. [DEFAULT- FALSE]").getBoolean(false);
		registerCharcoalCraftingRecipe = config.get(recipes, "registerGraphiteCharcoalCraftingRecipes", false, "If set, graphite bars can be crafted from 2 gravel, 1 charcoal. Use this if other mods interfere with the smelting recipe. [DEFAULT- FALSE]").getBoolean(false);
		registerYelloriteSmeltToUranium = config.get(recipes, "registerYelloriteSmeltToUranium", false, "If set, yellorite ore will smelt into whichever item is registered as ingotUranium in the ore dictionary. If false, it will smelt into ingotYellorium. [DEFAULT- FALSE]").getBoolean(false);

		useSteelForIron = config.get(recipes, "requireSteelInsteadOfIron", false, "If set, then all Big Reactors components will require steel ingots (ingotSteel) in place of iron ingots. Will be ignored if no other mod registers steel ingots. [DEFAULT- FALSE]").getBoolean(false);
		useExpensiveGlass = config.get(recipes, "requireObsidianGlass", false, "If set, then Big Reactors will require hardened or reinforced glass (glassHardened or glassReinforced) instead of plain glass. Will be ignored if no other mod registers those glass types. [DEFAULT- FALSE]").getBoolean(false);

//		enableReactorPowerTapRecipe = config.get(recipes, "enableReactorPowerTapRecipe", true, "If set, reactor power taps can be crafted, allowing players to use passive-cooled reactors.").getBoolean(true);
		enableCyaniteFromYelloriumRecipe = config.get(recipes, "enableCyaniteFromYelloriumRecipe", true, "If set, cyanite will be craftable from yellorium ingots and sand. [DEFAULT- TRUE]").getBoolean(true);

		enableCapes = config.get(general, "enableCapes", true, "Enable capes for developers/contributors. You should really only disable this if there is a conflicting cape. Or you find them annoying... Or whatever.").getBoolean(true);
		useHighResTextures = config.get(general, "useHighResTextures", true, "Enable 32x32 textures. Else enable 16x16 textures. Change to false on slower computers. [DEFAULT- TRUE]").getBoolean(true);
		useConnectedTextures = config.get(general, "useConnectedTextures", true, "Enable connected textures for (non-)multiblock blocks. [DEFAULT- TRUE]").getBoolean(true);

		enablePlayerEffects = config.get(general, "enablePlayerEffects", true, "Negative effects given to player if they enter a radiation zone. [DEFAULT- TRUE]").getBoolean(true);
		registerOwnSteam = config.get(general, "registerOwnSteam", true, "Register BR steam if nothing else adds Steam. [DEFAULT- TRUE]").getBoolean(true);

//		maximumReactorSize = config.get(general, "maxReactorSize", 32, "The maximum valid size of a reactor in the X/Z plane, in blocks. Lower this if your server's players are building ginormous reactors.").getInt();
//		maximumReactorHeight = config.get(general, "maxReactorHeight", 48, "The maximum valid size of a reactor in the Y dimension, in blocks. Lower this if your server's players are building ginormous reactors. Bigger Y sizes have far less performance impact than X/Z sizes.").getInt();
//		ticksPerRedstoneUpdate = config.get(general, "ticksPerRedstoneUpdate", 20, "Number of ticks between updates for redstone/rednet ports.").getInt();
//		powerProductionMultiplier = config.get(general, "powerProductionMultiplier", 1.0f, "A multiplier for balancing overall power production from Big Reactors. Defaults to 1.").getDouble(1.0);
//		fuelUsageMultiplier = config.get(general, "fuelUsageMultiplier", 1.0f, "A multiplier for balancing fuel consumption. Defaults to 1.").getDouble(1.0);
//
//		maximumTurbineSize = config.get(general,  "maxTurbineSize", 16, "The maximum valid size of a turbine in the X/Z plane, in blocks. Lower this for smaller turbines, which means lower max output. Turbines will be limited to twice this value in height.").getInt();
//		maximumTurbineHeight = maximumTurbineSize * 2;

		steamySteam = config.get(humor, "steamySteam", false, "Steamify your steam [DEFAULT- FALSE]").getBoolean(false);
		aprilFools = config.get(humor, "trolololol", true, "trololololololololollolololololololloollololololololololol [does nothing... yet... [DEFAULT- TRUE]").getBoolean(true);

		showOredictTooltips = config.get(debug, "showOredictTooltips", false, "For debugging porpoises. Adds tooltips to all registered items with their OreDictionary entry. [CURRENTLY BROKEN] [DEFAULT- FALSE]").getBoolean(false);
		enableDebugTools = config.get(debug, "enableDebugTools", false, "For debugging porpoises. Adds some blocks/items for easy testing. [DEFAULT- FALSE]").getBoolean(false);

		if (config.hasChanged()) {
			config.save();
		}
	}
}
