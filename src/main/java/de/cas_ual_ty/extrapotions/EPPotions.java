package de.cas_ual_ty.extrapotions;

import net.minecraft.potion.EffectInstance;
import net.minecraft.potion.Effects;
import net.minecraft.potion.Potion;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber;
import net.minecraftforge.registries.ObjectHolder;

@EventBusSubscriber(modid = ExtraPotions.MOD_ID, bus = EventBusSubscriber.Bus.MOD)
@ObjectHolder(ExtraPotions.MOD_ID)
public class EPPotions
{
    public static Potion BLINDNESS = null;
    public static Potion LONG_BLINDNESS = null;
    public static Potion LEVITATION = null;
    public static Potion LONG_LEVITATION = null;
    public static Potion NAUSEA = null;
    public static Potion LONG_NAUSEA = null;
    public static Potion HEALTH_BOOST = null;
    public static Potion LONG_HEALTH_BOOST = null;
    public static Potion STRONG_HEALTH_BOOST = null;
    public static Potion ABSORPTION = null;
    public static Potion LONG_ABSORPTION = null;
    public static Potion STRONG_ABSORPTION = null;
    public static Potion GLOWING = null;
    public static Potion LONG_GLOWING = null;
    public static Potion UNDERGROUND_EXPLORER = null;
    public static Potion LONG_UNDERGROUND_EXPLORER = null;
    public static Potion STRONG_UNDERGROUND_EXPLORER = null;
    public static Potion RESISTANCE = null;
    public static Potion LONG_RESISTANCE = null;
    public static Potion STRONG_RESISTANCE = null;
    public static Potion IRON_SKIN = null;
    public static Potion LONG_IRON_SKIN = null;
    public static Potion STRONG_IRON_SKIN = null;
    public static Potion SWIFT_TRAVELLER = null;
    public static Potion LONG_SWIFT_TRAVELLER = null;
    public static Potion STRONG_SWIFT_TRAVELLER = null;
    public static Potion PRETENTIOUS_PARTISAN = null;
    public static Potion LONG_PRETENTIOUS_PARTISAN = null;
    public static Potion STRONG_PRETENTIOUS_PARTISAN = null;
    public static Potion ANCIENT_PENTATHLETE = null;
    public static Potion LONG_ANCIENT_PENTATHLETE = null;
    public static Potion STRONG_ANCIENT_PENTATHLETE = null;
    public static Potion WITHER = null;
    public static Potion LONG_WITHER = null;
    public static Potion STRONG_WITHER = null;
    public static Potion HUNGRY_GIANT = null;
    public static Potion LONG_HUNGRY_GIANT = null;
    public static Potion STRONG_HUNGRY_GIANT = null;
    public static Potion HEAD_MONK = null;
    public static Potion LONG_HEAD_MONK = null;
    public static Potion STRONG_HEAD_MONK = null;

