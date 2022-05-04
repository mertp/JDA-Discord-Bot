/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bot.test;

import Commands.EightballCommand;
import Commands.ImageCommand;
import Commands.InfoCommand;
import Commands.MuteCommand;
import Commands.RockPaperCommand;
import bot.test.events.HelloEvent;
import net.dv8tion.jda.api.JDA;
import net.dv8tion.jda.api.JDABuilder;

/**
 *
 * @author DİLAN & MERT
 */
public class Bot {
    public static String prefix="-";
    public static String[] responses={"Kesinlikle", " Konsantre ol ve tekrar sor","Bilemiyorum altan","Yanıtım hayır",

"Kesinlikle öyle\n",
" Kuşkusuz\n",
" Evet","Belirtiler olduğu yönünde","Sonra tekrar dene",
" Şimdi söylemesem daha iyi",
" Şimdi kehanette bulunamam",
"Kaynaklarım hayır diyor\n",
"Pek iyi görünmüyor","İmkansız","Masmalesef"};
  public static String[] tkm={"T","K","M"};   
    
    public static void main(String[] args) throws Exception {
        String token="ODM1NTQ4MzEyNTc1ODAzMzky.YIRDAQ.cNADkWK4Sp_vJ3kpQ1zsc4stcmE";
        JDA jda = JDABuilder.createDefault(token).build();
        jda.addEventListener(new InfoCommand());
        jda.addEventListener(new EightballCommand());
        jda.addEventListener(new RockPaperCommand());
        jda.addEventListener(new HelloEvent());
     //   jda.addEventListener(new Filterr());
      // jda.addEventListener(new FilterToggle());
        jda.addEventListener(new ImageCommand());
        jda.addEventListener(new MuteCommand());
    }
}
