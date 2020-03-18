package tk.hipogriff.hipogriffkingdoms.tabs;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;
import tk.hipogriff.hipogriffkingdoms.HipogriffKingdoms;
import tk.hipogriff.hipogriffkingdoms.items.ItemBase;

public class TabBase extends CreativeTabs {

    String label;
    ItemStack icon;

    public TabBase(String label, ItemBase icon) {
        super(label);

        this.label = label;
        this.icon = icon.getItemStack(1, 0, null);

        addTabToManager();
    }

    @Override
    public ItemStack createIcon() {
        return this.icon;
    }

    public void addTabToManager() {
        TabManager.TABS.put(label, this);
    }
}
