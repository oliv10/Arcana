package revrocker99.arcana.tabs;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import revrocker99.arcana.Arcana;
import revrocker99.arcana.init.ModItems;

public class ArcanaTab extends CreativeTabs {

    public ArcanaTab() {
        super(Arcana.MOD_ID);
    }

    @SideOnly(Side.CLIENT)
    @Override
    public ItemStack getIcon() {
        return new ItemStack(ModItems.ITEM_ASH);
    }

    @Override
    public ItemStack createIcon() {
        return null;
    }
}
