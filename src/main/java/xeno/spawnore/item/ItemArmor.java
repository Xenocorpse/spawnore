package xeno.spawnore.item;

import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.Item;
import xeno.spawnore.SpawnOre;

public class ItemArmor extends net.minecraft.item.ItemArmor implements ItemModelProvider {
	
	private String name;
	
	public ItemArmor(ArmorMaterial material, EntityEquipmentSlot slot, String name) {
		super(material, 0, slot);
		setRegistryName(name);
		setUnlocalizedName(name);
		this.name = name;
	}
	
	@Override
	public void registerItemModel(Item item) {
		SpawnOre.proxy.registerItemRenderer(this, 0, name);
	}
	
}
