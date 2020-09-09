package me.mom.proxy;

import me.mom.init.MoMModels;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

public class ClientProxy extends CommonProxy {
	
public void preinit(FMLPreInitializationEvent e) {
		super.preinit(e);
		MinecraftForge.EVENT_BUS.register(MoMModels.class);
	}

	public void init(FMLInitializationEvent e) {
		super.init(e);
	}

	public void postinit(FMLPostInitializationEvent e) {
		super.postinit(e);
	}


}
