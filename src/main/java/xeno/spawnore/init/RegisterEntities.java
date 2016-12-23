package xeno.spawnore.init;

import net.minecraft.entity.Entity;
import net.minecraft.entity.EnumCreatureType;
import net.minecraft.entity.boss.EntityDragon;
import net.minecraft.entity.boss.EntityWither;
import net.minecraft.entity.monster.EntityIronGolem;
import net.minecraft.entity.monster.EntitySnowman;
import net.minecraft.init.Biomes;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.storage.loot.LootTable;
import net.minecraft.world.storage.loot.LootTableList;
import net.minecraftforge.common.BiomeDictionary;
import net.minecraftforge.common.BiomeDictionary.Type;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.client.registry.RenderingRegistry;
import net.minecraftforge.fml.common.registry.EntityRegistry;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import xeno.spawnore.SpawnOre;
import xeno.spawnore.entity.DropHandler;
import xeno.spawnore.entity.EntityAppleCow;
import xeno.spawnore.entity.EntityEnchantedGoldenAppleCow;
import xeno.spawnore.entity.EntityGoldenAppleCow;
import xeno.spawnore.entity.EntityRayBullet;
import xeno.spawnore.entity.EntityStinky;
import xeno.spawnore.entity.EntityWaterDragon;
import xeno.spawnore.render.RenderAppleCow;
import xeno.spawnore.render.RenderEnchantedGoldenAppleCow;
import xeno.spawnore.render.RenderGoldenAppleCow;
import xeno.spawnore.render.RenderRayBullet;
import xeno.spawnore.render.RenderStinky;
import xeno.spawnore.render.RenderWaterDragon;

public class RegisterEntities {
	
	public static int mobcount = 0;
	
	static Biome[] nether = BiomeDictionary.getBiomesForType(Type.NETHER);
	static Biome[] plains = BiomeDictionary.getBiomesForType(Type.PLAINS);
	
	public static void init() {
		
		// Entities
		register(EntityGoldenAppleCow.class, "goldencow");
		register(EntityAppleCow.class, "applecow");
		register(EntityStinky.class, "stinky");
		register(EntityRayBullet.class, "raybullet");
		register(EntityWaterDragon.class, "waterdragon");
		register(EntityEnchantedGoldenAppleCow.class, "enchantedcow");
		
		// Spawn Eggs
		registerSpawnEgg(EntityGoldenAppleCow.class, 15720061, 16167425);
		registerSpawnEgg(EntityAppleCow.class, 10489616, 16167425);
		registerSpawnEgg(EntityEnchantedGoldenAppleCow.class, 13107400, 16167425);
		registerSpawnEgg(EntityStinky.class, 12623485, 12623485);
		registerSpawnEgg(EntitySnowman.class, 15921906, 16167425);
		registerSpawnEgg(EntityIronGolem.class, 15921906, 52);
		//registerSpawnEgg(EntityDragon.class, 52, 53);
		registerSpawnEgg(EntityWither.class, 0, 50);
		registerSpawnEgg(EntityWaterDragon.class, 255, 16711680);
		
		// Register Extra Drops
		//MinecraftForge.EVENT_BUS.register(new DropHandler());
		
		// Add natural spawns
		EntityRegistry.addSpawn(EntityStinky.class, 100, 1, 3, EnumCreatureType.CREATURE, nether);
		EntityRegistry.addSpawn(EntityAppleCow.class, 100, 2, 5, EnumCreatureType.CREATURE, plains);
		EntityRegistry.addSpawn(EntityGoldenAppleCow.class, 85, 2, 5, EnumCreatureType.CREATURE, plains);
		EntityRegistry.addSpawn(EntityEnchantedGoldenAppleCow.class, 50, 2, 5, EnumCreatureType.CREATURE, plains);
		
		// Register Loot Tables
		LootTableList.register(EntityAppleCow.APPLECOW_DROPS);
		LootTableList.register(EntityGoldenAppleCow.DROPS);
		LootTableList.register(EntityEnchantedGoldenAppleCow.DROPS);
		LootTableList.register(EntityWaterDragon.LOOT);
		
	}
	
	@SideOnly(Side.CLIENT)
    public static void initModels() {
		RenderingRegistry.registerEntityRenderingHandler(EntityGoldenAppleCow.class, RenderGoldenAppleCow.FACTORY);
		RenderingRegistry.registerEntityRenderingHandler(EntityEnchantedGoldenAppleCow.class, RenderEnchantedGoldenAppleCow.FACTORY);
		RenderingRegistry.registerEntityRenderingHandler(EntityAppleCow.class, RenderAppleCow.FACTORY);
        RenderingRegistry.registerEntityRenderingHandler(EntityStinky.class, RenderStinky.FACTORY);
        RenderingRegistry.registerEntityRenderingHandler(EntityRayBullet.class, RenderRayBullet.FACTORY);
        RenderingRegistry.registerEntityRenderingHandler(EntityWaterDragon.class, RenderWaterDragon.FACTORY);
    }
	
	private static void register(Class entityClass, String name)
	{		
		EntityRegistry.registerModEntity(entityClass, name, ++mobcount, SpawnOre.instance, 48, 3, true);
	}
	
	private static void registerSpawnEgg(Class entityClass, int primary, int secondary) {
		EntityRegistry.registerEgg(entityClass, primary, secondary);
	}

}
