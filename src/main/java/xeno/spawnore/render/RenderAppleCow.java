package xeno.spawnore.render;

import net.minecraft.client.model.ModelCow;
import net.minecraft.client.renderer.entity.Render;
import net.minecraft.client.renderer.entity.RenderCow;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.entity.passive.EntityCow;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.client.registry.IRenderFactory;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import xeno.spawnore.entity.EntityAppleCow;

@SideOnly(Side.CLIENT)
public class RenderAppleCow extends RenderCow {
	
public static final Factory FACTORY = new Factory();
	
	private static final ResourceLocation applecowtexture = new ResourceLocation("spawnore:textures/entity/applecow/applecow.png");

	public RenderAppleCow(RenderManager renderManagerIn) {
		super(renderManagerIn, new ModelCow(), 0.5f);
	}
	
	/**
     * Returns the location of an entity's texture. Doesn't seem to be called unless you call Render.bindEntityTexture.
     */
	
	@Override
	protected ResourceLocation getEntityTexture(EntityCow entity) {
		return applecowtexture;
	}
	
	public static class Factory implements IRenderFactory<EntityAppleCow> {

	    @Override
	    public Render<? super EntityAppleCow> createRenderFor(RenderManager manager) {
	      return new RenderAppleCow(manager);
	    }
	  }

}
