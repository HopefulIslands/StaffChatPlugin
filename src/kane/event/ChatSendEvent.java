package kane.event;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.AsyncPlayerChatEvent;
import org.bukkit.event.player.PlayerChatEvent;

public class ChatSendEvent implements Listener {


    @EventHandler
    public void ChatSendMethod(AsyncPlayerChatEvent event) {


        if(event.getPlayer().hasPermission("Staff.use")) {
            String Message  = event.getMessage();

            Player playerSentMessage = event.getPlayer();






            if(Message.startsWith("#!")) {
                Message = Message.replace("#!","");
                for(Player p : Bukkit.getOnlinePlayers()){


                    if(p.hasPermission("Staff.use")){

                        p.sendMessage(ChatColor.translateAlternateColorCodes('&',"&c&l[Staff Chat] &e" + playerSentMessage.getName() + " &8&l>>&b" + Message));
                        event.setCancelled(true);
                    }

                }

            }
        }

        if(event.getPlayer().hasPermission("StaffBuild.use")) {
            String Message  = event.getMessage();

            Player playerSentMessage = event.getPlayer();






            if(Message.startsWith("#B")) {
                Message = Message.replace("#B","");
                for(Player p : Bukkit.getOnlinePlayers()){


                    if(p.hasPermission("StaffBuild.use")){

                        p.sendMessage(ChatColor.translateAlternateColorCodes('&',"&a&l[Builder Chat] &e" + playerSentMessage.getName() + " &8&l>>&b" + Message));
                        event.setCancelled(true);
                    }

                }

            }
        }
        if(event.getPlayer().hasPermission("StaffAdmin.use")) {
            String Message  = event.getMessage();

            Player playerSentMessage = event.getPlayer();






            if(Message.startsWith("#A")) {
                Message = Message.replace("#A","");
                for(Player p : Bukkit.getOnlinePlayers()){


                    if(p.hasPermission("StaffAdmin.use")){

                        p.sendMessage(ChatColor.translateAlternateColorCodes('&',"&4&l[Admin Chat] &e" + playerSentMessage.getName() + " &8&l>>&b" + Message));
                        event.setCancelled(true);
                    }

                }

            }
        }


    }
}




