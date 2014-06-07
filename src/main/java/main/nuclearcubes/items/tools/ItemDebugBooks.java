package main.nuclearcubes.items.tools;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import main.nuclearcubes.ModInformation;
import main.nuclearcubes.NuclearCubes;
import main.nuclearcubes.util.TextHelper;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.IIcon;

import java.util.List;

public class ItemDebugBooks extends Item {


	public IIcon[] icon = new IIcon[4];

	public ItemDebugBooks() {
		this.setCreativeTab(NuclearCubes.tabNuclearCubes);
		this.setHasSubtypes(true);
		this.setMaxDamage(0);
		this.setMaxStackSize(1);
	}

	@Override
	public String getUnlocalizedName(ItemStack itemstack) {
		String name = "";
		switch (itemstack.getItemDamage()) {
			case 0: {
				name = "debug.redBook";
				break;
			}
			case 1: {
				name = "debug.greenBook";
				break;
			}
			case 2: {
				name = "debug.blueBook";
				break;
			}
			case 3: {
				name = "debug.purpleBook";
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
		this.icon[0] = ri.registerIcon(ModInformation.ID + ":debug/redBook");
		this.icon[1] = ri.registerIcon(ModInformation.ID + ":debug/greenBook");
		this.icon[2] = ri.registerIcon(ModInformation.ID + ":debug/blueBook");
		this.icon[3] = ri.registerIcon(ModInformation.ID + ":debug/purpleBook");
	}

	@SuppressWarnings({"rawtypes", "unchecked"})
	@SideOnly(Side.CLIENT)
	public void getSubItems(Item item, CreativeTabs par2CreativeTabs, List list) {
		for (int i = 0; i <= 3; i++) {
			list.add(new ItemStack(this, 1, i));
		}
	}

//	@Override
//	public ItemStack onItemRightClick(ItemStack itemStack, World world, EntityPlayer player) {
//		if(itemStack.getItemDamage() == 0 && !world.isRemote && player.isSneaking()) {
//			return null;
//		} else if(itemStack.getItemDamage() == 1 && !world.isRemote && player.isSneaking()) {
//			return null;
//		} else if(itemStack.getItemDamage() == 2 && !world.isRemote && player.isSneaking()) {
//			return null;
//		} else if(itemStack.getItemDamage() == 3 && !world.isRemote && player.isSneaking()) {
//			return null;
//		}
//		return null;
//	}

	@Override
	public void addInformation(ItemStack itemStack, EntityPlayer player, List list, boolean par4) {
		if(itemStack.getItemDamage() == 0) {
			list.add(TextHelper.RED + "Red book");
		} else if(itemStack.getItemDamage() == 1) {
			list.add(TextHelper.GREEN + "Green book");
		} else if(itemStack.getItemDamage() == 2) {
			list.add(TextHelper.LIGHT_BLUE + "Blue book");
		} else if(itemStack.getItemDamage() == 3) {
			list.add(TextHelper.PURPLE + "Purple book");
		}
	}
}
