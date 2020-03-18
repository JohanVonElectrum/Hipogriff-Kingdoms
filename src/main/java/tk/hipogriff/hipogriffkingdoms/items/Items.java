package tk.hipogriff.hipogriffkingdoms.items;

import net.minecraftforge.fml.common.registry.GameRegistry;
import tk.hipogriff.hipogriffkingdoms.HipogriffKingdoms;
import tk.hipogriff.hipogriffkingdoms.items.*;
import tk.hipogriff.hipogriffkingdoms.items.keys.*;
import tk.hipogriff.hipogriffkingdoms.items.staffs.*;

/** Lista de items para que sean detectados por Forge */

@GameRegistry.ObjectHolder(HipogriffKingdoms.MOD_ID)
public class Items {
    public static final ItemBase admin_key = new AdminKey();

    public static final ItemBase wooden_staff = new WoodenStaff();
    public static final ItemBase translocation_staff = new TranslocationStaff();
    public static final ItemBase infernal_staff = new InfernalStaff();

    public Items() {
        HipogriffKingdoms.logger.info("[Items] ITEMS!");
    }
}
