package leviathan143.morelootstuff;

import leviathan143.morelootstuff.MoreLootStuff.Constants;
import leviathan143.morelootstuff.conditions.InBiome;
import net.minecraft.world.storage.loot.conditions.LootConditionManager;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = Constants.MODID, name = Constants.MODNAME, version = Constants.VERSION, dependencies = Constants.DEPENDENCIES)
public class MoreLootStuff
{
	public class Constants
	{
		public static final String MODNAME = "More Loot Stuff";
		public static final String MODID = "morelootstuff";
		public static final String VERSION = "0.0.1";
		public static final String DEPENDENCIES = "required-after:forge@[14.23.1.2577,)";
	}

	@Mod.EventHandler
	public void preInit(FMLPreInitializationEvent event)
	{
		//Register conditions
		LootConditionManager.registerCondition(new InBiome.Serialiser());
		
		//Register functions
	}
}
