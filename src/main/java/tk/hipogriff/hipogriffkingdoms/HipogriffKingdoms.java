package tk.hipogriff.hipogriffkingdoms;

import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.Mod;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import tk.hipogriff.hipogriffkingdoms.blocks.Blocks;
import tk.hipogriff.hipogriffkingdoms.items.Items;
import tk.hipogriff.hipogriffkingdoms.proxy.CommonProxy;
import tk.hipogriff.hipogriffkingdoms.tabs.TabManager;
import tk.hipogriff.hipogriffkingdoms.tabs.Tabs;

@Mod(
        modid = HipogriffKingdoms.MOD_ID,
        name = HipogriffKingdoms.MOD_NAME,
        version = HipogriffKingdoms.VERSION,
        useMetadata = true
)
public class HipogriffKingdoms {

    public static final String MOD_ID = "hipogriffkingdoms";
    public static final String MOD_NAME = "Hipogriff Kingdoms";
    public static final String VERSION = "1.0.0";

    /** Instancia del mod creada por Forge */
    @Mod.Instance(MOD_ID)
    public static HipogriffKingdoms INSTANCE;

    @SidedProxy(serverSide = "tk.hipogriff.hipogriffkingdoms.proxy.CommonProxy", clientSide = "tk.hipogriff.hipogriffkingdoms.proxy.ClientProxy")
    public static CommonProxy proxy;

    public static Logger logger;

    /** Primer paso de inicialización. Las Tile Entities tienen que registrarse aquí.*/
    @Mod.EventHandler
    public void preinit(FMLPreInitializationEvent event) {
        logger = event.getModLog();
        logger.info("[HipogriffKingdoms] PREINIT!");

        new Items();
        new Blocks();
        new Tabs();
    }

    /**
     * This is the second initialization event. Register custom recipes
     */
    @Mod.EventHandler
    public void init(FMLInitializationEvent event) {
        TabManager.setItemsTab();
    }

    /**
     * This is the final initialization event. Register actions from other mods here
     */
    @Mod.EventHandler
    public void postinit(FMLPostInitializationEvent event) {

    }



}
