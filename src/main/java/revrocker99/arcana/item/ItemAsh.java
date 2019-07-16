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
import vazkii.arl.item.ItemMod;


public class ItemAsh extends ItemMod {

    public static final String ITEM_ID = "item_ash";

    public ItemAsh() {
        super(ITEM_ID);

        this.setCreativeTab(Arcana.CREATIVE_TAB);

        this.setMaxDamage(15);
        this.setMaxStackSize(1);
    }

    @Override
    public String getModNamespace() {
        return Arcana.MOD_ID;
    }

    @Override
    public EnumActionResult onItemUse(EntityPlayer player, World worldIn, BlockPos pos, EnumHand hand, EnumFacing facing, float hitX, float hitY, float hitZ) {
        Arcana.LOGGER.info("Ash Right Click Block!"); // Testing

        ItemStack stack = player.getHeldItem(hand);
        BlockPos newPos = pos.offset(facing);

        if (worldIn.isAirBlock(newPos)){
            if (!worldIn.isRemote) {
                worldIn.setBlockState(newPos, ModBlocks.BLOCK_ASH.getDefaultState());
                stack.damageItem(1, player);
            }

            return EnumActionResult.SUCCESS;
        }

        return EnumActionResult.FAIL;
    }
}
