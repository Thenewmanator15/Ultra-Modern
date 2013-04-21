package com.TheNewmanator15.UltraModern.Block;

import java.util.List;
import java.util.Random;

import com.TheNewmanator15.UltraModern.IDs;
import com.TheNewmanator15.UltraModern.Main;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.Block;
import net.minecraft.block.BlockHalfSlab;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLiving;
import net.minecraft.item.ItemStack;
import net.minecraft.util.AxisAlignedBB;
import net.minecraft.util.Facing;
import net.minecraft.util.Icon;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;

public class StoneSlab extends BlockHalfSlab
{
public static final String[] woodType = { "blackWood" };
private static Icon blockTextureTop ;
private static Icon blockTextureSides ;

public StoneSlab(int par1, boolean par2)
{
super(par1, par2, Material.wood);
setBurnProperties(this.blockID, 5, 20);
useNeighborBrightness[this.blockID] = true;
}

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
public int idDropped(int par1, Random par2Random, int par3)
{
return IDs.singleslabstoneID;
}

public void onBlockPlacedBy(World par1World, int par2, int par3, int par4, EntityLiving par5EntityLiving)
{
if(par1World.getBlockId(par2, par3 - 1, par4) == IDs.singleslabstoneID)
{
par1World.setBlock(par2, par3, par4, 0);
par1World.setBlock(par2, par3 - 1, par4, IDs.doubleslabstoneID);
}
if(par1World.getBlockId(par2, par3 + 1, par4) == IDs.singleslabstoneID)
{
par1World.setBlock(par2, par3, par4, 0);
par1World.setBlock(par2, par3 + 1, par4, IDs.doubleslabstoneID);
}
}

protected ItemStack createStackedBlock(int par1)
{
return new ItemStack(IDs.singleslabstoneID, 2, par1 & 7);
}

public String getFullSlabName(int par1)
{
         if ((par1 < 0) || (par1 >= woodType.length))
         {
         par1 = 0;
         }

         return super.getUnlocalizedName2() + "." + woodType[par1];
}

public void getSubBlocks(int par1, CreativeTabs par2CreativeTabs, List par3List)
{
         if (par1 != IDs.doubleslabstoneID)
         {
         par3List.add(new ItemStack(par1, 1, 0));
         }
}

}
	
	
