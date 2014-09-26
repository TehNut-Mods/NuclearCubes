package main.nuclearcubes.client.gui;

import cpw.mods.fml.client.config.GuiConfig;
import cpw.mods.fml.client.config.IConfigElement;
import main.nuclearcubes.ModInformation;
import net.minecraft.client.gui.GuiScreen;
import net.minecraft.util.StatCollector;

import java.util.ArrayList;
import java.util.List;

public class ConfigGui extends GuiConfig {

	public ConfigGui(GuiScreen parentScreen) {
		super(parentScreen, getConfigElements(parentScreen), ModInformation.ID, false, false, StatCollector.translateToLocal(ModInformation.ID + ".config.title"));
	}

	@SuppressWarnings("rawtypes")
	private static List<IConfigElement> getConfigElements(GuiScreen parent) {
		List<IConfigElement> list = new ArrayList<IConfigElement>();

		return list;
	}
}