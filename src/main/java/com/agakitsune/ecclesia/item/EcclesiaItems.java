package com.agakitsune.ecclesia.item;

import com.agakitsune.ecclesia.EcclesiaMod;
import com.agakitsune.ecclesia.block.EcclesiaBlocks;
import net.minecraft.block.Block;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

import java.util.ArrayList;

@Mod.EventBusSubscriber
public class EcclesiaItems {

    public static final ArrayList<Item> ITEMS = new ArrayList<>();

    public static final Item HOLY_BREAD = new BasicItem("holy_bread");
    public static final Item HOLY_WATER = new HolyWater();
    public static final Item HOLY_BLOCK_ITEM = new BasicItemBlock(EcclesiaBlocks.HOLY_BLOCK);
    public static void setItemName(Item item, String name) {
        item.setRegistryName(EcclesiaMod.MODID, name).setUnlocalizedName(EcclesiaMod.MODID + "." + name);
        ITEMS.add(item);
    }

    public static void setItemBlockName(Item item, Block block) {
        item.setRegistryName(block.getRegistryName());
        ITEMS.add(item);
    }

    @SideOnly(Side.CLIENT)
    @SubscribeEvent
    protected static void registerItemModels(ModelRegistryEvent e) {
        ITEMS.forEach(item -> registerModel(item, 0));
    }

    @SideOnly(Side.CLIENT)
    protected static void registerModel(Item item, int metadata) {
        ModelLoader.setCustomModelResourceLocation(item, metadata, new ModelResourceLocation(item.getRegistryName(), "inventory"));
    }
}
