package UltraModern.common;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;


public class WhiteBlock extends Block{
	public WhiteBlock(int id, int texture, Material mat ){
		super(id, texture, mat);
		this.setCreativeTab(CreativeTabs.tabBlock);
	}
public String getTextureFile(){
	return "/UltraModern/TextureUM.png";
}
	
}
