package main.bigreactors.blocks.reactor;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import main.bigreactors.BigReactors;
import main.bigreactors.ModInformation;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.util.IIcon;

public class BlockReactorAccessPort extends Block {

	public IIcon accessPortSideInlet;
	public IIcon accessPortSideOutlet;
	public IIcon casingTex;

	public BlockReactorAccessPort() {
		super(Material.iron);
		this.setBlockName(ModInformation.ID + ".reactor.accessport");
		this.setBlockTextureName(ModInformation.ID + ":machines/reactor/reactorAccessPortInlet");
		this.setStepSound(soundTypeMetal);
		this.setCreativeTab(BigReactors.tabBigReactors);
		this.setHardness(7);
	}

	@Override
	@SideOnly(Side.CLIENT)
	public IIcon getIcon(int side, int meta) {
		if (side == 1) {
			return this.casingTex;
		} else {
			return this.accessPortSideInlet;
		}
	}

	@Override
	@SideOnly(Side.CLIENT)
	public void registerBlockIcons(IIconRegister icon) {
		this.casingTex = icon.registerIcon(ModInformation.ID + ":machines/reactor/reactorCasing_default");
		this.accessPortSideInlet = icon.registerIcon(ModInformation.ID + ":machines/reactor/reactorAccessPortInlet");
		this.accessPortSideOutlet = icon.registerIcon(ModInformation.ID + ":machines/reactor/reactorAccessPortOutlet");
	}

}
