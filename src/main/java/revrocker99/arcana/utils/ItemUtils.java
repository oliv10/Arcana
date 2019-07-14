package revrocker99.arcana.utils;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import revrocker99.arcana.Arcana;

public class ItemUtils {

    public Item setID(Item item, String ID) {

        item.setRegistryName(Arcana.MODID, ID);
        item.setTranslationKey(Arcana.MODID + "." + ID);
        item.setCreativeTab(CreativeTabs.MISC); //TODO Add Custom Creative Tab

        return item;
    }

}
