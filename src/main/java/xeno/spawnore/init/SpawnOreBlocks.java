package xeno.spawnore.init;

import java.util.Random;

import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.init.Items;
import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;
import xeno.spawnore.SpawnOre;
import xeno.spawnore.block.BlockBase;
import xeno.spawnore.block.BlockCropCorn;
import xeno.spawnore.block.BlockCropLettuce;
import xeno.spawnore.block.BlockCropTomato;
import xeno.spawnore.block.BlockExtremeTorch;
import xeno.spawnore.block.BlockGem;
import xeno.spawnore.block.BlockOre;
import xeno.spawnore.block.BlockOreSpecial;
import xeno.spawnore.block.BlockPizza;

public class SpawnOreBlocks {
	
	public static BlockOre oreamethyst;
	public static BlockOre oreruby;
	public static BlockOreSpecial oreuranium;
	public static BlockOreSpecial oretitanium;
	public static BlockBase oresalt;
	public static BlockBase blockruby;
	public static BlockBase blockamethyst;
	public static BlockBase blockuranium;
	public static BlockBase blocktitanium;
	public static BlockBase blockeyeofender;
	public static BlockBase blockenderpearl;
	
	// Crops
	public static BlockCropCorn cropcorn;
	public static BlockCropTomato croptomato;
	public static BlockCropLettuce croplettuce;
	
	// Other
	public static BlockPizza pizza;
	public static BlockExtremeTorch extremetorch;
	
	// Ancient Dried Spawn Eggs
	public static BlockBase orecreeper;
	public static BlockBase oreskeleton;
	public static BlockBase orespider;
	public static BlockBase orecavespider;
	public static BlockBase orebat;
	public static BlockBase oreblaze;
	public static BlockBase orechicken;
	public static BlockBase orecow;
	//public static BlockBase oreenderdragon;
	public static BlockBase oreenderman;
	public static BlockBase orehorse;
	public static BlockBase oreirongolem;
	public static BlockBase oremagmacube;
	public static BlockBase oremooshroom;
	public static BlockBase oreocelot;
	public static BlockBase orepig;
	public static BlockBase oresheep;
	public static BlockBase oresilverfish;
	public static BlockBase oreslime;
	public static BlockBase oresnowgolem;
	public static BlockBase oresquid;
	public static BlockBase orevillager;
	public static BlockBase orewitch;
	public static BlockBase orewitherboss;
	public static BlockBase orewitherskeleton;
	public static BlockBase orewolf;
	public static BlockBase orezombie;
	public static BlockBase orezombiepigman;
	public static BlockBase oreguardian;
	public static BlockBase orestinky;
	public static BlockBase oreghast;
	public static BlockBase oreshulker;
	public static BlockBase oreendermite;
	public static BlockBase orerabbit;
	public static BlockBase orepolarbear;
	public static BlockBase oreapplecow;
	public static BlockBase oregoldencow;
	public static BlockBase oreenchantedcow;
	public static BlockBase orewaterdragon;
	
