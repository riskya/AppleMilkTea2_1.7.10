package mods.defeatedcrow.client.model.model;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

@SideOnly(Side.CLIENT)
public class ModelCLamp extends ModelBase
{
    //fields
	ModelRenderer body;
    ModelRenderer head;
    ModelRenderer ear1;
    ModelRenderer ear2;
    ModelRenderer wing1;
    ModelRenderer wing2;
    ModelRenderer tail1;
    ModelRenderer tail2;
    ModelRenderer core1;
    ModelRenderer core2;
    
    ModelRenderer sphere;
    ModelRenderer sphere2;
    ModelRenderer arm1;
    ModelRenderer arm2;
    ModelRenderer arm3;
    ModelRenderer blade1;
    ModelRenderer blade2;
    ModelRenderer blade3;
    ModelRenderer blade21;
    ModelRenderer blade22;
    ModelRenderer blade23;
    
    ModelRenderer side1;
    ModelRenderer side2;
    ModelRenderer side3;
    ModelRenderer side4;
    ModelRenderer inner1;
    ModelRenderer inner2;
    ModelRenderer barB1;
    ModelRenderer barB2;
    ModelRenderer barB3;
    ModelRenderer barB4;
    ModelRenderer barB5;
    ModelRenderer barB6;
    ModelRenderer barF1;
    ModelRenderer barF2;
    ModelRenderer barF3;
    ModelRenderer barF4;
    ModelRenderer barF5;
    ModelRenderer barF6;
    ModelRenderer barR1;
    ModelRenderer barR2;
    ModelRenderer barR3;
    ModelRenderer barR4;
    ModelRenderer barL1;
    ModelRenderer barL2;
    ModelRenderer barL3;
    ModelRenderer barL4;
    
    ModelRenderer head1;
    ModelRenderer head2;
    ModelRenderer head3;
    ModelRenderer head4;
    ModelRenderer cover1;
    ModelRenderer head6;
    ModelRenderer head7;
    ModelRenderer head8;
    ModelRenderer head9;
    ModelRenderer cover2;
    ModelRenderer glow1;
    ModelRenderer glow2;
    ModelRenderer top;
    ModelRenderer lod1a;
    ModelRenderer lod1b;
    ModelRenderer lod1c;
    ModelRenderer lod2a;
    ModelRenderer lod2b;
    ModelRenderer lod2c;
    ModelRenderer lod3a;
    ModelRenderer lod3b;
    ModelRenderer lod3c;
    ModelRenderer lod4a;
    ModelRenderer lod4b;
    ModelRenderer lod4c;
    ModelRenderer wingb1;
    ModelRenderer wingb2;
  
