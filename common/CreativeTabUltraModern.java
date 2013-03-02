package UltraModern.common;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.Block;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemStack;

public class CreativeTabUltraModern extends CreativeTabs{

	public CreativeTabUltraModern(int par1 ,String label) {
		super(par1 ,label);
	}
	@SideOnly(Side.CLIENT)
	public int getTabIconItemIndex()
	{
		return Main.WhiteBlock.blockID;
	}
	public String getTranslatedTabLabel()
	{
	return "Ultra Modern ";
	}
}
