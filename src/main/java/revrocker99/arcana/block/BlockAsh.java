package revrocker99.arcana.block;

import net.minecraft.block.SoundType;
import net.minecraft.block.state.IBlockState;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockAccess;
import revrocker99.arcana.Arcana;
import vazkii.arl.block.BlockModDust;

import java.util.Random;

// TODO Add textures.
public class BlockAsh extends BlockModDust {

    public static final String ITEM_ID = "block_ash";

    public BlockAsh() {
        super(ITEM_ID);

        this.setCreativeTab(Arcana.CREATIVE_TAB);

        this.setSoundType(SoundType.CLOTH);
    }

    @Override
    public String getModNamespace() {
        return Arcana.MOD_ID;
    }

    @Override
    public int getColor(IBlockAccess world, IBlockState state, BlockPos pos, int tint) {
        return 0x222222;
    }

    /**
     * makes not drop item on destruction.
     * @param random
     * @return 0
     */
    @Override
    public int quantityDropped(Random random) {
        return 0;
    }
}