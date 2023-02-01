package com.agakitsune.ecclesia.register;

import com.agakitsune.ecclesia.block.EcclesiaBlocks;
import com.agakitsune.ecclesia.item.EcclesiaItems;
import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

@Mod.EventBusSubscriber
public class RegistryHandle {

    @SubscribeEvent
    public static void registerItems(RegistryEvent.Register<Item> event) {
        EcclesiaItems.ITEMS.forEach(item -> event.getRegistry().register(item));
    }

    @SubscribeEvent
    public static void registerBlocks(RegistryEvent.Register<Block> event) {
        EcclesiaBlocks.BLOCKS.forEach(block -> event.getRegistry().register(block));
    }
}
