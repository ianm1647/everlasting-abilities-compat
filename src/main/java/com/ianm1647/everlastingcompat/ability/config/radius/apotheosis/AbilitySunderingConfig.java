package com.ianm1647.everlastingcompat.ability.config.radius.apotheosis;

import alexthw.ars_elemental.registry.ModPotions;
import net.minecraft.world.item.Rarity;
import net.minecraftforge.fml.config.ModConfig;
import org.cyclops.cyclopscore.config.ConfigurableProperty;
import org.cyclops.everlastingabilities.ability.AbilityTypePotionEffectRadius;
import org.cyclops.everlastingabilities.core.config.extendedconfig.AbilityConfig;
import shadows.apotheosis.Apoth;
import shadows.apotheosis.adventure.affix.effect.PotionAffix;
import shadows.apotheosis.potion.PotionModule;
import shadows.apotheosis.potion.potions.SunderingEffect;

public class AbilitySunderingConfig extends AbilityConfig<AbilityTypePotionEffectRadius> {
    @ConfigurableProperty(
            category = "ability",
            comment = "Rarity of this ability.",
            isCommandable = true,
            configLocation = ModConfig.Type.SERVER
    )
    public static int rarity;
    @ConfigurableProperty(
            category = "ability",
            comment = "The maximum ability level.",
            isCommandable = true,
            configLocation = ModConfig.Type.SERVER
    )
    public static int maxLevel;
    @ConfigurableProperty(
            category = "ability",
            comment = "The xp required per level.",
            isCommandable = true,
            configLocation = ModConfig.Type.SERVER
    )
    public static int xpPerLevel;
    @ConfigurableProperty(
            category = "ability",
            comment = "If this can be obtained by initially spawning players.",
            isCommandable = true,
            configLocation = ModConfig.Type.SERVER
    )
    public static boolean obtainableOnPlayerSpawn;
    @ConfigurableProperty(
            category = "ability",
            comment = "If this can be obtained by spawning mobs.",
            isCommandable = true,
            configLocation = ModConfig.Type.SERVER
    )
    public static boolean obtainableOnMobSpawn;
    @ConfigurableProperty(
            category = "ability",
            comment = "If this can be obtained by combining totems in a crafting grid.",
            isCommandable = true,
            configLocation = ModConfig.Type.SERVER
    )
    public static boolean obtainableOnCraft;
    @ConfigurableProperty(
            category = "ability",
            comment = "If this can be obtained in loot chests.",
            isCommandable = true,
            configLocation = ModConfig.Type.SERVER
    )
    public static boolean obtainableOnLoot;

    public AbilitySunderingConfig() {
        super("sundering", (eConfig) -> new AbilityTypePotionEffectRadius(eConfig.getNamedId(),
                () -> rarity,
                () -> maxLevel,
                () -> xpPerLevel,
                () -> obtainableOnPlayerSpawn,
                () -> obtainableOnMobSpawn,
                () -> obtainableOnCraft,
                () -> obtainableOnLoot,
                Apoth.Effects.SUNDERING.get()) {
            protected int getDuration(int tickModulus, int level) {
                return tickModulus * 27;
            }
        });
    }

    static {
        rarity = Rarity.EPIC.ordinal();
        maxLevel = 3;
        xpPerLevel = 250;
        obtainableOnPlayerSpawn = false;
        obtainableOnMobSpawn = true;
        obtainableOnCraft = true;
        obtainableOnLoot = true;
    }
}
