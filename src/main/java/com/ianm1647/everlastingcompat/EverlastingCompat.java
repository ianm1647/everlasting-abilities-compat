package com.ianm1647.everlastingcompat;

import com.ianm1647.everlastingcompat.ability.config.radius.apotheosis.AbilitySunderingConfig;
import com.ianm1647.everlastingcompat.ability.config.radius.ars_elemental.*;
import com.ianm1647.everlastingcompat.ability.config.radius.ars_nouveau.*;
import com.ianm1647.everlastingcompat.ability.config.radius.cyclic.*;
import com.ianm1647.everlastingcompat.ability.config.self.alexsmobs.*;
import com.ianm1647.everlastingcompat.ability.config.self.apotheosis.AbilityAncientKnowledgeConfig;
import com.ianm1647.everlastingcompat.ability.config.self.ars_nouveau.*;
import com.ianm1647.everlastingcompat.ability.config.self.cyclic.*;
import com.ianm1647.everlastingcompat.ability.config.self.deeperdarker.AbilitySculkAffinityConfig;
import com.ianm1647.everlastingcompat.proxy.ClientProxy;
import com.ianm1647.everlastingcompat.proxy.CommonProxy;
import com.mojang.logging.LogUtils;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.ModList;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.cyclops.cyclopscore.config.ConfigHandler;
import org.cyclops.cyclopscore.init.ModBaseVersionable;
import org.cyclops.cyclopscore.proxy.IClientProxy;
import org.cyclops.cyclopscore.proxy.ICommonProxy;
import org.slf4j.Logger;
import shadows.apotheosis.Apotheosis;

@Mod(EverlastingCompat.MODID)
public class EverlastingCompat extends ModBaseVersionable<EverlastingCompat> {
    public static final String MODID = "everlastingcompat";
    private static final Logger LOGGER = LogUtils.getLogger();
    public static EverlastingCompat _instance;

    public EverlastingCompat() {
        super("everlastingcompat", (instance) -> {
            _instance = instance;
        });
        IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();
        modEventBus.addListener(this::commonSetup);
        MinecraftForge.EVENT_BUS.register(this);

    }

    protected void commonSetup(final FMLCommonSetupEvent event) {

    }

    protected IClientProxy constructClientProxy() { return new ClientProxy(); }

    protected ICommonProxy constructCommonProxy() { return new CommonProxy(); }

    protected CreativeModeTab constructDefaultCreativeModeTab() { return null; }

    @Override
    public void onConfigsRegister(ConfigHandler handler) {
        super.onConfigsRegister(handler);
        if (ModList.get().isLoaded("alexsmobs")) {
            handler.addConfigurable(new AbilityBugPheromonesConfig());
            handler.addConfigurable(new AbilityClingingConfig());
            handler.addConfigurable(new AbilityKnockbackResistanceConfig());
            handler.addConfigurable(new AbilityLavaVisionConfig());
            handler.addConfigurable(new AbilityPoisonResistanceConfig());
            handler.addConfigurable(new AbilitySoulstealConfig());
        }
        if (ModList.get().isLoaded("apotheosis")) {
            if (Apotheosis.enablePotion) {
                handler.addConfigurable(new AbilityAncientKnowledgeConfig());
                handler.addConfigurable(new AbilitySunderingConfig());
            }
        }
        if (ModList.get().isLoaded("ars_elemental")) {
            handler.addConfigurable(new AbilityEnderferenceConfig());
            handler.addConfigurable(new AbilityStaticChargedConfig());
        }
        if (ModList.get().isLoaded("ars_nouveau")) {
            handler.addConfigurable(new AbilityManaRegenConfig());
            handler.addConfigurable(new AbilityRecoveryConfig());
            handler.addConfigurable(new AbilityShieldingConfig());
            handler.addConfigurable(new AbilitySpellDamageConfig());
            handler.addConfigurable(new AbilityBlastingConfig());
            handler.addConfigurable(new AbilityFreezingConfig());
        }
        if (ModList.get().isLoaded("atmospheric")) {

        }
        if (ModList.get().isLoaded("cyclic")) {
            handler.addConfigurable(new AbilityAntiGravityConfig());
            handler.addConfigurable(new AbilityAttackRangeConfig());
            handler.addConfigurable(new AbilityFrostWalkerConfig());
            handler.addConfigurable(new AbilityMagnetismConfig());
            handler.addConfigurable(new AbilityReachDistanceConfig());
            handler.addConfigurable(new AbilitySnowWalkerConfig());
            handler.addConfigurable(new AbilitySwimSpeedConfig());
            handler.addConfigurable(new AbilityWaterwalkingConfig());
            handler.addConfigurable(new AbilityButterfingersConfig());
            handler.addConfigurable(new AbilityGravityConfig());
            handler.addConfigurable(new AbilityParalyzeConfig());
        }
        if (ModList.get().isLoaded("deeperdarker")) {
            handler.addConfigurable(new AbilitySculkAffinityConfig());
        }
        if (ModList.get().isLoaded("enlightened_end")) {

        }
        if (ModList.get().isLoaded("infernalexp")) {

        }
        if (ModList.get().isLoaded("nourished_nether")) {

        }
        if (ModList.get().isLoaded("unusualend")) {

        }
        if (ModList.get().isLoaded("upgrade_aquatic")) {

        }
        if (ModList.get().isLoaded("windswept")) {

        }
    }

    @Mod.EventBusSubscriber(modid = MODID, bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
    public static class ClientModEvents {
        @SubscribeEvent
        public static void onClientSetup(FMLClientSetupEvent event) {

        }
    }
}