  public ModelCLamp()
  {
    
	  body = new ModelRenderer(this, 0, 0);
      body.addBox(-2.5F, -3F, -2F, 5, 6, 5);
      body.setRotationPoint(0F, 14F, 0F);
      body.setTextureSize(64, 32);
      body.mirror = true;
      setRotation(body, 0F, 0F, 0F);
      head = new ModelRenderer(this, 0, 0);
      head.addBox(-2F, -2F, -1.5F, 4, 3, 4);
      head.setRotationPoint(0F, 10F, 0F);
      head.setTextureSize(64, 32);
      head.mirror = true;
      setRotation(head, 0F, 0F, 0F);
      ear1 = new ModelRenderer(this, 0, 0);
      ear1.addBox(-1F, 0F, 0.5F, 1, 1, 1);
      ear1.setRotationPoint(0F, 8.3F, 0F);
      ear1.setTextureSize(64, 32);
      ear1.mirror = true;
      setRotation(ear1, 0.7853982F, -1.570796F, 0F);
      ear2 = new ModelRenderer(this, 0, 0);
      ear2.addBox(0F, 0F, 0.5F, 1, 1, 1);
      ear2.setRotationPoint(0F, 8.3F, 0F);
      ear2.setTextureSize(64, 32);
      ear2.mirror = true;
      setRotation(ear2, 0.7853982F, 1.570796F, 0F);
      tail1 = new ModelRenderer(this, 0, 0);
      tail1.addBox(-2F, 0F, -1.5F, 4, 2, 4);
      tail1.setRotationPoint(0F, 17F, 0F);
      tail1.setTextureSize(64, 32);
      tail1.mirror = true;
      setRotation(tail1, 0F, 0F, 0F);
      tail2 = new ModelRenderer(this, 0, 0);
      tail2.addBox(-1.5F, 0F, -1F, 3, 2, 2);
      tail2.setRotationPoint(0F, 19F, 0F);
      tail2.setTextureSize(64, 32);
      tail2.mirror = true;
      setRotation(tail2, 0F, 0F, 0F);
      core1 = new ModelRenderer(this, 0, 17);
      core1.addBox(-1F, -1F, -1F, 2, 2, 2);
      core1.setRotationPoint(0F, 14F, 0F);
      core1.setTextureSize(64, 32);
      core1.mirror = true;
      setRotation(core1, 0F, 0F, -0.7853982F);
      core2 = new ModelRenderer(this, 0, 12);
      core2.addBox(-1.5F, -0.5F, -1F, 3, 2, 2);
      core2.setRotationPoint(0F, 9F, 0F);
      core2.setTextureSize(64, 32);
      core2.mirror = true;
      setRotation(core2, 0F, 0F, 0F);
      wing1 = new ModelRenderer(this, 0, 0);
      wing1.addBox(0F, -1.5F, 2.5F, 1, 3, 6);
      wing1.setRotationPoint(0F, 15F, 0F);
      wing1.setTextureSize(64, 32);
      wing1.mirror = true;
      setRotation(wing1, 0.4363323F, 1.570796F, 0F);
      wing2 = new ModelRenderer(this, 0, 0);
      wing2.addBox(0F, -1.5F, 2.5F, 1, 3, 6);
      wing2.setRotationPoint(0F, 15F, 0F);
      wing2.setTextureSize(64, 32);
      wing2.mirror = true;
      setRotation(wing2, 0.4363323F, -1.570796F, 0F);
      
      sphere = new ModelRenderer(this, 0, 0);
      sphere.addBox(-3F, -3F, -3F, 6, 6, 6);
      sphere.setRotationPoint(0F, 14F, 0F);
      sphere.setTextureSize(64, 32);
      sphere.mirror = true;
      setRotation(sphere, 0F, 0F, 0F);
      sphere2 = new ModelRenderer(this, 24, 0);
      sphere2.addBox(-2F, -2F, -2F, 4, 4, 4);
      sphere2.setRotationPoint(0F, 14F, 0F);
      sphere2.setTextureSize(64, 32);
      sphere2.mirror = true;
      setRotation(sphere2, 0F, 0F, 0F);
      arm1 = new ModelRenderer(this, 0, 13);
      arm1.addBox(-5F, -1F, -1F, 2, 2, 2);
      arm1.setRotationPoint(0F, 13F, -0.5F);
      arm1.setTextureSize(64, 32);
      arm1.mirror = true;
      setRotation(arm1, 0F, 0.6981317F, 0.2617994F);
      arm2 = new ModelRenderer(this, 0, 13);
      arm2.addBox(3F, -1F, -1F, 2, 2, 2);
      arm2.setRotationPoint(0F, 13F, -0.5F);
      arm2.setTextureSize(64, 32);
      arm2.mirror = true;
      setRotation(arm2, 0F, -0.6981317F, -0.2617994F);
      arm3 = new ModelRenderer(this, 0, 13);
      arm3.addBox(-1F, -1F, -4F, 2, 2, 2);
      arm3.setRotationPoint(0F, 12.5F, 0F);
      arm3.setTextureSize(64, 32);
      arm3.mirror = true;
      setRotation(arm3, -0.2617994F, 0F, 0F);
      blade1 = new ModelRenderer(this, 0, 17);
      blade1.addBox(-0.5F, 0F, -4.5F, 1, 10, 2);
      blade1.setRotationPoint(0F, 11F, 0F);
      blade1.setTextureSize(64, 32);
      blade1.mirror = true;
      setRotation(blade1, -0.3490659F, 0F, 0F);
      blade2 = new ModelRenderer(this, 0, 17);
      blade2.addBox(-0.5F, 0F, -5.5F, 1, 10, 2);
      blade2.setRotationPoint(0F, 11.5F, -0.2F);
      blade2.setTextureSize(64, 32);
      blade2.mirror = true;
      setRotation(blade2, -0.3490659F, 2.234021F, 0F);
      blade3 = new ModelRenderer(this, 0, 17);
      blade3.addBox(-0.5F, 0F, -5.5F, 1, 10, 2);
      blade3.setRotationPoint(0F, 11.5F, -0.2F);
      blade3.setTextureSize(64, 32);
      blade3.mirror = true;
      setRotation(blade3, -0.3490659F, -2.234021F, 0F);
      blade21 = new ModelRenderer(this, 14, 13);
      blade21.addBox(-0.5F, 0F, -8.7F, 1, 1, 3);
      blade21.setRotationPoint(0F, 23F, 0F);
      blade21.setTextureSize(64, 32);
      blade21.mirror = true;
      setRotation(blade21, -0.5410521F, 0F, 0F);
      blade22 = new ModelRenderer(this, 14, 13);
      blade22.addBox(-0.5F, 0F, -9.5F, 1, 1, 3);
      blade22.setRotationPoint(0F, 23.5F, -0.2F);
      blade22.setTextureSize(64, 32);
      blade22.mirror = true;
      setRotation(blade22, -0.5410521F, 2.234021F, 0F);
      blade23 = new ModelRenderer(this, 14, 13);
      blade23.addBox(-0.5F, 0F, -9.5F, 1, 1, 3);
      blade23.setRotationPoint(0F, 23.5F, -0.2F);
      blade23.setTextureSize(64, 32);
      blade23.mirror = true;
      setRotation(blade23, -0.5410521F, -2.234021F, 0F);
      
      side1 = new ModelRenderer(this, 0, 0);
      side1.addBox(-6F, -2F, -6F, 2, 14, 2);
      side1.setRotationPoint(0F, 10F, 0F);
      side1.setTextureSize(64, 32);
      side1.mirror = true;
      setRotation(side1, 0F, 0F, 0F);
      side2 = new ModelRenderer(this, 0, 0);
      side2.addBox(4F, -2F, -6F, 2, 14, 2);
      side2.setRotationPoint(0F, 10F, 0F);
      side2.setTextureSize(64, 32);
      side2.mirror = true;
      setRotation(side2, 0F, 0F, 0F);
      side3 = new ModelRenderer(this, 0, 0);
      side3.addBox(-6F, -2F, 4F, 2, 14, 2);
      side3.setRotationPoint(0F, 10F, 0F);
      side3.setTextureSize(64, 32);
      side3.mirror = true;
      setRotation(side3, 0F, 0F, 0F);
      side4 = new ModelRenderer(this, 0, 0);
      side4.addBox(4F, -2F, 4F, 2, 14, 2);
      side4.setRotationPoint(0F, 10F, 0F);
      side4.setTextureSize(64, 32);
      side4.mirror = true;
      setRotation(side4, 0F, 0F, 0F);
      inner1 = new ModelRenderer(this, 32, 0);
      inner1.addBox(-4F, -2F, -4F, 8, 14, 8);
      inner1.setRotationPoint(0F, 10F, 0F);
      inner1.setTextureSize(64, 32);
      inner1.mirror = true;
      setRotation(inner1, 0F, 0F, 0F);
      inner2 = new ModelRenderer(this, 32, 0);
      inner2.addBox(-3.5F, 0F, -3.5F, 7, 13, 7);
      inner2.setRotationPoint(0F, 8.5F, 0F);
      inner2.setTextureSize(64, 32);
      inner2.mirror = true;
      setRotation(inner2, 0F, 0F, 0F);
      barL1 = new ModelRenderer(this, 0, 0);
      barL1.addBox(4F, 0F, -9F, 1, 10, 1);
      barL1.setRotationPoint(0F, 2F, 0F);
      barL1.setTextureSize(64, 32);
      barL1.mirror = true;
      setRotation(barL1, 1.047198F, 0F, 0F);
      barL2 = new ModelRenderer(this, 0, 0);
      barL2.addBox(4F, 0F, 8F, 1, 10, 1);
      barL2.setRotationPoint(0F, 2F, 0F);
      barL2.setTextureSize(64, 32);
      barL2.mirror = true;
      setRotation(barL2, -1.047198F, 0F, 0F);
      barL3 = new ModelRenderer(this, 0, 0);
      barL3.addBox(4F, 0F, -9F, 1, 10, 1);
      barL3.setRotationPoint(0F, 8F, 0F);
      barL3.setTextureSize(64, 32);
      barL3.mirror = true;
      setRotation(barL3, 1.047198F, 0F, 0F);
      barL4 = new ModelRenderer(this, 0, 0);
      barL4.addBox(4F, 0F, 8F, 1, 10, 1);
      barL4.setRotationPoint(0F, 8F, 0F);
      barL4.setTextureSize(64, 32);
      barL4.mirror = true;
      setRotation(barL4, -1.047198F, 0F, 0F);
      barR1 = new ModelRenderer(this, 0, 0);
      barR1.addBox(-5F, 0F, 8F, 1, 10, 1);
      barR1.setRotationPoint(0F, 2F, 0F);
      barR1.setTextureSize(64, 32);
      barR1.mirror = true;
      setRotation(barR1, -1.047198F, 0F, 0F);
      barR2 = new ModelRenderer(this, 0, 0);
      barR2.addBox(-5F, 0F, -9F, 1, 10, 1);
      barR2.setRotationPoint(0F, 2F, 0F);
      barR2.setTextureSize(64, 32);
      barR2.mirror = true;
      setRotation(barR2, 1.047198F, 0F, 0F);
      barR3 = new ModelRenderer(this, 0, 0);
      barR3.addBox(-5F, 0F, 8F, 1, 10, 1);
      barR3.setRotationPoint(0F, 8F, 0F);
      barR3.setTextureSize(64, 32);
      barR3.mirror = true;
      setRotation(barR3, -1.047198F, 0F, 0F);
      barR4 = new ModelRenderer(this, 0, 0);
      barR4.addBox(-5F, 0F, -9F, 1, 10, 1);
      barR4.setRotationPoint(0F, 8F, 0F);
      barR4.setTextureSize(64, 32);
      barR4.mirror = true;
      setRotation(barR4, 1.047198F, 0F, 0F);
      barF1 = new ModelRenderer(this, 0, 0);
      barF1.addBox(4F, 0F, 0F, 1, 6, 1);
      barF1.setRotationPoint(0F, 8F, 0F);
      barF1.setTextureSize(64, 32);
      barF1.mirror = true;
      setRotation(barF1, -1.047198F, 1.570796F, 0F);
      barF2 = new ModelRenderer(this, 0, 0);
      barF2.addBox(4F, 0F, -1F, 1, 6, 1);
      barF2.setRotationPoint(0F, 8F, 0F);
      barF2.setTextureSize(64, 32);
      barF2.mirror = true;
      setRotation(barF2, 1.047198F, 1.570796F, 0F);
      barF3 = new ModelRenderer(this, 0, 0);
      barF3.addBox(4F, 0F, -9F, 1, 10, 1);
      barF3.setRotationPoint(0F, 5F, 0F);
      barF3.setTextureSize(64, 32);
      barF3.mirror = true;
      setRotation(barF3, 1.047198F, 1.570796F, 0F);
      barF4 = new ModelRenderer(this, 0, 0);
      barF4.addBox(4F, 0F, 8F, 1, 10, 1);
      barF4.setRotationPoint(0F, 5F, 0F);
      barF4.setTextureSize(64, 32);
      barF4.mirror = true;
      setRotation(barF4, -1.047198F, 1.570796F, 0F);
      barF5 = new ModelRenderer(this, 0, 0);
      barF5.addBox(4F, 0F, -9F, 1, 5, 1);
      barF5.setRotationPoint(0F, 11F, 0F);
      barF5.setTextureSize(64, 32);
      barF5.mirror = true;
      setRotation(barF5, 1.047198F, 1.570796F, 0F);
      barF6 = new ModelRenderer(this, 0, 0);
      barF6.addBox(4F, 0F, 9F, 1, 6, 1);
      barF6.setRotationPoint(0F, 10F, 0F);
      barF6.setTextureSize(64, 32);
      barF6.mirror = true;
      setRotation(barF6, -1.047198F, 1.570796F, 0F);
      barB1 = new ModelRenderer(this, 0, 0);
      barB1.addBox(-5F, 0F, -1F, 1, 6, 1);
      barB1.setRotationPoint(0F, 8F, 0F);
      barB1.setTextureSize(64, 32);
      barB1.mirror = true;
      setRotation(barB1, 1.047198F, 1.570796F, 0F);
      barB2 = new ModelRenderer(this, 0, 0);
      barB2.addBox(-5F, 0F, 0F, 1, 6, 1);
      barB2.setRotationPoint(0F, 8F, 0F);
      barB2.setTextureSize(64, 32);
      barB2.mirror = true;
      setRotation(barB2, -1.047198F, 1.570796F, 0F);
      barB3 = new ModelRenderer(this, 0, 0);
      barB3.addBox(-5F, 0F, 8F, 1, 10, 1);
      barB3.setRotationPoint(0F, 5F, 0F);
      barB3.setTextureSize(64, 32);
      barB3.mirror = true;
      setRotation(barB3, -1.047198F, 1.570796F, 0F);
      barB4 = new ModelRenderer(this, 0, 0);
      barB4.addBox(-5F, 0F, -9F, 1, 10, 1);
      barB4.setRotationPoint(0F, 5F, 0F);
      barB4.setTextureSize(64, 32);
      barB4.mirror = true;
      setRotation(barB4, 1.047198F, 1.570796F, 0F);
      barB5 = new ModelRenderer(this, 0, 0);
      barB5.addBox(-5F, 0F, 9F, 1, 6, 1);
      barB5.setRotationPoint(0F, 10F, 0F);
      barB5.setTextureSize(64, 32);
      barB5.mirror = true;
      setRotation(barB5, -1.047198F, 1.570796F, 0F);
      barB6 = new ModelRenderer(this, 0, 0);
      barB6.addBox(-5F, 0F, -10F, 1, 6, 1);
      barB6.setRotationPoint(0F, 10F, 0F);
      barB6.setTextureSize(64, 32);
      barB6.mirror = true;
      setRotation(barB6, 1.047198F, 1.570796F, 0F);
      
      head1 = new ModelRenderer(this, 0, 3);
      head1.addBox(-1F, 0F, 2F, 2, 1, 2);
      head1.setRotationPoint(0F, 11F, 0F);
      head1.setTextureSize(64, 32);
      head1.mirror = true;
      setRotation(head1, -0.5235988F, 1.570796F, 0F);
      head2 = new ModelRenderer(this, 0, 3);
      head2.addBox(-2F, 0F, 4F, 4, 1, 1);
      head2.setRotationPoint(0F, 11F, 0F);
      head2.setTextureSize(64, 32);
      head2.mirror = true;
      setRotation(head2, -0.5235988F, 1.570796F, 0F);
      head3 = new ModelRenderer(this, 0, 3);
      head3.addBox(-3F, 0F, 5F, 6, 1, 1);
      head3.setRotationPoint(0F, 11F, 0F);
      head3.setTextureSize(64, 32);
      head3.mirror = true;
      setRotation(head3, -0.5235988F, 1.570796F, 0F);
      head4 = new ModelRenderer(this, 0, 3);
      head4.addBox(-4F, 0F, 6F, 8, 1, 1);
      head4.setRotationPoint(0F, 11F, 0F);
      head4.setTextureSize(64, 32);
      head4.mirror = true;
      setRotation(head4, -0.5235988F, 1.570796F, 0F);
      cover1 = new ModelRenderer(this, 0, 3);
      cover1.addBox(5F, 0F, -4F, 1, 10, 8);
      cover1.setRotationPoint(0F, 14.5F, 0F);
      cover1.setTextureSize(64, 32);
      cover1.mirror = true;
      setRotation(cover1, 0F, 0F, 0F);
      head6 = new ModelRenderer(this, 0, 3);
      head6.addBox(-1F, 0F, 2F, 2, 1, 2);
      head6.setRotationPoint(0F, 11F, 0F);
      head6.setTextureSize(64, 32);
      head6.mirror = true;
      setRotation(head6, -0.5235988F, -1.570796F, 0F);
      head7 = new ModelRenderer(this, 0, 3);
      head7.addBox(-2F, 0F, 4F, 4, 1, 1);
      head7.setRotationPoint(0F, 11F, 0F);
      head7.setTextureSize(64, 32);
      head7.mirror = true;
      setRotation(head7, -0.5235988F, -1.570796F, 0F);
      head8 = new ModelRenderer(this, 0, 3);
      head8.addBox(-3F, 0F, 5F, 6, 1, 1);
      head8.setRotationPoint(0F, 11F, 0F);
      head8.setTextureSize(64, 32);
      head8.mirror = true;
      setRotation(head8, -0.5235988F, -1.570796F, 0F);
      head9 = new ModelRenderer(this, 0, 3);
      head9.addBox(-4F, 0F, 6F, 8, 1, 1);
      head9.setRotationPoint(0F, 11F, 0F);
      head9.setTextureSize(64, 32);
      head9.mirror = true;
      setRotation(head9, -0.5235988F, -1.570796F, 0F);
      cover2 = new ModelRenderer(this, 0, 3);
      cover2.addBox(-6F, 0F, -4F, 1, 10, 8);
      cover2.setRotationPoint(0F, 14.5F, 0F);
      cover2.setTextureSize(64, 32);
      cover2.mirror = true;
      setRotation(cover2, 0F, 0F, 0F);
      glow1 = new ModelRenderer(this, 24, 0);
      glow1.addBox(-2F, 0F, -2F, 4, 4, 4);
      glow1.setRotationPoint(0F, 16F, 0F);
      glow1.setTextureSize(64, 32);
      glow1.mirror = true;
      setRotation(glow1, 0F, 0.7853982F, 0F);
      glow2 = new ModelRenderer(this, 24, 8);
      glow2.addBox(-3F, 0F, -3F, 6, 6, 6);
      glow2.setRotationPoint(0F, 15F, 0F);
      glow2.setTextureSize(64, 32);
      glow2.mirror = true;
      setRotation(glow2, 0F, 0.7853982F, 0F);
      top = new ModelRenderer(this, 0, 3);
      top.addBox(-1F, 0F, -1F, 2, 2, 2);
      top.setRotationPoint(0F, 13F, 0F);
      top.setTextureSize(64, 32);
      top.mirror = true;
      setRotation(top, 0F, 0.7853982F, 0F);
      lod1a = new ModelRenderer(this, 0, 0);
      lod1a.addBox(-3F, 0F, 6F, 6, 1, 1);
      lod1a.setRotationPoint(0F, 17F, 0F);
      lod1a.setTextureSize(64, 32);
      lod1a.mirror = true;
      setRotation(lod1a, 0F, 0F, 0F);
      lod1b = new ModelRenderer(this, 0, 0);
      lod1b.addBox(-2F, 0F, 6F, 4, 1, 1);
      lod1b.setRotationPoint(0F, 17F, 0F);
      lod1b.setTextureSize(64, 32);
      lod1b.mirror = true;
      setRotation(lod1b, 0F, 0.6981317F, 0F);
      lod1c = new ModelRenderer(this, 0, 0);
      lod1c.addBox(-2F, 0F, 6F, 4, 1, 1);
      lod1c.setRotationPoint(0F, 17F, 0F);
      lod1c.setTextureSize(64, 32);
      lod1c.mirror = true;
      setRotation(lod1c, 0F, -0.6981317F, 0F);
      lod2a = new ModelRenderer(this, 0, 0);
      lod2a.addBox(-3F, 0F, 6F, 6, 1, 1);
      lod2a.setRotationPoint(0F, 21F, 0F);
      lod2a.setTextureSize(64, 32);
      lod2a.mirror = true;
      setRotation(lod2a, 0F, 0F, 0F);
      lod2b = new ModelRenderer(this, 0, 0);
      lod2b.addBox(-2F, 0F, 6F, 4, 1, 1);
      lod2b.setRotationPoint(0F, 21F, 0F);
      lod2b.setTextureSize(64, 32);
      lod2b.mirror = true;
      setRotation(lod2b, 0F, 0.6981317F, 0F);
      lod2c = new ModelRenderer(this, 0, 0);
      lod2c.addBox(-2F, 0F, 6F, 4, 1, 1);
      lod2c.setRotationPoint(0F, 21F, 0F);
      lod2c.setTextureSize(64, 32);
      lod2c.mirror = true;
      setRotation(lod2c, 0F, -0.6981317F, 0F);
      lod3a = new ModelRenderer(this, 0, 0);
      lod3a.addBox(-3F, 0F, -7F, 6, 1, 1);
      lod3a.setRotationPoint(0F, 17F, 0F);
      lod3a.setTextureSize(64, 32);
      lod3a.mirror = true;
      setRotation(lod3a, 0F, 0F, 0F);
      lod3b = new ModelRenderer(this, 0, 0);
      lod3b.addBox(-2F, 0F, -7F, 4, 1, 1);
      lod3b.setRotationPoint(0F, 17F, 0F);
      lod3b.setTextureSize(64, 32);
      lod3b.mirror = true;
      setRotation(lod3b, 0F, 0.6981317F, 0F);
      lod3c = new ModelRenderer(this, 0, 0);
      lod3c.addBox(-2F, 0F, -7F, 4, 1, 1);
      lod3c.setRotationPoint(0F, 17F, 0F);
      lod3c.setTextureSize(64, 32);
      lod3c.mirror = true;
      setRotation(lod3c, 0F, -0.6981317F, 0F);
      lod4a = new ModelRenderer(this, 0, 0);
      lod4a.addBox(-3F, 0F, -7F, 6, 1, 1);
      lod4a.setRotationPoint(0F, 21F, 0F);
      lod4a.setTextureSize(64, 32);
      lod4a.mirror = true;
      setRotation(lod4a, 0F, 0F, 0F);
      lod4b = new ModelRenderer(this, 0, 0);
      lod4b.addBox(-2F, 0F, -7F, 4, 1, 1);
      lod4b.setRotationPoint(0F, 21F, 0F);
      lod4b.setTextureSize(64, 32);
      lod4b.mirror = true;
      setRotation(lod4b, 0F, 0.6981317F, 0F);
      lod4c = new ModelRenderer(this, 0, 0);
      lod4c.addBox(-2F, 0F, -7F, 4, 1, 1);
      lod4c.setRotationPoint(0F, 21F, 0F);
      lod4c.setTextureSize(64, 32);
      lod4c.mirror = true;
      setRotation(lod4c, 0F, -0.6981317F, 0F);
      wingb1 = new ModelRenderer(this, 0, 22);
      wingb1.addBox(1F, 0F, -1F, 20, 0, 5);
      wingb1.setRotationPoint(0F, 11.5F, 0F);
      wingb1.setTextureSize(64, 32);
      wingb1.mirror = true;
      setRotation(wingb1, -0.1047198F, 0F, 0F);
      wingb2 = new ModelRenderer(this, 0, 22);
      wingb2.addBox(1F, 0F, -1F, 20, 0, 5);
      wingb2.setRotationPoint(0F, 11.5F, 0F);
      wingb2.setTextureSize(64, 32);
      wingb2.mirror = true;
      setRotation(wingb2, -0.1047198F, 3.141593F, 0F);
  }
  
