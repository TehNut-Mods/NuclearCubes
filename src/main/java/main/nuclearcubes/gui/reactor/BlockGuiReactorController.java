package main.nuclearcubes.gui.reactor;

import main.nuclearcubes.ModInformation;
import main.nuclearcubes.containers.reactor.ContainerReactorController;
import main.nuclearcubes.tile.reactor.TileEntityReactorController;
import main.nuclearcubes.util.TextHelper;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.inventory.GuiContainer;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.ResourceLocation;
import org.lwjgl.opengl.GL11;

public class BlockGuiReactorController extends GuiContainer {
	public static final ResourceLocation reactorControllerGui = new ResourceLocation(ModInformation.ID, "textures/guis/reactorController.png");

	@SuppressWarnings("unused")
	private ContainerReactorController container;
	private TileEntityReactorController te;
	String containerName = TextHelper.localize("info.nuclearcubes.gui.controller.name");

	public BlockGuiReactorController(EntityPlayer player, TileEntityReactorController tile) {
		super(new ContainerReactorController(player, tile));
		this.container = (ContainerReactorController) this.inventorySlots;
		this.te = tile;
	}

	@Override
	protected void drawGuiContainerForegroundLayer(int x, int y) {
		fontRendererObj.drawString(containerName, xSize / 2 - fontRendererObj.getStringWidth(containerName) / 2, 6, 4210752);
		fontRendererObj.drawString(TextHelper.localize("container.inventory"), 8, ySize - 96 + 2, 4210752);
	}

	@Override
	protected void drawGuiContainerBackgroundLayer(float par1, int par2, int par3) {
		GL11.glColor4f(1F, 1F, 1F, 1F);

		Minecraft.getMinecraft().getTextureManager().bindTexture(reactorControllerGui);
		drawTexturedModalRect(guiLeft, guiTop, 0, 0, xSize, ySize);

		int xStart = (width - xSize) / 2;
		int yStart = (height - ySize) / 2;
		this.drawTexturedModalRect(xStart, yStart, 0, 0, xSize, ySize);

		int i1 = this.te.getScaledProgress(24);
		this.drawTexturedModalRect(xStart + 81, yStart + 34, 176, 14, i1 + 1, 16);
	}
}
