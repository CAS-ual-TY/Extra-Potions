package de.cas_ual_ty.extrapotions;

import net.minecraft.advancements.CriteriaTriggers;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.stats.Stats;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.MilkBucketItem;
import net.minecraft.world.level.Level;

public class MilkBottleItem extends MilkBucketItem
{
    public MilkBottleItem(Item.Properties builder)
    {
        super(builder);
    }
    
    @Override
    public ItemStack finishUsingItem(ItemStack itemStack, Level level, LivingEntity entityLiving)
    {
        ItemStack fakeMilk = new ItemStack(Items.MILK_BUCKET);
        
        if(!level.isClientSide)
        {
            entityLiving.curePotionEffects(fakeMilk);
        }
        
        if(entityLiving instanceof ServerPlayer serverPlayer)
        {
            CriteriaTriggers.CONSUME_ITEM.trigger(serverPlayer, itemStack);
            serverPlayer.awardStat(Stats.ITEM_USED.get(this));
        }
        
        if(entityLiving instanceof Player player && !player.getAbilities().instabuild)
        {
            itemStack.shrink(1);
            player.getInventory().placeItemBackInInventory(new ItemStack(Items.GLASS_BOTTLE));
        }
        
        return itemStack;
    }
}
