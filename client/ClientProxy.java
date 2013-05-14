package com.nulltrain.housemod.client;

import net.minecraftforge.client.MinecraftForgeClient;
import com.nulltrain.housemod.CommonProxy;

public class ClientProxy extends CommonProxy {
        
        @Override
        public void registerRenderers() {
                MinecraftForgeClient.preloadTexture(ITEMS_PNG);
                MinecraftForgeClient.preloadTexture(BLOCK_PNG);
        }
        
}