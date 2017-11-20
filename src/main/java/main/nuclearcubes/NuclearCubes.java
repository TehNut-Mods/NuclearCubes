package main.nuclearcubes;

import cpw.mods.fml.common.FMLCommonHandler;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.network.NetworkRegistry;
import cpw.mods.fml.common.registry.GameRegistry;
import main.nuclearcubes.blocks.BlockRecipeRegistry;
import main.nuclearcubes.blocks.BlockRegistry;
import main.nuclearcubes.client.gui.CreativeTabNuclearCubes;
import main.nuclearcubes.client.gui.GuiHandler;
import main.nuclearcubes.items.ItemRecipeRegistry;
import main.nuclearcubes.items.ItemRegistry;
import main.nuclearcubes.proxies.CommonProxy;
import main.nuclearcubes.util.EventHandler;
import main.nuclearcubes.util.GenerationHandler;
import main.nuclearcubes.util.OreDictHandler;
import net.minecraft.creativetab.CreativeTabs;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

@Mod(modid = ModInformation.ID, name = ModInformation.NAME, version = ModInformation.VERSION, dependencies = ModInformation.REQUIRED, guiFactory = ModInformation.GUIFACTORY)
public class NuclearCubes {

	@SidedProxy(clientSide = ModInformation.CLIENTPROXY, serverSide = ModInformation.COMMONPROXY)
	public static CommonProxy proxy;

	public static CreativeTabs tabNuclearCubes = new CreativeTabNuclearCubes(ModInformation.ID + ".creativeTab");
	public static Logger logger = LogManager.getLogger(ModInformation.NAME);

	@Mod.Instance
	public static NuclearCubes instance;

	@Mod.EventHandler
	public void preInit(FMLPreInitializationEvent event) {

		ConfigHandler.init(event.getSuggestedConfigurationFile());

		ItemRegistry.registerItems();
		BlockRegistry.registerBlocks();

		OreDictHandler.registerOreDict();
		FMLCommonHandler.instance().bus().register(new EventHandler());
		NetworkRegistry.INSTANCE.registerGuiHandler(instance, new GuiHandler());

		GameRegistry.registerWorldGenerator(new GenerationHandler(), 2);
	}

	@Mod.EventHandler
	public void init(FMLInitializationEvent event) {

		ItemRecipeRegistry.registerItemRecipes();
		BlockRecipeRegistry.registerBlockRecipes();
	}

	@Mod.EventHandler
	public void postInit(FMLPostInitializationEvent event) {
	}
}
