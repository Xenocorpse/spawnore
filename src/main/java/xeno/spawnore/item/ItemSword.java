package xeno.spawnore.item;

import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import xeno.spawnore.SpawnOre;

public class ItemSword extends net.minecraft.item.ItemSword implements ItemModelProvider {
	
	private String name;

	public ItemSword(ToolMaterial material, String name) {
		super(material);
		setRegistryName(name);
		setUnlocalizedName(name);
		this.name = name;
	}
	
	@Override
	public void registerItemModel(Item item) {
		SpawnOre.proxy.registerItemRenderer(this, 0, name);
	}
	
}