    @SubscribeEvent
    public static void register(RegistryEvent.Register<Potion> event)
    {
        event.getRegistry().register(BLINDNESS = new Potion("blindness", new EffectInstance(Effects.BLINDNESS, 900)).setRegistryName(ExtraPotions.MOD_ID, "blindness"));
        event.getRegistry().register(LONG_BLINDNESS = new Potion("blindness", new EffectInstance(Effects.BLINDNESS, 1800)).setRegistryName(ExtraPotions.MOD_ID, "long_blindness"));
        event.getRegistry().register(LEVITATION = new Potion("levitation", new EffectInstance(Effects.LEVITATION, 900)).setRegistryName(ExtraPotions.MOD_ID, "levitation"));
        event.getRegistry().register(LONG_LEVITATION = new Potion("levitation", new EffectInstance(Effects.LEVITATION, 1800)).setRegistryName(ExtraPotions.MOD_ID, "long_levitation"));
        event.getRegistry().register(NAUSEA = new Potion("nausea", new EffectInstance(Effects.NAUSEA, 900)).setRegistryName(ExtraPotions.MOD_ID, "nausea"));
        event.getRegistry().register(LONG_NAUSEA = new Potion("nausea", new EffectInstance(Effects.NAUSEA, 1800)).setRegistryName(ExtraPotions.MOD_ID, "long_nausea"));
        event.getRegistry().register(HEALTH_BOOST =  new Potion("health_boost", new EffectInstance(Effects.HEALTH_BOOST, 900)).setRegistryName(ExtraPotions.MOD_ID, "health_boost"));
        event.getRegistry().register(LONG_HEALTH_BOOST = new Potion("health_boost", new EffectInstance(Effects.HEALTH_BOOST, 1800)).setRegistryName(ExtraPotions.MOD_ID, "long_health_boost"));
        event.getRegistry().register(STRONG_HEALTH_BOOST = new Potion("health_boost", new EffectInstance(Effects.HEALTH_BOOST, 450, 1)).setRegistryName(ExtraPotions.MOD_ID, "strong_health_boost"));
        event.getRegistry().register(ABSORPTION = new Potion("absorption", new EffectInstance(Effects.ABSORPTION, 3600)).setRegistryName(ExtraPotions.MOD_ID, "absorption"));
        event.getRegistry().register(LONG_ABSORPTION = new Potion("absorption", new EffectInstance(Effects.ABSORPTION, 9600)).setRegistryName(ExtraPotions.MOD_ID, "long_absorption"));
        event.getRegistry().register(STRONG_ABSORPTION = new Potion("absorption", new EffectInstance(Effects.ABSORPTION, 1800, 1)).setRegistryName(ExtraPotions.MOD_ID, "strong_absorption"));
        event.getRegistry().register(GLOWING = new Potion("glowing", new EffectInstance(Effects.GLOWING, 1800)).setRegistryName(ExtraPotions.MOD_ID, "glowing"));
        event.getRegistry().register(LONG_GLOWING = new Potion("glowing", new EffectInstance(Effects.GLOWING, 4800)).setRegistryName(ExtraPotions.MOD_ID, "long_glowing"));
        event.getRegistry().register(UNDERGROUND_EXPLORER = new Potion("underground_explorer", new EffectInstance(Effects.HASTE, 3600, 2), new EffectInstance(Effects.SATURATION, 3600), new EffectInstance(EPEffects.HEALTH_REDUCTION, 3600, 3)).setRegistryName(ExtraPotions.MOD_ID, "underground_explorer"));
        event.getRegistry().register(LONG_UNDERGROUND_EXPLORER = new Potion("underground_explorer", new EffectInstance(Effects.HASTE, 7200, 2), new EffectInstance(Effects.SATURATION, 7200), new EffectInstance(EPEffects.HEALTH_REDUCTION, 7200, 3)).setRegistryName(ExtraPotions.MOD_ID, "long_underground_explorer"));
        event.getRegistry().register(STRONG_UNDERGROUND_EXPLORER = new Potion("underground_explorer", new EffectInstance(Effects.HASTE, 3600, 3), new EffectInstance(Effects.SATURATION, 3600), new EffectInstance(EPEffects.HEALTH_REDUCTION, 3600, 5)).setRegistryName(ExtraPotions.MOD_ID, "strong_underground_explorer"));
        event.getRegistry().register(RESISTANCE = new Potion("resistance", new EffectInstance(Effects.RESISTANCE, 3600)).setRegistryName(ExtraPotions.MOD_ID, "resistance"));
        event.getRegistry().register(LONG_RESISTANCE = new Potion("resistance", new EffectInstance(Effects.RESISTANCE, 9600)).setRegistryName(ExtraPotions.MOD_ID, "long_resistance"));
        event.getRegistry().register(STRONG_RESISTANCE = new Potion("resistance", new EffectInstance(Effects.RESISTANCE, 1800, 1)).setRegistryName(ExtraPotions.MOD_ID, "strong_resistance"));
        event.getRegistry().register(IRON_SKIN = new Potion("iron_skin", new EffectInstance(EPEffects.ARMOR, 900)).setRegistryName(ExtraPotions.MOD_ID, "iron_skin"));
        event.getRegistry().register(LONG_IRON_SKIN = new Potion("iron_skin", new EffectInstance(EPEffects.ARMOR, 1800)).setRegistryName(ExtraPotions.MOD_ID, "long_iron_skin"));
        event.getRegistry().register(STRONG_IRON_SKIN = new Potion("iron_skin", new EffectInstance(EPEffects.ARMOR, 450, 1)).setRegistryName(ExtraPotions.MOD_ID, "strong_iron_skin"));
        event.getRegistry().register(SWIFT_TRAVELLER = new Potion("swift_traveller", new EffectInstance(Effects.SPEED, 3600, 2), new EffectInstance(Effects.JUMP_BOOST, 3600, 2), new EffectInstance(Effects.WEAKNESS, 3600, 1), new EffectInstance(Effects.MINING_FATIGUE, 3600, 3)).setRegistryName(ExtraPotions.MOD_ID, "traveller"));
        event.getRegistry().register(LONG_SWIFT_TRAVELLER = new Potion("swift_traveller", new EffectInstance(Effects.SPEED, 9600, 2), new EffectInstance(Effects.JUMP_BOOST, 9600, 2), new EffectInstance(Effects.WEAKNESS, 9600, 1), new EffectInstance(Effects.MINING_FATIGUE, 9600, 3)).setRegistryName(ExtraPotions.MOD_ID, "long_traveller"));
        event.getRegistry().register(STRONG_SWIFT_TRAVELLER = new Potion("swift_traveller", new EffectInstance(Effects.SPEED, 3600, 3), new EffectInstance(Effects.JUMP_BOOST, 3600, 3), new EffectInstance(Effects.WEAKNESS, 3600, 2), new EffectInstance(Effects.MINING_FATIGUE, 3600, 5)).setRegistryName(ExtraPotions.MOD_ID, "strong_traveller"));
        event.getRegistry().register(PRETENTIOUS_PARTISAN = new Potion("pretentious_partisan", new EffectInstance(Effects.ABSORPTION, 1800, 6), new EffectInstance(EPEffects.HEALTH_REDUCTION, 1800, 3)).setRegistryName(ExtraPotions.MOD_ID, "pretentious_partisan"));
        event.getRegistry().register(LONG_PRETENTIOUS_PARTISAN = new Potion("pretentious_partisan", new EffectInstance(Effects.ABSORPTION, 4800, 6), new EffectInstance(EPEffects.HEALTH_REDUCTION, 4800, 3)).setRegistryName(ExtraPotions.MOD_ID, "long_pretentious_partisan"));
        event.getRegistry().register(STRONG_PRETENTIOUS_PARTISAN = new Potion("pretentious_partisan", new EffectInstance(Effects.ABSORPTION, 900, 18), new EffectInstance(EPEffects.HEALTH_REDUCTION, 900, 7)).setRegistryName(ExtraPotions.MOD_ID, "strong_pretentious_partisan"));
        event.getRegistry().register(ANCIENT_PENTATHLETE = new Potion("ancient_pentathlete", new EffectInstance(Effects.SPEED, 3600), new EffectInstance(Effects.JUMP_BOOST, 3600)).setRegistryName(ExtraPotions.MOD_ID, "ancient_pentathlete"));
        event.getRegistry().register(LONG_ANCIENT_PENTATHLETE = new Potion("ancient_pentathlete", new EffectInstance(Effects.SPEED, 9600), new EffectInstance(Effects.JUMP_BOOST, 9600)).setRegistryName(ExtraPotions.MOD_ID, "long_ancient_pentathlete"));
        event.getRegistry().register(STRONG_ANCIENT_PENTATHLETE = new Potion("ancient_pentathlete", new EffectInstance(Effects.SPEED, 1800, 1), new EffectInstance(Effects.JUMP_BOOST, 1800, 1)).setRegistryName(ExtraPotions.MOD_ID, "strong_ancient_pentathlete"));
        event.getRegistry().register(WITHER = new Potion("wither", new EffectInstance(Effects.WITHER, 900)).setRegistryName(ExtraPotions.MOD_ID, "wither"));
        event.getRegistry().register(LONG_WITHER = new Potion("wither", new EffectInstance(Effects.WITHER, 1800)).setRegistryName(ExtraPotions.MOD_ID, "long_wither"));
        event.getRegistry().register(STRONG_WITHER = new Potion("wither", new EffectInstance(Effects.WITHER, 450, 1)).setRegistryName(ExtraPotions.MOD_ID, "strong_wither"));
        event.getRegistry().register(HUNGRY_GIANT = new Potion("hungry_giant", new EffectInstance(Effects.HEALTH_BOOST, 3600, 2), new EffectInstance(EPEffects.KNOCKBACK_RESISTANCE, 3600, 2), new EffectInstance(Effects.HUNGER, 3600, 3), new EffectInstance(Effects.SLOWNESS, 3600, 3)).setRegistryName(ExtraPotions.MOD_ID, "hungry_giant"));
        event.getRegistry().register(LONG_HUNGRY_GIANT = new Potion("hungry_giant", new EffectInstance(Effects.HEALTH_BOOST, 9600, 2), new EffectInstance(EPEffects.KNOCKBACK_RESISTANCE, 9600, 2), new EffectInstance(Effects.HUNGER, 9600, 3), new EffectInstance(Effects.SLOWNESS, 9600, 3)).setRegistryName(ExtraPotions.MOD_ID, "long_hungry_giant"));
        event.getRegistry().register(STRONG_HUNGRY_GIANT = new Potion("hungry_giant", new EffectInstance(Effects.HEALTH_BOOST, 3600, 3), new EffectInstance(EPEffects.KNOCKBACK_RESISTANCE, 3600, 3), new EffectInstance(Effects.HUNGER, 3600, 5), new EffectInstance(Effects.SLOWNESS, 3600, 5)).setRegistryName(ExtraPotions.MOD_ID, "strong_hungry_giant"));
        event.getRegistry().register(HEAD_MONK = new Potion("head_monk", new EffectInstance(Effects.STRENGTH, 3600, 2), new EffectInstance(Effects.BLINDNESS, 3600)).setRegistryName(ExtraPotions.MOD_ID, "head_monk"));
        event.getRegistry().register(LONG_HEAD_MONK = new Potion("head_monk", new EffectInstance(Effects.STRENGTH, 9600, 2), new EffectInstance(Effects.BLINDNESS, 9600)).setRegistryName(ExtraPotions.MOD_ID, "long_head_monk"));
        event.getRegistry().register(STRONG_HEAD_MONK = new Potion("head_monk", new EffectInstance(Effects.STRENGTH, 1800, 3), new EffectInstance(Effects.BLINDNESS, 1800)).setRegistryName(ExtraPotions.MOD_ID, "strong_head_monk"));
    }
}
