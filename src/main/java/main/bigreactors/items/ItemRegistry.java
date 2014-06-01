package main.bigreactors.items;

import cpw.mods.fml.common.registry.GameRegistry;
import main.bigreactors.ModInformation;
import main.bigreactors.blocks.BlockRegistry;
import main.bigreactors.items.tools.ItemBlutoniumBucket;
import main.bigreactors.items.tools.ItemCyaniteBucket;
import main.bigreactors.items.tools.ItemYelloriumBucket;
import main.bigreactors.util.BucketHandler;
import net.minecraft.item.Item;

public class ItemRegistry {

	//ingots
	public static Item ingots;
	public static Item dusts;
	public static Item bucketYellorium;
	public static Item bucketCyanite;
	public static Item bucketBlutonium;

	private static void registerItems() {

		ingots = new ItemIngots().setUnlocalizedName(ModInformation.ID);
		GameRegistry.registerItem(ingots, "ItemIngots");
		dusts = new ItemDusts().setUnlocalizedName(ModInformation.ID);
		GameRegistry.registerItem(dusts, "ItemDusts");

		//buckets
		bucketYellorium = new ItemYelloriumBucket(BlockRegistry.yelloriumBlock);
		GameRegistry.registerItem(bucketYellorium, bucketYellorium.getUnlocalizedName());
		bucketCyanite = new ItemCyaniteBucket(BlockRegistry.cyaniteBlock);
		GameRegistry.registerItem(bucketCyanite, bucketCyanite.getUnlocalizedName());
		bucketBlutonium = new ItemBlutoniumBucket(BlockRegistry.blutoniumBlock);
		GameRegistry.registerItem(bucketBlutonium, bucketBlutonium.getUnlocalizedName());
	}

	private static void addBuckets() {
		BucketHandler.INSTANCE.buckets.put(BlockRegistry.yelloriumBlock, bucketYellorium);
		BucketHandler.INSTANCE.buckets.put(BlockRegistry.cyaniteBlock, bucketCyanite);
		BucketHandler.INSTANCE.buckets.put(BlockRegistry.blutoniumBlock, bucketBlutonium);
	}

	public static void registerFullItems() {
		registerItems();
		addBuckets();
	}

}
