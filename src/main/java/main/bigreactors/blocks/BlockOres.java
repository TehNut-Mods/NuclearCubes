package main.bigreactors.blocks;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import main.bigreactors.BigReactors;
import main.bigreactors.ModInformation;
import net.minecraft.block.BlockOre;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.IIcon;

import java.util.List;

public class BlockOres extends BlockOre {
	public IIcon[] icon = new IIcon[4];

	public BlockOres() {
		super();
		this.setHardness(5F);
		this.setBlockName(ModInformation.ID + ".ores");
		this.setCreativeTab(BigReactors.tabBigReactors);
	}

	@Override
	@SideOnly(Side.CLIENT)
	public void registerBlockIcons(IIconRegister ir) {
		this.icon[0] = ir.registerIcon(ModInformation.ID + ":ores/yelloriteOre");
	}

	@Override
	@SideOnly(Side.CLIENT)
	public IIcon getIcon(int side, int meta) {
		return this.icon[meta];
	}

	@SuppressWarnings({"unchecked", "rawtypes"})
	@Override
	@SideOnly(Side.CLIENT)
	public void getSubBlocks(Item id, CreativeTabs tab, List list) {
		for (int i = 0; i < 1; i++) {
			list.add(new ItemStack(id, 1, i));
		}
	}

	@Override
	public int damageDropped(int meta) {
		return meta;
	}
}