  //通常色の部分
  public void render (Entity par1Entity, float par2, float par3, float par4, float par5, float par6, float par7, byte b0, float rad)
  {
	  super.render(par1Entity, par2, par3, par4, par5, par6, par7);
	  this.setRotationAngles(par2, par3, par4, par5, par6, par7, par1Entity, b0, rad);
	  
	  if (b0 == 9)
	  {
		  this.arm1.render(par7);
		  this.arm2.render(par7);
		  this.arm3.render(par7);
		  this.blade1.render(par7);
		  this.blade2.render(par7);
		  this.blade3.render(par7);
		  this.blade21.render(par7);
		  this.blade22.render(par7);
		  this.blade23.render(par7);
	  }
	  else if (b0 == 11)
	  {
		  this.top.render(par7);
		  this.head1.render(par7);
		  this.head2.render(par7);
		  this.head3.render(par7);
		  this.head4.render(par7);
		  this.head6.render(par7);
		  this.head7.render(par7);
		  this.head8.render(par7);
		  this.head9.render(par7);
		  this.cover1.render(par7);
		  this.cover2.render(par7);
		  
		  this.lod1a.render(par7);
		  this.lod1b.render(par7);
		  this.lod1c.render(par7);
		  this.lod2a.render(par7);
		  this.lod2b.render(par7);
		  this.lod2c.render(par7);
		  this.lod3a.render(par7);
		  this.lod3b.render(par7);
		  this.lod3c.render(par7);
		  this.lod4a.render(par7);
		  this.lod4b.render(par7);
		  this.lod4c.render(par7);
		  
		  this.wingb1.render(par7);
		  this.wingb2.render(par7);
	  }
  }
  
