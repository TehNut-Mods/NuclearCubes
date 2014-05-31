package main.bigreactors.items;

import cpw.mods.fml.common.registry.GameRegistry;
import main.bigreactors.ConfigHandler;
import main.bigreactors.blocks.BlockRegistry;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;

public class ItemRecipeRegistry {

	private static void registerShapedRecipes() {
		if(ConfigHandler.enableCyaniteFromYelloriumRecipe) {
			GameRegistry.addRecipe(new ItemStack(ItemRegistry.ingots, 1, 2), "SIS", 'I', new ItemStack(ItemRegistry.ingots, 1, 1), 'S', new ItemStack(Blocks.sand));
		}
		if(ConfigHandler.registerCoalCraftingRecipe) {
			GameRegistry.addRecipe(new ItemStack(ItemRegistry.ingots, 1, 3), "GCG", 'G', new ItemStack(Blocks.gravel), 'C', new ItemStack(Items.coal, 1, 0));
		}
		if(ConfigHandler.registerCharcoalCraftingRecipe) {
			GameRegistry.addRecipe(new ItemStack(ItemRegistry.ingots, 1, 3), "GCG", 'G', new ItemStack(Blocks.gravel), 'C', new ItemStack(Items.coal, 1, 1));
		}
	}

	private static void registerFurnaceRecipes() {
		//Ore to Ingot
//		if(!ConfigHandler.registerYelloriteSmeltToUranium || (OreDictionary.getOres(OreDictHandler.ingotUranium).size() < 0)) {
			GameRegistry.addSmelting(new ItemStack(BlockRegistry.blockOres, 1, 0), new ItemStack(ItemRegistry.ingots, 1, 0), 0.7F);
//		}else if(ConfigHandler.registerYelloriteSmeltToUranium && (OreDictionary.getOres(OreDictHandler.ingotUranium).size() >= 0)) {
//			GameRegistry.addSmelting(new ItemStack(BlockRegistry.blockOres, 1, 0), new ItemStack(OreDictHandler.ingotUranium), 0.7F);
//		}

		//Dust to Ingot
		GameRegistry.addSmelting(new ItemStack(ItemRegistry.dusts, 1, 0), new ItemStack(ItemRegistry.ingots, 1, 0), 0.7F);
		GameRegistry.addSmelting(new ItemStack(ItemRegistry.dusts, 1, 1), new ItemStack(ItemRegistry.ingots, 1, 1), 0.7F);
		GameRegistry.addSmelting(new ItemStack(ItemRegistry.dusts, 1, 2), new ItemStack(ItemRegistry.ingots, 1, 2), 0.7F);

		if(ConfigHandler.registerCoalFurnaceRecipe) {
			GameRegistry.addSmelting(new ItemStack(Items.coal, 1, 0), new ItemStack(ItemRegistry.ingots, 1, 3), 0.7F);
		}
		if(ConfigHandler.registerCharcoalFurnaceRecipe) {
			GameRegistry.addSmelting(new ItemStack(Items.coal, 1, 1), new ItemStack(ItemRegistry.ingots, 1, 3), 0.7F);
		}
	}

	public static void registerFullRecipes() {
		registerShapedRecipes();
		registerFurnaceRecipes();
	}
}
