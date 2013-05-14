package com.nulltrain.housemod;

import net.minecraft.item.Item;
import net.minecraft.item.ItemFood;

import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.creativetab.CreativeTabs;

public class PorkSandwich extends ItemFood {

	public PorkSandwich(int id, int maxStackSize, int texture, String name) {
		super(id, 13, 0.9F, true);

		setMaxStackSize(maxStackSize);
		setCreativeTab(CreativeTabs.tabMisc);
		setUnlocalizedName(name);
	}

    public void registerIcons(IconRegister par1IconRegister) {
        this.itemIcon = par1IconRegister.registerIcon("housemod:porksandwich");
    }
	
	public String getTextureFile() {
		return CommonProxy.ITEMS_PNG;
	}

}
