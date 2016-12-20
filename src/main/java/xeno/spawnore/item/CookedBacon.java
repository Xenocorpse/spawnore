package xeno.spawnore.item;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.world.World;

public class CookedBacon extends ItemFood{
	
	private PotionEffect eff1, eff2;
	private float par1, par2;

	public CookedBacon(String name, int amount, float saturation, boolean isWolfFood) {
		super(name, amount, saturation, isWolfFood);
	}
	
	public CookedBacon setPotionEffect(PotionEffect eff1, float par1, PotionEffect eff2, float par2) {
		this.eff1 = eff1;
		this.eff2 = eff2;
		this.par1 = par1;
		this.par2 = par2;
		return this;
	}
	
	protected void onFoodEaten(ItemStack stack, World worldIn, EntityPlayer player)
    {
        if (!worldIn.isRemote && this.eff1 != null && worldIn.rand.nextFloat() < this.par1)
        {
            player.addPotionEffect(new PotionEffect(this.eff1));
        }
        if (!worldIn.isRemote && this.eff2 != null && worldIn.rand.nextFloat() < this.par2)
        {
            player.addPotionEffect(new PotionEffect(this.eff2));
        }
    }

}
