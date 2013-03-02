package UltraModern.common;	

import UltraModern.client.ClientProxyUltraModern;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraftforge.common.Configuration;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.Init;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.Mod.PreInit;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.network.NetworkMod;
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.common.registry.LanguageRegistry;

@Mod(modid = "Ultra Modern",name= "Ultra Modern Blocks",version="1.0")
@NetworkMod(clientSideRequired = true, serverSideRequired = false)
	
public class Main {

	//Blocks
	public static Block WhiteBlock;
	public static int WhiteBlockID;
	public static Block BlockNice;
	public static int BlockNiceID;
	
	//Tabs
	public static CreativeTabs ultramodern = new CreativeTabUltraModern(CreativeTabs.getNextID(),"Ultra Modern");
	
	@Instance("Start")
	public static Main instance;
	
	@SidedProxy(clientSide = "UltraModern.client.ClientProxyUltraModern",
				serverSide = "UltraModern.common.CommonProxyUltraModern")
	
	public static ClientProxyUltraModern proxy = new ClientProxyUltraModern();	

		
	@PreInit
		public void load(FMLPreInitializationEvent event)
	{
			 Configuration config = new Configuration(event.getSuggestedConfigurationFile());
			 WhiteBlockID = config.get("Block ID's", "WhiteBlock", 500).getInt();
			 BlockNiceID = config.get("Block ID's", "BlockNice", 501).getInt();
			 config.save();
	}
	
	@Init
		public void load(FMLInitializationEvent event)
	{
			WhiteBlock = new WhiteBlock(WhiteBlockID,0, Material.iron).setBlockName("WhiteBlock").setCreativeTab(this.ultramodern);
			BlockNice = new BlockNice(BlockNiceID,1, Material.iron).setBlockName("BlockNice").setCreativeTab(this.ultramodern);
				
			gameRegisters();
			languageRegisters();
			proxy.registerRenders();
	}
	
		public void gameRegisters()
	{
		GameRegistry.registerBlock(WhiteBlock);
		GameRegistry.registerBlock(BlockNice);
	}
	
		public void languageRegisters()
	{
		LanguageRegistry.addName(WhiteBlock, "White Block");
		LanguageRegistry.addName(BlockNice, "Werid");
		
	}
}
