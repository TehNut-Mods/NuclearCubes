package main.bigreactors;

import net.minecraftforge.common.config.Configuration;

public class ConfigHandler {

	//Categories
	public static String worldgen = "World Generation";
	public static String recipes = "Recipes";
	public static String general = "General";
	public static String humor = "Humor";

	//Options
	public static boolean enableWorldGen = true;
	public static boolean enableWorldGenInNegativeDimensions = false;
	public static boolean enableWorldRegeneration = false;
	public static int userWorldGenVersion = 0;

	public static boolean registerCoalFurnaceRecipe = true;
	public static boolean registerCharcoalFurnaceRecipe = true;
	public static boolean registerCoalCraftingRecipe = false;
	public static boolean registerCharcoalCraftingRecipe = false;
	public static boolean registerYelloriteSmeltToUranium = false;

	public static boolean useSteelForIron = false;
	public static boolean useExpensiveGlass = false;

	public static boolean enableReactorPowerTapRecipe = true;
	public static boolean enableCyaniteFromYelloriumRecipe = true;

	public static boolean useConnectedTextures = true;

	public static int maximumReactorSize; //= MultiblockReactor.DIMENSION_UNBOUNDED;
	public static int maximumReactorHeight; //= MultiblockReactor.DIMENSION_UNBOUNDED;
	public static int ticksPerRedstoneUpdate = 20;
	public static double powerProductionMultiplier = 1.0f;
	public static double fuelUsageMultiplier = 1.0f;

	public static int maximumTurbineSize = 16;
	public static int maximumTurbineHeight = 32;

	public static boolean steamySteam;
	public static boolean aprilFools;

	public static void init(Configuration config) {
		config.load();

		enableWorldGen = config.get(worldgen, "enableWorldGen", true, "If false, disables all world gen from Big Reactors; all other worldgen settings are automatically overridden").getBoolean(true);
		enableWorldGenInNegativeDimensions = config.get(worldgen, "enableWorldGenInNegativeDims", false, "Run BR world generation in negative dimension IDs? (default: false) If you don't know what this is, leave it alone.").getBoolean(false);
		enableWorldRegeneration = config.get(worldgen, "enableWorldRegeneration", false, "Run BR World Generation in chunks that have already been generated, but have not been modified by Big Reactors before. This is largely useful for worlds that existed before BigReactors was released.").getBoolean(false);
		userWorldGenVersion = config.get(worldgen, "userWorldGenVersion", 0, "User-set world generation version. Increase this by 1 if you want Big Reactors to re-run world generation in your world.").getInt();

		registerCoalFurnaceRecipe = config.get(recipes, "registerCoalForSmelting", true, "If set, coal will be smeltable into graphite bars. Disable this if other mods need to smelt coal into their own products. (Default: true)").getBoolean(true);
		registerCharcoalFurnaceRecipe = config.get(recipes, "registerCharcoalForSmelting", true, "If set, charcoal will be smeltable into graphite bars. Disable this if other mods need to smelt charcoal into their own products. (Default: true)").getBoolean(true);
		registerCoalCraftingRecipe = config.get(recipes, "registerGraphiteCoalCraftingRecipes", false, "If set, graphite bars can be crafted from 2 gravel, 1 coal. Use this if other mods interfere with the smelting recipe. (Default: false)").getBoolean(false);
		registerCharcoalCraftingRecipe = config.get(recipes, "registerGraphiteCharcoalCraftingRecipes", false, "If set, graphite bars can be crafted from 2 gravel, 1 charcoal. Use this if other mods interfere with the smelting recipe. (Default: false)").getBoolean(false);
		registerYelloriteSmeltToUranium = config.get(recipes, "registerYelloriteSmeltToUranium", false, "If set, yellorite ore will smelt into whichever item is registered as ingotUranium in the ore dictionary. If false, it will smelt into ingotYellorium. (Default: false)").getBoolean(false);

		useSteelForIron = config.get(recipes, "requireSteelInsteadOfIron", false, "If set, then all Big Reactors components will require steel ingots (ingotSteel) in place of iron ingots. Will be ignored if no other mod registers steel ingots. (default: false)").getBoolean(false);
		useExpensiveGlass = config.get(recipes, "requireObsidianGlass", false, "If set, then Big Reactors will require hardened or reinforced glass (glassHardened or glassReinforced) instead of plain glass. Will be ignored if no other mod registers those glass types. (default: false)").getBoolean(false);

		enableReactorPowerTapRecipe = config.get(recipes, "enableReactorPowerTapRecipe", true, "If set, reactor power taps can be crafted, allowing players to use passive-cooled reactors.").getBoolean(true);
		enableCyaniteFromYelloriumRecipe = config.get(recipes, "enableCyaniteFromYelloriumRecipe", true, "If set, cyanite will be craftable from yellorium ingots and sand.").getBoolean(true);

		useConnectedTextures = config.get(general, "useConnectedTextures", true, "Enable connected textures for non-multiblock blocks.").getBoolean(true);

		maximumReactorSize = config.get(general, "maxReactorSize", 32, "The maximum valid size of a reactor in the X/Z plane, in blocks. Lower this if your server's players are building ginormous reactors.").getInt();
		maximumReactorHeight = config.get(general, "maxReactorHeight", 48, "The maximum valid size of a reactor in the Y dimension, in blocks. Lower this if your server's players are building ginormous reactors. Bigger Y sizes have far less performance impact than X/Z sizes.").getInt();
		ticksPerRedstoneUpdate = config.get(general, "ticksPerRedstoneUpdate", 20, "Number of ticks between updates for redstone/rednet ports.").getInt();
		powerProductionMultiplier = config.get(general, "powerProductionMultiplier", 1.0f, "A multiplier for balancing overall power production from Big Reactors. Defaults to 1.").getDouble(1.0);
		fuelUsageMultiplier = config.get(general, "fuelUsageMultiplier", 1.0f, "A multiplier for balancing fuel consumption. Defaults to 1.").getDouble(1.0);

		maximumTurbineSize = config.get(general,  "maxTurbineSize", 16, "The maximum valid size of a turbine in the X/Z plane, in blocks. Lower this for smaller turbines, which means lower max output. Turbines will be limited to twice this value in height.").getInt();
		maximumTurbineHeight = maximumTurbineSize * 2;

		steamySteam = config.get(humor, "steamySteam", false, "Steamify your steam").getBoolean(false);
		aprilFools = config.get(humor, "trolololol", true, "trololololololololollolololololololloollololololololololol").getBoolean(true);


		if (config.hasChanged()) {
			config.save();
		}
	}
}
