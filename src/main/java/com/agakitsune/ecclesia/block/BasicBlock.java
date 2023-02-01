package com.agakitsune.ecclesia.block;

import com.agakitsune.ecclesia.EcclesiaMod;
import com.agakitsune.ecclesia.tabs.EcclesiaCreativeTab;
import net.minecraft.block.Block;
import net.minecraft.block.material.MapColor;
import net.minecraft.block.material.Material;

public class BasicBlock extends Block {

    public BasicBlock(String name, Material blockMaterialIn) {
        super(blockMaterialIn);
        EcclesiaBlocks.setBLockName(this, name);
        setCreativeTab(EcclesiaMod.TAB);
        setHarvestLevel("pickaxe", 3);
    }
}
