package main.nuclearcubes.blocks.reactor;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import main.nuclearcubes.NuclearCubes;
import main.nuclearcubes.ModInformation;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.IIcon;

import java.util.List;

public class BlockReactorFuelRods extends Block {

	public IIcon[] icon = new IIcon[4];
	public IIcon rodEnd;

	public BlockReactorFuelRods() {
		super(Material.glass);
		this.setBlockName(ModInformation.ID + ".reactor.fuelrod");
		this.setStepSound(soundTypeGlass);
		this.setCreativeTab(NuclearCubes.tabNuclearCubes);
		this.setHardness(7F);
	}

	@Override
	@SideOnly(Side.CLIENT)
	public void registerBlockIcons(IIconRegister ir) {
		this.rodEnd = ir.registerIcon(ModInformation.ID + ":machines/reactor/reactorFuelRod_end");
		this.icon[0] = ir.registerIcon(ModInformation.ID + ":machines/reactor/reactorFuelRod_side");
		this.icon[1] = ir.registerIcon(ModInformation.ID + ":machines/reactor/reactorYelloriumFuelRod_side");
		this.icon[2] = ir.registerIcon(ModInformation.ID + ":machines/reactor/reactorBlutoniumFuelRod_side");
	}

	@Override
	@SideOnly(Side.CLIENT)
	public IIcon getIcon(int side, int meta) {
		if (side == 1 || side == 0) {
			return this.rodEnd;
		} else {
			return this.icon[meta];
		}
	}

	@SuppressWarnings({"unchecked", "rawtypes"})
	@Override
	@SideOnly(Side.CLIENT)
	public void getSubBlocks(Item id, CreativeTabs tab, List list) {
		for (int i = 0; i < 3; i++) {
			list.add(new ItemStack(id, 1, i));
		}
	}

	@Override
	public int damageDropped(int meta) {
		return meta;
	}

	@SideOnly(Side.CLIENT)
	public int getRenderBlockPass() {
		return 0;
	}

	public boolean isOpaqueCube() {
		return false;
	}

	public boolean renderAsNormalBlock() {
		return false;
	}

	public boolean shouldSideBeRendered() {
		return true;
	}


}
