package main.bigreactors.items.tools;

import main.bigreactors.BigReactors;
import main.bigreactors.ModInformation;
import net.minecraft.block.Block;
import net.minecraft.init.Items;
import net.minecraft.item.ItemBucket;

public class ItemCyaniteBucket extends ItemBucket {

	public ItemCyaniteBucket(Block block) {
		super(block);
		this.maxStackSize = 1;
		this.setContainerItem(Items.bucket);
		this.setTextureName(ModInformation.ID + ":tools/bucketCyanite");
		this.setCreativeTab(BigReactors.tabBigReactors);
		this.setUnlocalizedName(ModInformation.ID + ".bucket.cyanite");
	}
}
