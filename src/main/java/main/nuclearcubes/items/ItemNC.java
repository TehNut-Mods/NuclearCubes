package main.nuclearcubes.items;

import main.nuclearcubes.ModInformation;
import main.nuclearcubes.NuclearCubes;
import net.minecraft.item.Item;

public class ItemNC extends Item {

	public ItemNC(String unlocName, String textureName) {
		super();

		setCreativeTab(NuclearCubes.tabNuclearCubes);
		setUnlocalizedName(ModInformation.ID + unlocName);
		setTextureName(ModInformation.ID + ":" + textureName);
	}

	public ItemNC(String unlocName) {
		super();

		setCreativeTab(NuclearCubes.tabNuclearCubes);
		setUnlocalizedName(ModInformation.ID + unlocName);
	}
}
