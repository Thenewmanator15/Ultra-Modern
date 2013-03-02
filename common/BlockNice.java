package UltraModern.common;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;

public class BlockNice extends Block{
	
	public BlockNice(int id, int texture, Material mat ){
		super(id, texture, mat);
		this.setCreativeTab(CreativeTabs.tabBlock);
	}
public String getTextureFile(){
	return "/UltraModern/Texture_UltraModern.png";
}
}
