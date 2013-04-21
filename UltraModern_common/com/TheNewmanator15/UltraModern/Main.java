package com.TheNewmanator15.UltraModern;	

import com.TheNewmanator15.UltraModern.Block.BlockMain;

import com.TheNewmanator15.UltraModern.Client.ClientProxyUltraModern;
import net.minecraft.block.Block;
import net.minecraft.block.BlockHalfSlab;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemSlab;
import net.minecraftforge.common.Configuration;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.Init;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.Mod.PreInit;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.network.NetworkMod;
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.common.registry.LanguageRegistry;

@Mod(modid = "UltraModern",name= "Ultra Modern Blocks",version="1.0")
@NetworkMod(clientSideRequired = true, serverSideRequired = false)
	
public class Main {

	@Instance
	public static Main instance = new Main();
	
	//Tabs
	public static CreativeTabs ultramodern = new CreativeTab(CreativeTabs.getNextID(),"Ultra Modern");
	
	
	@SidedProxy(clientSide = "com.TheNewmanator15.UltraModern.Client.ClientProxyUltraModern",
				serverSide = "com.TheNewmanator15.UltraModern.CommonProxyUltraModern")
	
	public static ClientProxyUltraModern proxy = new ClientProxyUltraModern();	

	@PreInit
		public void load(FMLPreInitializationEvent event)
	{
			 Configuration config = new Configuration(event.getSuggestedConfigurationFile());
			 config.load();
			 IDs.loadconfiguration(config);
			 config.save();
	}
	
	@Init
		public void load(FMLInitializationEvent event)
	{
		BlockMain.SetupBlocks();	
		proxy.registerRenders();
	}
	
	@cpw.mods.fml.common.Mod.PostInit
	public void PostInit(FMLPostInitializationEvent event)
	{
	Item.itemsList[IDs.singleslabstoneID] = (new ItemSlab(IDs.singleslabstoneID - 256, (BlockHalfSlab)BlockMain.singleslabstone, (BlockHalfSlab)BlockMain.doubleslabstone, false));
	}
}
