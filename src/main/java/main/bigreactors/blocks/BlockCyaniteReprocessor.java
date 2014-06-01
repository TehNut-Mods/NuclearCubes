package main.bigreactors.blocks;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import main.bigreactors.BigReactors;
import main.bigreactors.ModInformation;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.util.IIcon;

public class BlockCyaniteReprocessor extends Block {

	public IIcon casingTex;
	public IIcon reprocessorOn;

	public BlockCyaniteReprocessor() {

		super(Material.iron);
		this.setBlockName(ModInformation.ID + ".cyanite.reprocessor");
		this.setBlockTextureName(ModInformation.ID + ":machines/cyaniteReprocessor_off");
		this.setStepSound(soundTypeMetal);
		this.setCreativeTab(BigReactors.tabBigReactors);
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
		blockIcon = icon.registerIcon(ModInformation.ID + ":machines/cyaniteReprocessor_off");
		reprocessorOn = icon.registerIcon(ModInformation.ID + ":machines/cyaniteReprocessor_on");
		casingTex = icon.registerIcon(ModInformation.ID + ":machines/reactor/reactorCasing_default");
	}

}
