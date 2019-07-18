package revrocker99.arcana.item;

import revrocker99.arcana.Arcana;
import vazkii.arl.item.ItemMod;

public class ItemWitheredBone extends ItemMod {

    public static final String ITEM_ID = "item_withered_bone";

    public ItemWitheredBone() {
        super(ITEM_ID);
    }

    public String getModNamespace() {
        return Arcana.MOD_ID;
    }

}
