package fr.rafoudiablol.internationalization;

import org.bukkit.plugin.java.JavaPlugin;

public final class ExamplePlugin extends JavaPlugin {
    public Messages messages;

    @Override
    public void onEnable() {
        messages = new Messages(this);
        getLogger().info(messages.hello.translate());
        getLogger().info(messages.sayMeHello.translate(getName()));
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}
