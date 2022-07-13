package com.teenagedlime3.realisticmobsproject.entity.client;

import com.teenagedlime3.realisticmobsproject.RealisticMobsProject;
import com.teenagedlime3.realisticmobsproject.entity.custom.RaccoonEntity;
import net.minecraft.resources.ResourceLocation;
import software.bernie.geckolib3.model.AnimatedGeoModel;

public class RaccoonModel extends AnimatedGeoModel<RaccoonEntity> {
    @Override
    public ResourceLocation getModelLocation(RaccoonEntity object) {
        return new ResourceLocation(RealisticMobsProject.MOD_ID, "geo/raccoon.geo.json");
    }

    @Override
    public ResourceLocation getTextureLocation(RaccoonEntity object) {
        return new ResourceLocation(RealisticMobsProject.MOD_ID, "textures/entity/raccoon/raccoon.png");
    }

    @Override
    public ResourceLocation getAnimationFileLocation(RaccoonEntity animatable) {
        return new ResourceLocation(RealisticMobsProject.MOD_ID, "animations/raccoon.animation.json");
    }
}
