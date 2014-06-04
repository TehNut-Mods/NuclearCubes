package main.bigreactors.items.tools;

import main.bigreactors.BigReactors;
import main.bigreactors.ModInformation;
import main.bigreactors.util.KeyboardHelper;
import net.minecraft.block.Block;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Items;
import net.minecraft.item.ItemBucket;
import net.minecraft.item.ItemStack;

import java.util.List;

public class ItemSteamBucket extends ItemBucket {

	public ItemSteamBucket(Block block) {
		super(block);
		this.maxStackSize = 1;
		this.setContainerItem(Items.bucket);
		this.setTextureName(ModInformation.ID + ":tools/bucketSteam");
		this.setCreativeTab(BigReactors.tabBigReactors);
		this.setUnlocalizedName(ModInformation.ID + ".bucket.steam");
	}

	@Override
	public void addInformation(ItemStack stack, EntityPlayer player, List list, boolean check) {

		super.addInformation(stack, player, list, check);
		if (!KeyboardHelper.isShiftDown()) {
			return;
		}
		list.add("I promise it's not empty...");
	}
}
