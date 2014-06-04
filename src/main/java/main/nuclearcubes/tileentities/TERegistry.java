package main.nuclearcubes.tileentities;

import cpw.mods.fml.common.registry.GameRegistry;
import main.nuclearcubes.tileentities.reactor.TileEntityReactorController;

public class TERegistry {

	public static void registerTileEntities() {
		GameRegistry.registerTileEntity(TileEntityReactorController.class, "TileEntityReactorController");
	}

}
