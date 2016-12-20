package xeno.spawnore;

import net.minecraft.init.SoundEvents;
import net.minecraft.item.Item;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.common.util.EnumHelper;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import xeno.spawnore.client.SpawnOreTabs;
import xeno.spawnore.init.RegisterEntities;
import xeno.spawnore.init.RegisterLootTables;
import xeno.spawnore.init.SpawnOreBlocks;
import xeno.spawnore.init.SpawnOreItems;
import xeno.spawnore.item.ItemArmor;
import xeno.spawnore.proxy.CommonProxy;
import xeno.spawnore.recipe.DriedRecipe;
import xeno.spawnore.recipe.Shaped;
import xeno.spawnore.recipe.Shapeless;
import xeno.spawnore.recipe.Smelting;

@Mod(modid = SpawnOre.MODID, name = SpawnOre.NAME, version = SpawnOre.VERSION, acceptedMinecraftVersions = "[1.10.2, 1.11]")
public class SpawnOre {
	
	@SidedProxy(serverSide = "xeno.spawnore.proxy.CommonProxy", clientSide = "xeno.spawnore.proxy.ClientProxy")
	public static CommonProxy proxy;
	
	public static final String MODID = "spawnore";
    public static final String VERSION = "0.1";
    public static final String NAME = "SpawnOre (OreSpawn Reloaded)";
    
    @Mod.Instance(MODID)
	public static SpawnOre instance;
    
    @Mod.EventHandler
    public void preInit(FMLPreInitializationEvent event) {
    	System.out.println(NAME + " version " + VERSION + " is loading!");
    	SpawnOreBlocks.init();
    	SpawnOreItems.init();
    	RegisterEntities.init();
    	RegisterEntities.initModels();
    }
    
    @Mod.EventHandler
    public void init(FMLInitializationEvent event) {
    	Shaped.init();
    	Shapeless.init();
    	Smelting.init();
    	DriedRecipe.init();
    }
    
    @Mod.EventHandler
    public void postInit(FMLPostInitializationEvent event) {
    	RegisterLootTables.init();
    	System.out.println(NAME + " version " + VERSION + " is loaded!");
    }
    
    public static final SpawnOreTabs tabspawnore = new SpawnOreTabs();
    
    public static final Item.ToolMaterial ultimateToolMaterial = EnumHelper.addToolMaterial("ULTIMATE", 3, 3000, 12, 40, 20);
    public static final Item.ToolMaterial amethystToolMaterial = EnumHelper.addToolMaterial("AMETHYST", 3, 2000, 8, 11, 15);
    public static final Item.ToolMaterial rubyToolMaterial = EnumHelper.addToolMaterial("RUBY", 3, 1500, 10, 16, 17);
    public static final Item.ToolMaterial emeraldToolMaterial = EnumHelper.addToolMaterial("EMERALD", 3, 1300, 8, 8, 15);
    public static final Item.ToolMaterial nightmareToolMaterial = EnumHelper.addToolMaterial("NIGHTMARE", 3, 1200, 8, 30, 15);
    public static final Item.ToolMaterial berthaToolMaterial = EnumHelper.addToolMaterial("BERTHA", 3, 9000, 15, 500, 20);
    
    public static final ItemArmor.ArmorMaterial ultimateArmorMaterial = EnumHelper.addArmorMaterial("ULTIMATE", MODID + ":ultimate", 200, new int[]{6, 10, 12, 6}, 40, SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND, 0.0F);
    public static final ItemArmor.ArmorMaterial amethystArmorMaterial = EnumHelper.addArmorMaterial("AMETHYST", MODID + ":amethyst", 100, new int[]{3, 7, 8, 4}, 15, SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND, 0.0F);
    public static final ItemArmor.ArmorMaterial rubyArmorMaterial = EnumHelper.addArmorMaterial("RUBY", MODID + ":ruby", 90, new int[]{4, 8, 9, 4}, 17, SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND, 0.0F);
    public static final ItemArmor.ArmorMaterial emeraldArmorMaterial = EnumHelper.addArmorMaterial("EMERALD", MODID + ":emerald", 60, new int[]{3, 6, 8, 3}, 15, SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND, 0.0F);
    public static final ItemArmor.ArmorMaterial lapisArmorMaterial = EnumHelper.addArmorMaterial("LAPIS", MODID + ":lapis", 60, new int[]{2, 5, 7, 2}, 15, SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND, 0.0F);
    
}
