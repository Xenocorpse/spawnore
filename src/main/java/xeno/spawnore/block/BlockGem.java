package xeno.spawnore.block;

import java.util.Random;

import net.minecraft.block.SoundType;
import net.minecraft.block.state.IBlockState;
import net.minecraft.item.Item;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

public class BlockGem extends BlockOre {
	
	static Random rand = new Random();

	public BlockGem(String name, Item drop, int quantity, int harvest, SoundType sound) {
		super(name, drop, quantity, harvest, sound);
		this.setSoundType(sound);
	}
	
	
	public void onBlockDestroyedByPlayer(World worldIn, BlockPos pos, IBlockState state) {
		this.quantity = rand.nextInt(2)+1;
    }

}
