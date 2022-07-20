package de.cas_ual_ty.extrapotions;

import net.minecraft.potion.EffectInstance;
import net.minecraft.potion.Effects;
import net.minecraft.potion.Potion;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class EPPotions
{
    private static final DeferredRegister<Potion> POTIONS = DeferredRegister.create(ForgeRegistries.POTION_TYPES, ExtraPotions.MOD_ID);
    
    public static final RegistryObject<Potion> BLINDNESS = POTIONS.register("blindness", () -> new Potion(new EffectInstance(Effects.BLINDNESS, 900)));
    public static final RegistryObject<Potion> LONG_BLINDNESS = POTIONS.register("long_blindness", () -> new Potion("blindness", new EffectInstance(Effects.BLINDNESS, 1800)));
    public static final RegistryObject<Potion> NAUSEA = POTIONS.register("nausea", () -> new Potion("nausea", new EffectInstance(Effects.CONFUSION, 900)));
    public static final RegistryObject<Potion> LONG_NAUSEA = POTIONS.register("long_nausea", () -> new Potion("nausea", new EffectInstance(Effects.CONFUSION, 1800)));
    public static final RegistryObject<Potion> HEALTH_BOOST = POTIONS.register("health_boost", () -> new Potion("health_boost", new EffectInstance(Effects.HEALTH_BOOST, 900)));
    public static final RegistryObject<Potion> LONG_HEALTH_BOOST = POTIONS.register("long_health_boost", () -> new Potion("health_boost", new EffectInstance(Effects.HEALTH_BOOST, 1800)));
    public static final RegistryObject<Potion> STRONG_HEALTH_BOOST = POTIONS.register("strong_health_boost", () -> new Potion("health_boost", new EffectInstance(Effects.HEALTH_BOOST, 450, 1)));
    public static final RegistryObject<Potion> ABSORPTION = POTIONS.register("absorption", () -> new Potion("absorption", new EffectInstance(Effects.ABSORPTION, 3600)));
    public static final RegistryObject<Potion> LONG_ABSORPTION = POTIONS.register("long_absorption", () -> new Potion("absorption", new EffectInstance(Effects.ABSORPTION, 9600)));
    public static final RegistryObject<Potion> STRONG_ABSORPTION = POTIONS.register("strong_absorption", () -> new Potion("absorption", new EffectInstance(Effects.ABSORPTION, 1800, 1)));
    public static final RegistryObject<Potion> GLOWING = POTIONS.register("glowing", () -> new Potion("glowing", new EffectInstance(Effects.GLOWING, 1800)));
    public static final RegistryObject<Potion> LONG_GLOWING = POTIONS.register("long_glowing", () -> new Potion("glowing", new EffectInstance(Effects.GLOWING, 4800)));
    public static final RegistryObject<Potion> UNDERGROUND_EXPLORER = POTIONS.register("underground_explorer", () -> new Potion("underground_explorer", new EffectInstance(Effects.DIG_SPEED, 3600, 2), new EffectInstance(Effects.SATURATION, 3600), new EffectInstance(EPEffects.HEALTH_REDUCTION.get(), 3600, 3)));
    public static final RegistryObject<Potion> LONG_UNDERGROUND_EXPLORER = POTIONS.register("long_underground_explorer", () -> new Potion("underground_explorer", new EffectInstance(Effects.DIG_SPEED, 7200, 2), new EffectInstance(Effects.SATURATION, 7200), new EffectInstance(EPEffects.HEALTH_REDUCTION.get(), 7200, 3)));
    public static final RegistryObject<Potion> STRONG_UNDERGROUND_EXPLORER = POTIONS.register("strong_underground_explorer", () -> new Potion("underground_explorer", new EffectInstance(Effects.DIG_SPEED, 3600, 3), new EffectInstance(Effects.SATURATION, 3600), new EffectInstance(EPEffects.HEALTH_REDUCTION.get(), 3600, 5)));
    public static final RegistryObject<Potion> RESISTANCE = POTIONS.register("resistance", () -> new Potion("resistance", new EffectInstance(Effects.DAMAGE_RESISTANCE, 3600)));
    public static final RegistryObject<Potion> LONG_RESISTANCE = POTIONS.register("long_resistance", () -> new Potion("resistance", new EffectInstance(Effects.DAMAGE_RESISTANCE, 9600)));
    public static final RegistryObject<Potion> STRONG_RESISTANCE = POTIONS.register("strong_resistance", () -> new Potion("resistance", new EffectInstance(Effects.DAMAGE_RESISTANCE, 1800, 1)));
    public static final RegistryObject<Potion> IRON_SKIN = POTIONS.register("iron_skin", () -> new Potion("iron_skin", new EffectInstance(EPEffects.ARMOR.get(), 900)));
    public static final RegistryObject<Potion> LONG_IRON_SKIN = POTIONS.register("long_iron_skin", () -> new Potion("iron_skin", new EffectInstance(EPEffects.ARMOR.get(), 1800)));
    public static final RegistryObject<Potion> STRONG_IRON_SKIN = POTIONS.register("strong_iron_skin", () -> new Potion("iron_skin", new EffectInstance(EPEffects.ARMOR.get(), 450, 1)));
    public static final RegistryObject<Potion> SWIFT_TRAVELLER = POTIONS.register("traveller", () -> new Potion("swift_traveller", new EffectInstance(Effects.MOVEMENT_SPEED, 3600, 2), new EffectInstance(Effects.JUMP, 3600, 2), new EffectInstance(Effects.WEAKNESS, 3600, 1), new EffectInstance(Effects.DIG_SLOWDOWN, 3600, 3)));
    public static final RegistryObject<Potion> LONG_SWIFT_TRAVELLER = POTIONS.register("long_traveller", () -> new Potion("swift_traveller", new EffectInstance(Effects.MOVEMENT_SPEED, 9600, 2), new EffectInstance(Effects.JUMP, 9600, 2), new EffectInstance(Effects.WEAKNESS, 9600, 1), new EffectInstance(Effects.DIG_SLOWDOWN, 9600, 3)));
    public static final RegistryObject<Potion> STRONG_SWIFT_TRAVELLER = POTIONS.register("strong_traveller", () -> new Potion("swift_traveller", new EffectInstance(Effects.MOVEMENT_SPEED, 3600, 3), new EffectInstance(Effects.JUMP, 3600, 3), new EffectInstance(Effects.WEAKNESS, 3600, 2), new EffectInstance(Effects.DIG_SLOWDOWN, 3600, 5)));
    public static final RegistryObject<Potion> PRETENTIOUS_PARTISAN = POTIONS.register("pretentious_partisan", () -> new Potion("pretentious_partisan", new EffectInstance(Effects.ABSORPTION, 1800, 6), new EffectInstance(EPEffects.HEALTH_REDUCTION.get(), 1800, 3)));
    public static final RegistryObject<Potion> LONG_PRETENTIOUS_PARTISAN = POTIONS.register("long_pretentious_partisan", () -> new Potion("pretentious_partisan", new EffectInstance(Effects.ABSORPTION, 4800, 6), new EffectInstance(EPEffects.HEALTH_REDUCTION.get(), 4800, 3)));
    public static final RegistryObject<Potion> STRONG_PRETENTIOUS_PARTISAN = POTIONS.register("strong_pretentious_partisan", () -> new Potion("pretentious_partisan", new EffectInstance(Effects.ABSORPTION, 900, 18), new EffectInstance(EPEffects.HEALTH_REDUCTION.get(), 900, 7)));
    public static final RegistryObject<Potion> ANCIENT_PENTATHLETE = POTIONS.register("ancient_pentathlete", () -> new Potion("ancient_pentathlete", new EffectInstance(Effects.MOVEMENT_SPEED, 3600), new EffectInstance(Effects.JUMP, 3600)));
    public static final RegistryObject<Potion> LONG_ANCIENT_PENTATHLETE = POTIONS.register("long_ancient_pentathlete", () -> new Potion("ancient_pentathlete", new EffectInstance(Effects.MOVEMENT_SPEED, 9600), new EffectInstance(Effects.JUMP, 9600)));
    public static final RegistryObject<Potion> STRONG_ANCIENT_PENTATHLETE = POTIONS.register("strong_ancient_pentathlete", () -> new Potion("ancient_pentathlete", new EffectInstance(Effects.MOVEMENT_SPEED, 1800, 1), new EffectInstance(Effects.JUMP, 1800, 1)));
    public static final RegistryObject<Potion> WITHER = POTIONS.register("wither", () -> new Potion("wither", new EffectInstance(Effects.WITHER, 900)));
    public static final RegistryObject<Potion> LONG_WITHER = POTIONS.register("long_wither", () -> new Potion("wither", new EffectInstance(Effects.WITHER, 1800)));
    public static final RegistryObject<Potion> STRONG_WITHER = POTIONS.register("strong_wither", () -> new Potion("wither", new EffectInstance(Effects.WITHER, 450, 1)));
    public static final RegistryObject<Potion> HUNGRY_GIANT = POTIONS.register("hungry_giant", () -> new Potion("hungry_giant", new EffectInstance(Effects.HEALTH_BOOST, 3600, 2), new EffectInstance(EPEffects.KNOCKBACK_RESISTANCE.get(), 3600, 2), new EffectInstance(Effects.HUNGER, 3600, 3), new EffectInstance(Effects.MOVEMENT_SLOWDOWN, 3600, 3)));
    public static final RegistryObject<Potion> LONG_HUNGRY_GIANT = POTIONS.register("long_hungry_giant", () -> new Potion("hungry_giant", new EffectInstance(Effects.HEALTH_BOOST, 9600, 2), new EffectInstance(EPEffects.KNOCKBACK_RESISTANCE.get(), 9600, 2), new EffectInstance(Effects.HUNGER, 9600, 3), new EffectInstance(Effects.MOVEMENT_SLOWDOWN, 9600, 3)));
    public static final RegistryObject<Potion> STRONG_HUNGRY_GIANT = POTIONS.register("strong_hungry_giant", () -> new Potion("hungry_giant", new EffectInstance(Effects.HEALTH_BOOST, 3600, 3), new EffectInstance(EPEffects.KNOCKBACK_RESISTANCE.get(), 3600, 3), new EffectInstance(Effects.HUNGER, 3600, 5), new EffectInstance(Effects.MOVEMENT_SLOWDOWN, 3600, 5)));
    public static final RegistryObject<Potion> HEAD_MONK = POTIONS.register("head_monk", () -> new Potion("head_monk", new EffectInstance(Effects.DAMAGE_BOOST, 3600, 2), new EffectInstance(Effects.BLINDNESS, 3600)));
    public static final RegistryObject<Potion> LONG_HEAD_MONK = POTIONS.register("long_head_monk", () -> new Potion("head_monk", new EffectInstance(Effects.DAMAGE_BOOST, 9600, 2), new EffectInstance(Effects.BLINDNESS, 9600)));
    public static final RegistryObject<Potion> STRONG_HEAD_MONK = POTIONS.register("strong_head_monk", () -> new Potion("head_monk", new EffectInstance(Effects.DAMAGE_BOOST, 1800, 3), new EffectInstance(Effects.BLINDNESS, 1800)));
    
    public static void register()
    {
        POTIONS.register(FMLJavaModLoadingContext.get().getModEventBus());
    }
}
