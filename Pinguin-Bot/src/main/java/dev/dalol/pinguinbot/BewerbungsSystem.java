package dev.dalol.pinguinbot;

import net.dv8tion.jda.api.EmbedBuilder;
import net.dv8tion.jda.api.entities.emoji.Emoji;
import net.dv8tion.jda.api.events.message.MessageReceivedEvent;
import net.dv8tion.jda.api.hooks.ListenerAdapter;
import net.dv8tion.jda.api.interactions.components.buttons.Button;

import java.time.Instant;

public class BewerbungsSystem extends ListenerAdapter {

    public void onMessageReceived(MessageReceivedEvent ereignis) {

        if (ereignis.isFromGuild()) {

            if (ereignis.getMessage().getContentStripped().equals("Hey")) {

                String username = ereignis.getAuthor().getName();

                ereignis.getChannel().sendMessage("Hey " + username + "!").queue();
            } else if (ereignis.getMessage().getContentStripped().equals("!code 2c4gmbSa2mh301df")) {
                EmbedBuilder bauplan = new EmbedBuilder();

                bauplan.setTitle("Bewerbungen");
                bauplan.setDescription("\nNaaa ihr Ihr könnt euch nun als Moderatoren bei verschiedenen Plattformen bewerben:\n\n» **__Discord Moderator-Anforderungen__** ‣\n> [**1**] Ihr braucht von dem Discord Server ein mindest Level von 10.\n> [**2**] Mindest Alter ist 13. (**Ausnahme »** Wenn man 12 ist und länger schon auf dem Discord Server ist, ist das eine ausnahme.)\n> [**Status**] Offen\n\n» **__YouTube Moderator-Anforderungen__ ‣**\n> [**Status**] Geschlossen.\n\nFür YT-Mod wird noch ausgedacht was ihr für Anforderungen dafür braucht.");
                bauplan.setColor(0x0081e3);
                bauplan.setFooter("©️ Pinguincrew");
                bauplan.setTimestamp(Instant.now());
                bauplan.setImage("https://i.imgur.com/duyqE4p.png");

                Button button1 = Button.link("https://forms.gle/TjU4bcasRGFg9kJy9", "Discord-Moderator").withEmoji(Emoji.fromFormatted("⛑️"));
                Button button2 = Button.link("https://forms.gle/eTwpvnEH2vf1xfvw6", "YT-Moderator").withEmoji(Emoji.fromFormatted("⛔"));

                ereignis.getChannel().sendMessageEmbeds(bauplan.build()).setActionRow(button1, button2).queue();
            }
        }
    }
}
