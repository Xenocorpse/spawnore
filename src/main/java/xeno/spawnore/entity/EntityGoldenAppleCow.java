package xeno.spawnore.entity;

import javax.annotation.Nullable;

import net.minecraft.entity.EntityAgeable;
import net.minecraft.entity.EntityLiving;
import net.minecraft.entity.item.EntityItem;
import net.minecraft.entity.passive.EntityCow;
import net.minecraft.entity.passive.IAnimals;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.network.play.server.SPacketCombatEvent.Event;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.datafix.DataFixer;
import net.minecraft.world.World;
import net.minecraft.world.storage.loot.LootEntryItem;
import net.minecraft.world.storage.loot.LootPool;
import net.minecraft.world.storage.loot.LootTable;
import net.minecraft.world.storage.loot.LootTableList;
import net.minecraft.world.storage.loot.RandomValueRange;
import net.minecraft.world.storage.loot.conditions.LootCondition;
import net.minecraft.world.storage.loot.functions.LootFunction;
import net.minecraft.world.storage.loot.functions.SetCount;
import net.minecraftforge.event.LootTableLoadEvent;
import net.minecraftforge.event.entity.living.LivingDropsEvent;
import net.minecraftforge.fml.common.eventhandler.EventPriority;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import xeno.spawnore.SpawnOre;

public class EntityGoldenAppleCow extends EntityCow{
	
	public static final ResourceLocation DROPS = new ResourceLocation(SpawnOre.MODID+":entities/goldencow");

	public EntityGoldenAppleCow(World worldIn) {
		super(worldIn);
		this.setSize(0.9F, 1.4F);
	}
	
	public static void registerFixesGoldenCow(DataFixer fixer)
    {
        EntityLiving.registerFixesMob(fixer, "GoldenCow");
    }
	
	public EntityGoldenAppleCow createChild(EntityAgeable ageable)
    {
        return new EntityGoldenAppleCow(this.worldObj);
    }
	
	public float getEyeHeight()
    {
        return this.isChild() ? this.height : 1.3F;
    }
	
    protected ResourceLocation getLootTable() {
        return DROPS;
    }

}
