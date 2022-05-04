/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Commands;

import bot.test.Bot;
import net.dv8tion.jda.api.EmbedBuilder;
import net.dv8tion.jda.api.events.message.guild.GuildMessageReceivedEvent;
import net.dv8tion.jda.api.hooks.ListenerAdapter;

/**
 *
 * @author DİLAN & MERT
 */
public class InfoCommand extends ListenerAdapter {
    public void onGuildMessageReceived(GuildMessageReceivedEvent event){
        String[] args=event.getMessage().getContentRaw().split(",");
        if(args[0].equalsIgnoreCase(Bot.prefix+"info")){
            EmbedBuilder info=new EmbedBuilder();
            info.setTitle("Lütfi Bot");
            info.setDescription("Hala geliştiriliyor");
            info.addField("Creator", "Lütfi Elvan", false);
            info.setColor(0x42c8f5);
            event.getChannel().sendTyping().queue();
            event.getChannel().sendMessage(info.build()).queue();
            info.clear();
            
        }
}
}
