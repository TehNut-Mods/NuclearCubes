package main.nuclearcubes.items;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import main.nuclearcubes.ModInformation;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.IIcon;

import java.util.List;

public class ItemMaterials extends ItemNC {

	public IIcon[] icon = new IIcon[1];

	public ItemMaterials() {
		super(".material");

		this.setHasSubtypes(true);
	}

	@Override
	public String getUnlocalizedName(ItemStack itemstack) {
		String name = "";
		switch (itemstack.getItemDamage()) {
			case 0: {
				name = "filter";
				break;
			}
			default:
				name = "nothing";
				break;
		}
		return getUnlocalizedName() + "." + name;
	}

	@SideOnly(Side.CLIENT)
	public void registerIcons(IIconRegister ri) {
		this.icon[0] = ri.registerIcon(ModInformation.ID + ":materials/filterHazmat");
	}

	@SuppressWarnings({"rawtypes", "unchecked"})
	@SideOnly(Side.CLIENT)
	public void getSubItems(Item item, CreativeTabs par2CreativeTabs, List list) {
		for (int i = 0; i <= 0; i++) {
			list.add(new ItemStack(this, 1, i));
		}
	}
}
