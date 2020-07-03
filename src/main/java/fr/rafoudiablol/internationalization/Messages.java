package fr.rafoudiablol.internationalization;

import org.bukkit.plugin.Plugin;

public class Messages extends Localization {
    public Messages(Plugin plugin) {
        super(plugin);
    }

    public UnlocalizedMessage.NoArgs hello;
    public UnlocalizedMessage.OneArgs<String> sayMeHello;
}
