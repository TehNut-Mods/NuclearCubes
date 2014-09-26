package main.nuclearcubes.items;

import cpw.mods.fml.common.registry.GameRegistry;
import main.nuclearcubes.util.OreDictHandler;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraftforge.oredict.ShapedOreRecipe;

public class ItemRecipeRegistry {

	private static void registerShapedRecipes() {

		// materials
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ItemRegistry.materials, 0), "SBS", "IWI", 'S', new ItemStack(Items.string), 'I', "ingotIron", 'B', "dyeBlack", 'W', new ItemStack(Blocks.wool)));

		// armor recipes
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ItemRegistry.armorHazmatHelm), "WAW", "WFW", 'W', new ItemStack(Blocks.wool), 'A', new ItemStack(Items.leather_helmet), 'F', new ItemStack(ItemRegistry.materials, 0)));
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ItemRegistry.armorHazmatChestplate), "WAW", "WFW", 'W', new ItemStack(Blocks.wool), 'A', new ItemStack(Items.leather_chestplate), 'F', new ItemStack(ItemRegistry.materials, 0)));
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ItemRegistry.armorHazmatLeggings), "WAW", "WFW", 'W', new ItemStack(Blocks.wool), 'A', new ItemStack(Items.leather_leggings), 'F', new ItemStack(ItemRegistry.materials, 0)));
		if (OreDictHandler.oreNameExists("rubber"))
			GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ItemRegistry.armorHazmatBoots), "WAW", "RFR", 'W', new ItemStack(Blocks.wool), 'A', new ItemStack(Items.leather_boots), 'F', new ItemStack(ItemRegistry.materials, 0), 'R', "rubber"));
		else
			GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ItemRegistry.armorHazmatBoots), "WAW", "WFW", 'W', new ItemStack(Blocks.wool), 'A', new ItemStack(Items.leather_boots), 'F', new ItemStack(ItemRegistry.materials, 0)));
	}

	private static void registerShaplessRecipes() {
	}

	public static void registerItemRecipes() {
		registerShapedRecipes();
		registerShaplessRecipes();
	}
}
