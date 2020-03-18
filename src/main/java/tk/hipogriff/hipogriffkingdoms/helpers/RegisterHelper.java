package tk.hipogriff.hipogriffkingdoms.helpers;

import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import tk.hipogriff.hipogriffkingdoms.HipogriffKingdoms;
import tk.hipogriff.hipogriffkingdoms.blocks.BlockBase;
import tk.hipogriff.hipogriffkingdoms.blocks.BlockManager;
import tk.hipogriff.hipogriffkingdoms.items.ItemBase;
import tk.hipogriff.hipogriffkingdoms.items.ItemManager;

@Mod.EventBusSubscriber
public class RegisterHelper {

    /** Registro de items de Hipogriff Kingodms */
    @SubscribeEvent
    public static void registerItems(RegistryEvent.Register<Item> event) {
        HipogriffKingdoms.logger.info("[RegisterHelper] Registrando items...");
        for (ItemBase item : ItemManager.ITEMS.values()) {
            event.getRegistry().register(item.setRegistryName(HipogriffKingdoms.MOD_ID, item.name).setTranslationKey(item.name));
            HipogriffKingdoms.logger.info("[RegisterHelper] Registrado item " + item.name);
        }
    }

    @SubscribeEvent
    public static void registerItems(ModelRegistryEvent event) {
        HipogriffKingdoms.logger.info("[RegisterHelper] Accediendo a Item Manager para registrar modelos de items...");
        ItemManager.registerModels();
    }

    /** Registro de blocks de Hipogriff Kingodms */
    @SubscribeEvent
    public static void addBlocks(RegistryEvent.Register<Block> event) {
        for (BlockBase block : BlockManager.BLOCKS.values()) {
            event.getRegistry().register(block.setRegistryName(HipogriffKingdoms.MOD_ID, block.name).setTranslationKey(block.name));
        }
    }
}
