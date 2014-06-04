package main.nuclearcubes.blocks;

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

public class BlockIngotStorage extends Block {

	public IIcon[] icon = new IIcon[4];

	public BlockIngotStorage() {
		super(Material.iron);
		this.setHardness(0.5F);
		this.setCreativeTab(NuclearCubes.tabNuclearCubes);
	}

	@Override
	@SideOnly(Side.CLIENT)
	public void registerBlockIcons(IIconRegister ir) {
		this.icon[0] = ir.registerIcon(ModInformation.ID + ":storage/yelloriumStorage");
		this.icon[1] = ir.registerIcon(ModInformation.ID + ":storage/cyaniteStorage");
		this.icon[2] = ir.registerIcon(ModInformation.ID + ":storage/blutoniumStorage");
		this.icon[3] = ir.registerIcon(ModInformation.ID + ":storage/graphiteStorage");
	}

	@Override
	@SideOnly(Side.CLIENT)
	public IIcon getIcon(int side, int meta) {
		return this.icon[meta];
	}

	@SuppressWarnings({ "unchecked", "rawtypes" })
	@Override
	@SideOnly(Side.CLIENT)
	public void getSubBlocks(Item id, CreativeTabs tab, List list) {
		for (int i = 0; i < 4; i++) {
			list.add(new ItemStack(id, 1, i));
		}
	}

	@Override
	public int damageDropped(int meta) {
		return meta;
	}

}
