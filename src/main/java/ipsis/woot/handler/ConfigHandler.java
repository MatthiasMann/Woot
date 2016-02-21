package ipsis.woot.handler;

import ipsis.woot.reference.Reference;
import ipsis.woot.reference.Settings;
import net.minecraftforge.common.config.Configuration;
import net.minecraftforge.fml.client.event.ConfigChangedEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

import java.io.File;

public class ConfigHandler {

    public static Configuration configuration;

    public static void init(File configFile) {

        if (configuration == null) {
            configuration = new Configuration(configFile);
            loadConfiguration();
        }
    }

    static void loadConfiguration() {

        Settings.learnTicks = Settings.Spawner.DEF_LEARN_TICKS;
        Settings.sampleSize = Settings.Spawner.DEF_SAMPLE_SIZE;

        Settings.baseRf = Settings.Spawner.DEF_BASE_RF;

        Settings.rateBaseTicks = Settings.Spawner.DEF_RATE_BASE_TICKS;
        Settings.rateITicks = Settings.Spawner.DEF_RATE_I_TICKS;
        Settings.rateIITicks = Settings.Spawner.DEF_RATE_II_TICKS;
        Settings.rateIIITicks = Settings.Spawner.DEF_RATE_III_TICKS;

        Settings.massBaseMobs = Settings.Spawner.DEF_MASS_MOBS;
        Settings.massIMobs = Settings.Spawner.DEF_MASS_I_MOBS;
        Settings.massIIMobs = Settings.Spawner.DEF_MASS_II_MOBS;
        Settings.massIIIMobs = Settings.Spawner.DEF_MASS_III_MOBS;

        Settings.decapitateIChance = Settings.Spawner.DEF_DECAPITATE_I_CHANCE;
        Settings.decapitateIIChance = Settings.Spawner.DEF_DECAPITATE_II_CHANCE;
        Settings.decapitateIIIChance = Settings.Spawner.DEF_DECAPITATE_III_CHANCE;

        Settings.rateIMulti = Settings.Power.DEF_RATE_I_MULTI;
        Settings.rateIIMulti = Settings.Power.DEF_RATE_II_MULTI;
        Settings.rateIIIMulti = Settings.Power.DEF_RATE_III_MULTI;
        Settings.lootingIMulti = Settings.Power.DEF_LOOTING_I_MULTI;
        Settings.lootingIIMulti = Settings.Power.DEF_LOOTING_II_MULTI;
        Settings.lootingIIIMulti = Settings.Power.DEF_LOOTING_III_MULTI;
        Settings.xpIMulti = Settings.Power.DEF_XP_I_MULTI;
        Settings.xpIIMulti = Settings.Power.DEF_XP_II_MULTI;
        Settings.xpIIIMulti = Settings.Power.DEF_XP_III_MULTI;
        Settings.massIMulti = Settings.Power.DEF_MASS_I_MULTI;
        Settings.massIIMulti = Settings.Power.DEF_MASS_II_MULTI;
        Settings.massIIIMulti = Settings.Power.DEF_MASS_III_MULTI;
        Settings.decapitateIMulti = Settings.Power.DEF_DECAPITATE_I_MULTI;
        Settings.decapitateIIMulti = Settings.Power.DEF_DECAPITATE_II_MULTI;
        Settings.decapitateIIIMulti = Settings.Power.DEF_DECAPITATE_III_MULTI;

        Settings.strictPower = Settings.Power.DEF_STRICT_POWER;
        Settings.strictFactorySpawns = Settings.Spawner.DEF_STRICT_FACTORY_SPAWNS;

        Settings.enchantLootingILevel = Settings.Enchant.DEF_LOOTING_I_LEVEL;
        Settings.enchantLootingIILevel = Settings.Enchant.DEF_LOOTING_II_LEVEL;
        Settings.enchantLootingIIILevel = Settings.Enchant.DEF_LOOTING_III_LEVEL;

        if (configuration.hasChanged())
            configuration.save();
    }

    @SubscribeEvent
    public void onConfigurationChangedEvent(ConfigChangedEvent.OnConfigChangedEvent event) {
        if (event.modID.equalsIgnoreCase(Reference.MOD_ID))
            loadConfiguration();
    }
}
