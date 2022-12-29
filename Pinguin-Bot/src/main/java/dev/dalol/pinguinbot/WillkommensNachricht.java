package dev.dalol.pinguinbot;

import net.dv8tion.jda.api.EmbedBuilder;
import net.dv8tion.jda.api.entities.User;
import net.dv8tion.jda.api.events.guild.member.GuildMemberJoinEvent;
import net.dv8tion.jda.api.hooks.ListenerAdapter;

public class WillkommensNachricht extends ListenerAdapter {

    public void onGuildMemberJoin (GuildMemberJoinEvent ereignis) {
        User nutzer = ereignis.getUser();

        EmbedBuilder bauplan = new EmbedBuilder();

        bauplan.setTitle("Willkommen auf dem Pinguincrew Discord!");
        bauplan.setDescription("Der User " + nutzer.getAsMention() + " hat diesen Discord Server betreten.");

        ereignis.getGuild().getTextChannelById("1009437716942958772").sendMessageEmbeds(bauplan.build()).queue();
    }

}
