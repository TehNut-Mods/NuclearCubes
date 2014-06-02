package main.bigreactors.blocks.reactor;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import main.bigreactors.BigReactors;
import main.bigreactors.ModInformation;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.util.IIcon;

public class BlockReactorControlRod extends Block {

	public IIcon controlRodTop;

	public BlockReactorControlRod() {
		super(Material.iron);
		this.setBlockName(ModInformation.ID + ".reactor.controlrod");
		this.setBlockTextureName(ModInformation.ID + ":machines/reactor/reactorControlRod");
		this.setStepSound(soundTypeMetal);
		this.setCreativeTab(BigReactors.tabBigReactors);
		this.setHardness(7);
	}

	@Override
	@SideOnly(Side.CLIENT)
	public IIcon getIcon(int side, int meta) {
		if (side == 1) {
			return this.controlRodTop;
		} else {
			return this.blockIcon;
		}
	}

	@Override
	@SideOnly(Side.CLIENT)
	public void registerBlockIcons(IIconRegister icon) {
		this.blockIcon = icon.registerIcon(ModInformation.ID + ":machines/reactor/reactorCasing_default");
		this.controlRodTop = icon.registerIcon(ModInformation.ID + ":machines/reactor/reactorControlRod");
	}
}
