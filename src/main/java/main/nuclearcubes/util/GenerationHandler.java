package main.nuclearcubes.util;

import cpw.mods.fml.common.IWorldGenerator;
import net.minecraft.world.World;
import net.minecraft.world.chunk.IChunkProvider;

import java.util.Random;

public class GenerationHandler implements IWorldGenerator {

	@Override
	public void generate(Random random, int chunkX, int chunkZ, World world, IChunkProvider chunkGenerator, IChunkProvider chunkProvider) {
		switch (world.provider.dimensionId) {
			case -1:
				break;
			case 0:
				generateSurface(world, random, chunkX * 16, chunkZ * 16);
				break;
			case 1:
				break;
		}
	}

	//The actual generation method.
	private void generateSurface(World world, Random rand, int chunkX, int chunkZ) {

	}
}
