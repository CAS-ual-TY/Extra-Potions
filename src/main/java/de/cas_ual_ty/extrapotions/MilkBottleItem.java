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
    public ItemStack onItemUseFinish(ItemStack stack, World worldIn, LivingEntity entityLiving)
    {
        ItemStack milkFake = new ItemStack(Items.MILK_BUCKET);
        
        if(!worldIn.isRemote)
        {
            entityLiving.curePotionEffects(milkFake);
        }
        
        if(entityLiving instanceof ServerPlayerEntity)
        {
            ServerPlayerEntity serverplayerentity = (ServerPlayerEntity)entityLiving;
            CriteriaTriggers.CONSUME_ITEM.trigger(serverplayerentity, stack);
            serverplayerentity.addStat(Stats.ITEM_USED.get(this));
        }
        
        if(entityLiving instanceof PlayerEntity && !((PlayerEntity)entityLiving).abilities.isCreativeMode)
        {
            stack.shrink(1);
            ((PlayerEntity)entityLiving).inventory.placeItemBackInInventory(worldIn, new ItemStack(Items.GLASS_BOTTLE));
        }
        
        return stack;
    }
}
