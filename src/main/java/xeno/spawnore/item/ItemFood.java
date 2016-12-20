package xeno.spawnore.item;

import net.minecraft.item.Item;
import xeno.spawnore.SpawnOre;

public class ItemFood extends net.minecraft.item.ItemFood implements ItemModelProvider {
	
	private String name;
	
	public ItemFood(String name, int amount, float saturation, boolean isWolfFood) {
		super(amount, saturation, isWolfFood);
		setRegistryName(name);
		setUnlocalizedName(name);
		this.name = name;
	}
		
	@Override
	public void registerItemModel(Item item) {
		SpawnOre.proxy.registerItemRenderer(this, 0, name);
	}
	
}
