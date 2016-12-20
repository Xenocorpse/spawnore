package xeno.spawnore.item;

import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import xeno.spawnore.SpawnOre;
import xeno.spawnore.init.SpawnOreBlocks;

public class ItemPizza extends ItemBlock implements ItemModelProvider {

	private String name;
	
	public ItemPizza(Block block, String name) {
		super(SpawnOreBlocks.pizza);
		this.name=name;
		setRegistryName(name);
		setUnlocalizedName(name);
	}
	
	@Override
	public void registerItemModel(Item item) {
		SpawnOre.proxy.registerItemRenderer(this, 0, name);
	}

}
