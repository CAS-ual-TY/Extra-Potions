package de.cas_ual_ty.extrapotions;

import net.minecraft.potion.Effect;
import net.minecraft.potion.EffectType;

public class EPEffect extends Effect
{
    // Effect constructor is not public for some reason...
    public EPEffect(EffectType type, int liquidColor)
    {
        super(type, liquidColor);
    }
}
