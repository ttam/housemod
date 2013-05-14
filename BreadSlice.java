package com.nulltrain.housemod;

import net.minecraft.item.Item;

import net.minecraft.creativetab.CreativeTabs;

public class BreadSlice extends Item {

	public BreadSlice(int id, int maxStackSize, int texture, String name) {
		super(id);

		setMaxStackSize(maxStackSize);
		setCreativeTab(CreativeTabs.tabMisc);
		setUnlocalizedName(name);
	}

	public String getTextureFile() {
		return CommonProxy.ITEMS_PNG;
	}

}
