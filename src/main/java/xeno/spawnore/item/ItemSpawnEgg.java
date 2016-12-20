package xeno.spawnore.item;

import net.minecraft.block.BlockFence;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import net.minecraft.item.ItemMonsterPlacer;
import net.minecraft.item.ItemStack;
import net.minecraft.tileentity.MobSpawnerBaseLogic;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.tileentity.TileEntityMobSpawner;
import net.minecraft.util.EnumActionResult;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.EnumHand;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import xeno.spawnore.SpawnOre;

public class ItemSpawnEgg extends ItemMonsterPlacer implements ItemModelProvider{
	
	private String name;
	private String entityID;
	private World worldIn;
	
	public ItemSpawnEgg(String name, String entityID) {
		this.name=name;
		this.entityID=entityID;
		setUnlocalizedName(name);
		setRegistryName(name);
		//this.spawnCreature(this.worldIn, entityID, maxDamage, maxDamage, maxDamage);
	}

	@Override
	public void registerItemModel(Item item) {
		SpawnOre.proxy.registerItemRenderer(this, 0, name);
	}

}
