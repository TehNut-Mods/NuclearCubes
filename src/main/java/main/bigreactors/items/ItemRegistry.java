package main.bigreactors.items;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.item.Item;

public class ItemRegistry {

	//ingots
	public static Item ingots;
	public static Item dusts;

	public static void registerItems() {

		ingots = new ItemIngots().setUnlocalizedName("bigreactors");
		GameRegistry.registerItem(ingots, "ItemIngots");
		dusts = new ItemDusts().setUnlocalizedName("bigreactors");
		GameRegistry.registerItem(dusts, "ItemDusts");
	}

}
