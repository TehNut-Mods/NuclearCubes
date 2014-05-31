package main.bigreactors.blocks;

import cpw.mods.fml.common.registry.GameRegistry;
import main.bigreactors.blocks.reactor.BlockReactorCasing;
import main.bigreactors.blocks.reactor.BlockReactorController;
import main.bigreactors.blocks.reactor.BlockReactorGlass;
import main.bigreactors.items.blocks.ItemBlockOres;
import net.minecraft.block.Block;

public class BlockRegistry {

	//reactor
	public static Block casingReactor;
	public static Block glassReactor;
	public static Block controllerReactor;

	//ores
	public static Block blockOres;

	public static void registerBlocks() {

		//reactor
		casingReactor = new BlockReactorCasing();
		GameRegistry.registerBlock(casingReactor, "BlockReactorCasing");
		glassReactor = new BlockReactorGlass();
		GameRegistry.registerBlock(glassReactor, "BlockReactorGlass");
		controllerReactor = new BlockReactorController();
		GameRegistry.registerBlock(controllerReactor, "BlockReactorController");


		//ores
		blockOres = new BlockOres();
		GameRegistry.registerBlock(blockOres, ItemBlockOres.class, blockOres.getUnlocalizedName());
	}

}
