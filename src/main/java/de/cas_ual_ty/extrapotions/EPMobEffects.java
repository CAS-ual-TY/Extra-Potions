package de.cas_ual_ty.extrapotions;

import net.minecraft.world.effect.HealthBoostMobEffect;
import net.minecraft.world.effect.MobEffect;
import net.minecraft.world.effect.MobEffectCategory;
import net.minecraft.world.entity.ai.attributes.AttributeModifier;
import net.minecraft.world.entity.ai.attributes.Attributes;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class EPMobEffects
{
    private static final DeferredRegister<MobEffect> MOB_EFFECTS = DeferredRegister.create(ForgeRegistries.MOB_EFFECTS, ExtraPotions.MOD_ID);
    
    public static final RegistryObject<MobEffect> HEALTH_REDUCTION = MOB_EFFECTS.register("health_reduction", () -> new HealthBoostMobEffect(MobEffectCategory.HARMFUL, 0x2C8265).addAttributeModifier(Attributes.MAX_HEALTH, "DEFFE3AE-979E-4E3D-96FE-E2B0BE26671C", -0.1D, AttributeModifier.Operation.MULTIPLY_BASE));
    public static final RegistryObject<MobEffect> ARMOR = MOB_EFFECTS.register("armor", () -> new EPMobEffect(MobEffectCategory.BENEFICIAL, 0x888888).addAttributeModifier(Attributes.ARMOR, "68685544-A337-4959-B1AD-ACCE62A583BE", 4D, AttributeModifier.Operation.ADDITION));
    public static final RegistryObject<MobEffect> KNOCKBACK_RESISTANCE = MOB_EFFECTS.register("knockback_resistance", () -> new EPMobEffect(MobEffectCategory.BENEFICIAL, 0x5C02DE).addAttributeModifier(Attributes.KNOCKBACK_RESISTANCE, "0DDC9275-7E9A-4662-8D3F-D8DF344444E0", 0.15D, AttributeModifier.Operation.ADDITION));
    
    public static void register()
    {
        MOB_EFFECTS.register(FMLJavaModLoadingContext.get().getModEventBus());
    }
}
