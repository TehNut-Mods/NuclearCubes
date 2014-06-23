package main.nuclearcubes.items;

import cpw.mods.fml.common.event.FMLInterModComms;
import cpw.mods.fml.common.registry.GameRegistry;
import main.nuclearcubes.ConfigHandler;
import main.nuclearcubes.blocks.BlockRegistry;
import main.nuclearcubes.util.OreDictHandler;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;

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

		GameRegistry.addRecipe(new ItemStack(ItemRegistry.armorHazmatHelm, 1), "WAW", "WFW", 'W', new ItemStack(Blocks.wool), 'A', new ItemStack(Items.leather_helmet, 1), 'F', new ItemStack(ItemRegistry.filter, 1));
		GameRegistry.addRecipe(new ItemStack(ItemRegistry.armorHazmatChest, 1), "WAW", "WFW", 'W', new ItemStack(Blocks.wool), 'A', new ItemStack(Items.leather_chestplate, 1), 'F', new ItemStack(ItemRegistry.filter, 1));
		GameRegistry.addRecipe(new ItemStack(ItemRegistry.armorHazmatLeggings, 1), "WAW", "WFW", 'W', new ItemStack(Blocks.wool), 'A', new ItemStack(Items.leather_leggings, 1), 'F', new ItemStack(ItemRegistry.filter, 1));
		if(OreDictHandler.oreNameExists("rubber")) {
            GameRegistry.addRecipe(new ItemStack(ItemRegistry.armorHazmatBoots, 1), "WAW", "RFR", 'W', new ItemStack(Blocks.wool), 'A', new ItemStack(Items.leather_boots, 1), 'F', new ItemStack(ItemRegistry.filter, 1), 'R', "rubber");
		} else {
			GameRegistry.addRecipe(new ItemStack(ItemRegistry.armorHazmatBoots, 1), "WAW", "WFW", 'W', new ItemStack(Blocks.wool), 'A', new ItemStack(Items.leather_boots, 1), 'F', new ItemStack(ItemRegistry.filter, 1));
		}
	}

	private static void registerFurnaceRecipes() {
		//Ore to Ingot
		GameRegistry.addSmelting(new ItemStack(BlockRegistry.blockOres, 1, 0), new ItemStack(ItemRegistry.ingots, 1, 0), 0.7F);

		//Dust to Ingot
		GameRegistry.addSmelting(new ItemStack(ItemRegistry.dusts, 1, 0), new ItemStack(ItemRegistry.ingots, 1, 0), 0.7F);
		GameRegistry.addSmelting(new ItemStack(ItemRegistry.dusts, 1, 1), new ItemStack(ItemRegistry.ingots, 1, 1), 0.7F);
		GameRegistry.addSmelting(new ItemStack(ItemRegistry.dusts, 1, 2), new ItemStack(ItemRegistry.ingots, 1, 2), 0.7F);

		//Coal to Graphite
		if(ConfigHandler.registerCoalFurnaceRecipe) {
			GameRegistry.addSmelting(new ItemStack(Items.coal, 1, 0), new ItemStack(ItemRegistry.ingots, 1, 3), 0.7F);
		}
		//Charcoal to Graphite
		if(ConfigHandler.registerCharcoalFurnaceRecipe) {
			GameRegistry.addSmelting(new ItemStack(Items.coal, 1, 1), new ItemStack(ItemRegistry.ingots, 1, 3), 0.7F);
		}

	}

	public static void registerMachineRecipes() {

		//Ore to dust
		NBTTagCompound toSend = new NBTTagCompound();
		toSend.setInteger("energy", 2000);
		toSend.setTag("input", new NBTTagCompound());
		toSend.setTag("primaryOutput", new NBTTagCompound());
		toSend.setTag("secondaryOutput", new NBTTagCompound());

		new ItemStack(BlockRegistry.blockOres, 1, 0).writeToNBT(toSend.getCompoundTag("input"));
		new ItemStack(ItemRegistry.dusts, 1, 0).writeToNBT(toSend.getCompoundTag("primaryOutput"));
		new ItemStack(ItemRegistry.dusts, 1, 0).writeToNBT(toSend.getCompoundTag("secondaryOutput"));
		toSend.setInteger("secondaryChance", 15);
		FMLInterModComms.sendMessage("ThermalExpansion", "PulverizerRecipe OR SawmillRecipe", toSend);

	}

	public static void registerFullRecipes() {
		registerShapedRecipes();
		registerFurnaceRecipes();
	}
}
