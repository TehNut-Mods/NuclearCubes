package main.nuclearcubes;

import net.minecraftforge.common.config.Configuration;

import java.io.File;

public class ConfigHandler {

	public static Configuration config;

	// sections to add to the config

	// options in the config

	public static void init(File file) {
		config = new Configuration(file);

		syncConfig();
	}

	public static void syncConfig() {

		config.save();
	}
}
