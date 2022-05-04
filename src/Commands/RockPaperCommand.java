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
public class RockPaperCommand extends ListenerAdapter {
     public void onGuildMessageReceived(GuildMessageReceivedEvent event){
          String[] args=event.getMessage().getContentRaw().split(",");
           if(args[0].equalsIgnoreCase(Bot.prefix+"tkm")){
            Random rand=new Random();
            String bot;
            int r=rand.nextInt(3);
            bot=(Bot.tkm[r]);
            String eforsuz="███░  ████\n" +
"█░░░  ░░█░\n" +
"███░ ░█░░\n" +
"█░░░ █░░░\n" +
"███░ ████";
           if(args[1].equals(bot)) {
        if(r==0) {
            event.getChannel().sendTyping().queue();
            event.getChannel().sendMessage("BERABERE"+"\nİkimizde taş seçtik").queue();
        }
        else if(r==1) {
             event.getChannel().sendTyping().queue();
            event.getChannel().sendMessage("BERABERE"+"\nİkimizde kağıt seçtik").queue();
        }
        else if(r==2) {
             event.getChannel().sendTyping().queue();
            event.getChannel().sendMessage("BERABERE"+"\nİkimizde makas seçtik").queue();
        }
           }
           else {    
    
    if((r==0)&&(args[1].equalsIgnoreCase(Bot.tkm[2]))) {
        event.getChannel().sendTyping().queue();
        event.getChannel().sendMessage("Senin seçtiğin:Makas"+"\nBenim seçtiğim:Taş \n"+eforsuz).queue();
        
    }
    else if ((r==2)&&(args[1].equalsIgnoreCase(Bot.tkm[1]))) {
        event.getChannel().sendTyping().queue();
        event.getChannel().sendMessage("Senin seçtiğin:Kağıt"+"\nBenim seçtiğim:Makas \n"+eforsuz).queue(); {
    }   
    }
     else if ((r==1)&&(args[1].equalsIgnoreCase(Bot.tkm[0]))) {
        event.getChannel().sendTyping().queue();
        event.getChannel().sendMessage("Senin seçtiğin:Taş"+"\nBenim seçtiğim:Kağıt \n"+eforsuz).queue(); {
     }
    }
    else if((r==2)&&(args[1].equalsIgnoreCase(Bot.tkm[0]))) {
         event.getChannel().sendTyping().queue();
        event.getChannel().sendMessage("Senin seçtiğin:Taş"+"\nBenim seçtiğim:Makas \n"+"Bala göte yendin").queue();
 
    }
    else if((r==0)&&(args[1].equalsIgnoreCase(Bot.tkm[1]))) {
          event.getChannel().sendTyping().queue();
        event.getChannel().sendMessage("Senin seçtiğin:Kağıt"+"\nBenim seçtiğim:Taş \n"+"Bala göte yendin").queue();
    }
    else if((r==1)&&(args[1].equalsIgnoreCase(Bot.tkm[2]))) {
          event.getChannel().sendTyping().queue();
        event.getChannel().sendMessage("Senin seçtiğin:Makas"+"\nBenim seçtiğim:Kağıt \n"+"Bala göte yendin").queue();
    }
           }
     }
     }
        
}
