package me.mom.proxy;

import me.mom.init.MoMItems;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

public class CommonProxy {

	public void preinit(FMLPreInitializationEvent e) {
		MoMItems.init();
		
		MinecraftForge.EVENT_BUS.register(MoMItems.class);
	}

	public void init(FMLInitializationEvent e) {
		
	}

	public void postinit(FMLPostInitializationEvent e) {
		
	}

}
