package me.mom.tab;

import me.mom.init.MoMItems;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;

public class CreativeTabMom extends CreativeTabs {

	public CreativeTabMom() {
		super("OresItems");
	}

	@Override
	public ItemStack getTabIconItem() {
		return new ItemStack(MoMItems.irbread);
	}

}
