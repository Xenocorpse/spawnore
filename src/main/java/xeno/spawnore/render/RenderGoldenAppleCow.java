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
import xeno.spawnore.entity.EntityGoldenAppleCow;

@SideOnly(Side.CLIENT)
public class RenderGoldenAppleCow extends RenderCow {
	
	public static final Factory FACTORY = new Factory();
	
	private static final ResourceLocation gacowtexture = new ResourceLocation("spawnore:textures/entity/goldencow/goldencow.png");

	public RenderGoldenAppleCow(RenderManager renderManagerIn) {
		super(renderManagerIn, new ModelCow(), 0.5f);
	}
	
	/**
     * Returns the location of an entity's texture. Doesn't seem to be called unless you call Render.bindEntityTexture.
     */
	
	@Override
	protected ResourceLocation getEntityTexture(EntityCow entity) {
		return gacowtexture;
	}
	
	public static class Factory implements IRenderFactory<EntityGoldenAppleCow> {

	    @Override
	    public Render<? super EntityGoldenAppleCow> createRenderFor(RenderManager manager) {
	      return new RenderGoldenAppleCow(manager);
	    }
	  }


}
