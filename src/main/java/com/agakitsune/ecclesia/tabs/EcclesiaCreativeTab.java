package com.agakitsune.ecclesia.tabs;

import com.agakitsune.ecclesia.EcclesiaMod;
import com.agakitsune.ecclesia.item.EcclesiaItems;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;

public class EcclesiaCreativeTab extends CreativeTabs {

    public EcclesiaCreativeTab() {
        super(EcclesiaMod.MODID + "_tab");
    }
    @Override
    public ItemStack getTabIconItem() {
        return new ItemStack(EcclesiaItems.HOLY_BREAD);
    }
}
