
package me.galaxysmediaxz.cmdonrespawn;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.entity.Player;
import org.bukkit.plugin.java.JavaPlugin;

public class main extends JavaPlugin{
    
    public static String InstantRespawnConfigTest;
    public static main plugin;
    
    
    
    @Override
    public void onEnable(){
        plugin = this;
        getServer().getConsoleSender().sendMessage(ChatColor.GREEN + " CommandOnRespawn is starting engine.. ");
        reloadConfig();
        saveDefaultConfig();
        Bukkit.getPluginManager().registerEvents(new DeathListener(), this);
        getServer().getConsoleSender().sendMessage(ChatColor.GREEN + " CommandOnRespawn is fully enable.. ");
        
    }
    
    @Override
    public void onDisable(){
        
    }
    
    @Override
    public void onLoad(){
        
    }
    
    
    
}
