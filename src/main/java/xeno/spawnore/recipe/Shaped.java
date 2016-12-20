package xeno.spawnore.recipe;

import net.minecraft.enchantment.Enchantment;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;
import xeno.spawnore.init.SpawnOreBlocks;
import xeno.spawnore.init.SpawnOreItems;

public class Shaped {
	
	static ItemStack ultimate = new ItemStack(SpawnOreItems.swordultimate);
	static ItemStack ultpick = new ItemStack(SpawnOreItems.pickultimate);
	static ItemStack ultshovel = new ItemStack(SpawnOreItems.shovelultimate);
	static ItemStack ultaxe = new ItemStack(SpawnOreItems.axeultimate);
	static ItemStack ulthoe = new ItemStack(SpawnOreItems.hoeultimate);
	static ItemStack ultbow = new ItemStack(SpawnOreItems.bowultimate);
	static ItemStack empick = new ItemStack(SpawnOreItems.pickemerald);
	static ItemStack ulthelm = new ItemStack(SpawnOreItems.helmultimate);
	static ItemStack ultchest = new ItemStack(SpawnOreItems.chestultimate);
	static ItemStack ultleg = new ItemStack(SpawnOreItems.legultimate);
	static ItemStack ultboot = new ItemStack(SpawnOreItems.bootultimate);
	static ItemStack nightmare = new ItemStack(SpawnOreItems.nightmaresword);
	static ItemStack laphelm = new ItemStack(SpawnOreItems.helmlapis);
	static ItemStack lapchest = new ItemStack(SpawnOreItems.chestlapis);
	static ItemStack lapleg = new ItemStack(SpawnOreItems.leglapis);
	static ItemStack lapboot = new ItemStack(SpawnOreItems.bootlapis);
	
