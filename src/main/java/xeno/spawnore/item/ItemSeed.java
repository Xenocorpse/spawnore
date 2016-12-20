package xeno.spawnore.item;

import net.minecraft.block.Block;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import xeno.spawnore.SpawnOre;

public class ItemSeed extends net.minecraft.item.ItemSeeds implements ItemModelProvider{
	
	protected String name;
	
	public ItemSeed(String name, Block crops, Block soil) {
		super(crops, Blocks.FARMLAND);
		setRegistryName(name);
		setUnlocalizedName(name);
		this.name = name;
	}

	@Override
	public void registerItemModel(Item item) {
		SpawnOre.proxy.registerItemRenderer(this, 0, name);
	}

}
