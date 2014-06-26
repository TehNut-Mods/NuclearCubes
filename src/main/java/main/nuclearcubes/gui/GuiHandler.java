package main.nuclearcubes.gui;

import cpw.mods.fml.common.network.IGuiHandler;
import main.nuclearcubes.containers.machines.ContainerFuelReprocessor;
import main.nuclearcubes.containers.reactor.ContainerReactorController;
import main.nuclearcubes.gui.reactor.BlockGuiReactorController;
import main.nuclearcubes.tile.machines.TileEntityFuelReprocessor;
import main.nuclearcubes.tile.reactor.TileEntityReactorController;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.World;

public class GuiHandler implements IGuiHandler {

	@Override
	public Object getServerGuiElement(int ID, EntityPlayer player, World world, int x, int y, int z) {
		TileEntity entity = world.getTileEntity(x, y, z);
		if (entity != null) {
			switch (ID) {
				case 0:
					return new ContainerReactorController(player, (TileEntityReactorController) entity);
				case 1:
					return new ContainerFuelReprocessor(player, (TileEntityFuelReprocessor) entity);
			}
		}
		return null;
	}

	@Override
	public Object getClientGuiElement(int ID, EntityPlayer player, World world, int x, int y, int z) {
		TileEntity entity = world.getTileEntity(x, y, z);
		if (entity != null) {
			switch (ID) {
				case 0:
					return new BlockGuiReactorController(player, (TileEntityReactorController) entity);
				case 1:
					return new BlockGuiFuelReprocessor(player, (TileEntityFuelReprocessor) entity);
			}
		}
		return null;
	}
}