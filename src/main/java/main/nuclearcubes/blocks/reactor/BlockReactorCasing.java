package main.nuclearcubes.blocks.reactor;

import main.nuclearcubes.NuclearCubes;
import main.nuclearcubes.ModInformation;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class BlockReactorCasing extends Block {

	public BlockReactorCasing() {
		super(Material.iron);
		this.setBlockName(ModInformation.ID + ".reactor.casing");
		this.setBlockTextureName(ModInformation.ID + ":machines/reactor/reactorCasing_default");
		this.setStepSound(soundTypeMetal);
		this.setCreativeTab(NuclearCubes.tabNuclearCubes);
		this.setHardness(7);
	}
}
