package main.bigreactors.tileentities;

import cpw.mods.fml.common.registry.GameRegistry;
import main.bigreactors.tileentities.reactor.TileEntityReactorController;

public class TERegistry {

	public static void registerTileEntities() {
		GameRegistry.registerTileEntity(TileEntityReactorController.class, "TileEntityReactorController");
	}

}
