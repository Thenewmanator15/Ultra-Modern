package com.TheNewmanator15.UltraModern.Block;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.util.Icon;
import net.minecraft.world.IBlockAccess;

public class BlockStone extends Block {
	
	Icon blockTextureSides;
	Icon blockTextureTop;
	
	public static Icon[] textures = new Icon[2];
	
	public BlockStone(int par1)
	{
		super(par1, Material.iron);
		this.setCreativeTab(CreativeTabs.tabBlock);
	}
	
	@Override
	@SideOnly(Side.CLIENT)
	public void registerIcons(IconRegister par1IconRegister)
	{
	    blockTextureSides = par1IconRegister.registerIcon("UltraModern:StoneBlockSide");
        blockTextureTop = par1IconRegister.registerIcon("UltraModern:StoneBlockTop");
        
	}
	
	@Override
	public Icon getBlockTextureFromSideAndMetadata(int i, int j) {
		if (i == 0 || i == 1)
			return blockTextureTop;

		else

		return blockTextureSides;
	}
	
}
	

