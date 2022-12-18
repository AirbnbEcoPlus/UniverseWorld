package fr.endide.universeworld.utils;

import java.util.logging.Logger;

public class Chat {
    private static Logger log = Logger.getLogger("Minecraft");

    public static void console(String msg){
        log.info("[PluginName] " + msg);
    }

    public static void console(String[] msg){
        for(String s : msg){
            log.info("[PluginName] " + s);
        }
    }
}