  //半透明かつ、明るい色
  public void renderLucent(Entity par1Entity, float par2, float par3, float par4, float par5, float par6, float par7, byte b0, float rad)
  {
	  super.render(par1Entity, par2, par3, par4, par5, par6, par7);
	  this.setRotationAngles(par2, par3, par4, par5, par6, par7, par1Entity, b0, rad);
	  
	  if (b0 == 8)
	  {
		  this.body.render(par7);
		  this.head.render(par7);
		  this.ear1.render(par7);
		  this.ear2.render(par7);
		  this.wing1.render(par7);
		  this.wing2.render(par7);
		  this.tail1.render(par7);
		  this.tail2.render(par7);
	  }
	  else if (b0 == 9)
	  {
		  this.sphere.render(par7);
	  }
	  else if (b0 == 10)
	  {
		  this.inner1.render(par7);
	  }
	  else if (b0 == 11)
	  {
		  this.glow2.render(par7);
	  }
  }
  
  //不透明、明るい色
  public void renderGlow(Entity par1Entity, float par2, float par3, float par4, float par5, float par6, float par7, byte b0)
  {
	  super.render(par1Entity, par2, par3, par4, par5, par6, par7);
	  this.setRotationAngles(par2, par3, par4, par5, par6, par7, par1Entity, b0, 0.0F);
	  
	  if (b0 == 8)
	  {
		  this.core1.render(par7);
		  this.core2.render(par7);
	  }
	  else if (b0 == 9)
	  {
		  this.sphere2.render(par7);
	  }
	  else if (b0 == 10)
	  {
		  this.inner2.render(par7);
		  this.side1.render(par7);
		  this.side2.render(par7);
		  this.side3.render(par7);
		  this.side4.render(par7);
		  this.barB1.render(par7);
		  this.barB2.render(par7);
		  this.barB3.render(par7);
		  this.barB4.render(par7);
		  this.barF1.render(par7);
		  this.barF2.render(par7);
		  this.barF3.render(par7);
		  this.barF4.render(par7);
		  this.barL1.render(par7);
		  this.barL2.render(par7);
		  this.barL3.render(par7);
		  this.barL4.render(par7);
		  this.barB5.render(par7);
		  this.barB6.render(par7);
		  this.barR1.render(par7);
		  this.barR2.render(par7);
		  this.barR3.render(par7);
		  this.barR4.render(par7);
		  this.barF5.render(par7);
		  this.barF6.render(par7);
	  }
	  else if (b0 == 11)
	  {
		  this.glow1.render(par7);
	  }
  }
  
