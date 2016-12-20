package xeno.spawnore.init;

import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.init.MobEffects;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.potion.PotionEffect;
import net.minecraftforge.fml.common.registry.GameRegistry;
import xeno.spawnore.SpawnOre;
import xeno.spawnore.item.CookedBacon;
import xeno.spawnore.item.ItemArmor;
import xeno.spawnore.item.ItemAxe;
import xeno.spawnore.item.ItemBase;
import xeno.spawnore.item.ItemBow;
import xeno.spawnore.item.ItemExtraSmallZooCage;
import xeno.spawnore.item.ItemExtremeTorch;
import xeno.spawnore.item.ItemFood;
import xeno.spawnore.item.ItemHoe;
import xeno.spawnore.item.ItemModelProvider;
import xeno.spawnore.item.ItemPickaxe;
import xeno.spawnore.item.ItemPizza;
import xeno.spawnore.item.ItemRayGun;
import xeno.spawnore.item.ItemSeed;
import xeno.spawnore.item.ItemShovel;
import xeno.spawnore.item.ItemSpawnEgg;
import xeno.spawnore.item.ItemSword;

public class SpawnOreItems {
	
	// instantiate items
	public static ItemBase itemamethyst;
	public static ItemBase itemruby;
	public static ItemBase nuggeturanium;
	public static ItemBase ingoturanium;
	public static ItemBase nuggettitanium;
	public static ItemBase ingottitanium;
	public static ItemBase itemsalt;
	public static ItemBase waterdragonscale;
	public static ItemBase nightmarescale;
	public static ItemBase basiliskscale;
	public static ItemBase mobzillascale;
	public static ItemBase molenoidnose;
	public static ItemBase mothscale;
	public static ItemBase caterkillerjaw;
	public static ItemBase seamonsterscale;
	public static ItemBase seavipertongue;
	public static ItemBase trextooth;
	public static ItemBase vortexeye;
	public static ItemBase wormtooth;
	public static ItemBase greengoo;
	public static ItemBase jumpybugscale;
	public static ItemBase krakentooth;
	public static ItemBase emperorscorpionscale;
	public static ItemBase mantisclaw;
	public static ItemBase bigberthablade;
	public static ItemBase bigberthaguard;
	public static ItemBase bigberthahandle;
	
	public static ItemFood uncookedbacon;
	public static ItemFood cookedbacon;
	public static ItemFood itemcheese;
	public static ItemFood itembutter;
	public static ItemFood buttercandy;
	public static ItemFood itemcorn;
	public static ItemFood popcorn;
	public static ItemFood rawcorndog;
	public static ItemFood corndog;
	public static ItemFood butterpop;
	public static ItemFood buttersaltpop;
	public static ItemFood popcornbag;
	public static ItemFood itemtomato;
	public static ItemFood itemlettuce;
	public static ItemFood itemblt;
	public static ItemFood itempeach;
	public static ItemFood crystalapple;
	
	// Random Stuff
	public static ItemPizza itempizza;
	public static ItemExtremeTorch itemextremetorch;
	//public static ItemExtraSmallZooCage extrasmallcage;
	public static ItemRayGun raygun;
	
	// Seeds
	public static ItemSeed seedcorn;
	public static ItemSeed seedtomato;
	public static ItemSeed seedlettuce;
	
	// spawn eggs
	public static ItemSpawnEgg spawnstinky;
	
	// instantiate tools
	// ultimate
	public static ItemSword swordultimate;
	public static ItemPickaxe pickultimate;
	public static ItemShovel shovelultimate;
	public static ItemAxe axeultimate;
	public static ItemHoe hoeultimate;
	public static ItemBow bowultimate;
	
	// BERTHA
	public static ItemSword bigbertha;
	
	// emerald
	public static ItemSword swordemerald;
	public static ItemPickaxe pickemerald;
	public static ItemShovel shovelemerald;
	public static ItemAxe axeemerald;
	public static ItemHoe hoeemerald;
	
