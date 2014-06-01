package main.bigreactors.util;

import main.bigreactors.blocks.BlockRegistry;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fluids.FluidRegistry;
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

	//Other
	public static String ingotUranium = "ingotUranium";

	private static void registerVanillaOres() {

		//Handle vanilla derps
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
	}

	private static void registerFluidDict() {
		FluidRegistry.registerFluid(BlockRegistry.yellorium);
		FluidRegistry.registerFluid(BlockRegistry.cyanite);
		FluidRegistry.registerFluid(BlockRegistry.steam);
	}

	public static void registerFullOreDict() {
		registerOreDict();
		registerVanillaOres();
//		registerFluidDict();
	}
}
