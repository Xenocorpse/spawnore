package xeno.spawnore.render;

import java.util.Random;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.client.renderer.entity.Render;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import xeno.spawnore.SpawnOre;
import xeno.spawnore.entity.EntityStinky;
import xeno.spawnore.model.ModelStinky;
import net.minecraftforge.fml.client.registry.IRenderFactory;

@SideOnly(Side.CLIENT)
public class RenderStinky extends RenderLiving<EntityStinky> {
	
	public static final Factory FACTORY = new Factory();

	public RenderStinky(RenderManager rendermanagerIn) {
		super(rendermanagerIn, new ModelStinky(), 0.5f);
	}
	
	@Override
	  public void doRender(EntityStinky entity, double x, double y, double z, float entityYaw, float partialTicks) {
	    super.doRender(entity, x, y, z, entityYaw, partialTicks);    
	  }

	@Override
	protected ResourceLocation getEntityTexture(EntityStinky entity) {
		return EntityStinky.STINKY_TEXTURES;
	}
	
	public static class Factory implements IRenderFactory<EntityStinky> {

	    @Override
	    public Render<? super EntityStinky> createRenderFor(RenderManager manager) {
	      return new RenderStinky(manager);
	    }
	  }

}
