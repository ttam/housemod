package com.nulltrain.housemod;

import net.minecraft.item.Item;

import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.creativetab.CreativeTabs;

public class BreadSlice extends Item {

	public BreadSlice(int id, int maxStackSize, int texture, String name) {
		super(id);

		setMaxStackSize(maxStackSize);
		setCreativeTab(CreativeTabs.tabMisc);
		setUnlocalizedName(name);
	}

    public void registerIcons(IconRegister par1IconRegister) {
        this.itemIcon = par1IconRegister.registerIcon("housemod:breadslice");
    }

	public String getTextureFile() {
		return CommonProxy.ITEMS_PNG;
	}

}
