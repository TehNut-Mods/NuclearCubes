package main.nuclearcubes.proxies;

import main.nuclearcubes.NuclearCubes;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.EntityRenderer;
import net.minecraft.client.renderer.OpenGlHelper;
import net.minecraft.client.shader.ShaderGroup;
import net.minecraft.util.ResourceLocation;

import java.io.IOException;

public class ClientProxy extends CommonProxy {

	private final ResourceLocation shader = new ResourceLocation("nuclearcubes", "greyscale.json");

	@Override
	public void enableGrayscaleShader() {
		if (OpenGlHelper.shadersSupported) {
			EntityRenderer entityRenderer = Minecraft.getMinecraft().entityRenderer;
			if (entityRenderer.theShaderGroup != null) {
				entityRenderer.theShaderGroup.deleteShaderGroup();
			}

			try {
				entityRenderer.theShaderGroup = new ShaderGroup(Minecraft.getMinecraft().getResourceManager(), Minecraft.getMinecraft().getFramebuffer(), this.shader);
				entityRenderer.theShaderGroup.createBindFramebuffers(Minecraft.getMinecraft().displayWidth, Minecraft.getMinecraft().displayHeight);
			} catch (IOException ioexception) {
				NuclearCubes.logger.warn("Failed to load shader: ", ioexception);
			}
		}
	}

	@Override
	public void disableGrayscaleShader() {
		if (OpenGlHelper.shadersSupported) {
			EntityRenderer entityRenderer = Minecraft.getMinecraft().entityRenderer;
			if (entityRenderer.getShaderGroup() != null) {
				entityRenderer.getShaderGroup().deleteShaderGroup();
			}
			entityRenderer.theShaderGroup = null;
		}
	}

}
