package me.mom.init;

import me.mom.MoreOreConstants;
import me.mom.item.ItemDiamondBread;
import me.mom.item.ItemIronBread;
import net.minecraft.item.Item;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.registries.IForgeRegistry;

public class MoMItems {
	
	public static final ItemIronBread irbread = new ItemIronBread();
	
	public static final ItemDiamondBread dbread = new ItemDiamondBread();
	
	public static void init() {
		setName(irbread, "iron_bread");
		setName(dbread, "diamond_bread");
	}
	
	@SubscribeEvent
	public static void register(RegistryEvent.Register<Item> e) {
		IForgeRegistry<Item> registry = e.getRegistry();
		registry.register(irbread);
		registry.register(dbread);
	}
	
	public static void setName(Item item, String name) {
		
		item.setRegistryName(new ResourceLocation(MoreOreConstants.MODID, name));
		item.setUnlocalizedName(name);
		
	}

}
