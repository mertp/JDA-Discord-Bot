/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Commands;

import bot.test.Bot;
import java.util.Random;
import net.dv8tion.jda.api.events.message.guild.GuildMessageReceivedEvent;
import net.dv8tion.jda.api.hooks.ListenerAdapter;

/**
 *
 * @author DİLAN & MERT
 */
public class EightballCommand extends ListenerAdapter {
     public void onGuildMessageReceived(GuildMessageReceivedEvent event){
        String[] args=event.getMessage().getContentRaw().split(",");
        if(args[0].equalsIgnoreCase(Bot.prefix+"8ball")){
            Random rand=new Random();
            int random=rand.nextInt(16);
            String answer="Soru:"+args[1]+"\nCevap:"+Bot.responses[random];
            event.getChannel().sendTyping().queue();
            event.getChannel().sendMessage(answer).queue();
            
        }
}
}
