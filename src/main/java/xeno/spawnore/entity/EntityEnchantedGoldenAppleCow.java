package xeno.spawnore.entity;

import net.minecraft.entity.EntityAgeable;
import net.minecraft.entity.EntityLiving;
import net.minecraft.entity.passive.EntityCow;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.datafix.DataFixer;
import net.minecraft.world.World;
import xeno.spawnore.SpawnOre;

public class EntityEnchantedGoldenAppleCow extends EntityCow {
	
	public static final ResourceLocation DROPS = new ResourceLocation(SpawnOre.MODID+":entities/enchantedcow");
	
	public EntityEnchantedGoldenAppleCow(World worldIn) {
		super(worldIn);
		this.setSize(0.9F, 1.4F);
	}
	
	public static void registerFixesGoldenCow(DataFixer fixer)
    {
        EntityLiving.registerFixesMob(fixer, "EnchantedCow");
    }
	
	public EntityGoldenAppleCow createChild(EntityAgeable ageable)
    {
        return new EntityGoldenAppleCow(this.worldObj);
    }
	
	public float getEyeHeight()
    {
        return this.isChild() ? this.height : 1.3F;
    }
	
    protected ResourceLocation getLootTable() {
        return DROPS;
    }

}
