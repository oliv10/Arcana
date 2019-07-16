package revrocker99.arcana.block;

import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import revrocker99.arcana.Arcana;

public class BaseBlock extends Block {

    public BaseBlock(Material material, SoundType sound, String itemID) {
        super(material);
        setRegistryName(Arcana.MOD_ID, itemID);
        setTranslationKey(Arcana.MOD_ID + "." + itemID);
        setSoundType(sound);
        setCreativeTab(Arcana.CREATIVE_TAB);
    }

}
