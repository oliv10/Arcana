package revrocker99.arcana.block;

import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import revrocker99.arcana.Arcana;

public class BaseBlock extends Block {

    public BaseBlock(Material material, SoundType sound, String itemID) {
        super(material);
        setRegistryName(Arcana.MODID, itemID);
        setTranslationKey(Arcana.MODID + "." + itemID);
        setSoundType(sound);
        setCreativeTab(Arcana.CREATIVE_TAB); //TODO Add Custom Creative Tab
    }

}
