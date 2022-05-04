/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Commands;

import bot.test.Bot;
import java.io.File;
import net.dv8tion.jda.api.events.message.guild.GuildMessageReceivedEvent;
import net.dv8tion.jda.api.hooks.ListenerAdapter;

/**
 *
 * @author DİLAN & MERT
 */
public class ImageCommand extends ListenerAdapter {
    @Override
    public void onGuildMessageReceived(GuildMessageReceivedEvent event){
        String[] args=event.getMessage().getContentRaw().split(",");
        File file = new File("C:\\Users\\DİLAN & MERT\\Documents\\NetBeansProjects\\Bot Test\\build\\classes\\Commands\\seagull.jpg");
        if(args[0].equalsIgnoreCase(Bot.prefix+"martı")){
         event.getChannel().sendMessage("GAAAAK GAAAAAK").addFile(file).queue();
        }
    }
}
