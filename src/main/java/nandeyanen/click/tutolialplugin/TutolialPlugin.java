package nandeyanen.click.tutolialplugin;

import org.bukkit.plugin.java.JavaPlugin;

public final class TutolialPlugin extends JavaPlugin {

    @Override
    public void onEnable() {
        super.onEnable();
        getServer().getPluginManager().registerEvents(new PluginTutolial(),this);
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
        super.onDisable();
    }
}
