package me.mom;

import static me.mom.MoreOreConstants.*;

import me.mom.proxy.CommonProxy;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.Mod.Instance;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = MODID, name = NAME, version = VERSION)
public class MoreOreMod {
	
	@Instance
	private static MoreOreMod instance;
	
	public static MoreOreMod getInstance() {
		return instance;
	}
	@SidedProxy(serverSide = "me.mom.proxy.CommonProxy", clientSide = "me.mom.proxy.ClientProxy")
	private static CommonProxy proxy;
	
	@EventHandler
	public void preInit(FMLPreInitializationEvent e) {
		proxy.preinit(e);
	}
	
	public void init(FMLInitializationEvent e) {
		proxy.init(e);
	}
	
	public void posInit(FMLPostInitializationEvent e) {
		proxy.postinit(e);
	}

}
