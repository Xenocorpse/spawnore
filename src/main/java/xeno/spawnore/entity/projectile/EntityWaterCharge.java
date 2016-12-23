package xeno.spawnore.entity.projectile;

import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.projectile.EntityThrowable;
import net.minecraft.util.DamageSource;
import net.minecraft.util.EnumParticleTypes;
import net.minecraft.util.math.RayTraceResult;
import net.minecraft.world.World;
import xeno.spawnore.entity.EntityWaterDragon;

public class EntityWaterCharge extends EntityThrowable {
	
	public EntityWaterCharge(World worldIn)
    {
        super(worldIn);
    }

    public EntityWaterCharge(World worldIn, EntityLivingBase throwerIn)
    {
        super(worldIn, throwerIn);
    }

    public EntityWaterCharge(World worldIn, double x, double y, double z)
    {
        super(worldIn, x, y, z);
    }

	@Override
	protected void onImpact(RayTraceResult result) {
		if (result.entityHit != null)
        {
            int i = 4;

            if (result.entityHit instanceof EntityWaterDragon)
            {
                i = 0;
            }

            result.entityHit.attackEntityFrom(DamageSource.causeThrownDamage(this, this.getThrower()), (float)i);
        }

        for (int j = 0; j < 8; ++j)
        {
            this.worldObj.spawnParticle(EnumParticleTypes.WATER_SPLASH, this.posX, this.posY, this.posZ, 0.0D, 0.0D, 0.0D, new int[0]);
        }

        if (!this.worldObj.isRemote)
        {
            this.setDead();
        }
	}

}
