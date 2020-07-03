package fr.rafoudiablol.internationalization.example;

import fr.rafoudiablol.internationalization.Localization;
import fr.rafoudiablol.internationalization.UnlocalizedMessage;
import org.bukkit.plugin.Plugin;

public class Messages extends Localization {
    public Messages(Plugin plugin) {
        super(plugin);
    }

    public UnlocalizedMessage.NoArgs hello;
    public UnlocalizedMessage.OneArgs<String> sayMeHello;
}
