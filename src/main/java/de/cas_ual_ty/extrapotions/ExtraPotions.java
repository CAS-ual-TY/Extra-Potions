package de.cas_ual_ty.extrapotions;

import net.minecraft.entity.EntityType;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.passive.CowEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.potion.Potions;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.common.brewing.BrewingRecipeRegistry;
import net.minecraft.potion.PotionBrewing;
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

        PotionBrewing.addMix(Potions.INVISIBILITY, Items.SPIDER_EYE, EPPotions.BLINDNESS);
        PotionBrewing.addMix(EPPotions.BLINDNESS, Items.REDSTONE, EPPotions.LONG_BLINDNESS);
        PotionBrewing.addMix(Potions.LONG_INVISIBILITY, Items.SPIDER_EYE, EPPotions.LONG_BLINDNESS);

        PotionBrewing.addMix(Potions.INVISIBILITY, Items.SPIDER_EYE, EPPotions.BLINDNESS);
        PotionBrewing.addMix(EPPotions.BLINDNESS, Items.REDSTONE, EPPotions.LONG_BLINDNESS);
        PotionBrewing.addMix(Potions.LONG_INVISIBILITY, Items.SPIDER_EYE, EPPotions.LONG_BLINDNESS);

        PotionBrewing.addMix(Potions.SLOW_FALLING, Items.SPIDER_EYE, EPPotions.LEVITATION);
        PotionBrewing.addMix(Potions.LONG_SLOW_FALLING, Items.SPIDER_EYE, EPPotions.LONG_LEVITATION);

        PotionBrewing.addMix(Potions.AWKWARD, Items.SLIME_BALL, EPPotions.NAUSEA);
        PotionBrewing.addMix(EPPotions.NAUSEA, Items.REDSTONE, EPPotions.LONG_NAUSEA);

        PotionBrewing.addMix(Potions.REGENERATION, Items.HONEY_BOTTLE, EPPotions.HEALTH_BOOST);
        PotionBrewing.addMix(EPPotions.HEALTH_BOOST, Items.REDSTONE, EPPotions.LONG_HEALTH_BOOST);
        PotionBrewing.addMix(EPPotions.HEALTH_BOOST, Items.GLOWSTONE_DUST, EPPotions.STRONG_HEALTH_BOOST);
        PotionBrewing.addMix(Potions.LONG_REGENERATION, Items.HONEY_BOTTLE, EPPotions.LONG_HEALTH_BOOST);

        PotionBrewing.addMix(Potions.STRONG_REGENERATION, Items.HONEY_BOTTLE, EPPotions.STRONG_HEALTH_BOOST);

        PotionBrewing.addMix(Potions.HEALING, Items.HONEY_BOTTLE, EPPotions.ABSORPTION);
        PotionBrewing.addMix(EPPotions.ABSORPTION, Items.REDSTONE, EPPotions.LONG_ABSORPTION);
        PotionBrewing.addMix(EPPotions.ABSORPTION, Items.GLOWSTONE_DUST, EPPotions.STRONG_ABSORPTION);
        PotionBrewing.addMix(Potions.STRONG_HEALING, Items.HONEY_BOTTLE, EPPotions.STRONG_ABSORPTION);

        PotionBrewing.addMix(Potions.HEALING, Items.HONEY_BOTTLE, EPPotions.ABSORPTION);
        PotionBrewing.addMix(EPPotions.ABSORPTION, Items.REDSTONE, EPPotions.LONG_ABSORPTION);
        PotionBrewing.addMix(EPPotions.ABSORPTION, Items.GLOWSTONE_DUST, EPPotions.STRONG_ABSORPTION);
        PotionBrewing.addMix(Potions.STRONG_HEALING, Items.HONEY_BOTTLE, EPPotions.STRONG_ABSORPTION);

        PotionBrewing.addMix(Potions.THICK, Items.PRISMARINE_CRYSTALS, EPPotions.GLOWING);
        PotionBrewing.addMix(EPPotions.GLOWING, Items.REDSTONE, EPPotions.LONG_GLOWING);

        PotionBrewing.addMix(Potions.AWKWARD, Items.POISONOUS_POTATO, EPPotions.UNDERGROUND_EXPLORER);
        PotionBrewing.addMix(EPPotions.UNDERGROUND_EXPLORER, Items.REDSTONE, EPPotions.LONG_UNDERGROUND_EXPLORER);
        PotionBrewing.addMix(EPPotions.UNDERGROUND_EXPLORER, Items.GLOWSTONE_DUST, EPPotions.STRONG_UNDERGROUND_EXPLORER);

        PotionBrewing.addMix(Potions.AWKWARD, Items.TURTLE_EGG, EPPotions.RESISTANCE);
        PotionBrewing.addMix(EPPotions.RESISTANCE, Items.REDSTONE, EPPotions.LONG_RESISTANCE);
        PotionBrewing.addMix(EPPotions.RESISTANCE, Items.GLOWSTONE_DUST, EPPotions.STRONG_RESISTANCE);

        PotionBrewing.addMix(Potions.AWKWARD, Items.CHAIN, EPPotions.IRON_SKIN);
        PotionBrewing.addMix(EPPotions.IRON_SKIN, Items.REDSTONE, EPPotions.LONG_IRON_SKIN);
        PotionBrewing.addMix(EPPotions.IRON_SKIN, Items.GLOWSTONE_DUST, EPPotions.STRONG_IRON_SKIN);

        PotionBrewing.addMix(Potions.SWIFTNESS, Items.FEATHER, EPPotions.SWIFT_TRAVELLER);
        PotionBrewing.addMix(EPPotions.SWIFT_TRAVELLER, Items.REDSTONE, EPPotions.LONG_SWIFT_TRAVELLER);
        PotionBrewing.addMix(EPPotions.SWIFT_TRAVELLER, Items.GLOWSTONE_DUST, EPPotions.STRONG_SWIFT_TRAVELLER);
        PotionBrewing.addMix(Potions.LONG_SWIFTNESS, Items.FEATHER, EPPotions.LONG_SWIFT_TRAVELLER);
        PotionBrewing.addMix(Potions.STRONG_SWIFTNESS, Items.FEATHER, EPPotions.STRONG_SWIFT_TRAVELLER);

        PotionBrewing.addMix(Potions.REGENERATION, Items.APPLE, EPPotions.PRETENTIOUS_PARTISAN);
        PotionBrewing.addMix(EPPotions.PRETENTIOUS_PARTISAN, Items.REDSTONE, EPPotions.LONG_PRETENTIOUS_PARTISAN);
        PotionBrewing.addMix(EPPotions.PRETENTIOUS_PARTISAN, Items.GLOWSTONE_DUST, EPPotions.STRONG_PRETENTIOUS_PARTISAN);
        PotionBrewing.addMix(Potions.LONG_REGENERATION, Items.APPLE, EPPotions.LONG_PRETENTIOUS_PARTISAN);
        PotionBrewing.addMix(Potions.STRONG_REGENERATION, Items.APPLE, EPPotions.STRONG_PRETENTIOUS_PARTISAN);

        PotionBrewing.addMix(Potions.SWIFTNESS, Items.RABBIT_FOOT, EPPotions.ANCIENT_PENTATHLETE);
        PotionBrewing.addMix(Potions.LEAPING, Items.SUGAR, EPPotions.ANCIENT_PENTATHLETE);
        PotionBrewing.addMix(EPPotions.ANCIENT_PENTATHLETE, Items.REDSTONE, EPPotions.LONG_ANCIENT_PENTATHLETE);
        PotionBrewing.addMix(EPPotions.ANCIENT_PENTATHLETE, Items.GLOWSTONE_DUST, EPPotions.STRONG_ANCIENT_PENTATHLETE);
        PotionBrewing.addMix(Potions.LONG_SWIFTNESS, Items.RABBIT_FOOT, EPPotions.LONG_ANCIENT_PENTATHLETE);
        PotionBrewing.addMix(Potions.STRONG_SWIFTNESS, Items.RABBIT_FOOT, EPPotions.STRONG_ANCIENT_PENTATHLETE);
        PotionBrewing.addMix(Potions.LONG_LEAPING, Items.SUGAR, EPPotions.LONG_ANCIENT_PENTATHLETE);
        PotionBrewing.addMix(Potions.STRONG_LEAPING, Items.SUGAR, EPPotions.STRONG_ANCIENT_PENTATHLETE);

        PotionBrewing.addMix(Potions.POISON, Items.BONE, EPPotions.WITHER);
        PotionBrewing.addMix(EPPotions.WITHER, Items.REDSTONE, EPPotions.LONG_WITHER);
        PotionBrewing.addMix(EPPotions.WITHER, Items.GLOWSTONE_DUST, EPPotions.STRONG_WITHER);
        PotionBrewing.addMix(Potions.LONG_POISON, Items.BONE, EPPotions.LONG_WITHER);
        PotionBrewing.addMix(Potions.STRONG_POISON, Items.BONE, EPPotions.STRONG_WITHER);

        PotionBrewing.addMix(EPPotions.HEALTH_BOOST, Items.BONE, EPPotions.HUNGRY_GIANT);
        PotionBrewing.addMix(EPPotions.HUNGRY_GIANT, Items.REDSTONE, EPPotions.LONG_HUNGRY_GIANT);
        PotionBrewing.addMix(EPPotions.HUNGRY_GIANT, Items.GLOWSTONE_DUST, EPPotions.STRONG_HUNGRY_GIANT);
        PotionBrewing.addMix(EPPotions.LONG_HEALTH_BOOST, Items.BONE, EPPotions.LONG_HUNGRY_GIANT);
        PotionBrewing.addMix(EPPotions.STRONG_HEALTH_BOOST, Items.BONE, EPPotions.STRONG_HUNGRY_GIANT);

        PotionBrewing.addMix(EPPotions.BLINDNESS, Items.BLAZE_POWDER, EPPotions.HEAD_MONK);
        PotionBrewing.addMix(EPPotions.HEAD_MONK, Items.REDSTONE, EPPotions.LONG_HEAD_MONK);
        PotionBrewing.addMix(EPPotions.HEAD_MONK, Items.GLOWSTONE_DUST, EPPotions.STRONG_HEAD_MONK);
        PotionBrewing.addMix(EPPotions.LONG_BLINDNESS, Items.BLAZE_POWDER, EPPotions.LONG_HEAD_MONK);
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
