package tk.hipogriff.hipogriffkingdoms.items;

import net.minecraft.item.Item;
import net.minecraftforge.registries.IForgeRegistry;
import tk.hipogriff.hipogriffkingdoms.HipogriffKingdoms;

import java.util.HashMap;

public class ItemManager {

    public static HashMap<String, ItemBase> ITEMS = new HashMap<String, ItemBase>();

    public static void register(IForgeRegistry<Item> registry) {
        for (ItemBase item : ItemManager.ITEMS.values()) {
            registry.register(item);
        }
    }

    public static void registerModels() {
        HipogriffKingdoms.logger.info("[ItemManager] Registrando modelos de items...");
        for (ItemBase item : ItemManager.ITEMS.values()) {
            item.registerItemModel();
        }
    }

}
