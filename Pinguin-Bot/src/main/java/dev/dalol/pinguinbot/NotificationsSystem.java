package dev.dalol.pinguinbot;

import net.dv8tion.jda.api.EmbedBuilder;
import net.dv8tion.jda.api.entities.Role;
import net.dv8tion.jda.api.entities.emoji.Emoji;
import net.dv8tion.jda.api.events.interaction.component.ButtonInteractionEvent;
import net.dv8tion.jda.api.events.message.MessageReceivedEvent;
import net.dv8tion.jda.api.hooks.ListenerAdapter;
import net.dv8tion.jda.api.interactions.components.buttons.Button;
import net.dv8tion.jda.api.interactions.components.buttons.ButtonInteraction;

import java.time.Instant;
import java.util.Objects;


public class NotificationsSystem extends ListenerAdapter {

    public void onMessageReceived(MessageReceivedEvent ereignis) {

        if (ereignis.isFromGuild()) {
            if (ereignis.getMessage().getContentStripped().equals("Hallo")) {

                String username = ereignis.getAuthor().getName();

                ereignis.getChannel().sendMessage("Hey " + username + "!").queue();
            } else if (ereignis.getMessage().getContentStripped().equals("!code 7vasABlr59mBDvh.")) {

                EmbedBuilder bauplan = new EmbedBuilder();

                bauplan.setColor(0x217eff);
                bauplan.setTitle("Notifications");
                bauplan.setDescription("""
                        > Hey hey! Ich bins der Pinguin Bot :)) ja, wir haben jetzt einen eigenen Bot, und hier sind die Notifications:\s

                        » **__Video Notification__** ‣
                        > Wenn Pinguindave ein neues YT Video hochlädt erfahrt ihr davon als erstes ;D

                        » **__Event Notification__** ‣
                        > Wenn es ein neues Event gibt wie z.B. ein Silvester oder Neujahrs Event, werdet ihr damit gepingt.

                        » **__News Notification__** ‣
                        > Wenn wir z.B. ein neues Update hier auf dem Discord haben oder neuigkeiten zu Projekten gibt, werdet ihr damit gepingt.
                        
                        **ACHTUNG: Momentan gibt es keine Möglichkeit die Rollen zu entfernen, melde dich bei einem Administrator wenn du eine Rolle entfernen willst.**""");
                bauplan.setFooter("©️ Pinguincrew");
                bauplan.setTimestamp(Instant.now());

                Button button1 = Button.secondary("vnot", "Video Notification").withEmoji(Emoji.fromFormatted("\uD83D\uDCF9"));
                Button button2 = Button.secondary("enot", "Event Notification").withEmoji(Emoji.fromFormatted("\uD83C\uDF89"));
                Button button3 = Button.secondary("anot", "News Notification").withEmoji(Emoji.fromFormatted("\uD83D\uDCE2"));

                ereignis.getChannel().sendMessageEmbeds(bauplan.build()).setActionRow(button1, button2, button3).queue();
            }
        }


    }

    @Override
    public void onButtonInteraction(ButtonInteractionEvent event) {

        Role role1 = event.getGuild().getRoleById("1014308234531717230");
        Role role2 = event.getGuild().getRoleById("1014310603482992650");
        Role role3 = event.getGuild().getRoleById("1014311047085174834");

        if (event.getComponentId().equals("vnot")) {
            event.reply(":white_check_mark: | Deine Rollen wurden aktuallisiert.").setEphemeral(true).queue(); // send a message in the channel
            event.getGuild().addRoleToMember(event.getUser(), role1).queue();
            System.out.println("[LOG] Jemand hat die Buttons im Notifications System ausgeführt");
        } else if (event.getComponentId().equals("enot")) {
            event.reply(":white_check_mark: | Deine Rollen wurden aktuallisiert.").setEphemeral(true).queue(); // update the message
            event.getGuild().addRoleToMember(event.getUser(), role2).queue();
            System.out.println("[LOG] Jemand hat die Buttons im Notifications System ausgeführt");
        } else if (event.getComponentId().equals("anot")) {
            event.reply(":white_check_mark: | Deine Rollen wurden aktuallisiert.").setEphemeral(true).queue(); // Third Argument
            event.getGuild().addRoleToMember(event.getUser(), role3).queue();
            System.out.println("[LOG] Jemand hat die Buttons im Notifications System ausgeführt");
        }
    }
}

