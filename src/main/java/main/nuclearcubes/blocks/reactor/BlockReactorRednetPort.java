package main.nuclearcubes.blocks.reactor;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import main.nuclearcubes.NuclearCubes;
import main.nuclearcubes.ModInformation;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.util.IIcon;

public class BlockReactorRednetPort extends Block {

	private IIcon rednetPort;
	private IIcon casingTex;

	public BlockReactorRednetPort() {
		super(Material.iron);
		this.setBlockName(ModInformation.ID + ".reactor.rednetport");
		this.setBlockTextureName(ModInformation.ID + ":machines/reactor/reactorRednetPort");
		this.setStepSound(soundTypeMetal);
		this.setCreativeTab(NuclearCubes.tabNuclearCubes);
		this.setHardness(7);
	}

	@Override
	@SideOnly(Side.CLIENT)
	public IIcon getIcon(int side, int meta) {
		if (side == 1 || side == 0) {
			return this.casingTex;
		} else {
			return this.rednetPort;
		}
	}

	@Override
	@SideOnly(Side.CLIENT)
	public void registerBlockIcons(IIconRegister icon) {
		this.rednetPort = icon.registerIcon(ModInformation.ID + ":machines/reactor/reactorRednetPort");
		this.casingTex = icon.registerIcon(ModInformation.ID + ":machines/reactor/reactorCasing_default");
	}

}
