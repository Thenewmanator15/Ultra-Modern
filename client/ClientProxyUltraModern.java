package UltraModern.client;

import net.minecraftforge.client.MinecraftForgeClient;
import UltraModern.common.CommonProxyUltraModern;

public class ClientProxyUltraModern extends CommonProxyUltraModern {

	@Override 
	public void registerRenders(){
		MinecraftForgeClient.preloadTexture("/UltraModern/Texture_UltraModern.png");
		MinecraftForgeClient.preloadTexture("/UltraModern/Texture_UltraModern.png");
	}
}
