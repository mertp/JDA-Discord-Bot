/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Commands;

import bot.test.Bot;
import net.dv8tion.jda.api.events.message.guild.GuildMessageReceivedEvent;
import net.dv8tion.jda.api.hooks.ListenerAdapter;

/**
 *
 * @author DİLAN & MERT
 */
public class FilterToggle extends ListenerAdapter {
    public static boolean filterOn=true;
    public void onGuildMessageReceived(GuildMessageReceivedEvent event){
        String id=event.getMember().getId();
        if(id.equals("324641233479663619")){
             if(event.getMessage().getContentRaw().equalsIgnoreCase(Bot.prefix+"togglefilter")&& filterOn ) {
            String name=event.getMember().getUser().getName();
            event.getChannel().sendMessage("Dil filresi "+name+" tarafından kapatıldı").queue();
            filterOn=false;
        }
        else if(event.getMessage().getContentRaw().equalsIgnoreCase(Bot.prefix+"togglefilter")&& !filterOn) {
            filterOn=true;
            String name=event.getMember().getUser().getName();
            event.getChannel().sendMessage("Dil filresi "+name+"tarafından açıldı").queue();
        } 
        }
        else {
            
        }
      
    }
}
