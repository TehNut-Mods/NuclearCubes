package main.nuclearcubes.items.tools;

import main.nuclearcubes.NuclearCubes;
import main.nuclearcubes.ModInformation;
import net.minecraft.block.Block;
import net.minecraft.init.Items;
import net.minecraft.item.ItemBucket;

public class ItemYelloriumBucket extends ItemBucket {

	public ItemYelloriumBucket(Block block) {
		super(block);
		this.maxStackSize = 1;
		this.setContainerItem(Items.bucket);
		this.setTextureName(ModInformation.ID + ":tools/bucketYellorium");
		this.setCreativeTab(NuclearCubes.tabNuclearCubes);
		this.setUnlocalizedName(ModInformation.ID + ".bucket.yellorium");
	}

}
