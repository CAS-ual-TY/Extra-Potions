package de.cas_ual_ty.extrapotions;

import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.effect.MobEffect;
import net.minecraft.world.effect.MobEffectCategory;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.entity.ai.attributes.AttributeModifier;
import net.minecraft.world.entity.ai.attributes.Attributes;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.fml.ModContainer;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.NeoForgeRegistries;

public class EPMobEffects
{
    private static final DeferredRegister<MobEffect> MOB_EFFECTS = DeferredRegister.create(BuiltInRegistries.MOB_EFFECT, ExtraPotions.MOD_ID);
    
    public static final DeferredHolder<MobEffect, MobEffect> HEALTH_REDUCTION = MOB_EFFECTS.register("health_reduction", () -> new EPMobEffect(MobEffectCategory.HARMFUL, 0x2C8265).addAttributeModifier(Attributes.MAX_HEALTH, ResourceLocation.fromNamespaceAndPath(ExtraPotions.MOD_ID, "health_reduction"), -0.1D, AttributeModifier.Operation.ADD_MULTIPLIED_BASE));
    public static final DeferredHolder<MobEffect, MobEffect> ARMOR = MOB_EFFECTS.register("armor", () -> new EPMobEffect(MobEffectCategory.BENEFICIAL, 0x888888).addAttributeModifier(Attributes.ARMOR, ResourceLocation.fromNamespaceAndPath(ExtraPotions.MOD_ID, "armor"), 4D, AttributeModifier.Operation.ADD_VALUE));
    public static final DeferredHolder<MobEffect, MobEffect> KNOCKBACK_RESISTANCE = MOB_EFFECTS.register("knockback_resistance", () -> new EPMobEffect(MobEffectCategory.BENEFICIAL, 0x5C02DE).addAttributeModifier(Attributes.KNOCKBACK_RESISTANCE, ResourceLocation.fromNamespaceAndPath(ExtraPotions.MOD_ID, "knockback_resistance"), 0.15D, AttributeModifier.Operation.ADD_VALUE));
    
    public static void register(IEventBus modEventBus, ModContainer modContainer)
    {
        MOB_EFFECTS.register(modEventBus);
    }
}
