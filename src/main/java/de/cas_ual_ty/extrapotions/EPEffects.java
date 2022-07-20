package de.cas_ual_ty.extrapotions;

import net.minecraft.entity.ai.attributes.AttributeModifier;
import net.minecraft.entity.ai.attributes.Attributes;
import net.minecraft.potion.Effect;
import net.minecraft.potion.EffectType;
import net.minecraft.potion.HealthBoostEffect;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class EPEffects
{
    private static final DeferredRegister<Effect> EFFECTS = DeferredRegister.create(ForgeRegistries.POTIONS, ExtraPotions.MOD_ID);
    
    public static final RegistryObject<Effect> HEALTH_REDUCTION = EFFECTS.register("health_reduction", () -> new HealthBoostEffect(EffectType.HARMFUL, 0x2C8265).addAttributeModifier(Attributes.MAX_HEALTH, "DEFFE3AE-979E-4E3D-96FE-E2B0BE26671C", -0.1D, AttributeModifier.Operation.MULTIPLY_BASE));
    public static final RegistryObject<Effect> ARMOR = EFFECTS.register("armor", () -> new EPEffect(EffectType.BENEFICIAL, 0x888888).addAttributeModifier(Attributes.ARMOR, "68685544-A337-4959-B1AD-ACCE62A583BE", 4D, AttributeModifier.Operation.ADDITION));
    public static final RegistryObject<Effect> KNOCKBACK_RESISTANCE = EFFECTS.register("knockback_resistance", () -> new EPEffect(EffectType.BENEFICIAL, 0x5C02DE).addAttributeModifier(Attributes.KNOCKBACK_RESISTANCE, "0DDC9275-7E9A-4662-8D3F-D8DF344444E0", 0.15D, AttributeModifier.Operation.ADDITION));
    
    public static void register()
    {
        EFFECTS.register(FMLJavaModLoadingContext.get().getModEventBus());
    }
}
