package main.bigreactors.items;

import cpw.mods.fml.common.registry.GameRegistry;
import main.bigreactors.ModInformation;
import main.bigreactors.blocks.BlockRegistry;
import main.bigreactors.items.tools.ItemBlutoniumBucket;
import main.bigreactors.items.tools.ItemCyaniteBucket;
import main.bigreactors.items.tools.ItemSteamBucket;
import main.bigreactors.items.tools.ItemYelloriumBucket;
import main.bigreactors.util.BucketHandler;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fluids.FluidContainerRegistry;
import net.minecraftforge.fluids.FluidRegistry;

public class ItemRegistry {

	//ingots
	public static Item ingots;

	//dusts
	public static Item dusts;

	//buckets
	public static Item bucketYellorium;
	public static Item bucketCyanite;
	public static Item bucketBlutonium;
	public static Item bucketSteam;

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
		bucketSteam = new ItemSteamBucket(BlockRegistry.steamBlock);
		GameRegistry.registerItem(bucketSteam, bucketSteam.getUnlocalizedName());
	}

	private static void addBuckets() {
		BucketHandler.INSTANCE.buckets.put(BlockRegistry.yelloriumBlock, bucketYellorium);
		FluidContainerRegistry.registerFluidContainer(FluidRegistry.getFluidStack("yellorium", FluidContainerRegistry.BUCKET_VOLUME), new ItemStack(bucketYellorium), new ItemStack(Items.bucket));
		BucketHandler.INSTANCE.buckets.put(BlockRegistry.cyaniteBlock, bucketCyanite);
		FluidContainerRegistry.registerFluidContainer(FluidRegistry.getFluidStack("cyanite", FluidContainerRegistry.BUCKET_VOLUME), new ItemStack(bucketCyanite), new ItemStack(Items.bucket));
		BucketHandler.INSTANCE.buckets.put(BlockRegistry.blutoniumBlock, bucketBlutonium);
		FluidContainerRegistry.registerFluidContainer(FluidRegistry.getFluidStack("blutonium", FluidContainerRegistry.BUCKET_VOLUME), new ItemStack(bucketBlutonium), new ItemStack(Items.bucket));
		BucketHandler.INSTANCE.buckets.put(BlockRegistry.steamBlock, bucketSteam);
		FluidContainerRegistry.registerFluidContainer(FluidRegistry.getFluidStack("steam", FluidContainerRegistry.BUCKET_VOLUME), new ItemStack(bucketSteam), new ItemStack(Items.bucket));
	}

	public static void registerFullItems() {
		registerItems();
		addBuckets();
	}
}
