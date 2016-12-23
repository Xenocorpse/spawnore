package xeno.spawnore.render;

import net.minecraft.client.model.ModelCow;
import net.minecraft.client.renderer.entity.Render;
import net.minecraft.client.renderer.entity.RenderCow;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.entity.passive.EntityCow;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.client.registry.IRenderFactory;
import xeno.spawnore.entity.EntityEnchantedGoldenAppleCow;

public class RenderEnchantedGoldenAppleCow extends RenderCow {
	
public static final Factory FACTORY = new Factory();
	
	private static final ResourceLocation TEXTURE = new ResourceLocation("spawnore:textures/entity/enchantedcow/enchantedcow.png");

	public RenderEnchantedGoldenAppleCow(RenderManager renderManagerIn) {
		super(renderManagerIn, new ModelCow(), 0.5f);
	}
	
	/**
     * Returns the location of an entity's texture. Doesn't seem to be called unless you call Render.bindEntityTexture.
     */
	
	@Override
	protected ResourceLocation getEntityTexture(EntityCow entity) {
		return TEXTURE;
	}
	
	public static class Factory implements IRenderFactory<EntityEnchantedGoldenAppleCow> {

	    @Override
	    public Render<? super EntityEnchantedGoldenAppleCow> createRenderFor(RenderManager manager) {
	      return new RenderEnchantedGoldenAppleCow(manager);
	    }
	  }

}
