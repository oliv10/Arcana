package revrocker99.arcana;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

@Mod(modid = Arcana.MODID, name = Arcana.NAME, version = Arcana.VERSION, acceptedMinecraftVersions = Arcana.MC_VERSION)
public class Arcana {

    public static final String MODID = "arcana";
    public static final String NAME = "Arcana";
    public static final String VERSION = "0.0.1";
    public static final String MC_VERSION = "[1.12.2]";

    public static final CreativeTabs CREATIVE_TAB = CreativeTabs.MISC;

    public static final Logger LOGGER = LogManager.getLogger(Arcana.MODID);

    @EventHandler
    public void preInit() {

    }

    @EventHandler
    public void init() {
        LOGGER.info(Arcana.NAME + "says hi!");
    }

    @EventHandler
    public void postInit() {

    }

}