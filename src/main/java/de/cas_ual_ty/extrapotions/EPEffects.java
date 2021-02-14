package de.cas_ual_ty.extrapotions;

import net.minecraft.entity.ai.attributes.AttributeModifier;
import net.minecraft.entity.ai.attributes.Attributes;
import net.minecraft.potion.Effect;
import net.minecraft.potion.EffectType;
import net.minecraft.potion.HealthBoostEffect;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber;
import net.minecraftforge.registries.ObjectHolder;

@EventBusSubscriber(modid = ExtraPotions.MOD_ID, bus = EventBusSubscriber.Bus.MOD)
@ObjectHolder(ExtraPotions.MOD_ID)
public class EPEffects
{
    public static final Effect HEALTH_REDUCTION = null;
    public static final Effect ARMOR = null;
    public static final Effect KNOCKBACK_RESISTANCE = null;
    
    @SubscribeEvent
    public static void register(RegistryEvent.Register<Effect> event)
    {
        event.getRegistry().register(new HealthBoostEffect(EffectType.HARMFUL, 0x2C8265).addAttributesModifier(Attributes.MAX_HEALTH, "DEFFE3AE-979E-4E3D-96FE-E2B0BE26671C", -0.1D, AttributeModifier.Operation.MULTIPLY_BASE).setRegistryName(ExtraPotions.MOD_ID, "health_reduction"));
        event.getRegistry().register(new EPEffect(EffectType.BENEFICIAL, 0x888888).addAttributesModifier(Attributes.ARMOR, "68685544-A337-4959-B1AD-ACCE62A583BE", 4D, AttributeModifier.Operation.ADDITION).setRegistryName(ExtraPotions.MOD_ID, "armor"));
        event.getRegistry().register(new EPEffect(EffectType.BENEFICIAL, 0x5C02DE).addAttributesModifier(Attributes.KNOCKBACK_RESISTANCE, "0DDC9275-7E9A-4662-8D3F-D8DF344444E0", 0.15D, AttributeModifier.Operation.ADDITION).setRegistryName(ExtraPotions.MOD_ID, "knockback_resistance"));
    }
}
