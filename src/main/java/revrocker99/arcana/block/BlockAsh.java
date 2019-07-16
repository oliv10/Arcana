package revrocker99.arcana.block;

import net.minecraft.block.SoundType;
import net.minecraft.block.state.IBlockState;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockAccess;
import revrocker99.arcana.Arcana;
import vazkii.arl.block.BlockModDust;

public class BlockAsh extends BlockModDust {

    public static final String ITEM_ID = "block_ash";

    public BlockAsh() {
        super(Arcana.MOD_ID + ITEM_ID);

        this.setCreativeTab(Arcana.CREATIVE_TAB);

//        this.setRegistryName(Arcana.MOD_ID + ITEM_ID);
//        this.setTranslationKey(Arcana.MOD_ID + "." + ITEM_ID);

        this.setSoundType(SoundType.CLOTH);

    }

    @Override
    public int getColor(IBlockAccess world, IBlockState state, BlockPos pos, int tint) {
        return 0;
    }

    @Override
    public String getModNamespace() {
        return Arcana.MOD_ID;
    }
}
