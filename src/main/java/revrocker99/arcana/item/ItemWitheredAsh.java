package revrocker99.arcana.item;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.util.EnumActionResult;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.EnumHand;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import revrocker99.arcana.Arcana;
import revrocker99.arcana.init.ModBlocks;
import revrocker99.arcana.utils.UAsh;
import vazkii.arl.item.ItemMod;

public class ItemWitheredAsh extends ItemMod {

    public static final String ITEM_ID = "item_withered_ash";

    public ItemWitheredAsh() {
        super(ITEM_ID);
        UAsh.setupAsh(this);
        this.setCreativeTab(Arcana.CREATIVE_TAB);
    }

    @Override
    public String getModNamespace() {
        return Arcana.MOD_ID;
    }

    @Override
    public EnumActionResult onItemUse(EntityPlayer player, World worldIn, BlockPos pos, EnumHand hand, EnumFacing facing, float hitX, float hitY, float hitZ) {
        Arcana.LOGGER.info("Withered Ash Right Click Block!"); // TEST

        ItemStack stack = player.getHeldItem(hand);
        BlockPos newPos = pos.offset(facing);

        if (worldIn.isAirBlock(newPos)){
            if (!worldIn.isRemote) {
                worldIn.setBlockState(newPos, ModBlocks.BLOCK_WITHERED_ASH.getDefaultState());
                stack.damageItem(1, player);
            }

            return EnumActionResult.SUCCESS;
        }

        return EnumActionResult.FAIL;
    }
}
