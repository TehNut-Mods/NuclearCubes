package main.nuclearcubes.items.blocks;

import net.minecraft.block.Block;
import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemStack;

public class ItemBlockIngotStorage extends ItemBlock {


	public ItemBlockIngotStorage(Block block) {
		super(block);
		setHasSubtypes(true);
	}

	@Override
	public String getUnlocalizedName(ItemStack itemstack) {
		String name = "";
		switch (itemstack.getItemDamage()) {
			case 0: {
				name = "yellorium";
				break;
			}
			case 1: {
				name = "cyanite";
				break;
			}
			case 2: {
				name = "blutonium";
				break;
			}
			case 3: {
				name = "graphite";
				break;
			}
			default:
				name = "nothing";
		}
		return getUnlocalizedName() + "." + name;
	}

	@Override
	public int getMetadata(int meta) {
		return meta;
	}

}
