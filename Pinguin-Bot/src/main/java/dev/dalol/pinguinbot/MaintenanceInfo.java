package dev.dalol.pinguinbot;

import net.dv8tion.jda.api.EmbedBuilder;
import net.dv8tion.jda.api.events.message.MessageReceivedEvent;
import net.dv8tion.jda.api.hooks.ListenerAdapter;

import java.time.Instant;

public class MaintenanceInfo extends ListenerAdapter {
    public void onMessageReceived(MessageReceivedEvent ereignis) {

        if (ereignis.isFromGuild()) {

            if (ereignis.getMessage().getContentStripped().equals("hi")) {

                String username = ereignis.getAuthor().getName();

                ereignis.getChannel().sendMessage("Hey " + username + "!").queue();
            } else if (ereignis.getMessage().getContentStripped().equals("!code ghrl4k12mck123")) {
                EmbedBuilder bauplan = new EmbedBuilder();

                bauplan.setTitle("🚧 Maintenance");
                bauplan.setDescription("\n> Naaaa ihr ;D Das hier sind die ersten Wartungsarbeiten für diesen Discord Server. Im <#1057787274533814343> könnt ihr einfach mit anderen vom Discord Server chatten und wenn ihr wollt könnt ihr in den <#1057787306335019078> gehen.\n\n**__Was wird in der Maintenance gemacht?__**\n> Wir werden heute fast alles redesignen d. h. Kanäle werden anders aussehen und auch Rollen oder wie auch das System mehr sieht ihr dann nach der Maintenance ;D");
                bauplan.setFooter("©️ Pinguincrew");
                bauplan.setTimestamp(Instant.now());
                bauplan.setColor(0xff2424);

                ereignis.getChannel().sendMessageEmbeds(bauplan.build()).queue();
            }
        }
    }
}
