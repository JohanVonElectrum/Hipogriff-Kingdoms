package tk.hipogriff.hipogriffkingdoms.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.material.MapColor;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import tk.hipogriff.hipogriffkingdoms.HipogriffKingdoms;
import tk.hipogriff.hipogriffkingdoms.items.ItemBase;
import tk.hipogriff.hipogriffkingdoms.items.ItemManager;

public class BlockBase extends Block {

    public String name;

    public BlockBase(String name, Material blockMaterialIn, MapColor blockMapColorIn) {
        super(blockMaterialIn, blockMapColorIn);

        this.name = name;
    }

    @Override
    public BlockBase setCreativeTab(CreativeTabs tab) {
        super.setCreativeTab(tab);
        return this;
    }

    public void addBlockToManager() {
        BlockManager.BLOCKS.put(name, this);
    }
}
