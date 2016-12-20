package xeno.spawnore.model;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.util.math.MathHelper;

/**
 * WaterDragon - Xenocorpse
 * Created using Tabula 5.1.0
 */
public class ModelWaterDragon extends ModelBase {
    public ModelRenderer body_main;
    public ModelRenderer body2;
    public ModelRenderer neck1;
    public ModelRenderer head_main;
    public ModelRenderer body_fin;
    public ModelRenderer footfleft;
    public ModelRenderer footfright;
    public ModelRenderer footbleft;
    public ModelRenderer footbright;
    public ModelRenderer tail1;
    public ModelRenderer tail2;
    public ModelRenderer tail3;
    public ModelRenderer tailfin1;
    public ModelRenderer tailfin2;
    public ModelRenderer tailfin3;
    public ModelRenderer neck2;
    public ModelRenderer neck3;
    public ModelRenderer neck4;
    public ModelRenderer neck_fin;
    public ModelRenderer mouth1;
    public ModelRenderer head_top;
    public ModelRenderer head_side1;
    public ModelRenderer head_side2;
    public ModelRenderer mouth2;

    public ModelWaterDragon() {
        this.textureWidth = 128;
        this.textureHeight = 128;
        this.tail2 = new ModelRenderer(this, 0, 89);
        this.tail2.setRotationPoint(0.0F, 0.0F, 7.0F);
        this.tail2.addBox(-1.5F, -1.5F, 0.0F, 3, 3, 5, 0.0F);
        this.body2 = new ModelRenderer(this, 0, 52);
        this.body2.setRotationPoint(0.0F, -4.5F, 4.5F);
        this.body2.addBox(-3.5F, -3.5F, 0.0F, 7, 7, 9, 0.0F);
        this.footfright = new ModelRenderer(this, 23, 18);
        this.footfright.setRotationPoint(-3.5F, -3.0F, -1.5F);
        this.footfright.addBox(-9.0F, -1.0F, -1.5F, 9, 2, 3, 0.0F);
        this.setRotateAngle(footfright, 0.0F, -0.5235987755982988F, -0.2617993877991494F);
        this.mouth2 = new ModelRenderer(this, 76, 8);
        this.mouth2.setRotationPoint(0.0F, 5.0F, 2.5F);
        this.mouth2.addBox(-2.5F, -0.5F, -5.0F, 5, 1, 5, 0.0F);
        this.setRotateAngle(mouth2, -0.17453292519943295F, 0.0F, 0.0F);
        this.tailfin1 = new ModelRenderer(this, 55, 37);
        this.tailfin1.setRotationPoint(0.0F, -2.0F, 3.0F);
        this.tailfin1.addBox(-1.0F, -5.5F, 0.0F, 2, 11, 9, 0.0F);
        this.neck2 = new ModelRenderer(this, 29, 70);
        this.neck2.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.neck2.addBox(-2.5F, -2.5F, -5.0F, 5, 5, 5, 0.0F);
        this.setRotateAngle(neck2, -0.7853981633974483F, 0.0F, 0.0F);
        this.head_main = new ModelRenderer(this, 79, 64);
        this.head_main.setRotationPoint(0.0F, -20.0F, -8.5F);
        this.head_main.addBox(-3.5F, -8.0F, -4.0F, 7, 8, 8, 0.0F);
        this.head_top = new ModelRenderer(this, 0, 99);
        this.head_top.setRotationPoint(0.0F, -3.5F, 1.0F);
        this.head_top.addBox(0.0F, -10.0F, 0.0F, 0, 10, 9, 0.0F);
        this.setRotateAngle(head_top, 0.17453292519943295F, 0.0F, 0.0F);
        this.body_main = new ModelRenderer(this, 0, 33);
        this.body_main.setRotationPoint(0.0F, 24.0F, 0.0F);
        this.body_main.addBox(-4.5F, -9.0F, -4.5F, 9, 9, 9, 0.0F);
        this.tailfin3 = new ModelRenderer(this, 56, 60);
        this.tailfin3.setRotationPoint(0.0F, 3.5F, 4.0F);
        this.tailfin3.addBox(-1.0F, 0.0F, -4.5F, 2, 11, 9, 0.0F);
        this.setRotateAngle(tailfin3, 0.4363323129985824F, 0.0F, 0.0F);
        this.neck3 = new ModelRenderer(this, 29, 70);
        this.neck3.setRotationPoint(0.0F, 0.0F, -5.0F);
        this.neck3.addBox(-2.5F, -2.5F, -5.0F, 5, 5, 5, 0.0F);
        this.setRotateAngle(neck3, -0.36425021489121656F, 0.0F, 0.0F);
        this.neck_fin = new ModelRenderer(this, 42, 47);
        this.neck_fin.setRotationPoint(0.0F, -2.0F, -2.0F);
        this.neck_fin.addBox(0.0F, -2.5F, 0.0F, 0, 5, 5, 0.0F);
        this.setRotateAngle(neck_fin, 1.7453292519943295F, 0.0F, 0.0F);
        this.footbright = new ModelRenderer(this, 80, 18);
        this.footbright.setRotationPoint(-2.5F, -3.0F, 11.0F);
        this.footbright.addBox(-9.0F, -1.0F, -1.5F, 9, 2, 3, 0.0F);
        this.setRotateAngle(footbright, 0.0F, 0.3490658503988659F, -0.2617993877991494F);
        this.footfleft = new ModelRenderer(this, 23, 25);
        this.footfleft.setRotationPoint(3.5F, -3.0F, -1.5F);
        this.footfleft.addBox(0.0F, -1.0F, -1.5F, 9, 2, 3, 0.0F);
        this.setRotateAngle(footfleft, 0.0F, 0.5235987755982988F, 0.2617993877991494F);
        this.neck1 = new ModelRenderer(this, 29, 70);
        this.neck1.setRotationPoint(0.0F, -6.0F, -5.0F);
        this.neck1.addBox(-2.5F, -2.5F, 0.0F, 5, 5, 5, 0.0F);
        this.setRotateAngle(neck1, -0.2617993877991494F, 0.0F, 0.0F);
        this.neck4 = new ModelRenderer(this, 29, 70);
        this.neck4.setRotationPoint(0.0F, 0.0F, -5.0F);
        this.neck4.addBox(-2.5F, -2.5F, -5.0F, 5, 5, 5, 0.0F);
        this.setRotateAngle(neck4, -0.3490658503988659F, 0.0F, 0.0F);
        this.head_side2 = new ModelRenderer(this, 38, 32);
        this.head_side2.setRotationPoint(-3.5F, -3.5F, 0.0F);
        this.head_side2.addBox(0.0F, -2.5F, 0.0F, 0, 5, 5, 0.0F);
        this.setRotateAngle(head_side2, 0.17453292519943295F, -0.4363323129985824F, 0.0F);
        this.footbleft = new ModelRenderer(this, 80, 25);
        this.footbleft.setRotationPoint(2.5F, -3.0F, 11.0F);
        this.footbleft.addBox(0.0F, -1.0F, -1.5F, 9, 2, 3, 0.0F);
        this.setRotateAngle(footbleft, 0.0F, -0.3490658503988659F, 0.2617993877991494F);
        this.body_fin = new ModelRenderer(this, 21, 91);
        this.body_fin.setRotationPoint(0.0F, -3.5F, 4.5F);
        this.body_fin.addBox(0.0F, -10.0F, -4.5F, 0, 10, 9, 0.0F);
        this.tailfin2 = new ModelRenderer(this, 82, 36);
        this.tailfin2.setRotationPoint(0.0F, -4.5F, 4.5F);
        this.tailfin2.addBox(-1.0F, -10.0F, -4.5F, 2, 11, 9, 0.0F);
        this.setRotateAngle(tailfin2, -0.4363323129985824F, 0.0F, 0.0F);
        this.head_side1 = new ModelRenderer(this, 38, 32);
        this.head_side1.setRotationPoint(3.5F, -3.5F, 0.0F);
        this.head_side1.addBox(0.0F, -2.5F, 0.0F, 0, 5, 5, 0.0F);
        this.setRotateAngle(head_side1, 0.17453292519943295F, 0.4363323129985824F, 0.0F);
        this.mouth1 = new ModelRenderer(this, 54, 19);
        this.mouth1.setRotationPoint(0.0F, -5.5F, -6.0F);
        this.mouth1.addBox(-2.5F, -2.5F, -3.0F, 5, 5, 5, 0.0F);
        this.tail1 = new ModelRenderer(this, 0, 69);
        this.tail1.setRotationPoint(0.0F, 0.0F, 9.0F);
        this.tail1.addBox(-2.5F, -2.5F, 0.0F, 5, 5, 7, 0.0F);
        this.tail3 = new ModelRenderer(this, 0, 82);
        this.tail3.setRotationPoint(0.0F, 0.0F, 5.0F);
        this.tail3.addBox(-0.5F, -1.0F, 0.0F, 1, 2, 3, 0.0F);
        this.tail1.addChild(this.tail2);
        this.body_main.addChild(this.body2);
        this.body_main.addChild(this.footfright);
        this.mouth1.addChild(this.mouth2);
        this.tail3.addChild(this.tailfin1);
        this.neck1.addChild(this.neck2);
        this.body_main.addChild(this.head_main);
        this.head_main.addChild(this.head_top);
        this.tailfin1.addChild(this.tailfin3);
        this.neck2.addChild(this.neck3);
        this.neck4.addChild(this.neck_fin);
        this.body_main.addChild(this.footbright);
        this.body_main.addChild(this.footfleft);
        this.body_main.addChild(this.neck1);
        this.neck3.addChild(this.neck4);
        this.head_main.addChild(this.head_side2);
        this.body_main.addChild(this.footbleft);
        this.body_main.addChild(this.body_fin);
        this.tailfin1.addChild(this.tailfin2);
        this.head_main.addChild(this.head_side1);
        this.head_main.addChild(this.mouth1);
        this.body2.addChild(this.tail1);
        this.tail2.addChild(this.tail3);
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) { 
        this.setRotationAngles(f, f1, f2, f3, f4, f5, entity);
    	this.body_main.render(f5);
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
        this.head_main.rotateAngleX = headPitch / (180F / (float)Math.PI);
        this.head_main.rotateAngleY = netHeadYaw / (180F / (float)Math.PI);
        this.footfleft.rotateAngleY = MathHelper.cos(limbSwing * 1.5F) * 1.4F * limbSwingAmount;
        this.footfright.rotateAngleY = MathHelper.cos(limbSwing * 1.5F + (float)Math.PI) * 1.4F * limbSwingAmount;
        this.footbright.rotateAngleY = MathHelper.cos(limbSwing * 1.5F) * 1.4F * limbSwingAmount;
        this.footbleft.rotateAngleY = MathHelper.cos(limbSwing * 1.5F + (float)Math.PI) * 1.4F * limbSwingAmount;
        this.tail1.rotateAngleY = MathHelper.cos(limbSwing * 1.0F) * 1.0F * limbSwingAmount;
        this.tail2.rotateAngleY = MathHelper.cos(limbSwing * 1.0F) * 1.2F * limbSwingAmount;
        this.tail3.rotateAngleY = -MathHelper.cos(limbSwing * 1.0F) * 1.0F * limbSwingAmount;
    	
    }
}
