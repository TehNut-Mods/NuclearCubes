package main.nuclearcubes.items.tools.buckets;

import main.nuclearcubes.ModInformation;
import main.nuclearcubes.NuclearCubes;
import net.minecraft.block.Block;
import net.minecraft.item.ItemBucket;

public class ItemBucketGraphite extends ItemBucket {

	public ItemBucketGraphite(Block block) {
		super(block);
		this.setTextureName(ModInformation.ID + ":tools/graphiteBucket_empty");
		this.setUnlocalizedName(ModInformation.ID + ".bucket.graphite.empty");
		this.setCreativeTab(NuclearCubes.tabNuclearCubes);
	}
}
