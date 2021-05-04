package kane;

import kane.event.ChatSendEvent;
import org.bukkit.ChatColor;
import org.bukkit.plugin.java.JavaPlugin;

public class MainClass extends JavaPlugin {

    @Override
    public void onEnable() {
        getServer().getConsoleSender().sendMessage(ChatColor.translateAlternateColorCodes('&',"&b[Staff Chat+Kane] &aHas Been LOADED"));
        getServer().getPluginManager().registerEvents(new ChatSendEvent(),this);
        
    }

    @Override
    public void onDisable() {


    }

}
