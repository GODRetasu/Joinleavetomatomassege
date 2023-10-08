package nandeyanen.click.tutolialplugin;

import org.bukkit.ChatColor;
import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.block.Block;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.BlockBreakEvent;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.event.player.PlayerMoveEvent;
import org.bukkit.plugin.java.JavaPlugin;

public class PluginTutolial implements Listener {
    @EventHandler

    public static void JoinEvent(PlayerJoinEvent e) {
        Player player = e.getPlayer();
        player.sendMessage("ようこそ僕の天才サーバーへ");
    }

}
