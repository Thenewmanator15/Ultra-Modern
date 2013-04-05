package com.TheNewmanator15.UltraModern.Block;

import net.minecraft.block.Block;
import net.minecraft.block.BlockStairs;
import net.minecraft.creativetab.CreativeTabs;

public class Stairs extends BlockStairs{

	protected Stairs(int par1, Block par2Block, int par3) {
		super(par1, par2Block, par3);
		this.setCreativeTab(CreativeTabs.tabBlock);
		this.setLightOpacity(255);
	}

}