  private void setRotation(ModelRenderer model, float x, float y, float z)
  {
	  model.rotateAngleX = x;
      model.rotateAngleY = y;
      model.rotateAngleZ = z;
  }
  
  public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5, Entity entity, byte b0, float rad)
  {
      super.setRotationAngles(f, f1, f2, f3, f4, f5, entity);
      
      this.body.rotateAngleY = f3 / (180F / (float)Math.PI);
      this.head.rotateAngleY = f3 / (180F / (float)Math.PI);
      this.ear1.rotateAngleY = -1.570796F + (f3 / (180F / (float)Math.PI));
      this.ear2.rotateAngleY = 1.570796F + (f3 / (180F / (float)Math.PI));
      this.tail1.rotateAngleY = f3 / (180F / (float)Math.PI);
      this.tail2.rotateAngleY = f3 / (180F / (float)Math.PI);
      this.wing1.rotateAngleY = 1.570796F + f3 / (180F / (float)Math.PI);
      this.wing2.rotateAngleY = -1.570796F + f3 / (180F / (float)Math.PI);
      this.core2.rotateAngleY = f3 / (180F / (float)Math.PI);
      
      this.core1.rotateAngleY += rad/ 3 / (360F / (float)Math.PI);
      this.core1.rotateAngleX += rad/ 3 / (360F / (float)Math.PI);
      
      this.wingb1.rotateAngleY = rad / (180F / (float)Math.PI);
      this.wingb2.rotateAngleY = -3.141593F + rad / (180F / (float)Math.PI);
  }
}
