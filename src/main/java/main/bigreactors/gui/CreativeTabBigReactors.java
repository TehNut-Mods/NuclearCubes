package main.bigreactors.gui;

import main.bigreactors.blocks.BlockRegistry;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

public class CreativeTabBigReactors extends CreativeTabs {

	public CreativeTabBigReactors(String tabLabel) {
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
