/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bot.test.events;

import net.dv8tion.jda.api.events.message.guild.GuildMessageReceivedEvent;
import net.dv8tion.jda.api.hooks.ListenerAdapter;

/**
 *
 * @author DİLAN & MERT
 */
public class HelloEvent extends ListenerAdapter {
    public void onGuildMessageReceived(GuildMessageReceivedEvent event){
        String messageSent=event.getMessage().getContentRaw();
        String name=event.getMember().getUser().getName();
        if(messageSent.equalsIgnoreCase("Merhaba")){
            if(!event.getMember().getUser().isBot())
            event.getChannel().sendMessage("Merhaba :wave: "+ name).queue();
            
        }
    }
}
