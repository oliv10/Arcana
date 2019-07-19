package revrocker99.arcana.item;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.util.EnumActionResult;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.EnumHand;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import revrocker99.arcana.Arcana;
import revrocker99.arcana.init.ModGlyphs;
import vazkii.arl.item.ItemMod;

/**
 * This item is used for testing purposes of checking for the creation of proper multi-block
 * structures made from block_ash.
 */
public class ItemCursedStone extends ItemMod {

    public static final String ITEM_ID = "item_cursed_stone";

    public ItemCursedStone() {
        super(ITEM_ID);

        this.setCreativeTab(Arcana.CREATIVE_TAB);
    }

    @Override
    public String getModNamespace() {
        return Arcana.MOD_ID;
    }

    @Override
    public EnumActionResult onItemUse(EntityPlayer player, World worldIn, BlockPos pos, EnumHand hand, EnumFacing facing, float hitX, float hitY, float hitZ) {
        Arcana.LOGGER.info("Cursed Stone right click on block!"); // TEST

        BlockPos newPos = pos.offset(facing);

        if (worldIn.isAirBlock(newPos)) {
            if (!worldIn.isRemote) {
                // 7x7 Glyphs

                // 5x5 Glyphs

                // 3x3 Glyphs
                if(ModGlyphs.glyph_beacon.checkGlyph(worldIn, newPos, player)) {
                    ModGlyphs.glyph_beacon.activate(worldIn, newPos, player);
                }
            }
            return EnumActionResult.SUCCESS;
        }
        return EnumActionResult.FAIL;
    }

    @Override
    public boolean hasEffect(ItemStack stack) {
        return true;
    }
}
