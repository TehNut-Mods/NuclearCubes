package main.nuclearcubes.items;

import cpw.mods.fml.common.registry.GameRegistry;
import main.nuclearcubes.items.armor.ItemHazmatArmor;
import net.minecraft.item.Item;
import net.minecraft.item.ItemArmor;
import net.minecraftforge.common.util.EnumHelper;

public class ItemRegistry {

	// armor materials
	public static final ItemArmor.ArmorMaterial ARMOR_MATERIAL_HAZMAT = EnumHelper.addArmorMaterial("NC_HAZMAT", 10, new int[]{0, 0, 0, 0}, 20);

	// items
	public static ItemNC materials;

	public static Item armorHazmatHelm;
	public static Item armorHazmatChestplate;
	public static Item armorHazmatLeggings;
	public static Item armorHazmatBoots;

	public static void registerItems() {
		materials = new ItemMaterials();
		GameRegistry.registerItem(materials, "ItemMaterials");

		armorHazmatHelm = (ItemHazmatArmor) new ItemHazmatArmor(ARMOR_MATERIAL_HAZMAT, 0);
		GameRegistry.registerItem(armorHazmatHelm, "ItemHazmatArmor.Helm");
		armorHazmatChestplate = (ItemHazmatArmor) new ItemHazmatArmor(ARMOR_MATERIAL_HAZMAT, 1);
		GameRegistry.registerItem(armorHazmatChestplate, "ItemHazmatArmor.Chestplate");
		armorHazmatLeggings = (ItemHazmatArmor) new ItemHazmatArmor(ARMOR_MATERIAL_HAZMAT, 2);
		GameRegistry.registerItem(armorHazmatLeggings, "ItemHazmatArmor.Leggings");
		armorHazmatBoots = (ItemHazmatArmor) new ItemHazmatArmor(ARMOR_MATERIAL_HAZMAT, 3);
		GameRegistry.registerItem(armorHazmatBoots, "ItemHazmatArmor.Boots");
	}
}
