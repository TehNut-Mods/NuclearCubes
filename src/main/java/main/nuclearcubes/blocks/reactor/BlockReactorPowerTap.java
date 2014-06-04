package main.nuclearcubes.blocks.reactor;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import main.nuclearcubes.NuclearCubes;
import main.nuclearcubes.ModInformation;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.util.IIcon;

public class BlockReactorPowerTap extends Block {

	private IIcon powerTapConnected;
	private IIcon powerTapDisconnected;
	private IIcon casingTex;

	public BlockReactorPowerTap() {
		super(Material.iron);
		this.setBlockName(ModInformation.ID + ".reactor.powertap");
		this.setBlockTextureName(ModInformation.ID + ":machines/reactor/reactorPowerTap_disconnected");
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
			return this.powerTapDisconnected;
		}
	}

	@Override
	@SideOnly(Side.CLIENT)
	public void registerBlockIcons(IIconRegister icon) {
		this.powerTapConnected = icon.registerIcon(ModInformation.ID + ":machines/reactor/reactorPowerTap_connected");
		this.powerTapDisconnected = icon.registerIcon(ModInformation.ID + ":machines/reactor/reactorPowerTap_disconnected");
		this.casingTex = icon.registerIcon(ModInformation.ID + ":machines/reactor/reactorCasing_default");
	}

}
