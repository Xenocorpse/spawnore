package xeno.spawnore.world;

import java.util.Random;

import net.minecraft.block.state.IBlockState;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraft.world.chunk.IChunkGenerator;
import net.minecraft.world.chunk.IChunkProvider;
import net.minecraft.world.gen.feature.WorldGenMinable;
import net.minecraftforge.fml.common.IWorldGenerator;
import xeno.spawnore.init.SpawnOreBlocks;

public class SpawnOreWorldGen implements IWorldGenerator {
	
	@Override
	public void generate(Random random, int chunkX, int chunkZ, World world, IChunkGenerator chunkGenerator, IChunkProvider chunkProvider) {
		if (world.provider.getDimension() == 0) { // the overworld
			generateOverworld(random, chunkX, chunkZ, world, chunkGenerator, chunkProvider);
		}
	}
	
	private void generateOverworld(Random random, int chunkX, int chunkZ, World world, IChunkGenerator chunkGenerator, IChunkProvider chunkProvider) {
		generateOre(SpawnOreBlocks.oreamethyst.getDefaultState(), world, random, chunkX * 16, chunkZ * 16, 1, 32, 1 + random.nextInt(7), 6);
		generateOre(SpawnOreBlocks.oreruby.getDefaultState(), world, random, chunkX * 16, chunkZ * 16, 1, 25, 1 + random.nextInt(3), 3);
		generateOre(SpawnOreBlocks.oretitanium.getDefaultState(), world, random, chunkX * 16, chunkZ * 16, 1, 25, 1 + random.nextInt(3), 4);
		generateOre(SpawnOreBlocks.oreuranium.getDefaultState(), world, random, chunkX * 16, chunkZ * 16, 1, 25, 1 + random.nextInt(3), 4);
		generateOre(SpawnOreBlocks.oresalt.getDefaultState(), world, random, chunkX * 16, chunkZ * 16, 1, 256, 2 + random.nextInt(6), 8);
		generateOre(SpawnOreBlocks.orecreeper.getDefaultState(), world, random, chunkX * 16, chunkZ * 16, 1, 256, 1 + random.nextInt(5), 6);
		generateOre(SpawnOreBlocks.oreskeleton.getDefaultState(), world, random, chunkX * 16, chunkZ * 16, 1, 256, 1 + random.nextInt(5), 6);
		generateOre(SpawnOreBlocks.orespider.getDefaultState(), world, random, chunkX * 16, chunkZ * 16, 1, 256, 1 + random.nextInt(5), 6);
		generateOre(SpawnOreBlocks.orecavespider.getDefaultState(), world, random, chunkX * 16, chunkZ * 16, 1, 256, 1 + random.nextInt(5), 6);
		generateOre(SpawnOreBlocks.orebat.getDefaultState(), world, random, chunkX * 16, chunkZ * 16, 1, 256, 1 + random.nextInt(5), 6);
		generateOre(SpawnOreBlocks.oreblaze.getDefaultState(), world, random, chunkX * 16, chunkZ * 16, 1, 256, 1 + random.nextInt(5), 6);
		generateOre(SpawnOreBlocks.orechicken.getDefaultState(), world, random, chunkX * 16, chunkZ * 16, 1, 256, 1 + random.nextInt(5), 6);
		generateOre(SpawnOreBlocks.orecow.getDefaultState(), world, random, chunkX * 16, chunkZ * 16, 1, 256, 1 + random.nextInt(5), 6);
		generateOre(SpawnOreBlocks.oreenderman.getDefaultState(), world, random, chunkX * 16, chunkZ * 16, 1, 256, 1 + random.nextInt(5), 6);
		generateOre(SpawnOreBlocks.orehorse.getDefaultState(), world, random, chunkX * 16, chunkZ * 16, 1, 256, 1 + random.nextInt(5), 6);
		generateOre(SpawnOreBlocks.oreirongolem.getDefaultState(), world, random, chunkX * 16, chunkZ * 16, 1, 256, 1 + random.nextInt(5), 6);
		generateOre(SpawnOreBlocks.oremagmacube.getDefaultState(), world, random, chunkX * 16, chunkZ * 16, 1, 256, 1 + random.nextInt(5), 6);
		generateOre(SpawnOreBlocks.oremooshroom.getDefaultState(), world, random, chunkX * 16, chunkZ * 16, 1, 256, 1 + random.nextInt(5), 6);
		generateOre(SpawnOreBlocks.oreocelot.getDefaultState(), world, random, chunkX * 16, chunkZ * 16, 1, 256, 1 + random.nextInt(5), 6);
		generateOre(SpawnOreBlocks.orepig.getDefaultState(), world, random, chunkX * 16, chunkZ * 16, 1, 256, 1 + random.nextInt(5), 6);
		generateOre(SpawnOreBlocks.oresheep.getDefaultState(), world, random, chunkX * 16, chunkZ * 16, 1, 256, 1 + random.nextInt(5), 6);
		generateOre(SpawnOreBlocks.oresilverfish.getDefaultState(), world, random, chunkX * 16, chunkZ * 16, 1, 256, 1 + random.nextInt(5), 6);
		generateOre(SpawnOreBlocks.oreslime.getDefaultState(), world, random, chunkX * 16, chunkZ * 16, 1, 256, 1 + random.nextInt(5), 6);
		generateOre(SpawnOreBlocks.oresnowgolem.getDefaultState(), world, random, chunkX * 16, chunkZ * 16, 1, 256, 1 + random.nextInt(5), 6);
		generateOre(SpawnOreBlocks.oresquid.getDefaultState(), world, random, chunkX * 16, chunkZ * 16, 1, 256, 1 + random.nextInt(5), 6);
		generateOre(SpawnOreBlocks.orevillager.getDefaultState(), world, random, chunkX * 16, chunkZ * 16, 1, 256, 1 + random.nextInt(5), 6);
		generateOre(SpawnOreBlocks.orewitch.getDefaultState(), world, random, chunkX * 16, chunkZ * 16, 1, 256, 1 + random.nextInt(5), 6);
		generateOre(SpawnOreBlocks.orewitherboss.getDefaultState(), world, random, chunkX * 16, chunkZ * 16, 1, 256, 1 + random.nextInt(5), 6);
		generateOre(SpawnOreBlocks.orewolf.getDefaultState(), world, random, chunkX * 16, chunkZ * 16, 1, 256, 1 + random.nextInt(5), 6);
		generateOre(SpawnOreBlocks.orezombie.getDefaultState(), world, random, chunkX * 16, chunkZ * 16, 1, 256, 1 + random.nextInt(5), 6);
		generateOre(SpawnOreBlocks.orezombiepigman.getDefaultState(), world, random, chunkX * 16, chunkZ * 16, 1, 256, 1 + random.nextInt(5), 6);
		generateOre(SpawnOreBlocks.oreguardian.getDefaultState(), world, random, chunkX * 16, chunkZ * 16, 1, 256, 1 + random.nextInt(5), 6);
		generateOre(SpawnOreBlocks.orestinky.getDefaultState(), world, random, chunkX * 16, chunkZ * 16, 1, 256, 1 + random.nextInt(5), 6);
		generateOre(SpawnOreBlocks.oreghast.getDefaultState(), world, random, chunkX * 16, chunkZ * 16, 1, 256, 1 + random.nextInt(5), 6);
		generateOre(SpawnOreBlocks.oreshulker.getDefaultState(), world, random, chunkX * 16, chunkZ * 16, 1, 256, 1 + random.nextInt(5), 6);
		generateOre(SpawnOreBlocks.oreendermite.getDefaultState(), world, random, chunkX * 16, chunkZ * 16, 1, 256, 1 + random.nextInt(5), 6);
		generateOre(SpawnOreBlocks.orerabbit.getDefaultState(), world, random, chunkX * 16, chunkZ * 16, 1, 256, 1 + random.nextInt(5), 6);
		generateOre(SpawnOreBlocks.orepolarbear.getDefaultState(), world, random, chunkX * 16, chunkZ * 16, 1, 256, 1 + random.nextInt(5), 6);
		generateOre(SpawnOreBlocks.oreapplecow.getDefaultState(), world, random, chunkX * 16, chunkZ * 16, 1, 256, 1 + random.nextInt(5), 6);
		generateOre(SpawnOreBlocks.oregoldencow.getDefaultState(), world, random, chunkX * 16, chunkZ * 16, 1, 256, 1 + random.nextInt(5), 6);
		generateOre(SpawnOreBlocks.oreenchantedcow.getDefaultState(), world, random, chunkX * 16, chunkZ * 16, 1, 256, 1 + random.nextInt(5), 6);
		generateOre(SpawnOreBlocks.orewaterdragon.getDefaultState(), world, random, chunkX * 16, chunkZ * 16, 1, 256, 1 + random.nextInt(5), 6);
	}
	
	private void generateOre(IBlockState ore, World world, Random random, int x, int z, int minY, int maxY, int size, int chances) {
		int deltaY = maxY - minY;
	
		for (int i = 0; i < chances; i++) {
			BlockPos pos = new BlockPos(x + random.nextInt(16), minY + random.nextInt(deltaY), z + random.nextInt(16));
	
			WorldGenMinable generator = new WorldGenMinable(ore, size);
			generator.generate(world, random, pos);
		}
	}

}
