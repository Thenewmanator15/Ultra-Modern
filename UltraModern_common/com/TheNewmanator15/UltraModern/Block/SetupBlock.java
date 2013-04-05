package com.TheNewmanator15.UltraModern.Block;

import com.TheNewmanator15.UltraModern.Main;
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.common.registry.LanguageRegistry;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import com.TheNewmanator15.UltraModern.IDs;
public class SetupBlock {
	
	//Blocks
	public static Block whiteBlock;
	public static Block blackBlock;
	public static Block glass;
	public static Block stonestairs;
	public static Block doubleslabstone;
	private static Block singleslabstone;

	public static void SetupBlocks() {
		
	//Blocks
	whiteBlock = new BlockModern(IDs.whiteBlockID,"WhiteBlock").setUnlocalizedName("White Block").setCreativeTab(Main.ultramodern);
	blackBlock = new BlockModern(IDs.blackBlockID, "BlackBlock").setUnlocalizedName("Black Block").setCreativeTab(Main.ultramodern);
	glass = new BlockTransparent(IDs.glassID,"Glass").setUnlocalizedName("Glass").setCreativeTab(Main.ultramodern);
	singleslabstone = new StoneSlab(IDs.stoneslabID, false, null).setUnlocalizedName("StoneSlab").setCreativeTab(Main.ultramodern);
	doubleslabstone = new BlockStone(IDs.stoneID).setUnlocalizedName("Stone Block").setCreativeTab(Main.ultramodern);
	stonestairs = new Stairs(IDs.stairsID, doubleslabstone, 0).setUnlocalizedName("Stone Stairs").setCreativeTab(Main.ultramodern);
	
	gameRegisters();
	languageRegisters();
		
	}
	
	public static void gameRegisters()
	{
		GameRegistry.registerBlock(whiteBlock);
		GameRegistry.registerBlock(blackBlock);
		GameRegistry.registerBlock(glass);
		GameRegistry.registerBlock(stonestairs);
		GameRegistry.registerBlock(doubleslabstone);
		GameRegistry.registerBlock(singleslabstone);
	}
	private static void languageRegisters() {
		LanguageRegistry.addName(whiteBlock, "White Block");
		LanguageRegistry.addName(blackBlock, "Black Block");
		LanguageRegistry.addName(glass,"Glass");
		LanguageRegistry.addName(stonestairs, "Stone Stairs");
		LanguageRegistry.addName(doubleslabstone,"Stone Block");
		LanguageRegistry.addName(singleslabstone, "Stone Slab");
	}
	
	
}
