package revrocker99.arcana.utils;

import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import revrocker99.arcana.block.BaseBlock;
import revrocker99.arcana.init.ModBlocks;
import revrocker99.arcana.item.ArcaneAsh;
import revrocker99.arcana.item.BaseItem;

@Mod.EventBusSubscriber
public class RegistryHandler {

    @SubscribeEvent
    public static void registerBlocks(RegistryEvent.Register<Block> event) {
        final Block[] blocks = {
                new BaseBlock(Material.CIRCUITS, SoundType.CLOTH, "arcane_symbol_base")
        };

        event.getRegistry().registerAll(blocks);

    }

    @SubscribeEvent
    public static void registerItems(RegistryEvent.Register<Item> event) {
        final Item[] items = {
                new BaseItem("test_item"),
                new ArcaneAsh("arcane_ash")
        };

        final Item[] itemBlocks = {
                new ItemBlock(ModBlocks.ARCANE_SYMBOL_BASE).setRegistryName(ModBlocks.ARCANE_SYMBOL_BASE.getRegistryName())
        };

        event.getRegistry().registerAll(items);
        event.getRegistry().registerAll(itemBlocks);
    }

}
