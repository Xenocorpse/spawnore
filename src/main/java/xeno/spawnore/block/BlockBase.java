package xeno.spawnore.block;

import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemBlock;
import xeno.spawnore.SpawnOre;

public class BlockBase extends Block{
	
	protected String name;
	
	public BlockBase(Material material, String name, String tool, int harvest, SoundType sound) {
		super(material);
		this.name = name;
		setLightLevel(0.0f);
		setUnlocalizedName(name);
		setRegistryName(name);
		setHarvestLevel(tool, harvest);
		this.setSoundType(sound);
	}

	public void registerItemModel(ItemBlock itemBlock) {
		SpawnOre.proxy.registerItemRenderer(itemBlock, 0, name);
	}

	@Override
	public BlockBase setCreativeTab(CreativeTabs tab) {
		super.setCreativeTab(tab);
		return this;
	}
	
}
