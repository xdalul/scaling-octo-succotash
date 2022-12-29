package dev.dalol.pinguinbot;

import net.dv8tion.jda.api.EmbedBuilder;
import net.dv8tion.jda.api.events.message.MessageReceivedEvent;
import net.dv8tion.jda.api.hooks.ListenerAdapter;

import java.time.Instant;

public class Codes extends ListenerAdapter {
    public void onMessageReceived(MessageReceivedEvent ereignis) {

        if (ereignis.isFromGuild()) {

            if (ereignis.getMessage().getContentStripped().equals("Hallo")) {

                String username = ereignis.getAuthor().getName();

                ereignis.getChannel().sendMessage("Hey " + username + "!").queue();
            } else if (ereignis.getMessage().getContentStripped().equals("!codes")) {

                EmbedBuilder bauplan = new EmbedBuilder();

                bauplan.setTitle("⛔-Codes");
                bauplan.setDescription("**Notification System Code** » ||7vasABlr59mBDvh.||\n**Bewerbung System Code** » ||2c4gmbSa2mh301df||\n**Color Roles System Code** » ||75nfh1nsctCg||\n\n**Benutzung: !code <code>**");
                bauplan.setTimestamp(Instant.now());
                bauplan.setFooter("🚧 Pinguincrew-Admin Tools");
                bauplan.setColor(0xff3d3d);

                ereignis.getChannel().sendMessageEmbeds(bauplan.build()).queue();
            }
        }
    }
}
