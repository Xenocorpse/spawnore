package xeno.spawnore.init;

import net.minecraft.init.Items;
import net.minecraft.world.storage.loot.LootEntryItem;
import net.minecraft.world.storage.loot.LootPool;
import net.minecraft.world.storage.loot.LootTableList;
import net.minecraft.world.storage.loot.RandomValueRange;
import net.minecraft.world.storage.loot.conditions.LootCondition;
import net.minecraft.world.storage.loot.functions.LootFunction;
import net.minecraft.world.storage.loot.functions.SetCount;
import net.minecraftforge.event.LootTableLoadEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import xeno.spawnore.entity.EntityGoldenAppleCow;

public class RegisterLootTables {
	
	public static void init() {
		LootTableList.register(EntityGoldenAppleCow.DROPS);
	}
	
	@SubscribeEvent
	public void onLootTablesLoaded(LootTableLoadEvent event) {
	 
	    if (event.getName().equals(LootTableList.ENTITIES_COW)) {
	    	
	    	final LootPool pool2 = event.getTable().getPool("pool2"); 
	        if (pool2 != null) {
	        	
	        	pool2.addEntry(new LootEntryItem(Items.APPLE, 1, 0, new LootFunction[] {new SetCount(new LootCondition[0], new RandomValueRange(1, 3))}, new LootCondition[0], "spawnore:goldencow"));
	        	pool2.addEntry(new LootEntryItem(Items.GOLDEN_APPLE, 1, 0, new LootFunction[] {new SetCount(new LootCondition[0], new RandomValueRange(1, 2))}, new LootCondition[0], "spawnore:goldencow"));
	 
	        }
	         
	    }
	}

}
