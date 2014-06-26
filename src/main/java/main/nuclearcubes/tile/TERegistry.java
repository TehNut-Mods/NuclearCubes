package main.nuclearcubes.tile;

import cpw.mods.fml.common.registry.GameRegistry;
import main.nuclearcubes.tile.machines.TileEntityFuelReprocessor;
import main.nuclearcubes.tile.machines.TileEntityInfuser;
import main.nuclearcubes.tile.reactor.TileEntityReactorController;

public class TERegistry {

	public static void registerTileEntities() {
		//reactor
		GameRegistry.registerTileEntity(TileEntityReactorController.class, "TileEntityReactorController");

		//machines
		GameRegistry.registerTileEntity(TileEntityFuelReprocessor.class, "TileEntityFuelReprocessor");
		GameRegistry.registerTileEntity(TileEntityInfuser.class, "TileEntityInfuser");
	}
}
