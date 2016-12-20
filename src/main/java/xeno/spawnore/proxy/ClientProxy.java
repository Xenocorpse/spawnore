package xeno.spawnore.proxy;

import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraftforge.client.model.ModelLoader;
import xeno.spawnore.SpawnOre;

public class ClientProxy extends CommonProxy{
	
	public void registerItemRenderer(Item item, int meta, String id) {
		ModelLoader.setCustomModelResourceLocation(item, meta, new ModelResourceLocation(SpawnOre.MODID + ":" + id, "inventory"));
	}
	
}
