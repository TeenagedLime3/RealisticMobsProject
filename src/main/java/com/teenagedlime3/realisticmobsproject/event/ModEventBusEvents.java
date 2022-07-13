package com.teenagedlime3.realisticmobsproject.event;

import com.teenagedlime3.realisticmobsproject.RealisticMobsProject;
import com.teenagedlime3.realisticmobsproject.entity.ModEntityTypes;
import com.teenagedlime3.realisticmobsproject.entity.custom.RaccoonEntity;
import net.minecraftforge.event.entity.EntityAttributeCreationEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(modid = RealisticMobsProject.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class ModEventBusEvents {

    @SubscribeEvent
    public static void entityAttributeEvent(EntityAttributeCreationEvent event) {
        event.put(ModEntityTypes.RACCOON.get(), RaccoonEntity.setAttributes());
    }
}
