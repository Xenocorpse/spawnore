package xeno.spawnore.model;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.entity.Entity;
import net.minecraft.util.math.MathHelper;

/**
 * Stinky - TheyCallMeDanger
 * Created using Tabula 5.1.0
 */
public class ModelStinky extends ModelBase {
    public ModelRenderer body;
    public ModelRenderer rightwing;
    public ModelRenderer leftwing;
    public ModelRenderer frontright;
    public ModelRenderer frontleft;
    public ModelRenderer backleft;
    public ModelRenderer backright;
    public ModelRenderer neckbottom;
    public ModelRenderer chest;
    public ModelRenderer head;
    public ModelRenderer snout;
    public ModelRenderer hornbig1;
    public ModelRenderer hornbig2;
    public ModelRenderer necktop;
    public ModelRenderer hornsmall1;
    public ModelRenderer hornsmall2;
    public ModelRenderer tail1;
    public ModelRenderer tail2;
    public ModelRenderer tail3;

    public ModelStinky() {
    	this.textureWidth = 128;
        this.textureHeight = 64;
        this.frontleft = new ModelRenderer(this, 19, 53);
        this.frontleft.setRotationPoint(2.0F, 16.0F, -3.7F);
        this.frontleft.addBox(-1.5F, 0.0F, -1.5F, 3, 8, 3, 0.0F);
        this.neckbottom = new ModelRenderer(this, 0, 31);
        this.neckbottom.setRotationPoint(0.0F, 12.09999999999998F, -8.5F);
        this.neckbottom.addBox(-2.0F, 1.5F, -2.0F, 4, 5, 5, 0.0F);
        this.setRotateAngle(neckbottom, 0.6981317007977318F, 0.0F, 0.0F);
        this.leftwing = new ModelRenderer(this, 59, 11);
        this.leftwing.setRotationPoint(4.0F, 11.700000000000003F, 0.0F);
        this.leftwing.addBox(0.0F, 0.0F, -5.0F, 18, 0, 10, 0.0F);
        this.setRotateAngle(leftwing, 0.0F, 0.0F, -0.4363323129985824F);
        this.frontright = new ModelRenderer(this, 19, 53);
        this.frontright.setRotationPoint(-2.0F, 16.0F, -3.7F);
        this.frontright.addBox(-1.5F, 0.0F, -1.5F, 3, 8, 3, 0.0F);
        this.rightwing = new ModelRenderer(this, 59, 0);
        this.rightwing.setRotationPoint(-4.0F, 11.700000000000003F, 0.0F);
        this.rightwing.addBox(-18.0F, 0.0F, -5.0F, 18, 0, 10, 0.0F);
        this.setRotateAngle(rightwing, 0.0F, 0.0F, 0.4363323129985824F);
        this.backright = new ModelRenderer(this, 19, 53);
        this.backright.setRotationPoint(-2.0F, 16.0F, 3.5F);
        this.backright.addBox(-1.5F, 0.0F, -1.5F, 3, 8, 3, 0.0F);
        this.hornbig1 = new ModelRenderer(this, 19, 47);
        this.hornbig1.setRotationPoint(0.8F, -5.2F, 0.0F);
        this.hornbig1.addBox(0.0F, 0.0F, 0.0F, 2, 2, 3, 0.0F);
        this.backleft = new ModelRenderer(this, 19, 53);
        this.backleft.setRotationPoint(2.0F, 16.0F, 3.5F);
        this.backleft.addBox(-1.5F, 0.0F, -1.5F, 3, 8, 3, 0.0F);
        this.necktop = new ModelRenderer(this, 0, 43);
        this.necktop.setRotationPoint(0.0F, 0.0F, 0.5F);
        this.necktop.addBox(-2.0F, 0.0F, -2.0F, 4, 6, 4, 0.0F);
        this.snout = new ModelRenderer(this, 32, 57);
        this.snout.setRotationPoint(1.0F, 2.0F, -4.0F);
        this.snout.addBox(-2.5F, -5.0F, -2.5F, 3, 3, 4, 0.0F);
        this.hornsmall1 = new ModelRenderer(this, 19, 42);
        this.hornsmall1.setRotationPoint(0.5F, 0.5F, 2.0F);
        this.hornsmall1.addBox(0.0F, 0.0F, 0.0F, 1, 1, 3, 0.0F);
        this.tail1 = new ModelRenderer(this, 19, 31);
        this.tail1.setRotationPoint(0.0F, 15.699999999999996F, 6.0F);
        this.tail1.addBox(-2.5F, -2.5F, -2.5F, 5, 5, 5, 0.0F);
        this.setRotateAngle(tail1, -0.2617993877991494F, 0.0F, 0.0F);
        this.head = new ModelRenderer(this, 0, 0);
        this.head.setRotationPoint(0.0F, 8.699999999999994F, -7.5F);
        this.head.addBox(-2.5F, -5.0F, -2.5F, 5, 5, 5, 0.0F);
        this.hornbig2 = new ModelRenderer(this, 19, 47);
        this.hornbig2.setRotationPoint(-2.8F, -5.2F, 0.0F);
        this.hornbig2.addBox(0.0F, 0.0F, 0.0F, 2, 2, 3, 0.0F);
        this.setRotateAngle(hornbig2, 0.0F, 0.00942477796076938F, 0.0F);
        this.chest = new ModelRenderer(this, 0, 55);
        this.chest.setRotationPoint(0.0F, 14.699999999999994F, -4.0F);
        this.chest.addBox(-3.0F, -2.5F, -1.5F, 6, 6, 3, 0.0F);
        this.tail2 = new ModelRenderer(this, 32, 46);
        this.tail2.setRotationPoint(0.0F, 0.0F, 2.0F);
        this.tail2.addBox(-2.0F, -2.0F, 0.0F, 4, 4, 4, 0.0F);
        this.setRotateAngle(tail2, 0.08726646259971647F, 0.0F, 0.0F);
        this.hornsmall2 = new ModelRenderer(this, 19, 42);
        this.hornsmall2.setRotationPoint(0.5F, 0.5F, 2.0F);
        this.hornsmall2.addBox(0.0F, 0.0F, 0.0F, 1, 1, 3, 0.0F);
        this.body = new ModelRenderer(this, 0, 12);
        this.body.setRotationPoint(0.0F, 15.599999999999982F, 0.0F);
        this.body.addBox(-4.0F, -4.0F, -5.0F, 8, 8, 10, 0.0F);
        this.tail3 = new ModelRenderer(this, 37, 13);
        this.tail3.setRotationPoint(0.0F, 0.0F, 3.8F);
        this.tail3.addBox(-1.5F, -1.5F, 0.0F, 3, 3, 5, 0.0F);
        this.setRotateAngle(tail3, 0.08726646259971647F, 0.0F, 0.0F);
        this.head.addChild(this.hornbig1);
        this.head.addChild(this.necktop);
        this.head.addChild(this.snout);
        this.hornbig1.addChild(this.hornsmall1);
        this.head.addChild(this.hornbig2);
        this.tail1.addChild(this.tail2);
        this.hornbig2.addChild(this.hornsmall2);
        this.tail2.addChild(this.tail3);
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) { 
    	setRotationAngles(f, f1, f2, f3, f4, f5, entity);
    	//GlStateManager.pushMatrix();
    	this.rightwing.render(f5);
        this.frontright.render(f5);
        this.head.render(f5);
        this.body.render(f5);
        this.frontleft.render(f5);
        this.backright.render(f5);
        this.tail1.render(f5);
        this.leftwing.render(f5);
        this.neckbottom.render(f5);
        this.backleft.render(f5);
        this.chest.render(f5);
    }

