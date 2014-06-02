package main.bigreactors.util;

import main.bigreactors.ConfigHandler;
import main.bigreactors.blocks.BlockRegistry;
import main.bigreactors.items.ItemRegistry;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraftforge.oredict.OreDictionary;

public class OreDictHandler {

	//Vanilla
	public static String ingotIron = "ingotIron";
	public static String ingotGold = "ingotGold";
	public static String blockSnow = "blockSnow";
	public static String blockIce = "blockIce";
	public static String glass = "glass";

	//BigReactors
	public static String oreYellorite = "oreYellorite";

	public static String ingotYellorium = "ingotYellorium";
	public static String ingotCyanite = "ingotCyanite";
	public static String ingotBlutonium = "ingotBlutonium";
	public static String ingotGraphite = "ingotGraphite";

	public static String dustYellorium = "dustYellorium";
	public static String dustCyanite = "dustCyanite";
	public static String dustBlutonium = "dustBlutonium";
	public static String dustGraphite = "dustGraphite";

	//Other
	public static String ingotUranium = "ingotUranium";

	private static void registerVanillaOres() {

		//Handle vanilla derps. Most mods already do this.
		if(OreDictionary.getOres(ingotIron).size() <= 0) {
			OreDictionary.registerOre(ingotIron, Items.iron_ingot);
		}

		if(OreDictionary.getOres(ingotGold).size() <= 0) {
			OreDictionary.registerOre(ingotGold, Items.gold_ingot);
		}

		if(OreDictionary.getOres(blockSnow).size() <= 0) {
			OreDictionary.registerOre(blockSnow, Blocks.snow);
		}

		if(OreDictionary.getOres(blockIce).size() <= 0) {
			OreDictionary.registerOre(blockIce, Blocks.ice);
		}

		if(OreDictionary.getOreID(new ItemStack(Blocks.glass)) < 0) {
			OreDictionary.registerOre(glass, Blocks.glass);
		}

	}

	private static void registerOreDict() {

		OreDictionary.registerOre(oreYellorite, new ItemStack(BlockRegistry.blockOres, 1, 0));

		if(ConfigHandler.registerYelloriteSmeltToUranium) {
			OreDictionary.registerOre(ingotUranium, new ItemStack(ItemRegistry.ingots, 1, 0));
		} else {
			OreDictionary.registerOre(ingotYellorium, new ItemStack(ItemRegistry.ingots, 1, 0));
		}
		OreDictionary.registerOre(ingotCyanite, new ItemStack(ItemRegistry.ingots, 1, 1));
		OreDictionary.registerOre(ingotBlutonium, new ItemStack(ItemRegistry.ingots, 1, 2));
		OreDictionary.registerOre(ingotGraphite, new ItemStack(ItemRegistry.ingots, 1, 3));

		OreDictionary.registerOre(dustYellorium, new ItemStack(ItemRegistry.dusts, 1, 0));
		OreDictionary.registerOre(dustCyanite, new ItemStack(ItemRegistry.dusts, 1, 1));
		OreDictionary.registerOre(dustBlutonium, new ItemStack(ItemRegistry.dusts, 1, 2));
		OreDictionary.registerOre(dustGraphite, new ItemStack(ItemRegistry.dusts, 1, 3));
	}

	public static void registerFullOreDict() {
		registerOreDict();
		registerVanillaOres();
	}
}
