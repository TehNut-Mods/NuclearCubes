package main.nuclearcubes.util;

import net.minecraftforge.oredict.OreDictionary;

public class OreDictHandler {

	//Oredict entries
	//items

	//blocks

	public static void registerOreDict() {
	}

	public static boolean oreNameExists(String oreName) {

		return !OreDictionary.getOres(oreName).isEmpty();
	}
}