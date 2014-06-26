package main.nuclearcubes;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.network.NetworkRegistry;
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.relauncher.Side;
import main.nuclearcubes.blocks.BlockRecipeRegistry;
import main.nuclearcubes.blocks.BlockRegistry;
import main.nuclearcubes.gui.CreativeTabNuclearCubes;
import main.nuclearcubes.gui.GuiHandler;
import main.nuclearcubes.items.ItemRecipeRegistry;
import main.nuclearcubes.items.ItemRegistry;
import main.nuclearcubes.proxies.CommonProxy;
import main.nuclearcubes.tile.TERegistry;
import main.nuclearcubes.util.BucketHandler;
import main.nuclearcubes.util.CapeEventHandler;
import main.nuclearcubes.util.GenerationHandler;
import main.nuclearcubes.util.OreDictHandler;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.common.config.Configuration;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

@Mod(modid = ModInformation.ID, name = ModInformation.NAME, version = ModInformation.VERSION)
public class NuclearCubes {

	public static CreativeTabs tabNuclearCubes = new CreativeTabNuclearCubes(ModInformation.ID + ".creativeTab");
	public static Logger logger = LogManager.getLogger(ModInformation.NAME);

	@Instance
	public static NuclearCubes instance;
	Configuration config;

	@SidedProxy(clientSide = "main.nuclearcubes.proxies.ClientProxy", serverSide = "main.nuclearcubes.proxies.CommonProxy")
	public static CommonProxy proxy;

	@EventHandler
	public void preInit(FMLPreInitializationEvent event) {
		config = new Configuration(event.getSuggestedConfigurationFile());
		ConfigHandler.init(config);

		BlockRegistry.registerBlocks();
		ItemRegistry.registerFullItems();
		TERegistry.registerTileEntities();

		OreDictHandler.registerFullOreDict();
		GameRegistry.registerWorldGenerator(new GenerationHandler(), 2);
		NetworkRegistry.INSTANCE.registerGuiHandler(NuclearCubes.instance, new GuiHandler());
		MinecraftForge.EVENT_BUS.register(BucketHandler.INSTANCE);
	}

	@EventHandler
	public void init(FMLInitializationEvent event) {

		BlockRecipeRegistry.registerFullRecipes();
		ItemRecipeRegistry.registerFullRecipes();
		ItemRecipeRegistry.registerMachineRecipes();
		if (event.getSide() == Side.CLIENT && ConfigHandler.enableCapes) {
			MinecraftForge.EVENT_BUS.register(new CapeEventHandler());
		}
	}

	@EventHandler
	public void postInit(FMLPostInitializationEvent event) {

	}

}
