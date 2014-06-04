package main.nuclearcubes.blocks.reactor;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import main.nuclearcubes.NuclearCubes;
import main.nuclearcubes.ModInformation;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.util.IIcon;

public class BlockReactorRedstonePort extends Block {

	private IIcon redstonePortLit;
	private IIcon redstonePortUnlit;
	private IIcon casingTex;

	public BlockReactorRedstonePort() {
		super(Material.iron);
		this.setBlockName(ModInformation.ID + ".reactor.redstoneport");
		this.setBlockTextureName(ModInformation.ID + ":machines/reactor/reactorRedstonePort_unlit");
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
			return this.redstonePortUnlit;
		}
	}

	@Override
	@SideOnly(Side.CLIENT)
	public void registerBlockIcons(IIconRegister icon) {
		this.redstonePortLit = icon.registerIcon(ModInformation.ID + ":machines/reactor/reactorRedstonePort_lit");
		this.redstonePortUnlit = icon.registerIcon(ModInformation.ID + ":machines/reactor/reactorRedstonePort_unlit");
		this.casingTex = icon.registerIcon(ModInformation.ID + ":machines/reactor/reactorCasing_default");
	}

}