	// amethyst
	public static ItemSword swordamethyst;
	public static ItemPickaxe pickamethyst;
	public static ItemShovel shovelamethyst;
	public static ItemAxe axeamethyst;
	public static ItemHoe hoeamethyst;
	
	// ruby
	public static ItemSword swordruby;
	public static ItemPickaxe pickruby;
	public static ItemShovel shovelruby;
	public static ItemAxe axeruby;
	public static ItemHoe hoeruby;
	
	// Random Tools
	public static ItemSword nightmaresword;
	
	// instantiate armor
	// ultimate
	public static ItemArmor helmultimate;
	public static ItemArmor chestultimate;
	public static ItemArmor legultimate;
	public static ItemArmor bootultimate;
	
	// amethyst
	public static ItemArmor helmamethyst;
	public static ItemArmor chestamethyst;
	public static ItemArmor legamethyst;
	public static ItemArmor bootamethyst;
	
	// emerald
	public static ItemArmor helmemerald;
	public static ItemArmor chestemerald;
	public static ItemArmor legemerald;
	public static ItemArmor bootemerald;
	
	// ruby
	public static ItemArmor helmruby;
	public static ItemArmor chestruby;
	public static ItemArmor legruby;
	public static ItemArmor bootruby;
	
	// lapis
	public static ItemArmor helmlapis;
	public static ItemArmor chestlapis;
	public static ItemArmor leglapis;
	public static ItemArmor bootlapis;
	
