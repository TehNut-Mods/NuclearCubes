package main.nuclearcubes.blocks.machines;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import main.nuclearcubes.ModInformation;
import main.nuclearcubes.NuclearCubes;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.util.IIcon;

public class BlockInfuser extends Block {

	public IIcon casingTex;
	public IIcon infuserOn;

	public BlockInfuser() {
		super(Material.iron);
		this.setBlockName(ModInformation.ID + ".machine.infuser");
		this.setBlockTextureName(ModInformation.ID + ":machines/infuser_off");
		this.setStepSound(soundTypeMetal);
		this.setCreativeTab(NuclearCubes.tabNuclearCubes);
		this.setHardness(7);
	}

	@Override
	@SideOnly(Side.CLIENT)
	public IIcon getIcon(int side, int meta) {
		if (side == 1 || side == 0) {
			return casingTex;
		} else {
			return blockIcon;
		}
	}

	@Override
	@SideOnly(Side.CLIENT)
	public void registerBlockIcons(IIconRegister icon) {
		blockIcon = icon.registerIcon(ModInformation.ID + ":machines/infuser_off");
		infuserOn = icon.registerIcon(ModInformation.ID + ":machines/infuser_on");
		casingTex = icon.registerIcon(ModInformation.ID + ":machines/reactor/reactorCasing_default");
	}

}
