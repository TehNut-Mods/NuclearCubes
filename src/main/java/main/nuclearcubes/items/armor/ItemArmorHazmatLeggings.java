package main.nuclearcubes.items.armor;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import main.nuclearcubes.ModInformation;
import main.nuclearcubes.NuclearCubes;
import net.minecraft.entity.Entity;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;

public class ItemArmorHazmatLeggings extends ItemArmor {

	public ItemArmorHazmatLeggings(ArmorMaterial material, int renderIndex, int armorType) {
		super(material, renderIndex, armorType);
		this.setCreativeTab(NuclearCubes.tabNuclearCubes);
		this.setUnlocalizedName(ModInformation.ID + ".armor.hazmat.leggings");
		this.setTextureName(ModInformation.ID + ":armor/hazmatLeggings");
	}

	@Override
	@SideOnly(Side.CLIENT)
	public String getArmorTexture(ItemStack Stack, Entity entity, int Slot, String type) {
		return ModInformation.ID + ":textures/models/armor/hazmat_layer2.png";
	}
}
