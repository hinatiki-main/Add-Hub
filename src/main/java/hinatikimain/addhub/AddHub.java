package hinatikimain.addhub;

import org.bukkit.plugin.java.JavaPlugin;

public final class AddHub extends JavaPlugin {

    @Override
    public void onEnable() {
        // Plugin startup logic
        getCommand("hub");

    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}
