package main.nuclearcubes.items;

import cpw.mods.fml.common.registry.GameRegistry;
import main.nuclearcubes.ConfigHandler;
import main.nuclearcubes.ModInformation;
import main.nuclearcubes.blocks.BlockRegistry;
import main.nuclearcubes.items.armor.ItemArmorHazmatChest;
import main.nuclearcubes.items.armor.ItemArmorHazmatHelm;
import main.nuclearcubes.items.tools.*;
import main.nuclearcubes.util.BucketHandler;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;
import net.minecraftforge.common.util.EnumHelper;
import net.minecraftforge.fluids.FluidContainerRegistry;
import net.minecraftforge.fluids.FluidRegistry;

public class ItemRegistry {

	//armor materials
	public static final ItemArmor.ArmorMaterial hazmat = EnumHelper.addArmorMaterial("hazmat", -1, new int[]{1, 2, 3, 4}, 0);

	//materials
	public static Item ingots;
	public static Item dusts;

	//armor
	public static Item armorHazmatHelm;
	public static Item armorHazmatChest;
	public static Item armorHazmatLeggings;
	public static Item armorHazmatBoots;

	//buckets
	public static Item bucketYellorium;
	public static Item bucketCyanite;
	public static Item bucketBlutonium;
	public static Item bucketSteam;

	//debug
	public static Item debugBooks;

	private static void registerItems() {

		//materials
		ingots = new ItemIngots().setUnlocalizedName(ModInformation.ID);
		GameRegistry.registerItem(ingots, "ItemIngots");
		dusts = new ItemDusts().setUnlocalizedName(ModInformation.ID);
		GameRegistry.registerItem(dusts, "ItemDusts");

		//armor
		armorHazmatHelm = new ItemArmorHazmatHelm(hazmat, 0, 0);
		GameRegistry.registerItem(armorHazmatHelm, "ItemArmorHazmatHelm");
		armorHazmatChest = new ItemArmorHazmatChest(hazmat, 0, 1);
		GameRegistry.registerItem(armorHazmatChest, "ItemArmorHazmatChest");

		//buckets
		bucketYellorium = new ItemYelloriumBucket(BlockRegistry.yelloriumBlock);
		GameRegistry.registerItem(bucketYellorium, bucketYellorium.getUnlocalizedName());
		bucketCyanite = new ItemCyaniteBucket(BlockRegistry.cyaniteBlock);
		GameRegistry.registerItem(bucketCyanite, bucketCyanite.getUnlocalizedName());
		bucketBlutonium = new ItemBlutoniumBucket(BlockRegistry.blutoniumBlock);
		GameRegistry.registerItem(bucketBlutonium, bucketBlutonium.getUnlocalizedName());
		if(ConfigHandler.registerOwnSteam) {
			bucketSteam = new ItemSteamBucket(BlockRegistry.steamBlock);
			GameRegistry.registerItem(bucketSteam, bucketSteam.getUnlocalizedName());
		}

		//debug
		if(ConfigHandler.enableDebugTools) {
			debugBooks = new ItemDebugBooks().setUnlocalizedName(ModInformation.ID);
			GameRegistry.registerItem(debugBooks, "ItemDebugBooks");
		}
	}

	private static void addBuckets() {
		BucketHandler.INSTANCE.buckets.put(BlockRegistry.yelloriumBlock, bucketYellorium);
		FluidContainerRegistry.registerFluidContainer(FluidRegistry.getFluidStack("yellorium", FluidContainerRegistry.BUCKET_VOLUME), new ItemStack(bucketYellorium), new ItemStack(Items.bucket));
		BucketHandler.INSTANCE.buckets.put(BlockRegistry.cyaniteBlock, bucketCyanite);
		FluidContainerRegistry.registerFluidContainer(FluidRegistry.getFluidStack("cyanite", FluidContainerRegistry.BUCKET_VOLUME), new ItemStack(bucketCyanite), new ItemStack(Items.bucket));
		BucketHandler.INSTANCE.buckets.put(BlockRegistry.blutoniumBlock, bucketBlutonium);
		FluidContainerRegistry.registerFluidContainer(FluidRegistry.getFluidStack("blutonium", FluidContainerRegistry.BUCKET_VOLUME), new ItemStack(bucketBlutonium), new ItemStack(Items.bucket));
		if(ConfigHandler.registerOwnSteam) {
			BucketHandler.INSTANCE.buckets.put(BlockRegistry.steamBlock, bucketSteam);
			FluidContainerRegistry.registerFluidContainer(FluidRegistry.getFluidStack("steam", FluidContainerRegistry.BUCKET_VOLUME), new ItemStack(bucketSteam), new ItemStack(Items.bucket));
		}
	}

	public static void registerFullItems() {
		registerItems();
		addBuckets();
	}
}
