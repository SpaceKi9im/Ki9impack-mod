package me.mom.item;

import me.mom.init.MoMTabs;
import net.minecraft.item.ItemFood;

public class ItemDiamondBread extends ItemFood{
	
	public ItemDiamondBread() {
		super(10, 2, false);
		setCreativeTab(MoMTabs.tab);
	}

}
