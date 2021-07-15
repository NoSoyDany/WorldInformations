package me.nosoydany.worldinformations;

import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.event.Listener;
import org.bukkit.plugin.java.JavaPlugin;

public final class WorldInformations extends JavaPlugin implements Listener {

    @Override
    public void onEnable() {
        Bukkit.getServer().getPluginManager().registerEvents(this, this);
        // Plugin startup logic

    }

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args)
    {
        if (!(sender instanceof Player)) return true;
        Player player = (Player) sender;
        String worldname = player.getWorld().getName();
        if (label.equalsIgnoreCase("worldinfo")) {
            player.sendMessage("§b§lWorldInfo §7» §7Ahora mismo estás en el mundo: §3" + worldname + "§7.");
        }
        if (label.equalsIgnoreCase("icanhasworldinfo")) {
            player.sendMessage("Running WorldInfo v1.0.0 made by NoSoyDany");
        }
        if (label.equalsIgnoreCase("worldinf")) {
            player.sendMessage("§7§m--------------------------");
            player.sendMessage("§b§lWorldInfo §7v1.0.0");
            player.sendMessage("§7by: §b§lNoSoyDany");
            player.sendMessage("§7");
            player.sendMessage("§b§lComandos:");
            player.sendMessage("§7/worldinfo - §bMuestra en qué mundo estás");
            player.sendMessage("§7§m--------------------------");
        }
        return true;
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}
