package dev.dalol.pinguinbot;

import net.dv8tion.jda.api.EmbedBuilder;
import net.dv8tion.jda.api.events.message.MessageReceivedEvent;
import net.dv8tion.jda.api.hooks.ListenerAdapter;

import java.time.Instant;

public class ChangeLog extends ListenerAdapter {
    public void onMessageReceived(MessageReceivedEvent ereignis) {

            if (ereignis.isFromGuild()) {

                if (ereignis.getMessage().getContentStripped().equals("hallo")) {

                    String username = ereignis.getAuthor().getName();

                    ereignis.getChannel().sendMessage("Hey " + username + "!").queue();
                } else if (ereignis.getMessage().getContentStripped().equals("!changelog")) {

                    EmbedBuilder bauplan = new EmbedBuilder();

                    bauplan.setTitle("Großes Update | 2.0 Update");
                    bauplan.setDescription("\n> Ja, ich bins der Pinguin Bot :)) Hier der Changelog für die Version 2.0 » \n\n> Es gibt nun wie ihr hier seht den Pinguin Bot, gleich so ca. 10 Minuten nach diesem Changelog wird das <#1009440588850003978> mit dem Pinguin Bot ersetzt, aber momentan kann man die Rollen nicht entfernen also müsst ihr ein Administrator fragen wenn ihr eure Rolle entfernen möchtet. Sonst gibt es erstmal noch nen kleines easteregg was einfach ist wenn man einfach nur hallo schreibt, schreibt euch der Bot zurück.\n\n> Das wars erstmal mit diesem Changelog, vielleicht kommt ja bald mehr zu dem Bot hinzu :)) und btw den Bot hab ich (DaLoL) gecodet in Java wenns euch interessiert :))");
                    bauplan.setAuthor("DaLoL", null, "https://i.imgur.com/xWHeHhC.png");
                    bauplan.setFooter("©️ Pinguincrew");
                    bauplan.setColor(0x297bff);
                    bauplan.setTimestamp(Instant.now());
                    bauplan.setImage("https://i.imgur.com/GWtQo07.png");

                    ereignis.getChannel().sendMessage("<@&1014311047085174834>").queue();
                    ereignis.getChannel().sendMessageEmbeds(bauplan.build()).queue();
                }
            }


        }
    }