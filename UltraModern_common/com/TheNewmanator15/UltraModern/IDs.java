package com.TheNewmanator15.UltraModern;

import net.minecraftforge.common.Configuration;

public class IDs {
	
		//Block ID's
		public static int whiteBlockID;
		public static int blackBlockID;
		public static int glassID;
		public static int stairsID;
		public static int stoneID;
		public static int singleslabstoneID;
		public static int doubleslabstoneID;
	
	
	//Config
	public static  void loadconfiguration(Configuration config) {
		
		IDs.whiteBlockID = config.get("Block ID's", "WhiteBlock", 500).getInt();
		IDs.blackBlockID = config.get("Block ID's", "BlackBlock", 501).getInt();
		IDs.glassID = config.get("Block ID's", "Glass Block", 502).getInt();
		IDs.stairsID = config.get("Block ID's", "Stairs", 503).getInt();
		IDs.stoneID = config.get("Block ID's", "Stone Block", 504).getInt();
		IDs.singleslabstoneID = config.get("Block ID's","Stone Double Slab", 507).getInt();
		IDs.doubleslabstoneID = config.get("Block ID's","Stone Slab",508).getInt();
	}

	
		
	}
