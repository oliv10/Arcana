package revrocker99.arcana.interf;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

public interface IGlyph {

    boolean checkGlyph(World worldIn, BlockPos pos, EntityPlayer player);

    void activate(World worldIn, BlockPos pos, EntityPlayer player);

    String getGlyphID();

    int getSize();

}
