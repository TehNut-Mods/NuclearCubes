package main.nuclearcubes.util;

import main.nuclearcubes.NuclearCubes;
import main.nuclearcubes.ConfigHandler;
import main.nuclearcubes.blocks.BlockRegistry;
import main.nuclearcubes.items.ItemRegistry;
import net.minecraft.item.ItemStack;
import net.minecraftforge.oredict.OreDictionary;

public class OreDictHandler {

	public static String oreYellorite = "oreYellorite";

	public static String ingotYellorium;
	public static String ingotIronOrSteel;
	public static String ingotCyanite = "ingotCyanite";
	public static String ingotBlutonium = "ingotBlutonium";
	public static String chunkGraphite = "chunkGraphite";

	public static String dustYellorium = "dustYellorium";
	public static String dustCyanite = "dustCyanite";
	public static String dustBlutonium = "dustBlutonium";
	public static String dustGraphite = "dustGraphite";

	public static final String BLOCK = "block";
	public static final String ORE = "ore";
	public static final String DUST = "dust";
	public static final String INGOT = "ingot";
	public static final String NUGGET = "nugget";
	public static final String LOG = "log";

	private static void registerOreDict() {

		OreDictionary.registerOre(oreYellorite, new ItemStack(BlockRegistry.blockOres, 1, 0));

		//This is currently broken while I figure out how to work with the OreDict...
		if(ConfigHandler.registerYelloriteSmeltToUranium && OreDictionary.getOres("ingotUranium").size() > 0) {
			ingotYellorium = "ingotUranium";
			NuclearCubes.logger.debug("Registering yellorium as ingotUranium...");
		} else {
			ingotYellorium = "ingotYellorium";
		}

		if(ConfigHandler.useSteelForIron && OreDictionary.getOres("ingotSteel").size() > 0) {
			ingotIronOrSteel = "ingotSteel";
			NuclearCubes.logger.debug("Using steel in place of iron...");
		} else {
			ingotIronOrSteel = "ingotIron";
		}

		OreDictionary.registerOre(ingotYellorium, new ItemStack(ItemRegistry.ingots, 1, 0));
		OreDictionary.registerOre(ingotCyanite, new ItemStack(ItemRegistry.ingots, 1, 1));
		OreDictionary.registerOre(ingotBlutonium, new ItemStack(ItemRegistry.ingots, 1, 2));
		OreDictionary.registerOre(chunkGraphite, new ItemStack(ItemRegistry.ingots, 1, 3));

		OreDictionary.registerOre(dustYellorium, new ItemStack(ItemRegistry.dusts, 1, 0));
		OreDictionary.registerOre(dustCyanite, new ItemStack(ItemRegistry.dusts, 1, 1));
		OreDictionary.registerOre(dustBlutonium, new ItemStack(ItemRegistry.dusts, 1, 2));
		OreDictionary.registerOre(dustGraphite, new ItemStack(ItemRegistry.dusts, 1, 3));
	}

	public static ItemStack cloneStack(ItemStack stack, int stackSize) {

		if (stack == null) {
			return null;
		}
		ItemStack retStack = stack.copy();
		retStack.stackSize = stackSize;

		return retStack;
	}

	public static boolean hasOreName(ItemStack stack) {

		return !getOreName(stack).equals("Unknown");
	}

	public static String getOreName(ItemStack stack) {

		return OreDictionary.getOreName(OreDictionary.getOreID(stack));
	}

	public static boolean isOreID(ItemStack stack, int oreID) {

		return OreDictionary.getOreID(stack) == oreID;
	}

	public static boolean isOreName(ItemStack stack, String oreName) {

		return OreDictionary.getOreName(OreDictionary.getOreID(stack)).equals(oreName);
	}

	public static boolean oreNameExists(String oreName) {

		return !OreDictionary.getOres(oreName).isEmpty();
	}

	public static ItemStack getOre(String oreName) {

		if (!oreNameExists(oreName)) {
			return null;
		}
		return cloneStack(OreDictionary.getOres(oreName).get(0), 1);
	}

	public static boolean isBlock(ItemStack stack) {

		return getOreName(stack).startsWith(BLOCK);
	}

	public static boolean isOre(ItemStack stack) {

		return getOreName(stack).startsWith(ORE);
	}

	public static boolean isDust(ItemStack stack) {

		return getOreName(stack).startsWith(DUST);
	}

	public static boolean isIngot(ItemStack stack) {

		return getOreName(stack).startsWith(INGOT);
	}

	public static boolean isNugget(ItemStack stack) {

		return getOreName(stack).startsWith(NUGGET);
	}

	public static boolean isLog(ItemStack stack) {

		return getOreName(stack).startsWith(LOG);
	}

	public static void registerFullOreDict() {
		registerOreDict();
		OreDictionary.initVanillaEntries();
	}
}
