package org.kjun.kjun;

import org.bukkit.plugin.java.JavaPlugin;

public final class Kjun extends JavaPlugin {

    @Override
    public void onEnable() {
        // Plugin startup logic
        getLogger().info("Enagle Plugin");
    }

    @Override
    public void onDisable() {
        getLogger().info("Disable Plugin");
    }
}
