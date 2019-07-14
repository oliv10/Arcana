package revrocker99.arcana.item;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.EnumActionResult;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.EnumHand;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import revrocker99.arcana.Arcana;
import revrocker99.arcana.init.ModBlocks;

/**
 * Arcane Ash is used to draw arcane inscriptions on the ground for crafting and summoning.
 */
public class ArcaneAsh extends BaseItem {

    public ArcaneAsh(String itemID){
        super(itemID);
        setMaxDamage(15);
        setMaxStackSize(1);
    }

    //TODO Add Item Functionality
    @Override
    public EnumActionResult onItemUse(EntityPlayer player, World world, BlockPos blockPos, EnumHand hand, EnumFacing side, float hitX, float hitY, float hitZ) {
        Arcana.LOGGER.info("Arcane Ash Right Click!");

        ItemStack stack = player.getHeldItem(hand);
        stack.damageItem(1, player); //Deals damage to item in hand

        return EnumActionResult.PASS;
    }

}
