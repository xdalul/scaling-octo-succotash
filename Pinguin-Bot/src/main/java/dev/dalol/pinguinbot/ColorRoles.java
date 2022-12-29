package dev.dalol.pinguinbot;

import net.dv8tion.jda.api.EmbedBuilder;
import net.dv8tion.jda.api.entities.Role;
import net.dv8tion.jda.api.events.interaction.component.ButtonInteractionEvent;
import net.dv8tion.jda.api.events.message.MessageReceivedEvent;
import net.dv8tion.jda.api.hooks.ListenerAdapter;
import net.dv8tion.jda.api.interactions.components.buttons.Button;

import java.time.Instant;

public class ColorRoles extends ListenerAdapter {
    public void onMessageReceived(MessageReceivedEvent ereignis) {

        if (ereignis.isFromGuild()) {

            if (ereignis.getMessage().getContentStripped().equals("!code 75nfh1nsctCg")) {
                EmbedBuilder bauplan = new EmbedBuilder();

                bauplan.setTitle("Color Roles");
                bauplan.setDescription("> Color Roles? Was soll das sein? Color Roles sind, wenn ihr ein Button unten klickt dann bekommt ihr eine Rolle z.B. <@&1051178179005517934> und diese wird sich auf deinem Namen draufladen. Momentan gibt es 5 Farb-Rolle aber bei nachfrage für mehr Farb Rollen werden wir gerne welche hinzufügen ;D\n**Achtung: Ihr könnt nur 1 Rolle auswählen.** \n\n> Es kann bis zu 5-10 Sekunden dauern bis eure Rolle entfernt oder hinzugefügt wird.");
                bauplan.setColor(0x246dff);
                bauplan.setFooter("©️ Pinguincrew");
                bauplan.setTimestamp(Instant.now());
                bauplan.setImage("https://i.imgur.com/cCeZKzY.png");

                Button button1 = Button.secondary("b", "Blau");
                Button button2 = Button.secondary("ge", "Gelb");
                Button button3 = Button.secondary("gr", "Grün");
                Button button4 = Button.secondary("l", "Lila");
                Button button5 = Button.secondary("o", "Orange");
                Button button8 = Button.danger("e", "Entfernen");
                Button button6 = Button.secondary("p", "Pink");
                Button button7 = Button.secondary("T", "Türkis");



                ereignis.getChannel().sendMessageEmbeds(bauplan.build()).setActionRow(button1, button2, button3, button4, button5).addActionRow(button6, button7, button8).queue();
            }
        }
    }

