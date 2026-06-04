package de.cas_ual_ty.extrapotions;

import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.animal.Cow;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.alchemy.Potions;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.fml.ModContainer;
import net.neoforged.fml.common.Mod;
import net.neoforged.neoforge.common.NeoForge;
import net.neoforged.neoforge.event.brewing.RegisterBrewingRecipesEvent;
import net.neoforged.neoforge.event.entity.player.PlayerInteractEvent;

@Mod(ExtraPotions.MOD_ID)
public class ExtraPotions
{
    public static final String MOD_ID = "extrapotions";
    
    public ExtraPotions(IEventBus modEventBus, ModContainer modContainer)
    {
        NeoForge.EVENT_BUS.addListener(this::registerBrewingRecipes);
        NeoForge.EVENT_BUS.addListener(this::playerInteract);
        EPItems.register(modEventBus, modContainer);
        EPMobEffects.register(modEventBus, modContainer);
        EPPotions.register(modEventBus, modContainer);
    }
    
    private void registerBrewingRecipes(RegisterBrewingRecipesEvent event)
    {
        event.getBuilder().addMix(Potions.INVISIBILITY, Items.SPIDER_EYE, EPPotions.BLINDNESS);
        event.getBuilder().addMix(EPPotions.BLINDNESS, Items.REDSTONE, EPPotions.LONG_BLINDNESS);
        event.getBuilder().addMix(Potions.LONG_INVISIBILITY, Items.SPIDER_EYE, EPPotions.LONG_BLINDNESS);
        
        event.getBuilder().addMix(Potions.AWKWARD, Items.SLIME_BALL, EPPotions.NAUSEA);
        event.getBuilder().addMix(EPPotions.NAUSEA, Items.REDSTONE, EPPotions.LONG_NAUSEA);
        
        event.getBuilder().addMix(Potions.REGENERATION, Items.HONEY_BOTTLE, EPPotions.HEALTH_BOOST);
        event.getBuilder().addMix(EPPotions.HEALTH_BOOST, Items.REDSTONE, EPPotions.LONG_HEALTH_BOOST);
        event.getBuilder().addMix(EPPotions.HEALTH_BOOST, Items.GLOWSTONE_DUST, EPPotions.STRONG_HEALTH_BOOST);
        event.getBuilder().addMix(Potions.LONG_REGENERATION, Items.HONEY_BOTTLE, EPPotions.LONG_HEALTH_BOOST);
        event.getBuilder().addMix(Potions.STRONG_REGENERATION, Items.HONEY_BOTTLE, EPPotions.STRONG_HEALTH_BOOST);
        
        event.getBuilder().addMix(Potions.HEALING, Items.HONEY_BOTTLE, EPPotions.ABSORPTION);
        event.getBuilder().addMix(EPPotions.ABSORPTION, Items.REDSTONE, EPPotions.LONG_ABSORPTION);
        event.getBuilder().addMix(EPPotions.ABSORPTION, Items.GLOWSTONE_DUST, EPPotions.STRONG_ABSORPTION);
        event.getBuilder().addMix(Potions.STRONG_HEALING, Items.HONEY_BOTTLE, EPPotions.STRONG_ABSORPTION);
        
        event.getBuilder().addMix(Potions.THICK, Items.PRISMARINE_CRYSTALS, EPPotions.GLOWING);
        event.getBuilder().addMix(EPPotions.GLOWING, Items.REDSTONE, EPPotions.LONG_GLOWING);
        
        event.getBuilder().addMix(Potions.AWKWARD, Items.POISONOUS_POTATO, EPPotions.UNDERGROUND_EXPLORER);
        event.getBuilder().addMix(EPPotions.UNDERGROUND_EXPLORER, Items.REDSTONE, EPPotions.LONG_UNDERGROUND_EXPLORER);
        event.getBuilder().addMix(EPPotions.UNDERGROUND_EXPLORER, Items.GLOWSTONE_DUST, EPPotions.STRONG_UNDERGROUND_EXPLORER);
        
        event.getBuilder().addMix(Potions.AWKWARD, Items.TURTLE_EGG, EPPotions.RESISTANCE);
        event.getBuilder().addMix(EPPotions.RESISTANCE, Items.REDSTONE, EPPotions.LONG_RESISTANCE);
        event.getBuilder().addMix(EPPotions.RESISTANCE, Items.GLOWSTONE_DUST, EPPotions.STRONG_RESISTANCE);
        
        event.getBuilder().addMix(Potions.AWKWARD, Items.CHAIN, EPPotions.IRON_SKIN);
        event.getBuilder().addMix(EPPotions.IRON_SKIN, Items.REDSTONE, EPPotions.LONG_IRON_SKIN);
        event.getBuilder().addMix(EPPotions.IRON_SKIN, Items.GLOWSTONE_DUST, EPPotions.STRONG_IRON_SKIN);
        
        event.getBuilder().addMix(Potions.SWIFTNESS, Items.FEATHER, EPPotions.SWIFT_TRAVELLER);
        event.getBuilder().addMix(EPPotions.SWIFT_TRAVELLER, Items.REDSTONE, EPPotions.LONG_SWIFT_TRAVELLER);
        event.getBuilder().addMix(EPPotions.SWIFT_TRAVELLER, Items.GLOWSTONE_DUST, EPPotions.STRONG_SWIFT_TRAVELLER);
        event.getBuilder().addMix(Potions.LONG_SWIFTNESS, Items.FEATHER, EPPotions.LONG_SWIFT_TRAVELLER);
        event.getBuilder().addMix(Potions.STRONG_SWIFTNESS, Items.FEATHER, EPPotions.STRONG_SWIFT_TRAVELLER);
        
        event.getBuilder().addMix(Potions.REGENERATION, Items.APPLE, EPPotions.PRETENTIOUS_PARTISAN);
        event.getBuilder().addMix(EPPotions.PRETENTIOUS_PARTISAN, Items.REDSTONE, EPPotions.LONG_PRETENTIOUS_PARTISAN);
        event.getBuilder().addMix(EPPotions.PRETENTIOUS_PARTISAN, Items.GLOWSTONE_DUST, EPPotions.STRONG_PRETENTIOUS_PARTISAN);
        event.getBuilder().addMix(Potions.LONG_REGENERATION, Items.APPLE, EPPotions.LONG_PRETENTIOUS_PARTISAN);
        event.getBuilder().addMix(Potions.STRONG_REGENERATION, Items.APPLE, EPPotions.STRONG_PRETENTIOUS_PARTISAN);
        
        event.getBuilder().addMix(Potions.SWIFTNESS, Items.RABBIT_FOOT, EPPotions.ANCIENT_PENTATHLETE);
        event.getBuilder().addMix(Potions.LEAPING, Items.SUGAR, EPPotions.ANCIENT_PENTATHLETE);
        event.getBuilder().addMix(EPPotions.ANCIENT_PENTATHLETE, Items.REDSTONE, EPPotions.LONG_ANCIENT_PENTATHLETE);
        event.getBuilder().addMix(EPPotions.ANCIENT_PENTATHLETE, Items.GLOWSTONE_DUST, EPPotions.STRONG_ANCIENT_PENTATHLETE);
        event.getBuilder().addMix(Potions.LONG_SWIFTNESS, Items.RABBIT_FOOT, EPPotions.LONG_ANCIENT_PENTATHLETE);
        event.getBuilder().addMix(Potions.STRONG_SWIFTNESS, Items.RABBIT_FOOT, EPPotions.STRONG_ANCIENT_PENTATHLETE);
        event.getBuilder().addMix(Potions.LONG_LEAPING, Items.SUGAR, EPPotions.LONG_ANCIENT_PENTATHLETE);
        event.getBuilder().addMix(Potions.STRONG_LEAPING, Items.SUGAR, EPPotions.STRONG_ANCIENT_PENTATHLETE);
        
        event.getBuilder().addMix(Potions.POISON, Items.BONE, EPPotions.WITHER);
        event.getBuilder().addMix(EPPotions.WITHER, Items.REDSTONE, EPPotions.LONG_WITHER);
        event.getBuilder().addMix(EPPotions.WITHER, Items.GLOWSTONE_DUST, EPPotions.STRONG_WITHER);
        event.getBuilder().addMix(Potions.LONG_POISON, Items.BONE, EPPotions.LONG_WITHER);
        event.getBuilder().addMix(Potions.STRONG_POISON, Items.BONE, EPPotions.STRONG_WITHER);
        
        event.getBuilder().addMix(EPPotions.HEALTH_BOOST, Items.BONE, EPPotions.HUNGRY_GIANT);
        event.getBuilder().addMix(EPPotions.HUNGRY_GIANT, Items.REDSTONE, EPPotions.LONG_HUNGRY_GIANT);
        event.getBuilder().addMix(EPPotions.HUNGRY_GIANT, Items.GLOWSTONE_DUST, EPPotions.STRONG_HUNGRY_GIANT);
        event.getBuilder().addMix(EPPotions.LONG_HEALTH_BOOST, Items.BONE, EPPotions.LONG_HUNGRY_GIANT);
        event.getBuilder().addMix(EPPotions.STRONG_HEALTH_BOOST, Items.BONE, EPPotions.STRONG_HUNGRY_GIANT);
        
        event.getBuilder().addMix(EPPotions.BLINDNESS, Items.BLAZE_POWDER, EPPotions.HEAD_MONK);
        event.getBuilder().addMix(EPPotions.HEAD_MONK, Items.REDSTONE, EPPotions.LONG_HEAD_MONK);
        event.getBuilder().addMix(EPPotions.HEAD_MONK, Items.GLOWSTONE_DUST, EPPotions.STRONG_HEAD_MONK);
        event.getBuilder().addMix(EPPotions.LONG_BLINDNESS, Items.BLAZE_POWDER, EPPotions.LONG_HEAD_MONK);
    }
    
    private void playerInteract(PlayerInteractEvent.EntityInteract event)
    {
        if(!event.getLevel().isClientSide && event.getTarget().getType() == EntityType.COW && event.getTarget() instanceof Cow cow && !cow.isBaby() && event.getEntity().getItemInHand(event.getHand()).getItem() == Items.GLASS_BOTTLE)
        {
            event.getEntity().getInventory().placeItemBackInInventory(new ItemStack(EPItems.MILK_BOTTLE.get()));
            
            if(!event.getEntity().getAbilities().instabuild)
            {
                event.getEntity().getItemInHand(event.getHand()).shrink(1);
            }
        }
    }
}
