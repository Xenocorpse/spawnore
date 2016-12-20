package xeno.spawnore.item;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.enchantment.EnchantmentHelper;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.projectile.EntityArrow;
import net.minecraft.init.Enchantments;
import net.minecraft.init.Items;
import net.minecraft.init.SoundEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemArrow;
import net.minecraft.item.ItemStack;
import net.minecraft.stats.StatList;
import net.minecraft.util.ActionResult;
import net.minecraft.util.EnumActionResult;
import net.minecraft.util.EnumHand;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.SoundCategory;
import net.minecraft.util.SoundEvent;
import net.minecraft.world.World;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import xeno.spawnore.SpawnOre;
import xeno.spawnore.entity.EntityRayBullet;

public class ItemRayGun extends Item implements ItemModelProvider {
	
	public static final ResourceLocation shoot = new ResourceLocation(SpawnOre.MODID + ":item.raygun.shoot");
	
	private String name;
	
	public ItemRayGun(String name, CreativeTabs tab) {
		this.name = name;
		setUnlocalizedName(name);
		setRegistryName(name);
		this.maxStackSize = 1;
        this.setMaxDamage(100);
        this.setCreativeTab(tab);
	}
	
    public int getMaxItemUseDuration(ItemStack stack)
    {
        return 72000;
    }
	
    @SubscribeEvent
	public void onItemRightClick(ItemStack stack, World worldIn, EntityLivingBase entityLiving, int timeLeft)
    {
		if (entityLiving instanceof EntityPlayer)
        {
            EntityPlayer entityplayer = (EntityPlayer)entityLiving;
            boolean flag = entityplayer.capabilities.isCreativeMode || EnchantmentHelper.getEnchantmentLevel(Enchantments.INFINITY, stack) > 0;

            int i = this.getMaxItemUseDuration(stack) - timeLeft;
            if (i < 0) return;

                float f = 1.0f;

                if ((double)f >= 0.1D)
                {

                    if (!worldIn.isRemote)
                    {
                        EntityRayBullet entityraybullet = new EntityRayBullet(worldIn, entityLiving, f, f, f);
                        entityraybullet.setAim(entityplayer, entityplayer.rotationPitch, entityplayer.rotationYaw, 0.0F, f * 3.0F, 1.0F);

                    }

                    worldIn.playSound((EntityPlayer)null, entityplayer.posX, entityplayer.posY, entityplayer.posZ, new SoundEvent(shoot), SoundCategory.NEUTRAL, 1.0F, 1.0F / (itemRand.nextFloat() * 0.4F + 1.2F) + f * 0.5F);
                }
        }
    }

	@Override
	public void registerItemModel(Item item) {
		SpawnOre.proxy.registerItemRenderer(this, 0, name);
	}

}
