package de.cas_ual_ty.extrapotions;

import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.animal.Cow;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.alchemy.PotionBrewing;
import net.minecraft.world.item.alchemy.Potions;
import net.minecraftforge.common.MinecraftForge;
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
        EPItems.register();
        EPMobEffects.register();
        EPPotions.register();
    }
    
    private void setup(FMLCommonSetupEvent event)
    {
        PotionBrewing.addMix(Potions.INVISIBILITY, Items.SPIDER_EYE, EPPotions.BLINDNESS.get());
        PotionBrewing.addMix(EPPotions.BLINDNESS.get(), Items.REDSTONE, EPPotions.LONG_BLINDNESS.get());
        PotionBrewing.addMix(Potions.LONG_INVISIBILITY, Items.SPIDER_EYE, EPPotions.LONG_BLINDNESS.get());
        
        PotionBrewing.addMix(Potions.AWKWARD, Items.SLIME_BALL, EPPotions.NAUSEA.get());
        PotionBrewing.addMix(EPPotions.NAUSEA.get(), Items.REDSTONE, EPPotions.LONG_NAUSEA.get());
        
        PotionBrewing.addMix(Potions.REGENERATION, Items.HONEY_BOTTLE, EPPotions.HEALTH_BOOST.get());
        PotionBrewing.addMix(EPPotions.HEALTH_BOOST.get(), Items.REDSTONE, EPPotions.LONG_HEALTH_BOOST.get());
        PotionBrewing.addMix(EPPotions.HEALTH_BOOST.get(), Items.GLOWSTONE_DUST, EPPotions.STRONG_HEALTH_BOOST.get());
        PotionBrewing.addMix(Potions.LONG_REGENERATION, Items.HONEY_BOTTLE, EPPotions.LONG_HEALTH_BOOST.get());
        PotionBrewing.addMix(Potions.STRONG_REGENERATION, Items.HONEY_BOTTLE, EPPotions.STRONG_HEALTH_BOOST.get());
        
        PotionBrewing.addMix(Potions.HEALING, Items.HONEY_BOTTLE, EPPotions.ABSORPTION.get());
        PotionBrewing.addMix(EPPotions.ABSORPTION.get(), Items.REDSTONE, EPPotions.LONG_ABSORPTION.get());
        PotionBrewing.addMix(EPPotions.ABSORPTION.get(), Items.GLOWSTONE_DUST, EPPotions.STRONG_ABSORPTION.get());
        PotionBrewing.addMix(Potions.STRONG_HEALING, Items.HONEY_BOTTLE, EPPotions.STRONG_ABSORPTION.get());
        
        PotionBrewing.addMix(Potions.THICK, Items.PRISMARINE_CRYSTALS, EPPotions.GLOWING.get());
        PotionBrewing.addMix(EPPotions.GLOWING.get(), Items.REDSTONE, EPPotions.LONG_GLOWING.get());
        
        PotionBrewing.addMix(Potions.AWKWARD, Items.POISONOUS_POTATO, EPPotions.UNDERGROUND_EXPLORER.get());
        PotionBrewing.addMix(EPPotions.UNDERGROUND_EXPLORER.get(), Items.REDSTONE, EPPotions.LONG_UNDERGROUND_EXPLORER.get());
        PotionBrewing.addMix(EPPotions.UNDERGROUND_EXPLORER.get(), Items.GLOWSTONE_DUST, EPPotions.STRONG_UNDERGROUND_EXPLORER.get());
        
        PotionBrewing.addMix(Potions.AWKWARD, Items.TURTLE_EGG, EPPotions.RESISTANCE.get());
        PotionBrewing.addMix(EPPotions.RESISTANCE.get(), Items.REDSTONE, EPPotions.LONG_RESISTANCE.get());
        PotionBrewing.addMix(EPPotions.RESISTANCE.get(), Items.GLOWSTONE_DUST, EPPotions.STRONG_RESISTANCE.get());
        
        PotionBrewing.addMix(Potions.AWKWARD, Items.CHAIN, EPPotions.IRON_SKIN.get());
        PotionBrewing.addMix(EPPotions.IRON_SKIN.get(), Items.REDSTONE, EPPotions.LONG_IRON_SKIN.get());
        PotionBrewing.addMix(EPPotions.IRON_SKIN.get(), Items.GLOWSTONE_DUST, EPPotions.STRONG_IRON_SKIN.get());
        
        PotionBrewing.addMix(Potions.SWIFTNESS, Items.FEATHER, EPPotions.SWIFT_TRAVELLER.get());
        PotionBrewing.addMix(EPPotions.SWIFT_TRAVELLER.get(), Items.REDSTONE, EPPotions.LONG_SWIFT_TRAVELLER.get());
        PotionBrewing.addMix(EPPotions.SWIFT_TRAVELLER.get(), Items.GLOWSTONE_DUST, EPPotions.STRONG_SWIFT_TRAVELLER.get());
        PotionBrewing.addMix(Potions.LONG_SWIFTNESS, Items.FEATHER, EPPotions.LONG_SWIFT_TRAVELLER.get());
        PotionBrewing.addMix(Potions.STRONG_SWIFTNESS, Items.FEATHER, EPPotions.STRONG_SWIFT_TRAVELLER.get());
        
        PotionBrewing.addMix(Potions.REGENERATION, Items.APPLE, EPPotions.PRETENTIOUS_PARTISAN.get());
        PotionBrewing.addMix(EPPotions.PRETENTIOUS_PARTISAN.get(), Items.REDSTONE, EPPotions.LONG_PRETENTIOUS_PARTISAN.get());
        PotionBrewing.addMix(EPPotions.PRETENTIOUS_PARTISAN.get(), Items.GLOWSTONE_DUST, EPPotions.STRONG_PRETENTIOUS_PARTISAN.get());
        PotionBrewing.addMix(Potions.LONG_REGENERATION, Items.APPLE, EPPotions.LONG_PRETENTIOUS_PARTISAN.get());
        PotionBrewing.addMix(Potions.STRONG_REGENERATION, Items.APPLE, EPPotions.STRONG_PRETENTIOUS_PARTISAN.get());
        
        PotionBrewing.addMix(Potions.SWIFTNESS, Items.RABBIT_FOOT, EPPotions.ANCIENT_PENTATHLETE.get());
        PotionBrewing.addMix(Potions.LEAPING, Items.SUGAR, EPPotions.ANCIENT_PENTATHLETE.get());
        PotionBrewing.addMix(EPPotions.ANCIENT_PENTATHLETE.get(), Items.REDSTONE, EPPotions.LONG_ANCIENT_PENTATHLETE.get());
        PotionBrewing.addMix(EPPotions.ANCIENT_PENTATHLETE.get(), Items.GLOWSTONE_DUST, EPPotions.STRONG_ANCIENT_PENTATHLETE.get());
        PotionBrewing.addMix(Potions.LONG_SWIFTNESS, Items.RABBIT_FOOT, EPPotions.LONG_ANCIENT_PENTATHLETE.get());
        PotionBrewing.addMix(Potions.STRONG_SWIFTNESS, Items.RABBIT_FOOT, EPPotions.STRONG_ANCIENT_PENTATHLETE.get());
        PotionBrewing.addMix(Potions.LONG_LEAPING, Items.SUGAR, EPPotions.LONG_ANCIENT_PENTATHLETE.get());
        PotionBrewing.addMix(Potions.STRONG_LEAPING, Items.SUGAR, EPPotions.STRONG_ANCIENT_PENTATHLETE.get());
        
        PotionBrewing.addMix(Potions.POISON, Items.BONE, EPPotions.WITHER.get());
        PotionBrewing.addMix(EPPotions.WITHER.get(), Items.REDSTONE, EPPotions.LONG_WITHER.get());
        PotionBrewing.addMix(EPPotions.WITHER.get(), Items.GLOWSTONE_DUST, EPPotions.STRONG_WITHER.get());
        PotionBrewing.addMix(Potions.LONG_POISON, Items.BONE, EPPotions.LONG_WITHER.get());
        PotionBrewing.addMix(Potions.STRONG_POISON, Items.BONE, EPPotions.STRONG_WITHER.get());
        
        PotionBrewing.addMix(EPPotions.HEALTH_BOOST.get(), Items.BONE, EPPotions.HUNGRY_GIANT.get());
        PotionBrewing.addMix(EPPotions.HUNGRY_GIANT.get(), Items.REDSTONE, EPPotions.LONG_HUNGRY_GIANT.get());
        PotionBrewing.addMix(EPPotions.HUNGRY_GIANT.get(), Items.GLOWSTONE_DUST, EPPotions.STRONG_HUNGRY_GIANT.get());
        PotionBrewing.addMix(EPPotions.LONG_HEALTH_BOOST.get(), Items.BONE, EPPotions.LONG_HUNGRY_GIANT.get());
        PotionBrewing.addMix(EPPotions.STRONG_HEALTH_BOOST.get(), Items.BONE, EPPotions.STRONG_HUNGRY_GIANT.get());
        
        PotionBrewing.addMix(EPPotions.BLINDNESS.get(), Items.BLAZE_POWDER, EPPotions.HEAD_MONK.get());
        PotionBrewing.addMix(EPPotions.HEAD_MONK.get(), Items.REDSTONE, EPPotions.LONG_HEAD_MONK.get());
        PotionBrewing.addMix(EPPotions.HEAD_MONK.get(), Items.GLOWSTONE_DUST, EPPotions.STRONG_HEAD_MONK.get());
        PotionBrewing.addMix(EPPotions.LONG_BLINDNESS.get(), Items.BLAZE_POWDER, EPPotions.LONG_HEAD_MONK.get());
    }
    
    private void playerInteract(PlayerInteractEvent.EntityInteract event)
    {
        if(!event.getWorld().isClientSide && event.getTarget().getType() == EntityType.COW && event.getTarget() instanceof Cow cow && !cow.isBaby() && event.getPlayer().getItemInHand(event.getHand()).getItem() == Items.GLASS_BOTTLE)
        {
            event.getPlayer().getInventory().placeItemBackInInventory(new ItemStack(EPItems.MILK_BOTTLE.get()));
            
            if(!event.getPlayer().getAbilities().instabuild)
            {
                event.getPlayer().getItemInHand(event.getHand()).shrink(1);
            }
        }
    }
}