	public static void init() {
		
		GameRegistry.addShapedRecipe(new ItemStack(Blocks.WEB), 
				"AAA", 
				"A A", 
				"AAA", 'A', Items.STRING);
		
		GameRegistry.addShapedRecipe(new ItemStack(SpawnOreItems.ingoturanium), 
				"AAA", 
				"AAA", 
				"AAA", 'A', SpawnOreItems.nuggeturanium);
		
		GameRegistry.addShapedRecipe(new ItemStack(SpawnOreItems.ingottitanium), 
				"AAA", 
				"AAA", 
				"AAA", 'A', SpawnOreItems.nuggettitanium);
		
		GameRegistry.addShapedRecipe(new ItemStack(SpawnOreBlocks.blockamethyst), 
				"AAA", 
				"AAA", 
				"AAA", 'A', SpawnOreItems.itemamethyst);
		
		GameRegistry.addShapedRecipe(new ItemStack(SpawnOreBlocks.blockruby), 
				"AAA", 
				"AAA", 
				"AAA", 'A', SpawnOreItems.itemruby);
		
		GameRegistry.addShapedRecipe(new ItemStack(SpawnOreBlocks.blockuranium), 
				"AAA", 
				"AAA", 
				"AAA", 'A', SpawnOreItems.ingoturanium);
		
		GameRegistry.addShapedRecipe(new ItemStack(SpawnOreBlocks.blocktitanium), 
				"AAA", 
				"AAA", 
				"AAA", 'A', SpawnOreItems.ingottitanium);
		
		GameRegistry.addShapedRecipe(new ItemStack(SpawnOreBlocks.blockeyeofender), 
				"AAA", 
				"AAA", 
				"AAA", 'A', Items.ENDER_EYE);
		
		GameRegistry.addShapedRecipe(new ItemStack(SpawnOreBlocks.blockenderpearl), 
				"AAA", 
				"AAA", 
				"AAA", 'A', Items.ENDER_PEARL);
		
		// Tools
		// Ultimate Sword Init
		ultimate.addEnchantment(Enchantment.getEnchantmentByID(16), 5);
		ultimate.addEnchantment(Enchantment.getEnchantmentByID(17), 5);
		ultimate.addEnchantment(Enchantment.getEnchantmentByID(18), 5);
		ultimate.addEnchantment(Enchantment.getEnchantmentByID(19), 3);
		ultimate.addEnchantment(Enchantment.getEnchantmentByID(21), 3);
		ultimate.addEnchantment(Enchantment.getEnchantmentByID(34), 3);
		ultimate.addEnchantment(Enchantment.getEnchantmentByID(20), 2);
		ultimate.addEnchantment(Enchantment.getEnchantmentByID(70), 1);
		
		GameRegistry.addShapedRecipe(ultimate, 
				"A", 
				"B", 
				"C", 'A', SpawnOreItems.ingottitanium,
				'B', SpawnOreItems.ingoturanium,
				'C', Items.IRON_INGOT);
		
		// Ultimate Pick Init
		ultpick.addEnchantment(Enchantment.getEnchantmentByID(32), 5);
		ultpick.addEnchantment(Enchantment.getEnchantmentByID(35), 5);
		ultpick.addEnchantment(Enchantment.getEnchantmentByID(70), 1);
		
		GameRegistry.addShapedRecipe(ultpick, 
				"ABA", 
				" B ", 
				" C ", 'A', SpawnOreItems.ingottitanium,
				'B', SpawnOreItems.ingoturanium,
				'C', Items.IRON_INGOT);
		
		// Ultimate Shovel Init
		ultshovel.addEnchantment(Enchantment.getEnchantmentByID(32), 5);
		ultshovel.addEnchantment(Enchantment.getEnchantmentByID(70), 1);
		
		GameRegistry.addShapedRecipe(ultshovel, 
				"B", 
				"A", 
				"C", 'A', SpawnOreItems.ingottitanium,
				'B', SpawnOreItems.ingoturanium,
				'C', Items.IRON_INGOT);
		
		// Ultimate Axe Init
		ultaxe.addEnchantment(Enchantment.getEnchantmentByID(32), 5);
		ultaxe.addEnchantment(Enchantment.getEnchantmentByID(70), 1);
		
		GameRegistry.addShapedRecipe(ultaxe, 
				"AB", 
				"AC", 
				" C", 'A', SpawnOreItems.ingottitanium,
				'B', SpawnOreItems.ingoturanium,
				'C', Items.IRON_INGOT);
		
		GameRegistry.addShapedRecipe(ultaxe, 
				"BA", 
				"CA", 
				"C ", 'A', SpawnOreItems.ingottitanium,
				'B', SpawnOreItems.ingoturanium,
				'C', Items.IRON_INGOT);
		
		// Ultimate Hoe Init
		ulthoe.addEnchantment(Enchantment.getEnchantmentByID(32), 2);
		ulthoe.addEnchantment(Enchantment.getEnchantmentByID(70), 1);
		
		GameRegistry.addShapedRecipe(ulthoe, 
				"AB", 
				" C", 
				" C", 'A', SpawnOreItems.ingottitanium,
				'B', SpawnOreItems.ingoturanium,
				'C', Items.IRON_INGOT);
		
		GameRegistry.addShapedRecipe(ulthoe, 
				"BA", 
				"C ", 
				"C ", 'A', SpawnOreItems.ingottitanium,
				'B', SpawnOreItems.ingoturanium,
				'C', Items.IRON_INGOT);
		
		// Ultimate Bow Init
		ultbow.addEnchantment(Enchantment.getEnchantmentByID(48), 5);
		ultbow.addEnchantment(Enchantment.getEnchantmentByID(50), 3);
		ultbow.addEnchantment(Enchantment.getEnchantmentByID(49), 2);
		ultbow.addEnchantment(Enchantment.getEnchantmentByID(51), 1);
		ultbow.addEnchantment(Enchantment.getEnchantmentByID(70), 1);
		
		GameRegistry.addShapedRecipe(ultbow, 
				" AD",
				"C D",
				" BD",
				'A', SpawnOreItems.ingottitanium,
				'B', SpawnOreItems.ingoturanium,
				'C', Items.IRON_INGOT,
				'D', Items.STRING);
		
		GameRegistry.addShapedRecipe(ultbow, 
				"DA ",
				"D C",
				"DB ",
				'A', SpawnOreItems.ingottitanium,
				'B', SpawnOreItems.ingoturanium,
				'C', Items.IRON_INGOT,
				'D', Items.STRING);
		
		// Emerald Init
		GameRegistry.addShapedRecipe(new ItemStack(SpawnOreItems.swordemerald), 
				"A", 
				"A", 
				"B",
				'A', Items.EMERALD,
				'B', Items.STICK);
		
		empick.addEnchantment(Enchantment.getEnchantmentByID(33), 1);
		
		GameRegistry.addShapedRecipe(empick, 
				"AAA", 
				" B ", 
				" B ",
				'A', Items.EMERALD,
				'B', Items.STICK);
		
		GameRegistry.addShapedRecipe(new ItemStack(SpawnOreItems.axeemerald), 
				"AA", 
				"AB", 
				" B",
				'A', Items.EMERALD,
				'B', Items.STICK);
		
		GameRegistry.addShapedRecipe(new ItemStack(SpawnOreItems.axeemerald), 
				"AA", 
				"BA", 
				"B ",
				'A', Items.EMERALD,
				'B', Items.STICK);
		
		GameRegistry.addShapedRecipe(new ItemStack(SpawnOreItems.hoeemerald), 
				"AA", 
				" B", 
				" B",
				'A', Items.EMERALD,
				'B', Items.STICK);
		
		GameRegistry.addShapedRecipe(new ItemStack(SpawnOreItems.hoeemerald), 
				"AA", 
				"B ", 
				"B ",
				'A', Items.EMERALD,
				'B', Items.STICK);
		
		GameRegistry.addShapedRecipe(new ItemStack(SpawnOreItems.shovelemerald), 
				"A", 
				"B", 
				"B",
				'A', Items.EMERALD,
				'B', Items.STICK);
		
		// Amethyst
		GameRegistry.addShapedRecipe(new ItemStack(SpawnOreItems.swordamethyst), 
				"A", 
				"A", 
				"B",
				'A', SpawnOreItems.itemamethyst,
				'B', Items.STICK);
		
		GameRegistry.addShapedRecipe(new ItemStack(SpawnOreItems.pickamethyst), 
				"AAA", 
				" B ", 
				" B ",
				'A', SpawnOreItems.itemamethyst,
				'B', Items.STICK);
		
		GameRegistry.addShapedRecipe(new ItemStack(SpawnOreItems.axeamethyst), 
				"AA", 
				"AB", 
				" B",
				'A', SpawnOreItems.itemamethyst,
				'B', Items.STICK);
		
		GameRegistry.addShapedRecipe(new ItemStack(SpawnOreItems.axeamethyst), 
				"AA", 
				"BA", 
				"B ",
				'A', SpawnOreItems.itemamethyst,
				'B', Items.STICK);
		
		GameRegistry.addShapedRecipe(new ItemStack(SpawnOreItems.hoeamethyst), 
				"AA", 
				" B", 
				" B",
				'A', SpawnOreItems.itemamethyst,
				'B', Items.STICK);
		
		GameRegistry.addShapedRecipe(new ItemStack(SpawnOreItems.hoeamethyst), 
				"AA", 
				"B ", 
				"B ",
				'A', SpawnOreItems.itemamethyst,
				'B', Items.STICK);
		
		GameRegistry.addShapedRecipe(new ItemStack(SpawnOreItems.shovelamethyst), 
				"A", 
				"B", 
				"B",
				'A', SpawnOreItems.itemamethyst,
				'B', Items.STICK);
		
		// Ruby
		GameRegistry.addShapedRecipe(new ItemStack(SpawnOreItems.swordruby), 
				"A", 
				"A", 
				"B",
				'A', SpawnOreItems.itemruby,
				'B', Items.STICK);
		
		GameRegistry.addShapedRecipe(new ItemStack(SpawnOreItems.pickruby), 
				"AAA", 
				" B ", 
				" B ",
				'A', SpawnOreItems.itemruby,
				'B', Items.STICK);
		
		GameRegistry.addShapedRecipe(new ItemStack(SpawnOreItems.axeruby), 
				"AA", 
				"AB", 
				" B",
				'A', SpawnOreItems.itemruby,
				'B', Items.STICK);
		
		GameRegistry.addShapedRecipe(new ItemStack(SpawnOreItems.axeruby), 
				"AA", 
				"BA", 
				"B ",
				'A', SpawnOreItems.itemruby,
				'B', Items.STICK);
		
		GameRegistry.addShapedRecipe(new ItemStack(SpawnOreItems.hoeruby), 
				"AA", 
				" B", 
				" B",
				'A', SpawnOreItems.itemruby,
				'B', Items.STICK);
		
		GameRegistry.addShapedRecipe(new ItemStack(SpawnOreItems.hoeruby), 
				"AA", 
				"B ", 
				"B ",
				'A', SpawnOreItems.itemruby,
				'B', Items.STICK);
		
		GameRegistry.addShapedRecipe(new ItemStack(SpawnOreItems.shovelruby), 
				"A", 
				"B", 
				"B",
				'A', SpawnOreItems.itemruby,
				'B', Items.STICK);
		
		// Random tools
		nightmare.addEnchantment(Enchantment.getEnchantmentByID(16), 1);
		nightmare.addEnchantment(Enchantment.getEnchantmentByID(19), 3);
		nightmare.addEnchantment(Enchantment.getEnchantmentByID(20), 1);
		
		GameRegistry.addShapedRecipe(nightmare, 
				"ABA", 
				"CDC", 
				"AEA",
				'A', SpawnOreItems.nightmarescale,
				'B', Items.DIAMOND,
				'C', Items.REDSTONE,
				'D', SpawnOreItems.ingottitanium,
				'E', Items.IRON_INGOT);
		
		// Armor
		// Ultimate Helmet Init
		ulthelm.addEnchantment(Enchantment.getEnchantmentByID(0), 5);
		ulthelm.addEnchantment(Enchantment.getEnchantmentByID(1), 5);
		ulthelm.addEnchantment(Enchantment.getEnchantmentByID(3), 5);
		ulthelm.addEnchantment(Enchantment.getEnchantmentByID(4), 5);
		ulthelm.addEnchantment(Enchantment.getEnchantmentByID(5), 2);
		ulthelm.addEnchantment(Enchantment.getEnchantmentByID(6), 3);
		
		GameRegistry.addShapedRecipe(ulthelm, 
				"ACA", 
				"B B", 
				'A', SpawnOreItems.ingottitanium,
				'B', SpawnOreItems.ingoturanium,
				'C', Items.IRON_INGOT);
		
		// Ultimate Chestplate Init
		ultchest.addEnchantment(Enchantment.getEnchantmentByID(0), 5);
		ultchest.addEnchantment(Enchantment.getEnchantmentByID(1), 5);
		ultchest.addEnchantment(Enchantment.getEnchantmentByID(3), 5);
		ultchest.addEnchantment(Enchantment.getEnchantmentByID(4), 5);
		
		GameRegistry.addShapedRecipe(ultchest, 
				"C C", 
				"AAA",
				"BBB",
				'A', SpawnOreItems.ingottitanium,
				'B', SpawnOreItems.ingoturanium,
				'C', Items.IRON_INGOT);
		
		// Ultimate Leggings Init
		ultleg.addEnchantment(Enchantment.getEnchantmentByID(0), 5);
		ultleg.addEnchantment(Enchantment.getEnchantmentByID(1), 5);
		ultleg.addEnchantment(Enchantment.getEnchantmentByID(3), 5);
		ultleg.addEnchantment(Enchantment.getEnchantmentByID(4), 5);
		
		GameRegistry.addShapedRecipe(ultleg, 
				"CCC", 
				"A A",
				"B B",
				'A', SpawnOreItems.ingottitanium,
				'B', SpawnOreItems.ingoturanium,
				'C', Items.IRON_INGOT);
		
		// Ultimate Boots Init
		ultboot.addEnchantment(Enchantment.getEnchantmentByID(0), 5);
		ultboot.addEnchantment(Enchantment.getEnchantmentByID(1), 5);
		ultboot.addEnchantment(Enchantment.getEnchantmentByID(3), 5);
		ultboot.addEnchantment(Enchantment.getEnchantmentByID(4), 5);
		ultboot.addEnchantment(Enchantment.getEnchantmentByID(2), 3);
		
		GameRegistry.addShapedRecipe(ultboot, 
				"A A",
				"B B",
				'A', SpawnOreItems.ingottitanium,
				'B', SpawnOreItems.ingoturanium);
		
		// Amethyst
		GameRegistry.addShapedRecipe(new ItemStack(SpawnOreItems.helmamethyst), 
				"AAA", 
				"A A", 
				'A', SpawnOreItems.itemamethyst);
		
		GameRegistry.addShapedRecipe(new ItemStack(SpawnOreItems.chestamethyst), 
				"A A", 
				"AAA",
				"AAA",
				'A', SpawnOreItems.itemamethyst);
		
		GameRegistry.addShapedRecipe(new ItemStack(SpawnOreItems.legamethyst), 
				"AAA", 
				"A A",
				"A A",
				'A', SpawnOreItems.itemamethyst);
		
		GameRegistry.addShapedRecipe(new ItemStack(SpawnOreItems.bootamethyst), 
				"A A", 
				"A A", 
				'A', SpawnOreItems.itemamethyst);
		
		// Emerald
		GameRegistry.addShapedRecipe(new ItemStack(SpawnOreItems.helmemerald), 
				"AAA", 
				"A A", 
				'A', Items.EMERALD);
		
		GameRegistry.addShapedRecipe(new ItemStack(SpawnOreItems.chestemerald), 
				"A A", 
				"AAA",
				"AAA",
				'A', Items.EMERALD);
		
		GameRegistry.addShapedRecipe(new ItemStack(SpawnOreItems.legemerald), 
				"AAA", 
				"A A",
				"A A",
				'A', Items.EMERALD);
		
		GameRegistry.addShapedRecipe(new ItemStack(SpawnOreItems.bootemerald), 
				"A A", 
				"A A", 
				'A', Items.EMERALD);
		
		// Ruby
		GameRegistry.addShapedRecipe(new ItemStack(SpawnOreItems.helmruby), 
				"AAA", 
				"A A", 
				'A', SpawnOreItems.itemruby);
		
		GameRegistry.addShapedRecipe(new ItemStack(SpawnOreItems.chestruby), 
				"A A", 
				"AAA",
				"AAA",
				'A', SpawnOreItems.itemruby);
		
		GameRegistry.addShapedRecipe(new ItemStack(SpawnOreItems.legruby), 
				"AAA", 
				"A A",
				"A A",
				'A', SpawnOreItems.itemruby);
		
		GameRegistry.addShapedRecipe(new ItemStack(SpawnOreItems.bootruby), 
				"A A", 
				"A A", 
				'A', SpawnOreItems.itemruby);
		
		// Lapis
		laphelm.addEnchantment(Enchantment.getEnchantmentByID(0), 1);
		laphelm.addEnchantment(Enchantment.getEnchantmentByID(4), 1);
		laphelm.addEnchantment(Enchantment.getEnchantmentByID(5), 1);
		laphelm.addEnchantment(Enchantment.getEnchantmentByID(6), 1);
		lapchest.addEnchantment(Enchantment.getEnchantmentByID(0), 1);
		lapchest.addEnchantment(Enchantment.getEnchantmentByID(4), 1);
		lapleg.addEnchantment(Enchantment.getEnchantmentByID(0), 1);
		lapleg.addEnchantment(Enchantment.getEnchantmentByID(4), 1);
		lapboot.addEnchantment(Enchantment.getEnchantmentByID(0), 1);
		lapboot.addEnchantment(Enchantment.getEnchantmentByID(4), 1);
		
		GameRegistry.addShapedRecipe(laphelm, 
				"AAA", 
				"A A", 
				'A', Blocks.LAPIS_BLOCK);
		
		GameRegistry.addShapedRecipe(lapchest, 
				"A A", 
				"AAA",
				"AAA",
				'A', Blocks.LAPIS_BLOCK);
		
		GameRegistry.addShapedRecipe(lapleg, 
				"AAA", 
				"A A",
				"A A",
				'A', Blocks.LAPIS_BLOCK);
		
		GameRegistry.addShapedRecipe(lapboot,
				"A A",
				"A A",
				'A', Blocks.LAPIS_BLOCK);
		
		// Big Bertha Parts
		GameRegistry.addShapedRecipe(new ItemStack(SpawnOreItems.bigberthablade),
				" AB",
				"CDE",
				"FG ",
				'A', SpawnOreItems.wormtooth,
				'B', SpawnOreItems.krakentooth,
				'C', SpawnOreItems.vortexeye,
				'D', SpawnOreItems.swordultimate,
				'E', SpawnOreItems.trextooth,
				'F', SpawnOreItems.caterkillerjaw,
				'G', SpawnOreItems.seavipertongue);
		
		GameRegistry.addShapedRecipe(new ItemStack(SpawnOreItems.bigberthaguard),
				"AB ",
				"CDE",
				" FG",
				'A', SpawnOreItems.seamonsterscale,
				'B', SpawnOreItems.nightmarescale,
				'C', SpawnOreItems.jumpybugscale,
				'D', SpawnOreItems.molenoidnose,
				'E', SpawnOreItems.emperorscorpionscale,
				'F', SpawnOreItems.mothscale,
				'G', SpawnOreItems.basiliskscale);
		
		
		// Food Items
		GameRegistry.addShapedRecipe(new ItemStack(SpawnOreItems.popcornbag), 
				"AAB", 
				"AAB",
				"AAB",
				'A', SpawnOreItems.buttersaltpop,
				'B', Items.PAPER);
		
	}

}
