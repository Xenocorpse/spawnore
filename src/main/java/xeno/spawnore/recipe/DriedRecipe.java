package xeno.spawnore.recipe;

import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraftforge.fml.common.registry.GameRegistry;
import xeno.spawnore.init.SpawnOreBlocks;

public class DriedRecipe {
	
public static void init() {
		
		// Ancient Dried Shapeless
		ItemStack creeper = new ItemStack(Items.SPAWN_EGG);
		applyEntityIdToItemStack(creeper, "Creeper");
		GameRegistry.addShapelessRecipe(creeper, SpawnOreBlocks.orecreeper, Items.WATER_BUCKET.setContainerItem(Items.BUCKET));
		
		ItemStack skeleton = new ItemStack(Items.SPAWN_EGG);
		applyEntityIdToItemStack(skeleton, "Skeleton");
		GameRegistry.addShapelessRecipe(skeleton, SpawnOreBlocks.oreskeleton, Items.WATER_BUCKET.setContainerItem(Items.BUCKET));
		
		ItemStack spider = new ItemStack(Items.SPAWN_EGG);
		applyEntityIdToItemStack(spider, "Spider");
		GameRegistry.addShapelessRecipe(spider, SpawnOreBlocks.orespider, Items.WATER_BUCKET.setContainerItem(Items.BUCKET));
		
		ItemStack cavespider = new ItemStack(Items.SPAWN_EGG);
		applyEntityIdToItemStack(cavespider, "CaveSpider");
		GameRegistry.addShapelessRecipe(cavespider, SpawnOreBlocks.orecavespider, Items.WATER_BUCKET.setContainerItem(Items.BUCKET));
		
		ItemStack bat = new ItemStack(Items.SPAWN_EGG);
		applyEntityIdToItemStack(bat, "Bat");
		GameRegistry.addShapelessRecipe(bat, SpawnOreBlocks.orebat, Items.WATER_BUCKET.setContainerItem(Items.BUCKET));
		
		ItemStack blaze = new ItemStack(Items.SPAWN_EGG);
		applyEntityIdToItemStack(blaze, "Blaze");
		GameRegistry.addShapelessRecipe(blaze, SpawnOreBlocks.oreblaze, Items.WATER_BUCKET.setContainerItem(Items.BUCKET));
		
		ItemStack chicken = new ItemStack(Items.SPAWN_EGG);
		applyEntityIdToItemStack(chicken, "Chicken");
		GameRegistry.addShapelessRecipe(chicken, SpawnOreBlocks.orechicken, Items.WATER_BUCKET.setContainerItem(Items.BUCKET));
		
		ItemStack cow = new ItemStack(Items.SPAWN_EGG);
		applyEntityIdToItemStack(cow, "Cow");
		GameRegistry.addShapelessRecipe(cow, SpawnOreBlocks.orecow, Items.WATER_BUCKET.setContainerItem(Items.BUCKET));
		
		// 1.10.2 Update breaks spawn egg
		//ItemStack enderdragon = new ItemStack(Items.SPAWN_EGG);
		//applyEntityIdToItemStack(enderdragon, "EnderDragon");
		//GameRegistry.addShapelessRecipe(enderdragon, SpawnOreBlocks.oreenderdragon, Items.WATER_BUCKET.setContainerItem(Items.BUCKET));
		
		ItemStack enderman = new ItemStack(Items.SPAWN_EGG);
		applyEntityIdToItemStack(enderman, "Enderman");
		GameRegistry.addShapelessRecipe(enderman, SpawnOreBlocks.oreenderman, Items.WATER_BUCKET.setContainerItem(Items.BUCKET));
		
		ItemStack horse = new ItemStack(Items.SPAWN_EGG);
		applyEntityIdToItemStack(horse, "EntityHorse");
		GameRegistry.addShapelessRecipe(horse, SpawnOreBlocks.orehorse, Items.WATER_BUCKET.setContainerItem(Items.BUCKET));
		
		ItemStack irongolem = new ItemStack(Items.SPAWN_EGG);
		applyEntityIdToItemStack(irongolem, "VillagerGolem");
		GameRegistry.addShapelessRecipe(irongolem, SpawnOreBlocks.oreirongolem, Items.WATER_BUCKET.setContainerItem(Items.BUCKET));
		
		ItemStack magmacube = new ItemStack(Items.SPAWN_EGG);
		applyEntityIdToItemStack(magmacube, "LavaSlime");
		GameRegistry.addShapelessRecipe(magmacube, SpawnOreBlocks.oremagmacube, Items.WATER_BUCKET.setContainerItem(Items.BUCKET));
		
		ItemStack mooshroom = new ItemStack(Items.SPAWN_EGG);
		applyEntityIdToItemStack(mooshroom, "MushroomCow");
		GameRegistry.addShapelessRecipe(mooshroom, SpawnOreBlocks.oremooshroom, Items.WATER_BUCKET.setContainerItem(Items.BUCKET));
		
		ItemStack ocelot = new ItemStack(Items.SPAWN_EGG);
		applyEntityIdToItemStack(ocelot, "Ozelot");
		GameRegistry.addShapelessRecipe(ocelot, SpawnOreBlocks.oreocelot, Items.WATER_BUCKET.setContainerItem(Items.BUCKET));
		
		ItemStack pig = new ItemStack(Items.SPAWN_EGG);
		applyEntityIdToItemStack(pig, "Pig");
		GameRegistry.addShapelessRecipe(pig, SpawnOreBlocks.orepig, Items.WATER_BUCKET.setContainerItem(Items.BUCKET));
		
		ItemStack sheep = new ItemStack(Items.SPAWN_EGG);
		applyEntityIdToItemStack(sheep, "Sheep");
		GameRegistry.addShapelessRecipe(sheep, SpawnOreBlocks.oresheep, Items.WATER_BUCKET.setContainerItem(Items.BUCKET));
		
		ItemStack silverfish = new ItemStack(Items.SPAWN_EGG);
		applyEntityIdToItemStack(silverfish, "Silverfish");
		GameRegistry.addShapelessRecipe(silverfish, SpawnOreBlocks.oresilverfish, Items.WATER_BUCKET.setContainerItem(Items.BUCKET));
		
		ItemStack slime = new ItemStack(Items.SPAWN_EGG);
		applyEntityIdToItemStack(slime, "Slime");
		GameRegistry.addShapelessRecipe(slime, SpawnOreBlocks.oreslime, Items.WATER_BUCKET.setContainerItem(Items.BUCKET));

		ItemStack snowgolem = new ItemStack(Items.SPAWN_EGG);
		applyEntityIdToItemStack(snowgolem, "SnowMan");
		GameRegistry.addShapelessRecipe(snowgolem, SpawnOreBlocks.oresnowgolem, Items.WATER_BUCKET.setContainerItem(Items.BUCKET));
		
		ItemStack squid = new ItemStack(Items.SPAWN_EGG);
		applyEntityIdToItemStack(squid, "Squid");
		GameRegistry.addShapelessRecipe(squid, SpawnOreBlocks.oresquid, Items.WATER_BUCKET.setContainerItem(Items.BUCKET));
		
		ItemStack villager = new ItemStack(Items.SPAWN_EGG);
		applyEntityIdToItemStack(villager, "Villager");
		GameRegistry.addShapelessRecipe(villager, SpawnOreBlocks.orevillager, Items.WATER_BUCKET.setContainerItem(Items.BUCKET));
		
		ItemStack witch = new ItemStack(Items.SPAWN_EGG);
		applyEntityIdToItemStack(witch, "Witch");
		GameRegistry.addShapelessRecipe(witch, SpawnOreBlocks.orewitch, Items.WATER_BUCKET.setContainerItem(Items.BUCKET));
		
		ItemStack witherboss = new ItemStack(Items.SPAWN_EGG);
		applyEntityIdToItemStack(witherboss, "WitherBoss");
		GameRegistry.addShapelessRecipe(witherboss, SpawnOreBlocks.orewitherboss, Items.WATER_BUCKET.setContainerItem(Items.BUCKET));
		
		// No Spawn Egg
		//ItemStack witherskeleton = new ItemStack(Items.SPAWN_EGG);
		//applyEntityIdToItemStack(witherskeleton, "WitherSkeleton");
		//GameRegistry.addShapelessRecipe(witherskeleton, SpawnOreBlocks.orewitherskeleton, Items.WATER_BUCKET.setContainerItem(Items.BUCKET));
		
		ItemStack wolf = new ItemStack(Items.SPAWN_EGG);
		applyEntityIdToItemStack(wolf, "Wolf");
		GameRegistry.addShapelessRecipe(wolf, SpawnOreBlocks.orewolf, Items.WATER_BUCKET.setContainerItem(Items.BUCKET));
		
		ItemStack zombie = new ItemStack(Items.SPAWN_EGG);
		applyEntityIdToItemStack(zombie, "Zombie");
		GameRegistry.addShapelessRecipe(zombie, SpawnOreBlocks.orezombie, Items.WATER_BUCKET.setContainerItem(Items.BUCKET));
		
		ItemStack zombiepigman = new ItemStack(Items.SPAWN_EGG);
		applyEntityIdToItemStack(zombiepigman, "PigZombie");
		GameRegistry.addShapelessRecipe(zombiepigman, SpawnOreBlocks.orezombiepigman, Items.WATER_BUCKET.setContainerItem(Items.BUCKET));
		
		ItemStack guardian = new ItemStack(Items.SPAWN_EGG);
		applyEntityIdToItemStack(guardian, "Guardian");
		GameRegistry.addShapelessRecipe(guardian, SpawnOreBlocks.oreguardian, Items.WATER_BUCKET.setContainerItem(Items.BUCKET));
		
		ItemStack stinky = new ItemStack(Items.SPAWN_EGG);
		applyEntityIdToItemStack(stinky, "spawnore.stinky");
		GameRegistry.addShapelessRecipe(stinky, SpawnOreBlocks.orestinky, Items.WATER_BUCKET.setContainerItem(Items.BUCKET));
		
		ItemStack ghast = new ItemStack(Items.SPAWN_EGG);
		applyEntityIdToItemStack(ghast, "Ghast");
		GameRegistry.addShapelessRecipe(ghast, SpawnOreBlocks.oreghast, Items.WATER_BUCKET.setContainerItem(Items.BUCKET));
		
		ItemStack shulker = new ItemStack(Items.SPAWN_EGG);
		applyEntityIdToItemStack(shulker, "Shulker");
		GameRegistry.addShapelessRecipe(shulker, SpawnOreBlocks.oreshulker, Items.WATER_BUCKET.setContainerItem(Items.BUCKET));
		
		ItemStack endermite = new ItemStack(Items.SPAWN_EGG);
		applyEntityIdToItemStack(endermite, "Endermite");
		GameRegistry.addShapelessRecipe(endermite, SpawnOreBlocks.oreendermite, Items.WATER_BUCKET.setContainerItem(Items.BUCKET));
		
		ItemStack rabbit = new ItemStack(Items.SPAWN_EGG);
		applyEntityIdToItemStack(rabbit, "Rabbit");
		GameRegistry.addShapelessRecipe(rabbit, SpawnOreBlocks.orerabbit, Items.WATER_BUCKET.setContainerItem(Items.BUCKET));
		
		ItemStack polarbear = new ItemStack(Items.SPAWN_EGG);
		applyEntityIdToItemStack(polarbear, "PolarBear");
		GameRegistry.addShapelessRecipe(polarbear, SpawnOreBlocks.orepolarbear, Items.WATER_BUCKET.setContainerItem(Items.BUCKET));
		
		ItemStack applecow = new ItemStack(Items.SPAWN_EGG);
		applyEntityIdToItemStack(applecow, "spawnore.applecow");
		GameRegistry.addShapelessRecipe(applecow, SpawnOreBlocks.oreapplecow, Items.WATER_BUCKET.setContainerItem(Items.BUCKET));
		
		ItemStack goldencow = new ItemStack(Items.SPAWN_EGG);
		applyEntityIdToItemStack(goldencow, "spawnore.goldencow");
		GameRegistry.addShapelessRecipe(goldencow, SpawnOreBlocks.oregoldencow, Items.WATER_BUCKET.setContainerItem(Items.BUCKET));
		
		ItemStack enchantedcow = new ItemStack(Items.SPAWN_EGG);
		applyEntityIdToItemStack(enchantedcow, "spawnore.enchantedcow");
		GameRegistry.addShapelessRecipe(enchantedcow, SpawnOreBlocks.oreenchantedcow, Items.WATER_BUCKET.setContainerItem(Items.BUCKET));
		
		ItemStack waterdragon = new ItemStack(Items.SPAWN_EGG);
		applyEntityIdToItemStack(waterdragon, "spawnore.waterdragon");
		GameRegistry.addShapelessRecipe(waterdragon, SpawnOreBlocks.orewaterdragon, Items.WATER_BUCKET.setContainerItem(Items.BUCKET));

	}
	
	public static void applyEntityIdToItemStack(ItemStack stack, String entityId) {
		NBTTagCompound nbttagcompound = new net.minecraft.nbt.NBTTagCompound();
		NBTTagCompound nbttagcompound1 = new NBTTagCompound();
		nbttagcompound1.setString("id", entityId);
		nbttagcompound.setTag("EntityTag", nbttagcompound1);
		stack.setTagCompound(nbttagcompound); //crashing line
	}

}
