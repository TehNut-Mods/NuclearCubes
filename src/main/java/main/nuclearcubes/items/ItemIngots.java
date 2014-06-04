package main.nuclearcubes.items;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import main.nuclearcubes.NuclearCubes;
import main.nuclearcubes.ModInformation;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.IIcon;

import java.util.List;

public class ItemIngots extends Item {


	public IIcon[] icon = new IIcon[5];

	public ItemIngots() {
		this.setCreativeTab(NuclearCubes.tabNuclearCubes);
		this.setHasSubtypes(true);
		this.setMaxDamage(0);
	}

	@Override
	public String getUnlocalizedName(ItemStack itemstack) {
		String name = "";
		switch (itemstack.getItemDamage()) {
			case 0: {
				name = "ingot.yellorium";
				break;
			}
			case 1: {
				name = "ingot.cyanite";
				break;
			}
			case 2: {
				name = "ingot.blutonium";
				break;
			}
			case 3: {
				name = "ingot.graphite";
				break;
			}
			default:
				name = "nothing";
				break;
		}
		return getUnlocalizedName() + "." + name;
	}

	@SideOnly(Side.CLIENT)
	public IIcon getIconFromDamage(int meta) {
		return this.icon[meta];
	}

	@SideOnly(Side.CLIENT)
	public void registerIcons(IIconRegister ri) {
		this.icon[0] = ri.registerIcon(ModInformation.ID + ":ingots/ingotYellorium");
		this.icon[1] = ri.registerIcon(ModInformation.ID + ":ingots/ingotCyanite");
		this.icon[2] = ri.registerIcon(ModInformation.ID + ":ingots/ingotBlutonium");
		this.icon[3] = ri.registerIcon(ModInformation.ID + ":ingots/ingotGraphite");
	}

	@SuppressWarnings({"rawtypes", "unchecked"})
	@SideOnly(Side.CLIENT)
	public void getSubItems(Item item, CreativeTabs par2CreativeTabs, List list) {
		for (int i = 0; i <= 3; i++) {
			list.add(new ItemStack(this, 1, i));
		}
	}
}
