package main.nuclearcubes.items.blocks;

import net.minecraft.block.Block;
import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemStack;

public class ItemBlockReactorFuelRods extends ItemBlock {

	public ItemBlockReactorFuelRods(Block block) {
		super(block);
		setHasSubtypes(true);
	}

	@Override
	public String getUnlocalizedName(ItemStack itemstack) {
		String name = "";
		switch (itemstack.getItemDamage()) {
			case 0: {
				name = "base";
				break;
			}
			case 1: {
				name = "uranium";
				break;
			}
			case 2: {
				name = "plutonium";
				break;
			}
			default:
				name = "nothing";
		}
		return getUnlocalizedName() + "." + name;
	}

	@Override
	public int getMetadata(int par1) {
		return par1;
	}
}
