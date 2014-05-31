package main.bigreactors.gui;

import cpw.mods.fml.common.network.IGuiHandler;
import main.bigreactors.containers.ContainerReactorController;
import main.bigreactors.tileentities.reactor.TileEntityReactorController;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.World;

public class GuiHandler implements IGuiHandler {

	@Override
	public Object getServerGuiElement(int ID, EntityPlayer player, World world, int x, int y, int z) {
		TileEntity entity = world.getTileEntity(x, y, z);
		System.out.println("Server Active");
		if (entity != null) {
			switch (ID) {
				case 0:
					return new ContainerReactorController(player, (TileEntityReactorController) entity);
			}
		}
		return null;
	}

	@Override
	public Object getClientGuiElement(int ID, EntityPlayer player, World world, int x, int y, int z) {
		TileEntity entity = world.getTileEntity(x, y, z);
		System.out.println("Client Active");
		if (entity != null) {
			switch (ID) {
				case 0:
					return new BlockGuiReactorController(player, (TileEntityReactorController) entity);
			}
		}
		return null;
	}

}
