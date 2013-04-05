package com.TheNewmanator15.UltraModern.Block;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.creativetab.CreativeTabs;

public class BlockModern extends Block{
	
	private String textureName;
	
	public BlockModern(int id, String textureName) {
		super(id, Material.iron);
		this.setCreativeTab(CreativeTabs.tabBlock);
		this.textureName = textureName;
	}
	public String getTextureName(){
		return this.textureName;
	}
	public void registerIcons(IconRegister reg){
		this.blockIcon = reg.registerIcon("UltraModern:"+ this.getTextureName() );
	}
}
