package com.agakitsune.ecclesia.item;

import com.agakitsune.ecclesia.EcclesiaMod;
import net.minecraft.item.Item;

public class BasicItem extends Item {

    BasicItem(String name) {
        super();
        EcclesiaItems.setItemName(this, name);
        setCreativeTab(EcclesiaMod.TAB);
    }
}
