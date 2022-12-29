package dev.dalol.pinguinbot;

import net.dv8tion.jda.api.JDA;
import net.dv8tion.jda.api.JDABuilder;
import net.dv8tion.jda.api.OnlineStatus;
import net.dv8tion.jda.api.entities.Activity;
import net.dv8tion.jda.api.requests.GatewayIntent;

import javax.security.auth.login.LoginException;

public class Main {


    public static void main(String[] args) throws LoginException {
        String prefix = "!";

        System.out.println(prefix);

        String token = "MTAxMjcxNTI0NDgzNTA1MzYzMA.GovrCg.WFzpCUIQnxOFeV93RVYqCvOGhXBqFK6vULl4HQ";

        JDABuilder bauplan = JDABuilder.createDefault(token);

        bauplan.enableIntents(GatewayIntent.MESSAGE_CONTENT);

        bauplan.setStatus(OnlineStatus.IDLE);
        bauplan.setActivity(Activity.watching("Pinguindave zu"));


        bauplan.addEventListeners(new ChangeLog());
        bauplan.addEventListeners(new NachrichtenReaktion());
        bauplan.addEventListeners(new NotificationsSystem());
        bauplan.addEventListeners(new WillkommensNachricht());
        bauplan.addEventListeners(new Codes());
        bauplan.addEventListeners(new BewerbungsSystem());
        bauplan.addEventListeners(new MaintenanceInfo());
        bauplan.addEventListeners(new ViewCommand());
        bauplan.addEventListeners(new ColorRoles());

        JDA bot = bauplan.build();
        }
    }
