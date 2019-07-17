package revrocker99.arcana.glyph;

import net.minecraft.block.Block;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import revrocker99.arcana.Arcana;
import revrocker99.arcana.init.ModBlocks;
import revrocker99.arcana.interf.IGlyph;

// TODO Create IGlyph from this class as a template
public class GlyphBeacon implements IGlyph {

    public static final String GLYPH_ID = "glyph_beacon";
    public static final int[][] SEARCH = {{1,0,1},{-1,0,-1},{-1,0,1},{1,0,-1}};
    public static final int se = 0;
    public static final int nw = 1;
    public static final int sw = 2;
    public static final int ne = 3;

    public boolean checkGlyph(World worldIn, BlockPos pos, EntityPlayer player) {

        BlockPos NE = pos.add(SEARCH[ne][0], SEARCH[ne][1], SEARCH[ne][2]);
        BlockPos NW = pos.add(SEARCH[nw][0], SEARCH[nw][1], SEARCH[nw][2]);
        BlockPos SW = pos.add(SEARCH[sw][0], SEARCH[sw][1], SEARCH[sw][2]);
        BlockPos SE = pos.add(SEARCH[se][0], SEARCH[se][1], SEARCH[se][2]);

        Block bNE = worldIn.getBlockState(NE).getBlock();
        Block bNW = worldIn.getBlockState(NW).getBlock();
        Block bSE = worldIn.getBlockState(SE).getBlock();
        Block bSW = worldIn.getBlockState(SW).getBlock();

        if (bNE.isAssociatedBlock(ModBlocks.BLOCK_ASH) && bNW.isAssociatedBlock(ModBlocks.BLOCK_ASH) && bSE.isAssociatedBlock(ModBlocks.BLOCK_ASH) && bSW.isAssociatedBlock(ModBlocks.BLOCK_ASH)) {
            Arcana.LOGGER.info("True Check Glyph Beacon"); //TEST
            return true;
        }
        else {
            Arcana.LOGGER.info("False Check Glyph Beacon");
            return false;
        }
    }

    public void activate(World worldIn, BlockPos pos, EntityPlayer player) {
        player.fall(5,1); // Deals 1 heart of damage.
        Arcana.LOGGER.info("Activate Glyph Beacon");
    }

}
