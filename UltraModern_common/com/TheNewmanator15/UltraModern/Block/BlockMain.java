package com.TheNewmanator15.UltraModern.Block;

import com.TheNewmanator15.UltraModern.Main;
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.common.registry.LanguageRegistry;
import net.minecraft.block.Block;
import net.minecraft.block.BlockHalfSlab;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import com.TheNewmanator15.UltraModern.IDs;
public class BlockMain {
	
	//Blocks
	public static Block whiteBlock;
	public static Block blackBlock;
	public static Block glass;
	public static BlockHalfSlab doubleslabstone;
	public static BlockHalfSlab singleslabstone;

	
	public static void SetupBlocks() {
		
	//Blocks
	whiteBlock = new BlockModern(IDs.whiteBlockID,"WhiteBlock").setUnlocalizedName("White Block").setCreativeTab(Main.ultramodern);
	blackBlock = new BlockModern(IDs.blackBlockID, "BlackBlock").setUnlocalizedName("Black Block").setCreativeTab(Main.ultramodern);
	glass = new BlockTransparent(IDs.glassID,"Glass").setUnlocalizedName("Glass").setCreativeTab(Main.ultramodern);
	singleslabstone = (BlockHalfSlab)(new StoneSlab(IDs.singleslabstoneID, false)).setUnlocalizedName("StoneSlab").setCreativeTab(Main.ultramodern);
	doubleslabstone = (BlockHalfSlab)(new StoneSlab(IDs.doubleslabstoneID, true)).setUnlocalizedName("Stone Block").setCreativeTab(Main.ultramodern);
	gameRegisters();
	languageRegisters();
		
	}
	
	public static void gameRegisters()
	{
		GameRegistry.registerBlock(whiteBlock);
		GameRegistry.registerBlock(blackBlock);
		GameRegistry.registerBlock(glass);
		GameRegistry.registerBlock(doubleslabstone, "DoubleSlab");
		GameRegistry.registerBlock(singleslabstone, "SingleSlab");
	}
	private static void languageRegisters() {
		LanguageRegistry.addName(whiteBlock, "White Block");
		LanguageRegistry.addName(blackBlock, "Black Block");
		LanguageRegistry.addName(glass,"Glass");
		LanguageRegistry.addName(doubleslabstone,"Stone DoubleSlab");
		LanguageRegistry.instance().addStringLocalization(((StoneSlab)singleslabstone).getFullSlabName(0)+".name", " SingleSlab");
	}
	
	
}
