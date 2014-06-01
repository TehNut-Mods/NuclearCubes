package main.bigreactors.items.tools;

import main.bigreactors.BigReactors;
import main.bigreactors.ModInformation;
import net.minecraft.block.Block;
import net.minecraft.init.Items;
import net.minecraft.item.ItemBucket;

public class ItemBlutoniumBucket extends ItemBucket {

	public ItemBlutoniumBucket(Block block) {
		super(block);
		this.maxStackSize = 1;
		this.setContainerItem(Items.bucket);
		this.setTextureName(ModInformation.ID + ":tools/bucketBlutonium");
		this.setCreativeTab(BigReactors.tabBigReactors);
		this.setUnlocalizedName(ModInformation.ID + ".bucket.blutonium");
	}
}