	public static void init() {
		oreamethyst = register(new BlockGem("oreamethyst", SpawnOreItems.itemamethyst, 1, 0, SoundType.STONE).setCreativeTab(SpawnOre.tabspawnore));
		oreruby = register(new BlockGem("oreruby", SpawnOreItems.itemruby, 1, 0, SoundType.STONE).setCreativeTab(SpawnOre.tabspawnore));
		oreuranium = (BlockOreSpecial) register(new BlockOreSpecial(Material.ROCK, "oreuranium", "pickaxe", 0, true, SoundType.STONE).setHardness(5f).setResistance(6f).setCreativeTab(SpawnOre.tabspawnore));
		oretitanium = (BlockOreSpecial) register(new BlockOreSpecial(Material.ROCK, "oretitanium", "pickaxe", 0, true, SoundType.STONE).setHardness(5f).setResistance(6f).setCreativeTab(SpawnOre.tabspawnore));
		oresalt = (BlockBase) register(new BlockBase(Material.ROCK, "oresalt", "pickaxe", 0, SoundType.STONE).setHardness(5f).setResistance(6f).setCreativeTab(SpawnOre.tabspawnore));
		blockamethyst = (BlockBase) register(new BlockBase(Material.IRON, "blockamethyst", "pickaxe", 0, SoundType.METAL).setHardness(4f).setResistance(6f).setCreativeTab(SpawnOre.tabspawnore));
		blockruby = (BlockBase) register(new BlockBase(Material.IRON, "blockruby", "pickaxe", 0, SoundType.METAL).setHardness(4f).setResistance(6f).setCreativeTab(SpawnOre.tabspawnore));
		blockuranium = (BlockBase) register(new BlockBase(Material.IRON, "blockuranium", "pickaxe", 0, SoundType.METAL).setHardness(4f).setResistance(6f).setCreativeTab(SpawnOre.tabspawnore));
		blocktitanium = (BlockBase) register(new BlockBase(Material.IRON, "blocktitanium", "pickaxe", 0, SoundType.METAL).setHardness(4f).setResistance(6f).setCreativeTab(SpawnOre.tabspawnore));
		blockeyeofender = (BlockBase) register(new BlockBase(Material.GROUND, "blockeyeofender", "shovel", 0, SoundType.GROUND).setHardness(1.0f).setResistance(6f).setCreativeTab(SpawnOre.tabspawnore));
		blockenderpearl = (BlockBase) register(new BlockBase(Material.GROUND, "blockenderpearl", "shovel", 0, SoundType.GROUND).setHardness(1.0f).setResistance(6f).setCreativeTab(SpawnOre.tabspawnore));
		
		// Crops
		cropcorn = register(new BlockCropCorn(), null);
		croptomato = register(new BlockCropTomato(), null);
		croplettuce = register(new BlockCropLettuce(), null);
		
		// Random
		pizza = (BlockPizza) register(new BlockPizza("pizza").setHardness(1f).setResistance(1f));
		extremetorch = (BlockExtremeTorch) register(new BlockExtremeTorch("extremetorch", SoundType.WOOD));
		
		// Ancient Dried Spawn Eggs
		orecreeper = (BlockBase) register(new BlockBase(Material.GROUND, "orecreeper", "shovel", 0, SoundType.GROUND).setHardness(3f).setResistance(4f).setCreativeTab(SpawnOre.tabspawnore));
		oreskeleton = (BlockBase) register(new BlockBase(Material.GROUND, "oreskeleton", "shovel", 0, SoundType.GROUND).setHardness(3f).setResistance(4f).setCreativeTab(SpawnOre.tabspawnore));
		orespider = (BlockBase) register(new BlockBase(Material.GROUND, "orespider", "shovel", 0, SoundType.GROUND).setHardness(3f).setResistance(4f).setCreativeTab(SpawnOre.tabspawnore));
		orecavespider = (BlockBase) register(new BlockBase(Material.GROUND, "orecavespider", "shovel", 0, SoundType.GROUND).setHardness(3f).setResistance(4f).setCreativeTab(SpawnOre.tabspawnore));
		orebat = (BlockBase) register(new BlockBase(Material.GROUND, "orebat", "shovel", 0, SoundType.GROUND).setHardness(3f).setResistance(4f).setCreativeTab(SpawnOre.tabspawnore));
		oreblaze = (BlockBase) register(new BlockBase(Material.GROUND, "oreblaze", "shovel", 0, SoundType.GROUND).setHardness(3f).setResistance(4f).setCreativeTab(SpawnOre.tabspawnore));
		orechicken = (BlockBase) register(new BlockBase(Material.GROUND, "orechicken", "shovel", 0, SoundType.GROUND).setHardness(3f).setResistance(4f).setCreativeTab(SpawnOre.tabspawnore));
		orecow = (BlockBase) register(new BlockBase(Material.GROUND, "orecow", "shovel", 0, SoundType.GROUND).setHardness(3f).setResistance(4f).setCreativeTab(SpawnOre.tabspawnore));
		//oreenderdragon = (BlockBase) register(new BlockBase(Material.GROUND, "oreenderdragon", "shovel", 0, SoundType.GROUND).setHardness(3f).setResistance(4f).setCreativeTab(SpawnOre.tabspawnore));
		oreenderman = (BlockBase) register(new BlockBase(Material.GROUND, "oreenderman", "shovel", 0, SoundType.GROUND).setHardness(3f).setResistance(4f).setCreativeTab(SpawnOre.tabspawnore));
		orehorse = (BlockBase) register(new BlockBase(Material.GROUND, "orehorse", "shovel", 0, SoundType.GROUND).setHardness(3f).setResistance(4f).setCreativeTab(SpawnOre.tabspawnore));
		oreirongolem = (BlockBase) register(new BlockBase(Material.GROUND, "oreirongolem", "shovel", 0, SoundType.GROUND).setHardness(3f).setResistance(4f).setCreativeTab(SpawnOre.tabspawnore));
		oremagmacube = (BlockBase) register(new BlockBase(Material.GROUND, "oremagmacube", "shovel", 0, SoundType.GROUND).setHardness(3f).setResistance(4f).setCreativeTab(SpawnOre.tabspawnore));
		oremooshroom = (BlockBase) register(new BlockBase(Material.GROUND, "oremooshroom", "shovel", 0, SoundType.GROUND).setHardness(3f).setResistance(4f).setCreativeTab(SpawnOre.tabspawnore));
		oreocelot = (BlockBase) register(new BlockBase(Material.GROUND, "oreocelot", "shovel", 0, SoundType.GROUND).setHardness(3f).setResistance(4f).setCreativeTab(SpawnOre.tabspawnore));
		orepig = (BlockBase) register(new BlockBase(Material.GROUND, "orepig", "shovel", 0, SoundType.GROUND).setHardness(3f).setResistance(4f).setCreativeTab(SpawnOre.tabspawnore));
		oresheep = (BlockBase) register(new BlockBase(Material.GROUND, "oresheep", "shovel", 0, SoundType.GROUND).setHardness(3f).setResistance(4f).setCreativeTab(SpawnOre.tabspawnore));
		oresilverfish = (BlockBase) register(new BlockBase(Material.GROUND, "oresilverfish", "shovel", 0, SoundType.GROUND).setHardness(3f).setResistance(4f).setCreativeTab(SpawnOre.tabspawnore));
		oreslime = (BlockBase) register(new BlockBase(Material.GROUND, "oreslime", "shovel", 0, SoundType.GROUND).setHardness(3f).setResistance(4f).setCreativeTab(SpawnOre.tabspawnore));
		oresnowgolem = (BlockBase) register(new BlockBase(Material.GROUND, "oresnowgolem", "shovel", 0, SoundType.GROUND).setHardness(3f).setResistance(4f).setCreativeTab(SpawnOre.tabspawnore));
		oresquid = (BlockBase) register(new BlockBase(Material.GROUND, "oresquid", "shovel", 0, SoundType.GROUND).setHardness(3f).setResistance(4f).setCreativeTab(SpawnOre.tabspawnore));
		orevillager = (BlockBase) register(new BlockBase(Material.GROUND, "orevillager", "shovel", 0, SoundType.GROUND).setHardness(3f).setResistance(4f).setCreativeTab(SpawnOre.tabspawnore));
		orewitch = (BlockBase) register(new BlockBase(Material.GROUND, "orewitch", "shovel", 0, SoundType.GROUND).setHardness(3f).setResistance(4f).setCreativeTab(SpawnOre.tabspawnore));
		orewitherboss = (BlockBase) register(new BlockBase(Material.GROUND, "orewitherboss", "shovel", 0, SoundType.GROUND).setHardness(3f).setResistance(4f).setCreativeTab(SpawnOre.tabspawnore));
		orewitherskeleton = (BlockBase) register(new BlockBase(Material.GROUND, "orewitherskeleton", "shovel", 0, SoundType.GROUND).setHardness(3f).setResistance(4f).setCreativeTab(SpawnOre.tabspawnore));
		orewolf = (BlockBase) register(new BlockBase(Material.GROUND, "orewolf", "shovel", 0, SoundType.GROUND).setHardness(3f).setResistance(4f).setCreativeTab(SpawnOre.tabspawnore));
		orezombie = (BlockBase) register(new BlockBase(Material.GROUND, "orezombie", "shovel", 0, SoundType.GROUND).setHardness(3f).setResistance(4f).setCreativeTab(SpawnOre.tabspawnore));
		orezombiepigman = (BlockBase) register(new BlockBase(Material.GROUND, "orezombiepigman", "shovel", 0, SoundType.GROUND).setHardness(3f).setResistance(4f).setCreativeTab(SpawnOre.tabspawnore));
		oreguardian = (BlockBase) register(new BlockBase(Material.GROUND, "oreguardian", "shovel", 0, SoundType.GROUND).setHardness(3f).setResistance(4f).setCreativeTab(SpawnOre.tabspawnore));
		orestinky = (BlockBase) register(new BlockBase(Material.GROUND, "orestinky", "shovel", 0, SoundType.GROUND).setHardness(3f).setResistance(4f).setCreativeTab(SpawnOre.tabspawnore));
		oreghast = (BlockBase) register(new BlockBase(Material.GROUND, "oreghast", "shovel", 0, SoundType.GROUND).setHardness(3f).setResistance(4f).setCreativeTab(SpawnOre.tabspawnore));
		oreshulker = (BlockBase) register(new BlockBase(Material.GROUND, "oreshulker", "shovel", 0, SoundType.GROUND).setHardness(3f).setResistance(4f).setCreativeTab(SpawnOre.tabspawnore));
		oreendermite = (BlockBase) register(new BlockBase(Material.GROUND, "oreendermite", "shovel", 0, SoundType.GROUND).setHardness(3f).setResistance(4f).setCreativeTab(SpawnOre.tabspawnore));
		orerabbit = (BlockBase) register(new BlockBase(Material.GROUND, "orerabbit", "shovel", 0, SoundType.GROUND).setHardness(3f).setResistance(4f).setCreativeTab(SpawnOre.tabspawnore));
		orepolarbear = (BlockBase) register(new BlockBase(Material.GROUND, "orepolarbear", "shovel", 0, SoundType.GROUND).setHardness(3f).setResistance(4f).setCreativeTab(SpawnOre.tabspawnore));
		oreapplecow = (BlockBase) register(new BlockBase(Material.GROUND, "oreapplecow", "shovel", 0, SoundType.GROUND).setHardness(3f).setResistance(4f).setCreativeTab(SpawnOre.tabspawnore));
		oregoldencow = (BlockBase) register(new BlockBase(Material.GROUND, "oregoldencow", "shovel", 0, SoundType.GROUND).setHardness(3f).setResistance(4f).setCreativeTab(SpawnOre.tabspawnore));
		oreenchantedcow = (BlockBase) register(new BlockBase(Material.GROUND, "oreenchantedcow", "shovel", 0, SoundType.GROUND).setHardness(3f).setResistance(4f).setCreativeTab(SpawnOre.tabspawnore));
		orewaterdragon = (BlockBase) register(new BlockBase(Material.GROUND, "orewaterdragon", "shovel", 0, SoundType.GROUND).setHardness(3f).setResistance(4f).setCreativeTab(SpawnOre.tabspawnore));
	}
	
	private static <T extends Block> T register(T block, ItemBlock itemBlock) {
		GameRegistry.register(block);
		if (itemBlock != null) GameRegistry.register(itemBlock);

		if (block instanceof BlockBase) {
			((BlockBase)block).registerItemModel(itemBlock);
		}
		
		return block;
	}
	
	private static <T extends Block> T register(T block) {
		ItemBlock itemBlock = new ItemBlock(block);
		itemBlock.setRegistryName(block.getRegistryName());
		return register(block, itemBlock);
	}
	
}
