package tk.hipogriff.hipogriffkingdoms.tabs;

import tk.hipogriff.hipogriffkingdoms.HipogriffKingdoms;
import tk.hipogriff.hipogriffkingdoms.items.ItemBase;
import tk.hipogriff.hipogriffkingdoms.items.ItemManager;

public class Tabs {

    public static final TabBase keys_tab = new KeysTab();
    public static final TabBase staffs_tab = new StaffsTab();

    public Tabs() {
        HipogriffKingdoms.logger.info("[Tabs] TABS!");
    }

}