	public static void init() {
		// init items
		itemamethyst = register(new ItemBase("itemamethyst").setCreativeTab(SpawnOre.tabspawnore));
		itemruby = register(new ItemBase("itemruby").setCreativeTab(SpawnOre.tabspawnore));
		nuggeturanium = register(new ItemBase("nuggeturanium").setCreativeTab(SpawnOre.tabspawnore));
		ingoturanium = register(new ItemBase("ingoturanium").setCreativeTab(SpawnOre.tabspawnore));
		nuggettitanium = register(new ItemBase("nuggettitanium").setCreativeTab(SpawnOre.tabspawnore));
		ingottitanium = register(new ItemBase("ingottitanium").setCreativeTab(SpawnOre.tabspawnore));
		itemsalt = register(new ItemBase("itemsalt").setCreativeTab(SpawnOre.tabspawnore));
		waterdragonscale = register(new ItemBase("waterdragonscale").setCreativeTab(SpawnOre.tabspawnore));
		nightmarescale = register(new ItemBase("nightmarescale").setCreativeTab(SpawnOre.tabspawnore));
		basiliskscale = register(new ItemBase("basiliskscale").setCreativeTab(SpawnOre.tabspawnore));
		mobzillascale = register(new ItemBase("mobzillascale").setCreativeTab(SpawnOre.tabspawnore));
		molenoidnose = register(new ItemBase("molenoidnose").setCreativeTab(SpawnOre.tabspawnore));
		mothscale = register(new ItemBase("mothscale").setCreativeTab(SpawnOre.tabspawnore));
		caterkillerjaw = register(new ItemBase("caterkillerjaw").setCreativeTab(SpawnOre.tabspawnore));
		seamonsterscale = register(new ItemBase("seamonsterscale").setCreativeTab(SpawnOre.tabspawnore));
		seavipertongue = register(new ItemBase("seavipertongue").setCreativeTab(SpawnOre.tabspawnore));
		trextooth = register(new ItemBase("trextooth").setCreativeTab(SpawnOre.tabspawnore));
		vortexeye = register(new ItemBase("vortexeye").setCreativeTab(SpawnOre.tabspawnore));
		wormtooth = register(new ItemBase("wormtooth").setCreativeTab(SpawnOre.tabspawnore));
		greengoo = register(new ItemBase("greengoo").setCreativeTab(SpawnOre.tabspawnore));
		jumpybugscale = register(new ItemBase("jumpybugscale").setCreativeTab(SpawnOre.tabspawnore));
		krakentooth = register(new ItemBase("krakentooth").setCreativeTab(SpawnOre.tabspawnore));
		emperorscorpionscale = register(new ItemBase("emperorscorpionscale").setCreativeTab(SpawnOre.tabspawnore));
		bigberthablade = register(new ItemBase("bigberthablade").setCreativeTab(SpawnOre.tabspawnore));
		mantisclaw = register(new ItemBase("mantisclaw").setCreativeTab(SpawnOre.tabspawnore));
		bigberthaguard = register(new ItemBase("bigberthaguard").setCreativeTab(SpawnOre.tabspawnore));
		bigberthahandle = register(new ItemBase("bigberthahandle").setCreativeTab(SpawnOre.tabspawnore));
		
		// Seeds
		seedcorn = (ItemSeed) register(new ItemSeed("seedcorn", SpawnOreBlocks.cropcorn, Blocks.FARMLAND).setCreativeTab(SpawnOre.tabspawnore));
		seedtomato = (ItemSeed) register(new ItemSeed("seedtomato", SpawnOreBlocks.croptomato, Blocks.FARMLAND).setCreativeTab(SpawnOre.tabspawnore));
		seedlettuce = (ItemSeed) register(new ItemSeed("seedlettuce", SpawnOreBlocks.croplettuce, Blocks.FARMLAND).setCreativeTab(SpawnOre.tabspawnore));
		
		// Spawn Eggs
		ItemStack stinky = new ItemStack(Items.SPAWN_EGG);
		applyEntityIdToItemStack(stinky, "spawnore.stinky");
		
		// init tools
		// ultimate tools
		swordultimate = (ItemSword) register(new ItemSword(SpawnOre.ultimateToolMaterial, "swordultimate").setCreativeTab(SpawnOre.tabspawnore));
		pickultimate = (ItemPickaxe) register(new ItemPickaxe(SpawnOre.ultimateToolMaterial, "pickultimate").setCreativeTab(SpawnOre.tabspawnore));
		shovelultimate = (ItemShovel) register(new ItemShovel(SpawnOre.ultimateToolMaterial, "shovelultimate").setCreativeTab(SpawnOre.tabspawnore));
		axeultimate = (ItemAxe) register(new ItemAxe(SpawnOre.ultimateToolMaterial, "axeultimate").setCreativeTab(SpawnOre.tabspawnore));
		hoeultimate = (ItemHoe) register(new ItemHoe(SpawnOre.ultimateToolMaterial, "hoeultimate").setCreativeTab(SpawnOre.tabspawnore));
		bowultimate = (ItemBow) register(new ItemBow(SpawnOre.ultimateToolMaterial, "bowultimate", (new ItemStack(Items.ARROW))).setMaxDamage(1000).setCreativeTab(SpawnOre.tabspawnore));
		
		// BERTHA
		bigbertha = (ItemSword) register(new ItemSword(SpawnOre.berthaToolMaterial, "bigbertha").setCreativeTab(SpawnOre.tabspawnore));
		
		// emerald
		swordemerald = (ItemSword) register(new ItemSword(SpawnOre.emeraldToolMaterial, "swordemerald").setCreativeTab(SpawnOre.tabspawnore));
		pickemerald = (ItemPickaxe) register(new ItemPickaxe(SpawnOre.emeraldToolMaterial, "pickemerald").setCreativeTab(SpawnOre.tabspawnore));
		shovelemerald = (ItemShovel) register(new ItemShovel(SpawnOre.emeraldToolMaterial, "shovelemerald").setCreativeTab(SpawnOre.tabspawnore));
		axeemerald = (ItemAxe) register(new ItemAxe(SpawnOre.emeraldToolMaterial, "axeemerald").setCreativeTab(SpawnOre.tabspawnore));
		hoeemerald = (ItemHoe) register(new ItemHoe(SpawnOre.emeraldToolMaterial, "hoeemerald").setCreativeTab(SpawnOre.tabspawnore));
		
		// amethyst
		swordamethyst = (ItemSword) register(new ItemSword(SpawnOre.amethystToolMaterial, "swordamethyst").setCreativeTab(SpawnOre.tabspawnore));
		pickamethyst = (ItemPickaxe) register(new ItemPickaxe(SpawnOre.amethystToolMaterial, "pickamethyst").setCreativeTab(SpawnOre.tabspawnore));
		shovelamethyst = (ItemShovel) register(new ItemShovel(SpawnOre.amethystToolMaterial, "shovelamethyst").setCreativeTab(SpawnOre.tabspawnore));
		axeamethyst = (ItemAxe) register(new ItemAxe(SpawnOre.amethystToolMaterial, "axeamethyst").setCreativeTab(SpawnOre.tabspawnore));
		hoeamethyst = (ItemHoe) register(new ItemHoe(SpawnOre.amethystToolMaterial, "hoeamethyst").setCreativeTab(SpawnOre.tabspawnore));
		
		// ruby
		swordruby = (ItemSword) register(new ItemSword(SpawnOre.rubyToolMaterial, "swordruby").setCreativeTab(SpawnOre.tabspawnore));
		pickruby = (ItemPickaxe) register(new ItemPickaxe(SpawnOre.rubyToolMaterial, "pickruby").setCreativeTab(SpawnOre.tabspawnore));
		shovelruby = (ItemShovel) register(new ItemShovel(SpawnOre.rubyToolMaterial, "shovelruby").setCreativeTab(SpawnOre.tabspawnore));
		axeruby = (ItemAxe) register(new ItemAxe(SpawnOre.rubyToolMaterial, "axeruby").setCreativeTab(SpawnOre.tabspawnore));
		hoeruby = (ItemHoe) register(new ItemHoe(SpawnOre.rubyToolMaterial, "hoeruby").setCreativeTab(SpawnOre.tabspawnore));
		
		// Random tools
		nightmaresword = (ItemSword) register(new ItemSword(SpawnOre.nightmareToolMaterial, "nightmaresword").setCreativeTab(SpawnOre.tabspawnore));
		
		// Init armor
		// ultimate
		helmultimate = (ItemArmor) register(new ItemArmor(SpawnOre.ultimateArmorMaterial, EntityEquipmentSlot.HEAD, "helmultimate").setCreativeTab(SpawnOre.tabspawnore));
		chestultimate = (ItemArmor) register(new ItemArmor(SpawnOre.ultimateArmorMaterial, EntityEquipmentSlot.CHEST, "chestultimate").setCreativeTab(SpawnOre.tabspawnore));
		legultimate = (ItemArmor) register(new ItemArmor(SpawnOre.ultimateArmorMaterial, EntityEquipmentSlot.LEGS, "legultimate").setCreativeTab(SpawnOre.tabspawnore));
		bootultimate = (ItemArmor) register(new ItemArmor(SpawnOre.ultimateArmorMaterial, EntityEquipmentSlot.FEET, "bootultimate").setCreativeTab(SpawnOre.tabspawnore));
		
		// amethyst
		helmamethyst = (ItemArmor) register(new ItemArmor(SpawnOre.amethystArmorMaterial, EntityEquipmentSlot.HEAD, "helmamethyst").setCreativeTab(SpawnOre.tabspawnore));
		chestamethyst = (ItemArmor) register(new ItemArmor(SpawnOre.amethystArmorMaterial, EntityEquipmentSlot.CHEST, "chestamethyst").setCreativeTab(SpawnOre.tabspawnore));
		legamethyst = (ItemArmor) register(new ItemArmor(SpawnOre.amethystArmorMaterial, EntityEquipmentSlot.LEGS, "legamethyst").setCreativeTab(SpawnOre.tabspawnore));
		bootamethyst = (ItemArmor) register(new ItemArmor(SpawnOre.amethystArmorMaterial, EntityEquipmentSlot.FEET, "bootamethyst").setCreativeTab(SpawnOre.tabspawnore));
		
		// emerald
		helmemerald = (ItemArmor) register(new ItemArmor(SpawnOre.emeraldArmorMaterial, EntityEquipmentSlot.HEAD, "helmemerald").setCreativeTab(SpawnOre.tabspawnore));
		chestemerald = (ItemArmor) register(new ItemArmor(SpawnOre.emeraldArmorMaterial, EntityEquipmentSlot.CHEST, "chestemerald").setCreativeTab(SpawnOre.tabspawnore));
		legemerald = (ItemArmor) register(new ItemArmor(SpawnOre.emeraldArmorMaterial, EntityEquipmentSlot.LEGS, "legemerald").setCreativeTab(SpawnOre.tabspawnore));
		bootemerald = (ItemArmor) register(new ItemArmor(SpawnOre.emeraldArmorMaterial, EntityEquipmentSlot.FEET, "bootemerald").setCreativeTab(SpawnOre.tabspawnore));
		
		// ruby
		helmruby = (ItemArmor) register(new ItemArmor(SpawnOre.rubyArmorMaterial, EntityEquipmentSlot.HEAD, "helmruby").setCreativeTab(SpawnOre.tabspawnore));
		chestruby = (ItemArmor) register(new ItemArmor(SpawnOre.rubyArmorMaterial, EntityEquipmentSlot.CHEST, "chestruby").setCreativeTab(SpawnOre.tabspawnore));
		legruby = (ItemArmor) register(new ItemArmor(SpawnOre.rubyArmorMaterial, EntityEquipmentSlot.LEGS, "legruby").setCreativeTab(SpawnOre.tabspawnore));
		bootruby = (ItemArmor) register(new ItemArmor(SpawnOre.rubyArmorMaterial, EntityEquipmentSlot.FEET, "bootruby").setCreativeTab(SpawnOre.tabspawnore));
		
		//lapis
		helmlapis = (ItemArmor) register(new ItemArmor(SpawnOre.lapisArmorMaterial, EntityEquipmentSlot.HEAD, "helmlapis").setCreativeTab(SpawnOre.tabspawnore));
		chestlapis = (ItemArmor) register(new ItemArmor(SpawnOre.lapisArmorMaterial, EntityEquipmentSlot.CHEST, "chestlapis").setCreativeTab(SpawnOre.tabspawnore));
		leglapis = (ItemArmor) register(new ItemArmor(SpawnOre.lapisArmorMaterial, EntityEquipmentSlot.LEGS, "leglapis").setCreativeTab(SpawnOre.tabspawnore));
		bootlapis = (ItemArmor) register(new ItemArmor(SpawnOre.lapisArmorMaterial, EntityEquipmentSlot.FEET, "bootlapis").setCreativeTab(SpawnOre.tabspawnore));
		
		// init food
		uncookedbacon = (ItemFood) register(new ItemFood("uncookedbacon", 8, 1.5f, true).setCreativeTab(SpawnOre.tabspawnore));
		itemcheese = (ItemFood) register(new ItemFood("itemcheese", 4, 0.5f, false).setCreativeTab(SpawnOre.tabspawnore));
		itembutter = (ItemFood) register(new ItemFood("itembutter", 1, 0.2f, false).setCreativeTab(SpawnOre.tabspawnore));
		itemcorn = (ItemFood) register(new ItemFood("itemcorn", 6, 0.4f, false).setCreativeTab(SpawnOre.tabspawnore));
		itemtomato = (ItemFood) register(new ItemFood("itemtomato", 4, 0.4f, false).setCreativeTab(SpawnOre.tabspawnore));
		popcorn = (ItemFood) register(new ItemFood("popcorn", 1, 0.2f, false).setCreativeTab(SpawnOre.tabspawnore));
		butterpop = (ItemFood) register(new ItemFood("butterpop", 2, 0.2f, false).setCreativeTab(SpawnOre.tabspawnore));
		buttersaltpop = (ItemFood) register(new ItemFood("buttersaltpop", 3, 0.2f, false).setCreativeTab(SpawnOre.tabspawnore));
		popcornbag = (ItemFood) register(new ItemFood("popcornbag", 10, 0.5f, false).setCreativeTab(SpawnOre.tabspawnore));
		rawcorndog = (ItemFood) register(new ItemFood("rawcorndog", 4, 0.4f, false).setCreativeTab(SpawnOre.tabspawnore));
		corndog = (ItemFood) register(new ItemFood("corndog", 16, 2.0f, false).setCreativeTab(SpawnOre.tabspawnore));
		itemlettuce = (ItemFood) register(new ItemFood("itemlettuce", 3, 0.45f, false).setCreativeTab(SpawnOre.tabspawnore));
		itemblt = (ItemFood) register(new ItemFood("itemblt", 12, 0.95f, false).setCreativeTab(SpawnOre.tabspawnore));
		itempeach = (ItemFood) register(new ItemFood("itempeach", 4, 0.55f, false).setCreativeTab(SpawnOre.tabspawnore));
		crystalapple = (CookedBacon) register(new CookedBacon("crystalapple", 5, 0.85f, false).setPotionEffect(new PotionEffect(MobEffects.STRENGTH, 1700, 0), 1.0f, new PotionEffect(MobEffects.REGENERATION, 1700, 0), 1.0f).setCreativeTab(SpawnOre.tabspawnore));
		cookedbacon = (CookedBacon) register(new CookedBacon("cookedbacon", 14, 3.0f, true).setPotionEffect((new PotionEffect(MobEffects.STRENGTH, 1700, 0)), 1.0f, (new PotionEffect(MobEffects.REGENERATION, 1700, 0)), 1.0f).setCreativeTab(SpawnOre.tabspawnore));
		buttercandy = (CookedBacon) register(new CookedBacon("buttercandy", 4, 0.5f, false).setPotionEffect((new PotionEffect(MobEffects.SPEED, 1700, 0)), 1.0f, (new PotionEffect(MobEffects.JUMP_BOOST, 1700, 0)), 1.0f).setCreativeTab(SpawnOre.tabspawnore));
		
		// Random Stuff
		itemextremetorch = (ItemExtremeTorch) register(new ItemExtremeTorch(SpawnOreBlocks.extremetorch, "itemextremetorch").setCreativeTab(SpawnOre.tabspawnore));
		itempizza = (ItemPizza) register(new ItemPizza(SpawnOreBlocks.pizza, "itempizza").setCreativeTab(SpawnOre.tabspawnore));
		//extrasmallcage = (ItemExtraSmallZooCage) register(new ItemExtraSmallZooCage("extrasmallcage", Blocks.QUARTZ_BLOCK).setCreativeTab(SpawnOre.tabspawnore));
		raygun = register(new ItemRayGun("raygun", SpawnOre.tabspawnore));
	}
	
	public static void applyEntityIdToItemStack(ItemStack stack, String entityId) {
		NBTTagCompound nbttagcompound = new net.minecraft.nbt.NBTTagCompound();
		NBTTagCompound nbttagcompound1 = new NBTTagCompound();
		nbttagcompound1.setString("id", entityId);
		nbttagcompound.setTag("EntityTag", nbttagcompound1);
		stack.setTagCompound(nbttagcompound); //crashing line
	}
	
	// render items
	private static <T extends Item> T register(T item) {
		GameRegistry.register(item);

		if (item instanceof ItemModelProvider) {
			((ItemModelProvider)item).registerItemModel(item);
		}

		return item;
	}
	
}
