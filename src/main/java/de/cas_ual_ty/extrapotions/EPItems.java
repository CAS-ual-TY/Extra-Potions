package de.cas_ual_ty.extrapotions;

import net.minecraft.world.item.CreativeModeTabs;
import net.minecraft.world.item.Item;
import net.minecraftforge.event.BuildCreativeModeTabContentsEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class EPItems
{
    private static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, ExtraPotions.MOD_ID);
    
    public static final RegistryObject<Item> MILK_BOTTLE = ITEMS.register("milk_bottle", () -> new MilkBottleItem(new Item.Properties().stacksTo(16)));
    
    public static void register()
    {
        ITEMS.register(FMLJavaModLoadingContext.get().getModEventBus());
        FMLJavaModLoadingContext.get().getModEventBus().addListener(EPItems::creativeModeTabs);
    }
    
    private static void creativeModeTabs(BuildCreativeModeTabContentsEvent event)
    {
        if(event.getTabKey() == CreativeModeTabs.FOOD_AND_DRINKS)
        {
            event.accept(MILK_BOTTLE);
        }
    }
}
