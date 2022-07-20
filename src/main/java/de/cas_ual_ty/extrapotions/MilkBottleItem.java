package de.cas_ual_ty.extrapotions;

import net.minecraft.advancements.CriteriaTriggers;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.player.ServerPlayerEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.item.MilkBucketItem;
import net.minecraft.stats.Stats;
import net.minecraft.world.World;

public class MilkBottleItem extends MilkBucketItem
{
    public MilkBottleItem(Properties builder)
    {
        super(builder);
    }
    
    @Override
    public ItemStack finishUsingItem(ItemStack itemStack, World world, LivingEntity entityLiving)
    {
        if(!world.isClientSide)
        {
            entityLiving.curePotionEffects(itemStack);
        }
        
        if(entityLiving instanceof ServerPlayerEntity)
        {
            ServerPlayerEntity serverplayerentity = (ServerPlayerEntity) entityLiving;
            CriteriaTriggers.CONSUME_ITEM.trigger(serverplayerentity, itemStack);
            serverplayerentity.awardStat(Stats.ITEM_USED.get(this));
        }
        
        if(entityLiving instanceof PlayerEntity && !((PlayerEntity) entityLiving).abilities.instabuild)
        {
            itemStack.shrink(1);
            ((PlayerEntity) entityLiving).inventory.placeItemBackInInventory(world, new ItemStack(Items.GLASS_BOTTLE));
        }
        
        return itemStack;
    }
}
