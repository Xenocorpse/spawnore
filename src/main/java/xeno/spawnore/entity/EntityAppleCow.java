package xeno.spawnore.entity;

import net.minecraft.entity.EntityAgeable;
import net.minecraft.entity.EntityLiving;
import net.minecraft.entity.passive.EntityCow;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.datafix.DataFixer;
import net.minecraft.world.World;
import net.minecraft.world.storage.loot.LootPool;
import net.minecraft.world.storage.loot.LootTableList;
import xeno.spawnore.SpawnOre;

public class EntityAppleCow extends EntityCow {
	
	public static final ResourceLocation APPLECOW_DROPS = new ResourceLocation(SpawnOre.MODID+":entities/applecow");

	public EntityAppleCow(World worldIn) {
		super(worldIn);
		this.setSize(0.9F, 1.4F);
	}
	
	public static void registerFixesAppleCow(DataFixer fixer)
    {
        EntityLiving.registerFixesMob(fixer, "AppleCow");
    }
	
	public EntityAppleCow createChild(EntityAgeable ageable)
    {
        return new EntityAppleCow(this.worldObj);
    }
	
	public float getEyeHeight()
    {
        return this.isChild() ? this.height : 1.3F;
    }
	
	@Override
    protected ResourceLocation getLootTable() {
        return APPLECOW_DROPS;
    }

}
