package com.nulltrain.housemod;

import net.minecraft.item.Item;
import net.minecraft.item.ItemFood;

import net.minecraft.creativetab.CreativeTabs;

public class PorkSandwich extends ItemFood {

	public PorkSandwich(int id, int maxStackSize, int texture, String name) {
		super(id, 5, 0.6F, false);

		setMaxStackSize(maxStackSize);
		setCreativeTab(CreativeTabs.tabMisc);
		setUnlocalizedName(name);
	}

	public String getTextureFile() {
		return CommonProxy.ITEMS_PNG;
	}

}
