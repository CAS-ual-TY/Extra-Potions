package de.cas_ual_ty.extrapotions;

import net.minecraft.entity.EntityType;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.passive.CowEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.potion.Potions;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.common.brewing.BrewingRecipeRegistry;
import net.minecraftforge.event.entity.player.PlayerInteractEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

@Mod(ExtraPotions.MOD_ID)
public class ExtraPotions
{
    public static final String MOD_ID = "extrapotions";
    
    public ExtraPotions()
    {
        FMLJavaModLoadingContext.get().getModEventBus().addListener(this::setup);
        MinecraftForge.EVENT_BUS.addListener(this::playerInteract);
    }
    
    private void setup(FMLCommonSetupEvent event)
    {
        BrewingRecipeRegistry.addRecipe(new EPBrewingRecipe(Potions.INVISIBILITY, Items.SPIDER_EYE, EPPotions.BLINDNESS));
        BrewingRecipeRegistry.addRecipe(new EPBrewingRecipe(EPPotions.BLINDNESS, Items.REDSTONE, EPPotions.LONG_BLINDNESS));
        BrewingRecipeRegistry.addRecipe(new EPBrewingRecipe(Potions.LONG_INVISIBILITY, Items.SPIDER_EYE, EPPotions.LONG_BLINDNESS));
        
        BrewingRecipeRegistry.addRecipe(new EPBrewingRecipe(Potions.AWKWARD, Items.SLIME_BALL, EPPotions.NAUSEA));
        BrewingRecipeRegistry.addRecipe(new EPBrewingRecipe(EPPotions.NAUSEA, Items.REDSTONE, EPPotions.LONG_NAUSEA));
        
        BrewingRecipeRegistry.addRecipe(new EPBrewingRecipe(Potions.REGENERATION, Items.HONEY_BOTTLE, EPPotions.HEALTH_BOOST));
        BrewingRecipeRegistry.addRecipe(new EPBrewingRecipe(EPPotions.HEALTH_BOOST, Items.REDSTONE, EPPotions.LONG_HEALTH_BOOST));
        BrewingRecipeRegistry.addRecipe(new EPBrewingRecipe(EPPotions.HEALTH_BOOST, Items.GLOWSTONE_DUST, EPPotions.STRONG_HEALTH_BOOST));
        BrewingRecipeRegistry.addRecipe(new EPBrewingRecipe(Potions.LONG_REGENERATION, Items.HONEY_BOTTLE, EPPotions.LONG_HEALTH_BOOST));
        BrewingRecipeRegistry.addRecipe(new EPBrewingRecipe(Potions.STRONG_REGENERATION, Items.HONEY_BOTTLE, EPPotions.STRONG_HEALTH_BOOST));
        
        BrewingRecipeRegistry.addRecipe(new EPBrewingRecipe(Potions.HEALING, Items.BONE, EPPotions.ABSORPTION));
        BrewingRecipeRegistry.addRecipe(new EPBrewingRecipe(EPPotions.ABSORPTION, Items.REDSTONE, EPPotions.LONG_ABSORPTION));
        BrewingRecipeRegistry.addRecipe(new EPBrewingRecipe(EPPotions.ABSORPTION, Items.GLOWSTONE_DUST, EPPotions.STRONG_ABSORPTION));
        BrewingRecipeRegistry.addRecipe(new EPBrewingRecipe(Potions.STRONG_HEALING, Items.BONE, EPPotions.STRONG_ABSORPTION));
        
        BrewingRecipeRegistry.addRecipe(new EPBrewingRecipe(Potions.THICK, Items.PRISMARINE_CRYSTALS, EPPotions.GLOWING));
        BrewingRecipeRegistry.addRecipe(new EPBrewingRecipe(EPPotions.GLOWING, Items.REDSTONE, EPPotions.LONG_GLOWING));
        
        BrewingRecipeRegistry.addRecipe(new EPBrewingRecipe(Potions.AWKWARD, Items.POISONOUS_POTATO, EPPotions.UNDERGROUND_EXPLORER));
        BrewingRecipeRegistry.addRecipe(new EPBrewingRecipe(EPPotions.UNDERGROUND_EXPLORER, Items.REDSTONE, EPPotions.LONG_UNDERGROUND_EXPLORER));
        BrewingRecipeRegistry.addRecipe(new EPBrewingRecipe(EPPotions.UNDERGROUND_EXPLORER, Items.GLOWSTONE_DUST, EPPotions.STRONG_UNDERGROUND_EXPLORER));
        
        BrewingRecipeRegistry.addRecipe(new EPBrewingRecipe(Potions.AWKWARD, Items.TURTLE_EGG, EPPotions.RESISTANCE));
        BrewingRecipeRegistry.addRecipe(new EPBrewingRecipe(EPPotions.RESISTANCE, Items.REDSTONE, EPPotions.LONG_RESISTANCE));
        BrewingRecipeRegistry.addRecipe(new EPBrewingRecipe(EPPotions.RESISTANCE, Items.GLOWSTONE_DUST, EPPotions.STRONG_RESISTANCE));
        
        BrewingRecipeRegistry.addRecipe(new EPBrewingRecipe(Potions.AWKWARD, Items.CHAIN, EPPotions.IRON_SKIN));
        BrewingRecipeRegistry.addRecipe(new EPBrewingRecipe(EPPotions.IRON_SKIN, Items.REDSTONE, EPPotions.LONG_IRON_SKIN));
        BrewingRecipeRegistry.addRecipe(new EPBrewingRecipe(EPPotions.IRON_SKIN, Items.GLOWSTONE_DUST, EPPotions.STRONG_IRON_SKIN));
        
        BrewingRecipeRegistry.addRecipe(new EPBrewingRecipe(Potions.SWIFTNESS, Items.FEATHER, EPPotions.SWIFT_TRAVELLER));
        BrewingRecipeRegistry.addRecipe(new EPBrewingRecipe(EPPotions.SWIFT_TRAVELLER, Items.REDSTONE, EPPotions.LONG_SWIFT_TRAVELLER));
        BrewingRecipeRegistry.addRecipe(new EPBrewingRecipe(EPPotions.SWIFT_TRAVELLER, Items.GLOWSTONE_DUST, EPPotions.STRONG_SWIFT_TRAVELLER));
        BrewingRecipeRegistry.addRecipe(new EPBrewingRecipe(Potions.LONG_SWIFTNESS, Items.FEATHER, EPPotions.LONG_SWIFT_TRAVELLER));
        BrewingRecipeRegistry.addRecipe(new EPBrewingRecipe(Potions.STRONG_SWIFTNESS, Items.FEATHER, EPPotions.STRONG_SWIFT_TRAVELLER));
        
        BrewingRecipeRegistry.addRecipe(new EPBrewingRecipe(Potions.REGENERATION, Items.APPLE, EPPotions.PRETENTIOUS_PARTISAN));
        BrewingRecipeRegistry.addRecipe(new EPBrewingRecipe(EPPotions.PRETENTIOUS_PARTISAN, Items.REDSTONE, EPPotions.LONG_PRETENTIOUS_PARTISAN));
        BrewingRecipeRegistry.addRecipe(new EPBrewingRecipe(EPPotions.PRETENTIOUS_PARTISAN, Items.GLOWSTONE_DUST, EPPotions.STRONG_PRETENTIOUS_PARTISAN));
        BrewingRecipeRegistry.addRecipe(new EPBrewingRecipe(Potions.LONG_REGENERATION, Items.APPLE, EPPotions.LONG_PRETENTIOUS_PARTISAN));
        BrewingRecipeRegistry.addRecipe(new EPBrewingRecipe(Potions.STRONG_REGENERATION, Items.APPLE, EPPotions.STRONG_PRETENTIOUS_PARTISAN));
        
        BrewingRecipeRegistry.addRecipe(new EPBrewingRecipe(Potions.SWIFTNESS, Items.RABBIT_FOOT, EPPotions.ANCIENT_PENTATHLETE));
        BrewingRecipeRegistry.addRecipe(new EPBrewingRecipe(Potions.LEAPING, Items.SUGAR, EPPotions.ANCIENT_PENTATHLETE));
        BrewingRecipeRegistry.addRecipe(new EPBrewingRecipe(EPPotions.ANCIENT_PENTATHLETE, Items.REDSTONE, EPPotions.LONG_ANCIENT_PENTATHLETE));
        BrewingRecipeRegistry.addRecipe(new EPBrewingRecipe(EPPotions.ANCIENT_PENTATHLETE, Items.GLOWSTONE_DUST, EPPotions.STRONG_ANCIENT_PENTATHLETE));
        BrewingRecipeRegistry.addRecipe(new EPBrewingRecipe(Potions.LONG_SWIFTNESS, Items.RABBIT_FOOT, EPPotions.LONG_ANCIENT_PENTATHLETE));
        BrewingRecipeRegistry.addRecipe(new EPBrewingRecipe(Potions.STRONG_SWIFTNESS, Items.RABBIT_FOOT, EPPotions.STRONG_ANCIENT_PENTATHLETE));
        BrewingRecipeRegistry.addRecipe(new EPBrewingRecipe(Potions.LONG_LEAPING, Items.SUGAR, EPPotions.LONG_ANCIENT_PENTATHLETE));
        BrewingRecipeRegistry.addRecipe(new EPBrewingRecipe(Potions.STRONG_LEAPING, Items.SUGAR, EPPotions.STRONG_ANCIENT_PENTATHLETE));
        
        BrewingRecipeRegistry.addRecipe(new EPBrewingRecipe(Potions.POISON, Items.BONE, EPPotions.WITHER));
        BrewingRecipeRegistry.addRecipe(new EPBrewingRecipe(EPPotions.WITHER, Items.REDSTONE, EPPotions.LONG_WITHER));
        BrewingRecipeRegistry.addRecipe(new EPBrewingRecipe(EPPotions.WITHER, Items.GLOWSTONE_DUST, EPPotions.STRONG_WITHER));
        BrewingRecipeRegistry.addRecipe(new EPBrewingRecipe(Potions.LONG_POISON, Items.BONE, EPPotions.LONG_WITHER));
        BrewingRecipeRegistry.addRecipe(new EPBrewingRecipe(Potions.STRONG_POISON, Items.BONE, EPPotions.STRONG_WITHER));
    }
    
    private void playerInteract(PlayerInteractEvent.EntityInteract event)
    {
        if(!event.getWorld().isRemote && event.getTarget().getType() == EntityType.COW && event.getTarget() instanceof CowEntity && !((LivingEntity)event.getTarget()).isChild() && event.getPlayer().getHeldItem(event.getHand()).getItem() == Items.GLASS_BOTTLE)
        {
            event.getPlayer().inventory.placeItemBackInInventory(event.getWorld(), new ItemStack(EPItems.MILK_BOTTLE));
            
            if(!event.getPlayer().abilities.isCreativeMode)
            {
                event.getPlayer().getHeldItem(event.getHand()).shrink(1);
            }
        }
    }
}
