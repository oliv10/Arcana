package revrocker99.arcana.interf;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

//TODO Optimize creating of glyph multi-blocks
public interface IGlyph {

    boolean checkGlyph(World worldIn, BlockPos pos, EntityPlayer player);

    void activate(World worldIn, BlockPos pos, EntityPlayer player);

}
