package xeno.spawnore.item;

import net.minecraft.item.Item;
import xeno.spawnore.SpawnOre;

public class ItemAxe extends net.minecraft.item.ItemAxe implements ItemModelProvider {
	
	private String name;
	
	public ItemAxe(ToolMaterial material, String name) {
		super(material, 8f, -3.1f);
		setRegistryName(name);
		setUnlocalizedName(name);
		this.name = name;
	}
	
	@Override
	public void registerItemModel(Item item) {
		SpawnOre.proxy.registerItemRenderer(this, 0, name);
	}
	
}
