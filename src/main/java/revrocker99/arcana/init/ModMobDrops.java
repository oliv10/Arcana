package revrocker99.arcana.init;

import net.minecraft.entity.monster.EntityWitherSkeleton;
import net.minecraftforge.event.entity.living.LivingDropsEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

import java.util.Random;

public class ModMobDrops {

    private Random r = new Random();

    @SubscribeEvent
    public void onEntityDrop(LivingDropsEvent event) {
        if(event.getEntityLiving() instanceof EntityWitherSkeleton && r.nextInt(100)<35) {
            event.getEntityLiving().dropItem(ModItems.ITEM_WITHERED_BONE, 2);
        }
    }

}
