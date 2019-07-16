package revrocker99.arcana.utils;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import revrocker99.arcana.Arcana;

public class ItemUtils {

    public Item setID(Item item, String ID) {

        item.setRegistryName(Arcana.MOD_ID, ID);
        item.setTranslationKey(Arcana.MOD_ID + "." + ID);
        item.setCreativeTab(CreativeTabs.MISC);

        return item;
    }

}
