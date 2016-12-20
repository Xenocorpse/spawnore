package xeno.spawnore.block;

import java.util.Random;

import net.minecraft.block.BlockTorch;
import net.minecraft.block.SoundType;
import net.minecraft.block.state.IBlockState;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemBlock;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.EnumParticleTypes;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import xeno.spawnore.SpawnOre;

public class BlockExtremeTorch extends BlockTorch {
	
	private String name;
	private SoundType sound;
	
	public BlockExtremeTorch(String name, SoundType sound) {
		this.name = name;
		this.sound = sound;
		setLightLevel(1.0F);
		setUnlocalizedName(name);
		setRegistryName(name);
		this.setSoundType(sound);
	}
	
	@SideOnly(Side.CLIENT)
	public void randomDisplayTick(IBlockState stateIn, World worldIn, BlockPos pos, Random rand)
	{
	    double d0 = (double)pos.getX() + 0.5D + (rand.nextDouble() - 0.5D) * 0.2D;
	    double d1 = (double)pos.getY() + 0.7D + (rand.nextDouble() - 0.5D) * 0.2D;
	    double d2 = (double)pos.getZ() + 0.5D + (rand.nextDouble() - 0.5D) * 0.2D;
	    EnumFacing enumfacing = (EnumFacing)stateIn.getValue(FACING);

	    if (enumfacing.getAxis().isHorizontal())
	    {
	        EnumFacing enumfacing1 = enumfacing.getOpposite();
	        double d3 = 0.27D;
	        d0 += 0.27D * (double)enumfacing1.getFrontOffsetX();
	        d1 += 0.22D;
	        d2 += 0.27D * (double)enumfacing1.getFrontOffsetZ();
	        worldIn.spawnParticle(EnumParticleTypes.SMOKE_NORMAL, d0 + 0.27D * (double)enumfacing1.getFrontOffsetX(), d1 + 0.22D, d2 + 0.27D * (double)enumfacing1.getFrontOffsetZ(), 0.0D, 0.0D, 0.0D, new int[0]);
           //worldIn.spawnParticle(EnumParticleTypes.FLAME, d0 + 0.27D * (double)enumfacing1.getFrontOffsetX(), d1 + 0.22D, d2 + 0.27D * (double)enumfacing1.getFrontOffsetZ(), 0.0D, 0.0D, 0.0D, new int[0]);
	    }
	    else
	    {
	    	worldIn.spawnParticle(EnumParticleTypes.SMOKE_NORMAL, d0, d1, d2, 0.0D, 0.0D, 0.0D, new int[0]);
            //worldIn.spawnParticle(EnumParticleTypes.FLAME, d0, d1, d2, 0.0D, 0.0D, 0.0D, new int[0]);
	    }

	    worldIn.spawnParticle(EnumParticleTypes.REDSTONE, d0, d1, d2, 0.0D, 0.0D, 0.0D, new int[0]);
	}
	
	public void registerItemModel(ItemBlock itemBlock) {
		SpawnOre.proxy.registerItemRenderer(itemBlock, 0, name);
	}
	
	@Override
	public BlockExtremeTorch setCreativeTab(CreativeTabs tab) {
		super.setCreativeTab(tab);
		return this;
	}

}
