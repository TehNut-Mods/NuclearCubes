package main.bigreactors;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.network.NetworkRegistry;
import cpw.mods.fml.common.registry.GameRegistry;
import main.bigreactors.blocks.BlockRecipeRegistry;
import main.bigreactors.blocks.BlockRegistry;
import main.bigreactors.fluids.BRFluidRegistry;
import main.bigreactors.gui.CreativeTabBigReactors;
import main.bigreactors.gui.GuiHandler;
import main.bigreactors.items.ItemRecipeRegistry;
import main.bigreactors.items.ItemRegistry;
import main.bigreactors.proxies.CommonProxy;
import main.bigreactors.tileentities.TERegistry;
import main.bigreactors.util.GenerationHandler;
import main.bigreactors.util.OreDictHandler;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraftforge.common.config.Configuration;

@Mod(modid = ModInformation.ID, name = ModInformation.NAME, version = ModInformation.VERSION)
public class BigReactors {

	public static CreativeTabs tabBigReactors = new CreativeTabBigReactors("bigReactors.creativeTab");

	@Instance
	public static BigReactors instance;
	Configuration config;

	@SidedProxy(clientSide = "main.bigreactors.proxies.ClientProxy", serverSide = "main.bigreactors.proxies.CommonProxy")
	public static CommonProxy proxy;

	@EventHandler
	public void preInit(FMLPreInitializationEvent event) {
		config = new Configuration(event.getSuggestedConfigurationFile());
		ConfigHandler.init(config);

		BlockRegistry.registerBlocks();
		ItemRegistry.registerItems();
		TERegistry.registerTileEntities();
		BRFluidRegistry.registerFluids();

		ItemRecipeRegistry.registerFullRecipes();
		BlockRecipeRegistry.registerFullRecipes();

		OreDictHandler.registerFullOreDict();
		GameRegistry.registerWorldGenerator(new GenerationHandler(), 2);
		NetworkRegistry.INSTANCE.registerGuiHandler(BigReactors.instance, new GuiHandler());

		proxy.initRenderers();
		proxy.initSounds();
	}

	@EventHandler
	public void init(FMLInitializationEvent event) {

	}

	@EventHandler
	public void postInit(FMLPostInitializationEvent event) {

	}

}