    /**
     * This is a helper function from Tabula to set the rotation of model parts
     */
    public void setRotateAngle(ModelRenderer modelRenderer, float x, float y, float z) {
        modelRenderer.rotateAngleX = x;
        modelRenderer.rotateAngleY = y;
        modelRenderer.rotateAngleZ = z;
    }
    
    @Override
    public void setRotationAngles(float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch, float scaleFactor, Entity parEntity)
    {
    	super.setRotationAngles(limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch, scaleFactor, parEntity);
        this.head.rotateAngleX = headPitch / (180F / (float)Math.PI);
        this.head.rotateAngleY = netHeadYaw / (180F / (float)Math.PI);
        this.frontleft.rotateAngleX = MathHelper.cos(limbSwing * 3.5F) * 1.4F * limbSwingAmount;
        this.frontright.rotateAngleX = MathHelper.cos(limbSwing * 3.5F + (float)Math.PI) * 1.4F * limbSwingAmount;
        this.backright.rotateAngleX = MathHelper.cos(limbSwing * 3.5F) * 1.4F * limbSwingAmount;
        this.backleft.rotateAngleX = MathHelper.cos(limbSwing * 3.5F + (float)Math.PI) * 1.4F * limbSwingAmount;
        this.leftwing.rotateAngleZ = 0.1F + MathHelper.cos(limbSwing * 3.5F + (float)Math.PI) * 1.4F * limbSwingAmount;
        this.rightwing.rotateAngleZ = -0.1F + MathHelper.cos(limbSwing * 3.5F) * 1.4F * limbSwingAmount;
        this.tail1.rotateAngleY = MathHelper.cos(limbSwing * 3.5F) * 1.2F * limbSwingAmount;
        this.tail2.rotateAngleY = MathHelper.cos(limbSwing * 3.5F) * 1.0F * limbSwingAmount;
        this.tail3.rotateAngleY = MathHelper.cos(limbSwing * 3.5F) * 0.8F * limbSwingAmount;
    	
    }
}
