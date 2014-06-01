package main.bigreactors.util;

import cpw.mods.fml.common.IWorldGenerator;
import main.bigreactors.ConfigHandler;
import main.bigreactors.blocks.BlockRegistry;
import net.minecraft.init.Blocks;
import net.minecraft.world.World;
import net.minecraft.world.chunk.IChunkProvider;
import net.minecraft.world.gen.feature.WorldGenMinable;

import java.util.Random;

public class GenerationHandler implements IWorldGenerator {

	@Override
	public void generate(Random random, int chunkX, int chunkZ, World world, IChunkProvider chunkGenerator, IChunkProvider chunkProvider) {
		switch (world.provider.dimensionId) {
			case -1:
				if(ConfigHandler.enableWorldGenInNegativeDimensions) {
					generateSurface(world, random, chunkX * 16, chunkZ * 16);
				}
				break;
			case 0:
				generateSurface(world, random, chunkX * 16, chunkZ * 16);
				break;
			case 1:
				break;
		}
	}

	private void generateSurface(World world, Random rand, int chunkX, int chunkZ) {
		for (int k = 0; k < 10; k++) {
			int firstBlockXCoord = chunkX + rand.nextInt(16);
			int firstBlockZCoord = chunkZ + rand.nextInt(16);
			int yelloriteY = rand.nextInt(256);

			if (ConfigHandler.enableWorldGen) {
				(new WorldGenMinable(BlockRegistry.blockOres, 3, 0, Blocks.grass)).generate(world, rand, firstBlockXCoord, yelloriteY, firstBlockZCoord);
			}
		}
	}
}
