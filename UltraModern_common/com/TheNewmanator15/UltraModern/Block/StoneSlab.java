package com.TheNewmanator15.UltraModern.Block;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.Block;
import net.minecraft.block.BlockHalfSlab;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.util.Icon;

public class StoneSlab extends BlockHalfSlab{

	private static Icon blockTextureTop ;
	private static Icon blockTextureSides;

	public StoneSlab(int par1, boolean par2, Material par3Material) {
		super(par1, par2, Material.ice);
		this.setCreativeTab(CreativeTabs.tabBlock);
        this.setLightOpacity(0);//Fixes most of the Halfslab lightning bugs
	}

	@Override
	public String getFullSlabName(int i) {
		// TODO Auto-generated method stub
		return null;
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
