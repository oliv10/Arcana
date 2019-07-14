package revrocker99.arcana.item;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import revrocker99.arcana.Arcana;

public class BaseItem extends Item {

    public BaseItem(String itemID){
        setRegistryName(Arcana.MODID, itemID);
        setTranslationKey(Arcana.MODID + "." + itemID);
        setCreativeTab(Arcana.CREATIVE_TAB); //TODO Add Custom Creative Tab
    }

}
