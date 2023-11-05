package com.extralent.client.sounds;

import com.extralent.common.misc.ModMisc;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.SoundEvent;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

public class SoundHandler {
    public static final SoundHandler instance = new SoundHandler();

    public static final SoundEvent FUSE = addSoundsToRegistry("fuse");

    private static SoundEvent addSoundsToRegistry(String soundName) {
        ResourceLocation soundID = new ResourceLocation(ModMisc.MODID, soundName);
        return new SoundEvent(soundID).setRegistryName(soundID);
    }

    @SubscribeEvent
    public void registerSoundEvents(RegistryEvent.Register<SoundEvent> event) {
        event.getRegistry().registerAll(
                FUSE
        );
    }
}

