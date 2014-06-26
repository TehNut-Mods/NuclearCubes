package main.nuclearcubes.tile.machines;

import main.nuclearcubes.tile.TileEntityBase;
import net.minecraft.item.ItemStack;

public class TileEntityInfuser extends TileEntityBase {

	private String field_145958_o;

	public TileEntityInfuser() {
	}

	@Override
	public String getInventoryName() {
		return "Infuser";
	}

	@Override
	public boolean hasCustomInventoryName() {
		return true;
	}

	@Override
	public boolean isItemValidForSlot(int slot, ItemStack stack) {
		return false;
	}

	@Override
	public int[] getAccessibleSlotsFromSide(int side) {
		return new int[]{0, 1};
	}

	@Override
	public boolean canInsertItem(int var1, ItemStack var2, int var3) {
		return true;
	}

	@Override
	public boolean canExtractItem(int slot, ItemStack stack, int side) {
		return slot == 1;
	}

	public void func_145951_a(String displayName) {
		this.field_145958_o = displayName;
	}

	@Override
	public void updateEntity() {
	}

	public int getScaledProgress(int scale) {
		return scale;
	}
}
