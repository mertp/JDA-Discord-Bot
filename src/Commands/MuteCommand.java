/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Commands;

import bot.test.Bot;
import net.dv8tion.jda.api.entities.Member;
import net.dv8tion.jda.api.entities.Role;
import net.dv8tion.jda.api.events.message.guild.GuildMessageReceivedEvent;

/**
 *
 * @author DİLAN & MERT
 */
public class MuteCommand {
    public void onGuildMessageReceived(GuildMessageReceivedEvent event){
        String[] args=event.getMessage().getContentRaw().split(",");
        if(args[0].equalsIgnoreCase(Bot.prefix+"mute")){
         Member member = event.getGuild().getMemberById(args[1].replace("<@", "").replace(">", ""));
				Role role = event.getGuild().getRoleById("949741809066737755");
				if (args.length > 1 && args.length < 3) {
				if (!member.getRoles().contains(role)) {
					// Mute user
					event.getChannel().sendMessage("Muted " + args[1] + ".").queue();
					event.getGuild().addRoleToMember(member, role).complete();
				}
				else {
					// Unmute user
					event.getChannel().sendMessage("Unmuted " + args[1] + ".").queue();
					event.getGuild().removeRoleFromMember(member, role).complete();
				}
        }
        }
    }
}
