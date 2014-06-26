package main.nuclearcubes.blocks;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.item.ItemStack;
import net.minecraftforge.oredict.ShapedOreRecipe;

public class BlockRecipeRegistry {

	private static void registerStorageRecipes() {
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(BlockRegistry.ingotStorage, 1, 0), new Object[]{"XXX", "XXX", "XXX", 'X', "ingotYellorium"}));
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(BlockRegistry.ingotStorage, 1, 1), new Object[]{"XXX", "XXX", "XXX", 'X', "ingotCyanite"}));
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(BlockRegistry.ingotStorage, 1, 2), new Object[]{"XXX", "XXX", "XXX", 'X', "ingotBlutonium"}));
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(BlockRegistry.ingotStorage, 1, 3), new Object[]{"XXX", "XXX", "XXX", 'X', "chunkGraphite"}));
	}

	public static void registerFullRecipes() {
		registerStorageRecipes();
	}
}
