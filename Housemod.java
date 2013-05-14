package com.nulltrain.housemod;

import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.item.ItemFood;
import net.minecraft.item.ItemStack;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.Init;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.Mod.PostInit;
import cpw.mods.fml.common.Mod.PreInit;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.network.NetworkMod;
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.common.registry.LanguageRegistry;



@Mod(modid="Housemod", name="Housemod", version="0.0.0")
@NetworkMod(clientSideRequired=true, serverSideRequired=false)
public class Housemod {

        // The instance of your mod that Forge uses.
        @Instance("Housemod")
        public static Housemod instance;

        private final static ItemFood porkSandwich = new PorkSandwich(5400, 16, 1, "porkSandwich");
        private final static Item breadSlice = new BreadSlice(5401, 16, 1, "breadSlice");
        
        // Says where the client and server 'proxy' code is loaded.
        @SidedProxy(clientSide="com.nulltrain.housemod.client.ClientProxy", serverSide="com.nulltrain.housemod.CommonProxy")
        public static CommonProxy proxy;
        
        @PreInit
        public void preInit(FMLPreInitializationEvent event) {
                // Stub Method
        }
        
        @Init
        public void load(FMLInitializationEvent event) {
                proxy.registerRenderers();
                
                // Items we need for recipes
                ItemStack breadSliceStack = new ItemStack(breadSlice);
                ItemStack fourSlicesStack = new ItemStack(breadSlice, 4);
                ItemStack porkStack = new ItemStack(Item.porkCooked);
                ItemStack breadStack = new ItemStack(Item.bread);
                
                // Recipes
                
                // Cheating to start off
                GameRegistry.addShapelessRecipe(breadStack, new ItemStack(Block.dirt));
                GameRegistry.addRecipe(new ItemStack(Item.porkCooked), "x", "x", 'x', new ItemStack(Block.dirt));

                // Pork between two slices of bread
                GameRegistry.addRecipe(new ItemStack(porkSandwich), "x", "y", "x", 'x', breadSliceStack, 'y', porkStack);

                // Bread by itself
                GameRegistry.addShapelessRecipe(fourSlicesStack, breadStack);

                // Nice names for items
                LanguageRegistry.addName(porkSandwich, "Pork Sandwich");
                LanguageRegistry.addName(breadSlice, "Slice of Bread");
        }
        
        @PostInit
        public void postInit(FMLPostInitializationEvent event) {
                // Stub Method
        }
}