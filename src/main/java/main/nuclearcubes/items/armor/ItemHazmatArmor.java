package main.nuclearcubes.items.armor;

import cofh.core.item.ItemArmorAdv;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import main.nuclearcubes.ModInformation;
import main.nuclearcubes.NuclearCubes;
import net.minecraft.entity.Entity;
import net.minecraft.item.ItemStack;

public class ItemHazmatArmor extends ItemArmorAdv {

	public ItemHazmatArmor(ArmorMaterial material, int type) {
		super(material, type);
		this.isRepairable();
		this.setRepairIngot("wool");
		this.setCreativeTab(NuclearCubes.tabNuclearCubes);

		switch (type) {
			case 0: {
				this.setTextureName(ModInformation.ID + ":armor/hazmatHelm");
				this.setUnlocalizedName(ModInformation.ID + ".armor.hazmat.helm");
				this.setMaxDamage(50);
				break;
			}
			case 1: {
				this.setTextureName(ModInformation.ID + ":armor/hazmatChestplate");
				this.setUnlocalizedName(ModInformation.ID + ".armor.hazmat.chestplate");
				this.setMaxDamage(80);
				break;
			}
			case 2: {
				this.setTextureName(ModInformation.ID + ":armor/hazmatLeggings");
				this.setUnlocalizedName(ModInformation.ID + ".armor.hazmat.leggings");
				this.setMaxDamage(70);
				break;
			}
			case 3: {
				this.setTextureName(ModInformation.ID + ":armor/hazmatBoots");
				this.setUnlocalizedName(ModInformation.ID + ".armor.hazmat.boots");
				this.setMaxDamage(40);
				break;
			}
		}
	}

	@Override
	@SideOnly(Side.CLIENT)
	public String getArmorTexture(ItemStack Stack, Entity entity, int Slot, String type) {
		switch (Slot) {
			case 0: {
				return ModInformation.ID + ":textures/models/armor/hazmatArmor_1.png";
			}
			case 1: {
				return ModInformation.ID + ":textures/models/armor/hazmatArmor_1.png";
			}
			case 2: {
				return ModInformation.ID + ":textures/models/armor/hazmatArmor_2.png";
			}
			case 3: {
				return ModInformation.ID + ":textures/models/armor/hazmatArmor_1.png";
			}
		}
		return type;
	}
}
