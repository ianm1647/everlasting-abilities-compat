package com.ianm1647.everlastingcompat.ability.config.self.apotheosis;

import com.github.alexthe666.alexsmobs.effect.AMEffectRegistry;
import net.minecraft.world.item.Rarity;
import net.minecraftforge.fml.config.ModConfig;
import org.cyclops.cyclopscore.config.ConfigurableProperty;
import org.cyclops.everlastingabilities.ability.AbilityTypePotionEffectSelf;
import org.cyclops.everlastingabilities.core.config.extendedconfig.AbilityConfig;
import shadows.apotheosis.Apoth;

public class AbilityAncientKnowledgeConfig extends AbilityConfig<AbilityTypePotionEffectSelf> {
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

    public AbilityAncientKnowledgeConfig() {
        super("ancient_knowledge", (eConfig) -> new AbilityTypePotionEffectSelf(eConfig.getNamedId(),
                () -> rarity,
                () -> maxLevel,
                () -> xpPerLevel,
                () -> obtainableOnPlayerSpawn,
                () -> obtainableOnMobSpawn,
                () -> obtainableOnCraft,
                () -> obtainableOnLoot,
                Apoth.Effects.KNOWLEDGE.get()));
    }

    static {
        rarity = Rarity.RARE.ordinal();
        maxLevel = 5;
        xpPerLevel = 80;
        obtainableOnPlayerSpawn = false;
        obtainableOnMobSpawn = true;
        obtainableOnCraft = true;
        obtainableOnLoot = true;
    }
}
