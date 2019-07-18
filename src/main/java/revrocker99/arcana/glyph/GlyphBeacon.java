package revrocker99.arcana.glyph;

import net.minecraft.block.Block;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.text.TextComponentString;
import net.minecraft.world.World;
import revrocker99.arcana.Arcana;
import revrocker99.arcana.init.ModBlocks;
import revrocker99.arcana.interf.IGlyph;

public class GlyphBeacon implements IGlyph {

    public static final String GLYPH_ID = "glyph_beacon";
    public static final int[][] SEARCH = {{1,0,1},{-1,0,-1},{-1,0,1},{1,0,-1}}; // Blocks checked around source of cursed stone.
    public static final int[][] VOID = {{1,0,0},{0,0,1},{-1,0,0},{0,0,-1}}; // Check for air blocks in remaining spaces.
    public static final int SIZE = 3;

    @Override
    public boolean checkGlyph(World worldIn, BlockPos pos, EntityPlayer player) {

        for (int[] i: SEARCH) {
            BlockPos checkPos = pos.add(i[0], i[1], i[2]);
            Block checkBlock = worldIn.getBlockState(checkPos).getBlock();
            if (!checkBlock.isAssociatedBlock(ModBlocks.BLOCK_ASH)){
                return false;
            }
        }
        for (int[] i: VOID) {
            BlockPos checkPos = pos.add(i[0], i[1], i[2]);
            Block checkBlock = worldIn.getBlockState(checkPos).getBlock();
            if (checkBlock.isAssociatedBlock(ModBlocks.BLOCK_ASH)) {
                return false;
            }
        }
        return true;
    }

    @Override
    public void activate(World worldIn, BlockPos pos, EntityPlayer player) {
        player.fall(5,1); // Deals 1 heart of damage.
        player.addExhaustion(5);
        player.sendMessage(new TextComponentString("Glyph Activated"));
        Arcana.LOGGER.info("Activate Glyph Beacon");
    }

    @Override
    public String getGlyphID() {
        return GLYPH_ID;
    }

    @Override
    public int getSize() {
        return SIZE;
    }
}
