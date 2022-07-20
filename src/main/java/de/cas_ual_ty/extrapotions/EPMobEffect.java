package de.cas_ual_ty.extrapotions;

import net.minecraft.world.effect.MobEffect;
import net.minecraft.world.effect.MobEffectCategory;

public class EPMobEffect extends MobEffect
{
    // Effect constructor is not public for some reason...
    public EPMobEffect(MobEffectCategory type, int liquidColor)
    {
        super(type, liquidColor);
    }
}
