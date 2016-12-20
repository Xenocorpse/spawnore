package xeno.spawnore.render;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.renderer.entity.Render;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.client.registry.IRenderFactory;
import xeno.spawnore.entity.EntityStinky;
import xeno.spawnore.entity.EntityWaterDragon;
import xeno.spawnore.model.ModelStinky;
import xeno.spawnore.model.ModelWaterDragon;
import xeno.spawnore.render.RenderStinky.Factory;

public class RenderWaterDragon extends RenderLiving<EntityWaterDragon>{
	
	public static final Factory FACTORY = new Factory();
	
	public static final ResourceLocation WD_TEXTURES = new ResourceLocation("spawnore:textures/entity/waterdragon/waterdragon.png");

	public RenderWaterDragon(RenderManager rendermanagerIn) {
		super(rendermanagerIn, new ModelWaterDragon(), 0.5f);
	}

	@Override
	protected ResourceLocation getEntityTexture(EntityWaterDragon entity) {
		return WD_TEXTURES;
	}
	
	public static class Factory implements IRenderFactory<EntityWaterDragon> {

	    @Override
	    public Render<? super EntityWaterDragon> createRenderFor(RenderManager manager) {
	      return new RenderWaterDragon(manager);
	    }
	  }

}
