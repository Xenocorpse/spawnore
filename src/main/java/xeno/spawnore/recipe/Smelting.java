package xeno.spawnore.recipe;

import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;
import xeno.spawnore.init.SpawnOreBlocks;
import xeno.spawnore.init.SpawnOreItems;

public class Smelting {
	
	public static void init() {
		
		GameRegistry.addSmelting(SpawnOreBlocks.oreuranium, new ItemStack(SpawnOreItems.nuggeturanium), 1f);
		GameRegistry.addSmelting(SpawnOreBlocks.oretitanium, new ItemStack(SpawnOreItems.nuggettitanium), 1f);
		GameRegistry.addSmelting(SpawnOreBlocks.oreruby, new ItemStack(SpawnOreItems.itemruby), 1f);
		GameRegistry.addSmelting(SpawnOreBlocks.oreamethyst, new ItemStack(SpawnOreItems.itemamethyst), 1f);
		GameRegistry.addSmelting(SpawnOreBlocks.oresalt, new ItemStack(SpawnOreItems.itemsalt, 8), 0.5f);
		GameRegistry.addSmelting(SpawnOreItems.uncookedbacon, new ItemStack(SpawnOreItems.cookedbacon), 0.4f);
		GameRegistry.addSmelting(SpawnOreItems.itemcorn, new ItemStack(SpawnOreItems.popcorn), 0.4f);
		GameRegistry.addSmelting(SpawnOreItems.rawcorndog, new ItemStack(SpawnOreItems.corndog), 0.5f);
		
	}

}
