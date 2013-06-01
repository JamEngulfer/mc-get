package com.mcget;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.network.NetworkMod;

@Mod(modid = "MCget", name = "MC Get", version = "0.01")
@NetworkMod(clientSideRequired = true, serverSideRequired = false, channels = { "MCget" }, packetHandler = ClientPacketHandler.class)
public class MCget {
    
    @Instance
    public static MCget instance = new MCget();
    
    public void load(FMLInitializationEvent event) {
        
    }
}
