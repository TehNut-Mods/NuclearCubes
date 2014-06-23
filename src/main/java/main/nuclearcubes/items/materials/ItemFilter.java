package main.nuclearcubes.items.materials;

import main.nuclearcubes.ModInformation;
import main.nuclearcubes.NuclearCubes;
import net.minecraft.item.Item;

public class ItemFilter extends Item {

	public ItemFilter() {
		this.setCreativeTab(NuclearCubes.tabNuclearCubes);
		this.maxStackSize = 1;
		this.setTextureName(ModInformation.ID + ":materials/filter");
		this.setUnlocalizedName(ModInformation.ID + ".material.filter");
	}
}
