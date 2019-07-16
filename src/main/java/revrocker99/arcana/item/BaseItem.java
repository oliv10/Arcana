package revrocker99.arcana.item;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import revrocker99.arcana.Arcana;

public class BaseItem extends Item {

    public BaseItem(String itemID){
        setRegistryName(Arcana.MOD_ID, itemID);
        setTranslationKey(Arcana.MOD_ID + "." + itemID);
        setCreativeTab(Arcana.CREATIVE_TAB);
    }

}
