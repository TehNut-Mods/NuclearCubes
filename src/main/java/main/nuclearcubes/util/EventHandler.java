package main.nuclearcubes.util;

import cpw.mods.fml.client.event.ConfigChangedEvent;
import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import main.nuclearcubes.ConfigHandler;
import main.nuclearcubes.ModInformation;
import main.nuclearcubes.NuclearCubes;

public class EventHandler {

	@SubscribeEvent
	public void onConfigChanged(ConfigChangedEvent.OnConfigChangedEvent eventArgs) {
		if (eventArgs.modID.equals(ModInformation.ID)) {
			ConfigHandler.syncConfig();
			NuclearCubes.logger.info(TextHelper.localize("info.nuclearcubes.console.config.refresh"));
		}
	}
}
