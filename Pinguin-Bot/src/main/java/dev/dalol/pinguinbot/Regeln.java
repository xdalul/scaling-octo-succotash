package dev.dalol.pinguinbot;

import net.dv8tion.jda.api.EmbedBuilder;
import net.dv8tion.jda.api.events.message.MessageReceivedEvent;
import net.dv8tion.jda.api.hooks.ListenerAdapter;

public class Regeln extends ListenerAdapter {
    public void on (MessageReceivedEvent ereignis) {
        if (ereignis.isFromGuild()) {
            if (ereignis.getMessage().getContentStripped().equals("!setup rules")) {
                EmbedBuilder bauplan = new EmbedBuilder();

                bauplan.setTitle("ServerRegeln");
            }
        }
    }
}
