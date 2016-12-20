package xeno.spawnore.entity;

import java.util.Random;
import net.minecraft.entity.passive.EntityCow;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraftforge.event.entity.living.LivingDropsEvent;
import xeno.spawnore.init.SpawnOreItems;

public class DropHandler {
	
	public static Random rand;
	public static int dropped;

	@net.minecraftforge.fml.common.eventhandler.SubscribeEvent
	public void onEntityDrop(LivingDropsEvent event) {
		rand = new Random();
		dropped = this.randomInt(3);

		if(event.getEntityLiving() instanceof EntityAppleCow) {
			event.getEntityLiving().entityDropItem(new ItemStack(Items.APPLE, dropped+1), 0.1f);
		}
		if(event.getEntityLiving() instanceof EntityGoldenAppleCow) {
			event.getEntityLiving().entityDropItem(new ItemStack(Items.APPLE, dropped+1), 0.1f);
			event.getEntityLiving().entityDropItem(new ItemStack(Items.GOLDEN_APPLE, dropped+1), 0.1f);
		}
		if(event.getEntityLiving() instanceof EntityWaterDragon) {
			event.getEntityLiving().entityDropItem(new ItemStack(Items.FISH, dropped+11), 0.1f);
			event.getEntityLiving().entityDropItem(new ItemStack(Items.ITEM_FRAME, 1), 0.1f);
			event.getEntityLiving().entityDropItem(new ItemStack(SpawnOreItems.waterdragonscale, 1), 0.1f);
			event.getEntityLiving().entityDropItem(new ItemStack(Items.IRON_INGOT, dropped), 0.1f);
		}

	}
	
	private int randomInt(int max) {
		int x = max;
		while (x == max) {
			return rand.nextInt(x);
		}
		return max;
	}

}