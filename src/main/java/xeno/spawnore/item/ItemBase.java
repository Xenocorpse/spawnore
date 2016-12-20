package xeno.spawnore.item;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import xeno.spawnore.SpawnOre;

public class ItemBase extends Item implements ItemModelProvider{
	
protected String name;
	
	public ItemBase(String name) {
		this.name = name;
		setUnlocalizedName(name);
		setRegistryName(name);
	}
	
	@Override
	public void registerItemModel(Item item) {
		SpawnOre.proxy.registerItemRenderer(this, 0, name);
	}

	@Override
	public ItemBase setCreativeTab(CreativeTabs tab) {
		super.setCreativeTab(tab);
		return this;
	}
	
}
