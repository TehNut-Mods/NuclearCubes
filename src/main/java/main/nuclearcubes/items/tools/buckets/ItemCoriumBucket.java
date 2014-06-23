package main.nuclearcubes.items.tools.buckets;

import main.nuclearcubes.NuclearCubes;
import main.nuclearcubes.ModInformation;
import main.nuclearcubes.util.KeyboardHelper;
import main.nuclearcubes.util.TextHelper;
import net.minecraft.block.Block;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Items;
import net.minecraft.item.ItemBucket;
import net.minecraft.item.ItemStack;

import java.util.List;

public class ItemCoriumBucket extends ItemBucket {

	public ItemCoriumBucket(Block block) {
		super(block);
		this.maxStackSize = 1;
		this.setContainerItem(Items.bucket);
		this.setTextureName(ModInformation.ID + ":tools/bucketCorium");
		this.setCreativeTab(NuclearCubes.tabNuclearCubes);
		this.setUnlocalizedName(ModInformation.ID + ".bucket.corium");
	}

	@SuppressWarnings("unchecked")
	@Override
	public void addInformation(ItemStack stack, EntityPlayer player, List list, boolean check) {

		super.addInformation(stack, player, list, check);
		if (!KeyboardHelper.isShiftDown()) {
			return;
		}
		list.add("This " + TextHelper.ITALIC + "should" + TextHelper.LIGHT_GRAY + " be a creative only item.");
	}
}
