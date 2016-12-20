package xeno.spawnore.recipe;

import net.minecraft.enchantment.Enchantment;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;
import xeno.spawnore.init.SpawnOreBlocks;
import xeno.spawnore.init.SpawnOreItems;

public class Shapeless {
	
	public static void init() {
		
		GameRegistry.addShapelessRecipe(new ItemStack(SpawnOreItems.uncookedbacon), SpawnOreItems.itemsalt, Items.PORKCHOP);
		GameRegistry.addShapelessRecipe(new ItemStack(SpawnOreItems.nuggeturanium, 9), SpawnOreItems.ingoturanium);
		GameRegistry.addShapelessRecipe(new ItemStack(SpawnOreItems.nuggettitanium, 9), SpawnOreItems.ingottitanium);
		GameRegistry.addShapelessRecipe(new ItemStack(SpawnOreItems.itemamethyst, 9), SpawnOreBlocks.blockamethyst);
		GameRegistry.addShapelessRecipe(new ItemStack(SpawnOreItems.itemruby, 9), SpawnOreBlocks.blockruby);
		GameRegistry.addShapelessRecipe(new ItemStack(SpawnOreItems.ingoturanium, 9), SpawnOreBlocks.blockuranium);
		GameRegistry.addShapelessRecipe(new ItemStack(SpawnOreItems.ingottitanium, 9), SpawnOreBlocks.blocktitanium);
		GameRegistry.addShapelessRecipe(new ItemStack(Items.ENDER_EYE, 9), SpawnOreBlocks.blockeyeofender);
		GameRegistry.addShapelessRecipe(new ItemStack(Items.ENDER_PEARL, 9), SpawnOreBlocks.blockenderpearl);
		GameRegistry.addShapelessRecipe(new ItemStack(SpawnOreItems.buttercandy, 4), SpawnOreItems.itembutter, Items.SUGAR);
		GameRegistry.addShapelessRecipe(new ItemStack(SpawnOreItems.butterpop, 1), SpawnOreItems.itembutter, SpawnOreItems.popcorn);
		GameRegistry.addShapelessRecipe(new ItemStack(SpawnOreItems.buttersaltpop, 1), SpawnOreItems.itemsalt, SpawnOreItems.itembutter,SpawnOreItems.popcorn);
		GameRegistry.addShapelessRecipe(new ItemStack(SpawnOreItems.buttersaltpop, 1), SpawnOreItems.itemsalt, SpawnOreItems.butterpop);
		GameRegistry.addShapelessRecipe(new ItemStack(SpawnOreItems.itempizza, 1), SpawnOreItems.itemcheese, SpawnOreItems.itemtomato, SpawnOreItems.cookedbacon, Items.BREAD);
		GameRegistry.addShapelessRecipe(new ItemStack(SpawnOreItems.itemblt, 1), SpawnOreItems.itemlettuce, SpawnOreItems.itemtomato, SpawnOreItems.cookedbacon, Items.BREAD, SpawnOreItems.itembutter);
		GameRegistry.addShapelessRecipe(new ItemStack(SpawnOreItems.rawcorndog, 4), SpawnOreItems.itemcorn, Items.CHICKEN, Items.PORKCHOP, Items.STICK);
		GameRegistry.addShapelessRecipe(new ItemStack(SpawnOreItems.itemcheese, 2), Items.MILK_BUCKET.setContainerItem(Items.BUCKET), Items.MILK_BUCKET.setContainerItem(Items.BUCKET), Items.MILK_BUCKET.setContainerItem(Items.BUCKET), Items.MILK_BUCKET.setContainerItem(Items.BUCKET));
		GameRegistry.addShapelessRecipe(new ItemStack(SpawnOreItems.itembutter, 4), Items.MILK_BUCKET.setContainerItem(Items.BUCKET), Items.MILK_BUCKET.setContainerItem(Items.BUCKET));
		
		// Big Bertha Enchantment adding
		ItemStack bertha = new ItemStack(SpawnOreItems.bigbertha);
		bertha.addEnchantment(Enchantment.getEnchantmentByID(19), 5);
		bertha.addEnchantment(Enchantment.getEnchantmentByID(20), 1);
		bertha.addEnchantment(Enchantment.getEnchantmentByID(18), 1);
		GameRegistry.addShapelessRecipe(bertha, SpawnOreItems.bigberthablade, SpawnOreItems.bigberthaguard, SpawnOreItems.bigberthahandle);
		
	}

}
