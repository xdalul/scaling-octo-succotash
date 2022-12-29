package dev.dalol.pinguinbot;

import net.dv8tion.jda.api.EmbedBuilder;
import net.dv8tion.jda.api.events.message.MessageReceivedEvent;
import net.dv8tion.jda.api.hooks.ListenerAdapter;

public class NachrichtenReaktion extends ListenerAdapter {

    public void onMessageReceived(MessageReceivedEvent ereignis) {
            if (ereignis.isFromGuild()) {
                if (ereignis.getMessage().getContentStripped().equals("Hi")) {

                    String username = ereignis.getAuthor().getName();

                    ereignis.getChannel().sendMessage("Hey " + username + "!").queue();
                } else if (ereignis.getMessage().getContentStripped().equals("!....")) {

                    EmbedBuilder bauplan = new EmbedBuilder();

                    bauplan.setTitle("Das ist ein Test Embed!");
                    bauplan.setDescription("Ich hoffe das funktioniert :))");
                    bauplan.setColor(0x3d81f5);

                    bauplan.setFooter("©️ Test");

                    ereignis.getChannel().sendMessageEmbeds(bauplan.build()).queue();

                    ereignis.getChannel().sendMessageEmbeds(bauplan.build()).queue();
                }
            }
        }
    }