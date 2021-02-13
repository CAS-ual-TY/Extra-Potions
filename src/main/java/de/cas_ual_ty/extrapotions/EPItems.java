package de.cas_ual_ty.extrapotions;

import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber;
import net.minecraftforge.registries.ObjectHolder;

@EventBusSubscriber(modid = ExtraPotions.MOD_ID, bus = EventBusSubscriber.Bus.MOD)
@ObjectHolder(ExtraPotions.MOD_ID)
public class EPItems
{
    public static final Item MILK_BOTTLE = null;
    
    @SubscribeEvent
    public static void register(RegistryEvent.Register<Item> event)
    {
        event.getRegistry().register(new MilkBottleItem(new Item.Properties().group(ItemGroup.BREWING).maxStackSize(16)).setRegistryName(ExtraPotions.MOD_ID, "milk_bottle"));
    }
}
