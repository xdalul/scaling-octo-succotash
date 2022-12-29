package dev.dalol.pinguinbot;

import net.dv8tion.jda.api.EmbedBuilder;
import net.dv8tion.jda.api.entities.Member;
import net.dv8tion.jda.api.events.message.MessageReceivedEvent;
import net.dv8tion.jda.api.hooks.ListenerAdapter;

public class ViewCommand extends ListenerAdapter {
    public void onMessageReveivedEvent(MessageReceivedEvent ereignis) {
        if (ereignis.getMessage().getContentStripped().startsWith("!view")) {
            Member mitglied = ereignis.getMessage().getMentions().getMembers().get(0);

            EmbedBuilder bauplan = new EmbedBuilder();

            bauplan.setTitle("Nutzerinformationen zu " + mitglied.getEffectiveName());
            bauplan.addField("Nutzer-ID", mitglied.getId(), true);

            if (mitglied.getNickname() != null) {
                bauplan.addField("Nickname", mitglied.getNickname(), true);
            }

            bauplan.setThumbnail(mitglied.getEffectiveAvatarUrl());

            ereignis.getChannel().sendMessageEmbeds(bauplan.build()).queue();
        }
    }
}
