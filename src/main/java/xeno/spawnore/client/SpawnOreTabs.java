package xeno.spawnore.client;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import xeno.spawnore.SpawnOre;
import xeno.spawnore.init.SpawnOreItems;

public class SpawnOreTabs extends CreativeTabs {
	
	public SpawnOreTabs() {
		super(SpawnOre.MODID);
	}
	
	@Override
	public Item getTabIconItem() {
		return SpawnOreItems.itemamethyst;
	}
	
}
