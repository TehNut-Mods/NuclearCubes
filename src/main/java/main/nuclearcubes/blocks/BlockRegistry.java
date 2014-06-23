package main.nuclearcubes.blocks;

import cpw.mods.fml.common.registry.GameRegistry;
import main.nuclearcubes.ConfigHandler;
import main.nuclearcubes.ModInformation;
import main.nuclearcubes.blocks.fluids.*;
import main.nuclearcubes.blocks.machines.*;
import main.nuclearcubes.blocks.reactor.*;
import main.nuclearcubes.items.blocks.ItemBlockIngotStorage;
import main.nuclearcubes.items.blocks.ItemBlockOres;
import main.nuclearcubes.items.blocks.ItemBlockReactorFuelRods;
import main.nuclearcubes.items.blocks.ItemBlockReactorGlass;
import net.minecraft.block.Block;
import net.minecraftforge.fluids.Fluid;
import net.minecraftforge.fluids.FluidRegistry;

public class BlockRegistry {

	//reactor
	public static Block casingReactor;
	public static Block glassReactor;
	public static Block controllerReactor;
	public static Block fuelRodReactor;
	public static Block controlRodReactor;
	public static Block accessPortReactor;
	public static Block powerTapReactor;
	public static Block rednetPortReactor;
	public static Block computerPortReactor;
	public static Block redstonePortReactor;

	//machines
	public static Block fuelReprocessor;
	public static Block infuser;

	//blocks
	public static Block ingotStorage;

	//ores
	public static Block blockOres;

	//fluids
	public static Fluid yellorium;
	public static Block yelloriumBlock;
	public static Fluid cyanite;
	public static Block cyaniteBlock;
	public static Fluid blutonium;
	public static Block blutoniumBlock;
	public static Fluid steam;
	public static Block steamBlock;
	public static Fluid corium;
	public static Block coriumBlock;

	public static void registerBlocks() {

		//reactor
		casingReactor = new BlockReactorCasing();
		GameRegistry.registerBlock(casingReactor, "BlockReactorCasing");
		glassReactor = new BlockReactorGlass();
		GameRegistry.registerBlock(glassReactor, ItemBlockReactorGlass.class, glassReactor.getUnlocalizedName());
		controllerReactor = new BlockReactorController();
		GameRegistry.registerBlock(controllerReactor, "BlockReactorController");
		fuelRodReactor = new BlockReactorFuelRods();
		GameRegistry.registerBlock(fuelRodReactor, ItemBlockReactorFuelRods.class, fuelRodReactor.getUnlocalizedName());
		controlRodReactor = new BlockReactorControlRod();
		GameRegistry.registerBlock(controlRodReactor, "BlockReactorControlRod");
		accessPortReactor = new BlockReactorAccessPort();
		GameRegistry.registerBlock(accessPortReactor, "BlockReactorAccessPort");
		powerTapReactor = new BlockReactorPowerTap();
		GameRegistry.registerBlock(powerTapReactor, "BlockReactorPowerTap");
		rednetPortReactor = new BlockReactorRednetPort();
		GameRegistry.registerBlock(rednetPortReactor, "BlockReactorRednetPort");
		computerPortReactor = new BlockReactorComputerPort();
		GameRegistry.registerBlock(computerPortReactor, "BlockReactorComputerPort");
		redstonePortReactor = new BlockReactorRedstonePort();
		GameRegistry.registerBlock(redstonePortReactor, "BlockReactorRedstonePort");

		//machines
		fuelReprocessor = new BlockFuelReprocessor();
		GameRegistry.registerBlock(fuelReprocessor, "BlockFuelReprocessor");
		infuser = new BlockInfuser();
		GameRegistry.registerBlock(infuser, "BlockInfuser");

		//blocks
		ingotStorage = new BlockIngotStorage().setBlockName("blockIngotStorage");
		GameRegistry.registerBlock(ingotStorage, ItemBlockIngotStorage.class, ModInformation.ID + "BlockIngotStorage");

		//ores
		blockOres = new BlockOres();
		GameRegistry.registerBlock(blockOres, ItemBlockOres.class, blockOres.getUnlocalizedName());

		//fluids
		yellorium = new Fluid("yellorium");
		FluidRegistry.registerFluid(yellorium);
		yelloriumBlock = new BlockFluidYellorium(yellorium);
		GameRegistry.registerBlock(yelloriumBlock, yelloriumBlock.getUnlocalizedName());
		yellorium.setUnlocalizedName(yelloriumBlock.getUnlocalizedName());

		cyanite = new Fluid("cyanite");
		FluidRegistry.registerFluid(cyanite);
		cyaniteBlock = new BlockFluidCyanite(cyanite);
		GameRegistry.registerBlock(cyaniteBlock, cyaniteBlock.getUnlocalizedName());
		cyanite.setUnlocalizedName(cyaniteBlock.getUnlocalizedName());

		blutonium = new Fluid("blutonium");
		FluidRegistry.registerFluid(blutonium);
		blutoniumBlock = new BlockFluidBlutonium(blutonium);
		GameRegistry.registerBlock(blutoniumBlock, blutoniumBlock.getUnlocalizedName());
		blutonium.setUnlocalizedName(blutoniumBlock.getUnlocalizedName());

		if(ConfigHandler.registerOwnSteam) {
			steam = new Fluid("steam");
			FluidRegistry.registerFluid(steam);
			steamBlock = new BlockFluidSteam(steam);
			GameRegistry.registerBlock(steamBlock, steamBlock.getUnlocalizedName());
			steam.setUnlocalizedName(steamBlock.getUnlocalizedName());
		}

		corium = new Fluid("corium");
		FluidRegistry.registerFluid(corium);
		coriumBlock = new BlockFluidCorium(corium);
		GameRegistry.registerBlock(coriumBlock, coriumBlock.getUnlocalizedName());
		corium.setUnlocalizedName(coriumBlock.getUnlocalizedName());
	}

}
