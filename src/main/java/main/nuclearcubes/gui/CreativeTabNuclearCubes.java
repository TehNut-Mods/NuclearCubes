package main.nuclearcubes.gui;

import main.nuclearcubes.blocks.BlockRegistry;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

public class CreativeTabNuclearCubes extends CreativeTabs {

	public CreativeTabNuclearCubes(String tabLabel) {
		super(tabLabel);
	}

	@Override
	public ItemStack getIconItemStack() {
		return new ItemStack(BlockRegistry.blockOres, 1, 0);
	}

	@Override
	public Item getTabIconItem() { return new Item();
	}

}
