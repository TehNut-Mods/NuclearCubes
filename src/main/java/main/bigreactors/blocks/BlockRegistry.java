package main.bigreactors.blocks;

import cpw.mods.fml.common.registry.GameRegistry;
import main.bigreactors.ModInformation;
import main.bigreactors.blocks.fluids.BlockFluidBlutonium;
import main.bigreactors.blocks.fluids.BlockFluidCyanite;
import main.bigreactors.blocks.fluids.BlockFluidSteam;
import main.bigreactors.blocks.fluids.BlockFluidYellorium;
import main.bigreactors.blocks.reactor.BlockReactorCasing;
import main.bigreactors.blocks.reactor.BlockReactorController;
import main.bigreactors.blocks.reactor.BlockReactorGlass;
import main.bigreactors.items.blocks.ItemBlockIngotStorage;
import main.bigreactors.items.blocks.ItemBlockOres;
import net.minecraft.block.Block;
import net.minecraftforge.fluids.Fluid;
import net.minecraftforge.fluids.FluidRegistry;

public class BlockRegistry {

	//fluid materials

	//reactor
	public static Block casingReactor;
	public static Block glassReactor;
	public static Block controllerReactor;

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

	public static void registerBlocks() {

		//reactor
		casingReactor = new BlockReactorCasing();
		GameRegistry.registerBlock(casingReactor, "BlockReactorCasing");
		glassReactor = new BlockReactorGlass();
		GameRegistry.registerBlock(glassReactor, "BlockReactorGlass");
		controllerReactor = new BlockReactorController();
		GameRegistry.registerBlock(controllerReactor, "BlockReactorController");


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

		steam = new Fluid("steam");
		FluidRegistry.registerFluid(steam);
		steamBlock = new BlockFluidSteam(steam);
		GameRegistry.registerBlock(steamBlock, steamBlock.getUnlocalizedName());
		steam.setUnlocalizedName(steamBlock.getUnlocalizedName());
	}

}
