package com.agakitsune.ecclesia.entity;

import com.agakitsune.ecclesia.EcclesiaMod;
import com.agakitsune.ecclesia.item.EcclesiaItems;
import net.minecraft.block.Block;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.projectile.EntityPotion;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.init.PotionTypes;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.PotionEffect;
import net.minecraft.potion.PotionType;
import net.minecraft.potion.PotionUtils;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.RayTraceResult;
import net.minecraft.world.World;

import java.util.List;

public class EntityHolyWater extends EntityPotion {

    public EntityHolyWater(World worldIn)
    {
        super(worldIn);
    }
    public EntityHolyWater(World worldIn, EntityLivingBase throwerIn, ItemStack potionDamageIn) {
        super(worldIn, throwerIn, potionDamageIn);
    }

    public EntityHolyWater(World worldIn, double x, double y, double z, ItemStack potionDamageIn) {
        super(worldIn, x, y, z, potionDamageIn);
    }

    @Override
    public ItemStack getPotion()
    {
        return new ItemStack(EcclesiaItems.HOLY_WATER);
    }

    @Override
    protected void onImpact(RayTraceResult result)
    {
        EcclesiaMod.logger.info("AYO WTF BRO");

        if (!this.world.isRemote)
        {
            if (result.typeOfHit == RayTraceResult.Type.BLOCK) {
                BlockPos blockpos = result.getBlockPos().offset(result.sideHit);
                Block hit = this.world.getBlockState(blockpos).getBlock();
                if (hit != Blocks.AIR) {
                    return;
                }
                world.setBlockState(blockpos, Blocks.FIRE.getDefaultState());
            }
            this.setDead();
        }
    }
}