    @Override
    public void onButtonInteraction(ButtonInteractionEvent event) {

        Role role1 = event.getGuild().getRoleById("1051178179005517934"); //Blau
        Role role2 = event.getGuild().getRoleById("1051178124118863892"); //Gelb
        Role role3 = event.getGuild().getRoleById("1051178262983888957"); //Grün
        Role role4 = event.getGuild().getRoleById("1051178157409062962"); //Lila
        Role role5 = event.getGuild().getRoleById("1051178288820781176"); //Orange
        Role role6 = event.getGuild().getRoleById("1058082827222138940"); //Pink
        Role role7 = event.getGuild().getRoleById("1058083159385833522"); //Türkis

        if (event.getComponentId().equals("b")) {
            event.reply(":white_check_mark: | Deine Rollen wurden aktuallisiert.").setEphemeral(true).queue(); // send a message in the channel
            event.getGuild().addRoleToMember(event.getUser(), role1).queue();
            event.getGuild().removeRoleFromMember(event.getUser(), role2).queue();
            event.getGuild().removeRoleFromMember(event.getUser(), role3).queue();
            event.getGuild().removeRoleFromMember(event.getUser(), role4).queue();
            event.getGuild().removeRoleFromMember(event.getUser(), role5).queue();
            event.getGuild().removeRoleFromMember(event.getUser(), role6).queue();
            event.getGuild().removeRoleFromMember(event.getUser(), role7).queue();
            System.out.println("[LOG] " + event.getUser() + " hat die Buttons im Color Roles System ausgeführt");
        } else if (event.getComponentId().equals("ge")) {
            event.reply(":white_check_mark: | Deine Rollen wurden aktuallisiert.").setEphemeral(true).queue(); // update the message
            event.getGuild().addRoleToMember(event.getUser(), role2).queue();
            event.getGuild().removeRoleFromMember(event.getUser(), role1).queue();
            event.getGuild().removeRoleFromMember(event.getUser(), role3).queue();
            event.getGuild().removeRoleFromMember(event.getUser(), role4).queue();
            event.getGuild().removeRoleFromMember(event.getUser(), role5).queue();
            event.getGuild().removeRoleFromMember(event.getUser(), role6).queue();
            event.getGuild().removeRoleFromMember(event.getUser(), role7).queue();
            System.out.println("[LOG] " + event.getUser() + " hat die Buttons im Color Roles System ausgeführt");
        } else if (event.getComponentId().equals("gr")) {
            event.reply(":white_check_mark: | Deine Rollen wurden aktuallisiert.").setEphemeral(true).queue(); // Third Argument
            event.getGuild().addRoleToMember(event.getUser(), role3).queue();
            event.getGuild().removeRoleFromMember(event.getUser(), role2).queue();
            event.getGuild().removeRoleFromMember(event.getUser(), role1).queue();
            event.getGuild().removeRoleFromMember(event.getUser(), role4).queue();
            event.getGuild().removeRoleFromMember(event.getUser(), role5).queue();
            event.getGuild().removeRoleFromMember(event.getUser(), role6).queue();
            event.getGuild().removeRoleFromMember(event.getUser(), role7).queue();
            System.out.println("[LOG] " + event.getUser() + " hat die Buttons im Color Roles System ausgeführt");
        } else if (event.getComponentId().equals("l")) {
            event.reply(":white_check_mark: | Deine Rollen wurden aktuallisiert.").setEphemeral(true).queue(); // Third Argument
            event.getGuild().addRoleToMember(event.getUser(), role4).queue();
            event.getGuild().removeRoleFromMember(event.getUser(), role2).queue();
            event.getGuild().removeRoleFromMember(event.getUser(), role3).queue();
            event.getGuild().removeRoleFromMember(event.getUser(), role1).queue();
            event.getGuild().removeRoleFromMember(event.getUser(), role5).queue();
            event.getGuild().removeRoleFromMember(event.getUser(), role6).queue();
            event.getGuild().removeRoleFromMember(event.getUser(), role7).queue();
            System.out.println("[LOG] " + event.getUser() + " hat die Buttons im Color Roles System ausgeführt");
        } else if (event.getComponentId().equals("o")) {
            event.reply(":white_check_mark: | Deine Rollen wurden aktuallisiert.").setEphemeral(true).queue(); // Third Argument
            event.getGuild().addRoleToMember(event.getUser(), role5).queue();
            event.getGuild().removeRoleFromMember(event.getUser(), role2).queue();
            event.getGuild().removeRoleFromMember(event.getUser(), role3).queue();
            event.getGuild().removeRoleFromMember(event.getUser(), role4).queue();
            event.getGuild().removeRoleFromMember(event.getUser(), role1).queue();
            event.getGuild().removeRoleFromMember(event.getUser(), role6).queue();
            event.getGuild().removeRoleFromMember(event.getUser(), role7).queue();
            System.out.println("[LOG] " + event.getUser() + " hat die Buttons im Color Roles System ausgeführt");
        }else if (event.getComponentId().equals("e")) {
            event.reply("Du hast deine Farbrolle entfernt.").setEphemeral(true).queue();
            event.getGuild().removeRoleFromMember(event.getUser(), role2).queue();
            event.getGuild().removeRoleFromMember(event.getUser(), role3).queue();
            event.getGuild().removeRoleFromMember(event.getUser(), role4).queue();
            event.getGuild().removeRoleFromMember(event.getUser(), role1).queue();
            event.getGuild().removeRoleFromMember(event.getUser(), role5).queue();
            event.getGuild().removeRoleFromMember(event.getUser(), role6).queue();
            event.getGuild().removeRoleFromMember(event.getUser(), role7).queue();
            System.out.println("[LOG] " + event.getUser() + " hat die Buttons im Color Roles System ausgeführt");
        }else if (event.getComponentId().equals("p")) {
            event.reply(":white_check_mark: | Deine Rollen wurden aktuallisiert.").setEphemeral(true).queue();
            event.getGuild().addRoleToMember(event.getUser(), role6).queue();
            event.getGuild().removeRoleFromMember(event.getUser(), role2).queue();
            event.getGuild().removeRoleFromMember(event.getUser(), role3).queue();
            event.getGuild().removeRoleFromMember(event.getUser(), role4).queue();
            event.getGuild().removeRoleFromMember(event.getUser(), role1).queue();
            event.getGuild().removeRoleFromMember(event.getUser(), role5).queue();
            event.getGuild().removeRoleFromMember(event.getUser(), role7).queue();
            System.out.println("[LOG] " + event.getUser() + " hat die Buttons im Color Roles System ausgeführt");
        }else if (event.getComponentId().equals("T")) {
            event.reply(":white_check_mark: | Deine Rollen wurden aktuallisiert.").setEphemeral(true).queue();
            event.getGuild().addRoleToMember(event.getUser(), role7).queue();
            event.getGuild().removeRoleFromMember(event.getUser(), role2).queue();
            event.getGuild().removeRoleFromMember(event.getUser(), role3).queue();
            event.getGuild().removeRoleFromMember(event.getUser(), role4).queue();
            event.getGuild().removeRoleFromMember(event.getUser(), role1).queue();
            event.getGuild().removeRoleFromMember(event.getUser(), role5).queue();
            event.getGuild().removeRoleFromMember(event.getUser(), role6).queue();
            System.out.println("[LOG] " + event.getUser() + " hat die Buttons im Color Roles System ausgeführt");
        }
    }
}
//                Button button6 = Button.secondary("p", "Pink");
//                Button button7 = Button.secondary("T", "Türkis");
