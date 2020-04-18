package mod.linguardium.litematicaitem;

import net.fabricmc.api.ModInitializer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class LitematicaItem implements ModInitializer {

    public static Logger LOGGER = LogManager.getLogger();

    public static final String MOD_ID = "litematicaitem";
    public static final String MOD_NAME = "Litematica Tool";
    public static final Item LITEMATICA_TOOL = new Item(new Item.Settings().maxCount(1).group(ItemGroup.MISC));
    @Override
    public void onInitialize() {
        log(Level.INFO, "Initializing");
        Registry.register(Registry.ITEM,new Identifier(MOD_ID,"tool"),LITEMATICA_TOOL);
    }

    public static void log(Level level, String message){
        LOGGER.log(level, "["+MOD_NAME+"] " + message);
    }

}