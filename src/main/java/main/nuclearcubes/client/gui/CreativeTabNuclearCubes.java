package main.nuclearcubes.client.gui;

import main.nuclearcubes.items.ItemRegistry;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

public class CreativeTabNuclearCubes extends CreativeTabs {

	public CreativeTabNuclearCubes(String tabLabel) {
		super(tabLabel);
	}

	@Override
	public ItemStack getIconItemStack() {
		return new ItemStack(ItemRegistry.armorHazmatHelm);
	}

	@Override
	public Item getTabIconItem() {
		return new Item();
	}
}
