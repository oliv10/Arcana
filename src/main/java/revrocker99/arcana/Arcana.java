package revrocker99.arcana;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import revrocker99.arcana.block.BlockAsh;
import revrocker99.arcana.item.ItemAsh;
import revrocker99.arcana.item.ItemCursedStone;
import vazkii.arl.util.ProxyRegistry;

@Mod(modid = Arcana.MOD_ID, name = Arcana.NAME, version = Arcana.VERSION, acceptedMinecraftVersions = Arcana.MC_VERSION, dependencies = Arcana.DEPEND)
public class Arcana {

    public static final String MOD_ID = "arcana";
    public static final String NAME = "Arcana";
    public static final String VERSION = "0.0.1";
    public static final String MC_VERSION = "[1.12.2]";
    public static final String DEPEND = "required-after:autoreglib@[1.3-31,)";

    public static final CreativeTabs CREATIVE_TAB = CreativeTabs.MISC; //TODO Add Custom Creative Tab

    public static final Logger LOGGER = LogManager.getLogger(Arcana.MOD_ID);

    @Mod.Instance(MOD_ID)
    public static Arcana instance;

    @EventHandler
    public void preInit(FMLPreInitializationEvent event) {
        LOGGER.info(Arcana.NAME + " has started loading Blocks and Items.");
        ProxyRegistry.register(new BlockAsh());
        ProxyRegistry.register(new ItemAsh());
        ProxyRegistry.register(new ItemCursedStone()); // TEST Item used for testing Glyphs
        LOGGER.info(Arcana.NAME + " is done loading Blocks and Items.");
    }

    @EventHandler
    public void init(FMLInitializationEvent event) {
        LOGGER.info(Arcana.NAME + " says hi!");
    }

    @EventHandler
    public void postInit(FMLPostInitializationEvent event) {

    }

}