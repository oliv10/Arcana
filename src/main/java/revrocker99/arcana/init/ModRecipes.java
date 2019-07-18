package revrocker99.arcana.init;

import net.minecraft.block.BlockBone;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class ModRecipes {
    public static void init() {
        GameRegistry.addSmelting(BlockBone.getBlockFromName("bone_block"), new ItemStack(ModItems.ITEM_ASH, 1), 0.5f);
    }

}
