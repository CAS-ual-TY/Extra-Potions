package de.cas_ual_ty.extrapotions;

import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.item.alchemy.Potion;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class EPPotions
{
    private static final DeferredRegister<Potion> POTIONS = DeferredRegister.create(ForgeRegistries.POTIONS, ExtraPotions.MOD_ID);
    
    public static final RegistryObject<Potion> BLINDNESS = POTIONS.register("blindness", () -> new Potion(new MobEffectInstance(MobEffects.BLINDNESS, 900)));
    public static final RegistryObject<Potion> LONG_BLINDNESS = POTIONS.register("long_blindness", () -> new Potion("blindness", new MobEffectInstance(MobEffects.BLINDNESS, 1800)));
    public static final RegistryObject<Potion> NAUSEA = POTIONS.register("nausea", () -> new Potion("nausea", new MobEffectInstance(MobEffects.CONFUSION, 900)));
    public static final RegistryObject<Potion> LONG_NAUSEA = POTIONS.register("long_nausea", () -> new Potion("nausea", new MobEffectInstance(MobEffects.CONFUSION, 1800)));
    public static final RegistryObject<Potion> HEALTH_BOOST = POTIONS.register("health_boost", () -> new Potion("health_boost", new MobEffectInstance(MobEffects.HEALTH_BOOST, 900)));
    public static final RegistryObject<Potion> LONG_HEALTH_BOOST = POTIONS.register("long_health_boost", () -> new Potion("health_boost", new MobEffectInstance(MobEffects.HEALTH_BOOST, 1800)));
    public static final RegistryObject<Potion> STRONG_HEALTH_BOOST = POTIONS.register("strong_health_boost", () -> new Potion("health_boost", new MobEffectInstance(MobEffects.HEALTH_BOOST, 450, 1)));
    public static final RegistryObject<Potion> ABSORPTION = POTIONS.register("absorption", () -> new Potion("absorption", new MobEffectInstance(MobEffects.ABSORPTION, 3600)));
    public static final RegistryObject<Potion> LONG_ABSORPTION = POTIONS.register("long_absorption", () -> new Potion("absorption", new MobEffectInstance(MobEffects.ABSORPTION, 9600)));
    public static final RegistryObject<Potion> STRONG_ABSORPTION = POTIONS.register("strong_absorption", () -> new Potion("absorption", new MobEffectInstance(MobEffects.ABSORPTION, 1800, 1)));
    public static final RegistryObject<Potion> GLOWING = POTIONS.register("glowing", () -> new Potion("glowing", new MobEffectInstance(MobEffects.GLOWING, 1800)));
    public static final RegistryObject<Potion> LONG_GLOWING = POTIONS.register("long_glowing", () -> new Potion("glowing", new MobEffectInstance(MobEffects.GLOWING, 4800)));
    public static final RegistryObject<Potion> UNDERGROUND_EXPLORER = POTIONS.register("underground_explorer", () -> new Potion("underground_explorer", new MobEffectInstance(MobEffects.DIG_SPEED, 3600, 2), new MobEffectInstance(MobEffects.SATURATION, 3600), new MobEffectInstance(EPMobEffects.HEALTH_REDUCTION.get(), 3600, 3)));
    public static final RegistryObject<Potion> LONG_UNDERGROUND_EXPLORER = POTIONS.register("long_underground_explorer", () -> new Potion("underground_explorer", new MobEffectInstance(MobEffects.DIG_SPEED, 7200, 2), new MobEffectInstance(MobEffects.SATURATION, 7200), new MobEffectInstance(EPMobEffects.HEALTH_REDUCTION.get(), 7200, 3)));
    public static final RegistryObject<Potion> STRONG_UNDERGROUND_EXPLORER = POTIONS.register("strong_underground_explorer", () -> new Potion("underground_explorer", new MobEffectInstance(MobEffects.DIG_SPEED, 3600, 3), new MobEffectInstance(MobEffects.SATURATION, 3600), new MobEffectInstance(EPMobEffects.HEALTH_REDUCTION.get(), 3600, 5)));
    public static final RegistryObject<Potion> RESISTANCE = POTIONS.register("resistance", () -> new Potion("resistance", new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 3600)));
    public static final RegistryObject<Potion> LONG_RESISTANCE = POTIONS.register("long_resistance", () -> new Potion("resistance", new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 9600)));
    public static final RegistryObject<Potion> STRONG_RESISTANCE = POTIONS.register("strong_resistance", () -> new Potion("resistance", new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 1800, 1)));
    public static final RegistryObject<Potion> IRON_SKIN = POTIONS.register("iron_skin", () -> new Potion("iron_skin", new MobEffectInstance(EPMobEffects.ARMOR.get(), 900)));
    public static final RegistryObject<Potion> LONG_IRON_SKIN = POTIONS.register("long_iron_skin", () -> new Potion("iron_skin", new MobEffectInstance(EPMobEffects.ARMOR.get(), 1800)));
    public static final RegistryObject<Potion> STRONG_IRON_SKIN = POTIONS.register("strong_iron_skin", () -> new Potion("iron_skin", new MobEffectInstance(EPMobEffects.ARMOR.get(), 450, 1)));
    public static final RegistryObject<Potion> SWIFT_TRAVELLER = POTIONS.register("traveller", () -> new Potion("swift_traveller", new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 3600, 2), new MobEffectInstance(MobEffects.JUMP, 3600, 2), new MobEffectInstance(MobEffects.WEAKNESS, 3600, 1), new MobEffectInstance(MobEffects.DIG_SLOWDOWN, 3600, 3)));
    public static final RegistryObject<Potion> LONG_SWIFT_TRAVELLER = POTIONS.register("long_traveller", () -> new Potion("swift_traveller", new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 9600, 2), new MobEffectInstance(MobEffects.JUMP, 9600, 2), new MobEffectInstance(MobEffects.WEAKNESS, 9600, 1), new MobEffectInstance(MobEffects.DIG_SLOWDOWN, 9600, 3)));
    public static final RegistryObject<Potion> STRONG_SWIFT_TRAVELLER = POTIONS.register("strong_traveller", () -> new Potion("swift_traveller", new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 3600, 3), new MobEffectInstance(MobEffects.JUMP, 3600, 3), new MobEffectInstance(MobEffects.WEAKNESS, 3600, 2), new MobEffectInstance(MobEffects.DIG_SLOWDOWN, 3600, 5)));
    public static final RegistryObject<Potion> PRETENTIOUS_PARTISAN = POTIONS.register("pretentious_partisan", () -> new Potion("pretentious_partisan", new MobEffectInstance(MobEffects.ABSORPTION, 1800, 6), new MobEffectInstance(EPMobEffects.HEALTH_REDUCTION.get(), 1800, 3)));
    public static final RegistryObject<Potion> LONG_PRETENTIOUS_PARTISAN = POTIONS.register("long_pretentious_partisan", () -> new Potion("pretentious_partisan", new MobEffectInstance(MobEffects.ABSORPTION, 4800, 6), new MobEffectInstance(EPMobEffects.HEALTH_REDUCTION.get(), 4800, 3)));
    public static final RegistryObject<Potion> STRONG_PRETENTIOUS_PARTISAN = POTIONS.register("strong_pretentious_partisan", () -> new Potion("pretentious_partisan", new MobEffectInstance(MobEffects.ABSORPTION, 900, 18), new MobEffectInstance(EPMobEffects.HEALTH_REDUCTION.get(), 900, 7)));
    public static final RegistryObject<Potion> ANCIENT_PENTATHLETE = POTIONS.register("ancient_pentathlete", () -> new Potion("ancient_pentathlete", new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 3600), new MobEffectInstance(MobEffects.JUMP, 3600)));
    public static final RegistryObject<Potion> LONG_ANCIENT_PENTATHLETE = POTIONS.register("long_ancient_pentathlete", () -> new Potion("ancient_pentathlete", new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 9600), new MobEffectInstance(MobEffects.JUMP, 9600)));
    public static final RegistryObject<Potion> STRONG_ANCIENT_PENTATHLETE = POTIONS.register("strong_ancient_pentathlete", () -> new Potion("ancient_pentathlete", new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 1800, 1), new MobEffectInstance(MobEffects.JUMP, 1800, 1)));
    public static final RegistryObject<Potion> WITHER = POTIONS.register("wither", () -> new Potion("wither", new MobEffectInstance(MobEffects.WITHER, 900)));
    public static final RegistryObject<Potion> LONG_WITHER = POTIONS.register("long_wither", () -> new Potion("wither", new MobEffectInstance(MobEffects.WITHER, 1800)));
    public static final RegistryObject<Potion> STRONG_WITHER = POTIONS.register("strong_wither", () -> new Potion("wither", new MobEffectInstance(MobEffects.WITHER, 450, 1)));
    public static final RegistryObject<Potion> HUNGRY_GIANT = POTIONS.register("hungry_giant", () -> new Potion("hungry_giant", new MobEffectInstance(MobEffects.HEALTH_BOOST, 3600, 2), new MobEffectInstance(EPMobEffects.KNOCKBACK_RESISTANCE.get(), 3600, 2), new MobEffectInstance(MobEffects.HUNGER, 3600, 3), new MobEffectInstance(MobEffects.MOVEMENT_SLOWDOWN, 3600, 3)));
    public static final RegistryObject<Potion> LONG_HUNGRY_GIANT = POTIONS.register("long_hungry_giant", () -> new Potion("hungry_giant", new MobEffectInstance(MobEffects.HEALTH_BOOST, 9600, 2), new MobEffectInstance(EPMobEffects.KNOCKBACK_RESISTANCE.get(), 9600, 2), new MobEffectInstance(MobEffects.HUNGER, 9600, 3), new MobEffectInstance(MobEffects.MOVEMENT_SLOWDOWN, 9600, 3)));
    public static final RegistryObject<Potion> STRONG_HUNGRY_GIANT = POTIONS.register("strong_hungry_giant", () -> new Potion("hungry_giant", new MobEffectInstance(MobEffects.HEALTH_BOOST, 3600, 3), new MobEffectInstance(EPMobEffects.KNOCKBACK_RESISTANCE.get(), 3600, 3), new MobEffectInstance(MobEffects.HUNGER, 3600, 5), new MobEffectInstance(MobEffects.MOVEMENT_SLOWDOWN, 3600, 5)));
    public static final RegistryObject<Potion> HEAD_MONK = POTIONS.register("head_monk", () -> new Potion("head_monk", new MobEffectInstance(MobEffects.DAMAGE_BOOST, 3600, 2), new MobEffectInstance(MobEffects.BLINDNESS, 3600)));
    public static final RegistryObject<Potion> LONG_HEAD_MONK = POTIONS.register("long_head_monk", () -> new Potion("head_monk", new MobEffectInstance(MobEffects.DAMAGE_BOOST, 9600, 2), new MobEffectInstance(MobEffects.BLINDNESS, 9600)));
    public static final RegistryObject<Potion> STRONG_HEAD_MONK = POTIONS.register("strong_head_monk", () -> new Potion("head_monk", new MobEffectInstance(MobEffects.DAMAGE_BOOST, 1800, 3), new MobEffectInstance(MobEffects.BLINDNESS, 1800)));
    
    public static void register()
    {
        POTIONS.register(FMLJavaModLoadingContext.get().getModEventBus());
    }
}
