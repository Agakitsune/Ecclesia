package com.agakitsune.ecclesia.block;

import com.agakitsune.ecclesia.EcclesiaMod;
import com.agakitsune.ecclesia.item.EcclesiaItems;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

import java.util.ArrayList;

public class EcclesiaBlocks {

    public static final ArrayList<Block> BLOCKS = new ArrayList<>();

    public static final Block HOLY_BLOCK = new BasicBlock("holy_block", Material.ANVIL);

    public static void setBLockName(Block block, String name) {
        block.setRegistryName(EcclesiaMod.MODID, name).setUnlocalizedName(EcclesiaMod.MODID + "." + name);
        BLOCKS.add(block);
    }
}
