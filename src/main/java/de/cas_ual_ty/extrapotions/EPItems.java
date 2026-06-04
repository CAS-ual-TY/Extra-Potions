package de.cas_ual_ty.extrapotions;

import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.world.item.CreativeModeTabs;
import net.minecraft.world.item.Item;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.fml.ModContainer;
import net.neoforged.neoforge.event.BuildCreativeModeTabContentsEvent;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.NeoForgeRegistries;

public class EPItems
{
    private static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(ExtraPotions.MOD_ID);

    public static final DeferredItem<MilkBottleItem> MILK_BOTTLE = ITEMS.register("milk_bottle", () -> new MilkBottleItem(new Item.Properties().stacksTo(16)));
    
    public static void register(IEventBus modEventBus, ModContainer modContainer)
    {
        ITEMS.register(modEventBus);
        modEventBus.addListener(EPItems::creativeModeTabs);
    }
    
    private static void creativeModeTabs(BuildCreativeModeTabContentsEvent event)
    {
        if(event.getTabKey() == CreativeModeTabs.FOOD_AND_DRINKS)
        {
            event.accept(MILK_BOTTLE);
        }
    }
}
