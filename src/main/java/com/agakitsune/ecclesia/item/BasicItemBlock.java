package com.agakitsune.ecclesia.item;

import com.agakitsune.ecclesia.EcclesiaMod;
import com.agakitsune.ecclesia.block.EcclesiaBlocks;
import net.minecraft.block.Block;
import net.minecraft.item.ItemBlock;

public class BasicItemBlock extends ItemBlock {


    public BasicItemBlock(Block block) {
        super(block);
        EcclesiaItems.setItemBlockName(this, block);
        setCreativeTab(EcclesiaMod.TAB);
    }
}
