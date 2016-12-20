package xeno.spawnore.item;

import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import xeno.spawnore.SpawnOre;
import xeno.spawnore.init.SpawnOreBlocks;

public class ItemExtremeTorch extends ItemBlock implements ItemModelProvider{
	
	private String name;
	
	public ItemExtremeTorch(Block block, String name) {
		super(block);
		setRegistryName(name);
		setUnlocalizedName(name);
		this.name=name;
	}

	@Override
	public void registerItemModel(Item item) {
		SpawnOre.proxy.registerItemRenderer(this, 0, name);
	}

}
