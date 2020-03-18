package tk.hipogriff.hipogriffkingdoms.tabs;

import tk.hipogriff.hipogriffkingdoms.items.ItemBase;
import tk.hipogriff.hipogriffkingdoms.items.ItemManager;

import java.util.HashMap;

public class TabManager {

    public static final HashMap<String, TabBase> TABS = new HashMap<String, TabBase>();

    public static void setItemsTab() {
        for (ItemBase item : ItemManager.ITEMS.values()) {
            item.setCreativeTab(TABS.get(item.tab));
        }
    }

}
