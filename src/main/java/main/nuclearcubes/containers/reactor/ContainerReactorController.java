package main.nuclearcubes.containers.reactor;

import main.nuclearcubes.tile.reactor.TileEntityReactorController;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.InventoryPlayer;
import net.minecraft.inventory.Container;
import net.minecraft.inventory.Slot;
import net.minecraft.inventory.SlotFurnace;
import net.minecraft.item.ItemStack;

public class ContainerReactorController extends Container {

	public ContainerReactorController(EntityPlayer player, TileEntityReactorController entity) {
		createSlots(entity, player);
		bindPlayerInventory(player.inventory);
	}

	@Override
	public boolean canInteractWith(EntityPlayer player) {
		return this.isUseableByPlayer(player);
	}

	private boolean isUseableByPlayer(EntityPlayer player) {
		return true;
	}

	private void createSlots(TileEntityReactorController tile, EntityPlayer player) {
		addSlotToContainer(new Slot(tile, 0, 52, 16));
		addSlotToContainer(new SlotFurnace(player, tile, 1, 129, 34));
	}

	@Override
	public ItemStack transferStackInSlot(EntityPlayer par1EntityPlayer, int par2) {
		return null;
	}

	public void bindPlayerInventory(InventoryPlayer inv) {
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 9; j++) {
				addSlotToContainer(new Slot(inv, j + i * 9 + 9, 8 + j * 18, 84 + i * 18));
			}
		}
		for (int i = 0; i < 9; i++) {
			addSlotToContainer(new Slot(inv, i, 8 + i * 18, 142));
		}
	}

}
