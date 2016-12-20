package xeno.spawnore.block;

import java.util.Random;

import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class BlockOre extends BlockBase{
	
	protected Item drop;
	protected int quantity;
	
	public BlockOre(String name, Item drop, int quantity, int harvest, SoundType sound) {
		super(Material.ROCK, name, "pickaxe", harvest, sound);
		this.drop = drop;
		this.quantity = quantity;
		this.setSoundType(sound);
		setHardness(4f);
		setResistance(6f);
	}

	@Override
	public BlockOre setCreativeTab(CreativeTabs tab) {
		super.setCreativeTab(tab);
		return this;
	}
	
	public Item getItemDropped(IBlockState state, Random rand, int fortune) {
		return drop;
	}
	
	public int quantityDropped(Random random) {
		return quantity;
	}
	
	public int quantityDroppedWithBonus(int fortune, Random random)
    {
        if (fortune > 0 && Item.getItemFromBlock(this) != this.getItemDropped((IBlockState)this.getBlockState().getValidStates().iterator().next(), random, fortune))
        {
            int i = random.nextInt(fortune + 2) - 1;

            if (i < 0)
            {
                i = 0;
            }

            return this.quantityDropped(random) * (i + 1);
        }
        else
        {
            return this.quantityDropped(random);
        }
    }
	
}
