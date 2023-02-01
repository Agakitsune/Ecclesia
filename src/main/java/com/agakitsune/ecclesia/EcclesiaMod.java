package com.agakitsune.ecclesia;

import com.agakitsune.ecclesia.tabs.EcclesiaCreativeTab;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import org.apache.logging.log4j.Logger;

import javax.naming.Name;

@Mod(modid = EcclesiaMod.MODID, name = EcclesiaMod.NAME, version = EcclesiaMod.VERSION)
public class EcclesiaMod {

    public static final String MODID = "ecclesia";
    public static final String NAME = "Ecclesia";
    public static final String VERSION = "0.0.1";

    public static final CreativeTabs TAB = new EcclesiaCreativeTab();

    private static Logger logger;

    @Mod.EventHandler
    public void preInit(FMLPreInitializationEvent event) { logger = event.getModLog(); }

    @Mod.EventHandler
    public void init(FMLInitializationEvent event) {
        logger.info("Initializing mod " + NAME);
    }
}
