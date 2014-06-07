package main.nuclearcubes.blocks;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import main.nuclearcubes.ModInformation;
import main.nuclearcubes.NuclearCubes;
import main.nuclearcubes.tileentities.TileEntityFuelReprocessor;
import net.minecraft.block.BlockContainer;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.IIcon;
import net.minecraft.world.World;

public class BlockFuelReprocessor extends BlockContainer {

	public IIcon casingTex;
	public IIcon reprocessorOn;

	public BlockFuelReprocessor() {

		super(Material.iron);
		this.setBlockName(ModInformation.ID + ".fuel.reprocessor");
		this.setBlockTextureName(ModInformation.ID + ":machines/fuelReprocessor_off");
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
		blockIcon = icon.registerIcon(ModInformation.ID + ":machines/fuelReprocessor_off");
		reprocessorOn = icon.registerIcon(ModInformation.ID + ":machines/fuelReprocessor_on");
		casingTex = icon.registerIcon(ModInformation.ID + ":machines/reactor/reactorCasing_default");
	}

	@Override
	public TileEntity createNewTileEntity(World var1, int var2) {
		return null;
	}

	@Override
	public boolean onBlockActivated(World world, int x, int y, int z, EntityPlayer player, int par6, float par7, float par8, float par9) {

		TileEntityFuelReprocessor tile = (TileEntityFuelReprocessor) world.getTileEntity(x, y, z);

		if (!world.isRemote && tile instanceof TileEntityFuelReprocessor) {
			player.openGui(NuclearCubes.instance, 1, world, x, y, z);
		}
		return true;
	}

}
