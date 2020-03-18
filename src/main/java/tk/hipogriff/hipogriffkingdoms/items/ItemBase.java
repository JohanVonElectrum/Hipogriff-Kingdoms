package tk.hipogriff.hipogriffkingdoms.items;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import tk.hipogriff.hipogriffkingdoms.HipogriffKingdoms;

public class ItemBase extends Item {

    public String name;
    public String tab;

    public ItemBase(String name, String tab, int maxStackSize) {
        this.name = name;
        this.tab = tab;

        setMaxStackSize(maxStackSize);

        HipogriffKingdoms.logger.info("[ItemBase] Creado item " + name);
        addItemToManager();
    }

    public void registerItemModel() {
        HipogriffKingdoms.proxy.registerItemRenderer(this, 0, name);
    }

    @Override
    public ItemBase setCreativeTab(CreativeTabs tab) {
        super.setCreativeTab(tab);
        return this;
    }

    public void addItemToManager() {
        ItemManager.ITEMS.put(name, this);
        HipogriffKingdoms.logger.info("[ItemBase] Añadido a Item Manager " + name);
    }

    public ItemStack getItemStack(int count, int meta, NBTTagCompound nbt) {
        return new ItemStack(this, count, meta, nbt);
    }

}
