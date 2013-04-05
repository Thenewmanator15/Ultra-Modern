package com.TheNewmanator15.UltraModern;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.Block;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemStack;

public class CreativeTab extends CreativeTabs{

	public CreativeTab(int par1 ,String label) {
		super(par1 ,label);
	}
	@SideOnly(Side.CLIENT)
	public int getTabIconItemIndex()
	{
		return IDs.whiteBlockID;
	}
	public String getTranslatedTabLabel(){
	
	return "Ultra Modern ";
	}
}
