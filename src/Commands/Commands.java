/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Commands;

import bot.test.Bot;
import java.util.Random;
import net.dv8tion.jda.api.EmbedBuilder;
import net.dv8tion.jda.api.events.message.guild.GuildMessageReceivedEvent;
import net.dv8tion.jda.api.hooks.ListenerAdapter;
import net.dv8tion.jda.api.requests.Request;

/**
 *
 * @author DİLAN & MERT
 */
public class Commands extends ListenerAdapter{
    @Override
    public void onGuildMessageReceived(GuildMessageReceivedEvent event){
        String[] args=event.getMessage().getContentRaw().split(",");
        if(args[0].equalsIgnoreCase(Bot.prefix+"info")){
            EmbedBuilder info=new EmbedBuilder();
            info.setTitle("Babanın botu");
            info.setDescription("Kuş şakaları yapan ve dünyaya hiçbir faydası olmayan bot");
            info.addField("Creator", "Lütfi Elvan", false);
            info.setColor(0x42c8f5);
            event.getChannel().sendTyping().queue();
            event.getChannel().sendMessage(info.build()).queue();
            info.clear();
            
        }
        else if(args[0].equalsIgnoreCase(Bot.prefix+"8ball")){
            Random rand=new Random();
            int random=rand.nextInt(16);
            String answer="Soru:"+args[1]+"\nCevap:"+Bot.responses[random];
            event.getChannel().sendTyping().queue();
            event.getChannel().sendMessage(answer).queue();
        }
        else if(args[0].equalsIgnoreCase(Bot.prefix+"tkm")){
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
        else if(args[0].equals(Bot.prefix+"flood")){
           String f1="Hala babasını dowmemis koylu yobazlar warmı? Moruk aykırı olucaksın kolesi deyilsin ya?? Ben ilk dowdugumde yedinci sınıfdayım partiden gelmisim gece saat iki kapiyi actigim gibi nerdesin lan yawsak diye bagirdi dedim sana ne lan kahbe ewladı yuzune bile bakmadim odama yuruyorum ama babam eski komandolardan biliyorumki sinsice yaklasip arkamdan saldiracak tabi ben de uc sene orman muhafizligi egitimi almisim siyah kusagim moruk bir ses kastim tam vuracakken aniden donup bilegini buktum sss geri bas lan geri bas diye bagirdim ne arkadan yaklasiyosun lan dedim tabi o sirada iyice bilegini bukuyorum kivraniyor abi cekmeye basladi ama acimadim amin cocuguna kirilana kadar cevirdim aglamaya basladiginda biraktim ambulansi bile aramadim gittim uyudum babamin amina ilk boyle koydum tavsiye isteyecek olursa sonrasinda uyumayin ben sabah hastanede uyanmistim uykumda bicaklamis orosbu cocugu";
           String f2="Beyler kızların am rengini öğrenme taktiğini anlatıyorum %100 tutuyor. Am rengi deri kalınlığıyla alakalı bir durum. Doğuda sert karasal iklim olduğundan deriler kalın olur bu yüzden doğuluların amcıkları kara olur. Sürekli sıcaklık değişimine maruz kaldıkları için. Rus karılarında mesela dış deri daha incedir. Bu soğuk yüzünden oluşan bir şeydir. Micheal jackson zenciyken nasıl beyaz oldu? Derisini soydurdu da oldu. Şimdi ise nasıl anlayacağımızı anlatıyorum kızı alıyorsun eğer izin veriyorsa dişliyosun kolunu acıtacak düzeyde. Eğer direkt kırmızılık oluşup tahriş oluyorsa o kızın amı pespembeciktir. Eğer sadece izi kalıyorsa renk değişimi olmuyorsa o kızın amı kendi derisinin rengindedir veya karadır. Ben o eşiği bildiğim için kara veya kendi teninin renginde olup olmadığını anlayabiliyorum. Siz de zamanla anlarsınız. Ayrıca amının kara olması bir diğer etken olan kıllı olmasıyla da alakalıdır. Çok jilet vurursa o bölge kararır. Yani demem o ki beyler böylece kızların amını görmeden am rengini tahmin edebilirsiniz.";
           String f3="yanlis anlamayin da ben dejenere bir ateistim, ezan okununca muzigin sesini kısmam; aksine cihazı amfiye bağlarım ve daha çok ses yaratırım. yatalak dedem gözleriyle namaz kılmasın diye ona uyku hapı veriyorum, emekli maaşını da çekip kadikoyde kızlarla teqila shot atıyorum. kalan parayla da metallica posterleri satın alıyorum. babam annemi döverken babama yardım ediyorum, kardesimi zincirle baglayıp immortal dinletiyorum. kisacasi ben dejenere bir ateist metalciyim";
           String f4="Bakin siyahlar:bust_in_silhouette: olarak byazlar :man:la dalga geçmemiz hiç hoş değil:pouting_cat: biliyorum !1!1!!! hepsi salak :angry:ve gerizekalı :frowning:olsa da onlarda hayvan:monkey::pig2:.Biz Üstünyarıs :robot:bir millet olan karaboğa☻ imparatorluğu:crown: vatandaşları irkciliga artik bir son vermeliyiz:couple: eğer bunu yaparsak:v: onları da dünya ya bir katkisi:atom: olur belki diskilarini temizlemeyi :recycle:ogrenebilirler. Yani dünyanın efendisi :crown:olabiliriz yinede altyarışlara :pig2:şans vermeliyiz⚅⚄.kisaca byazların :older_man:önüne bi kap su :tea:ve yemek:ramen: birakirak onlara yardimci:muscle: olabiliriz eğer bu konuşmamla:speaking_head: biraz bile fikrinizi değistirdiysem ne mutlu bana:grin:.";
           String f5="şerefsis annemin bhana son qasığı... buqün saturdey... yani qendimi soqağa atıph istiqlalde ve tarlabashında deli qibi qeseceğim qün... hiqhoq pantolomu olmadan nereye qitjem aq oqul pantulunu mu qiysem naphsam... anneme diyom yaf neden sormadan yıqıyon diyom... babandan da shenden de bıqtım diyo... apır sapır qonushuyo bu qadın... babama ihaneth edejeqmish qibi sanqi... mom ile dad boshanırlarsa süfer olur falla... istediqim qadar sahilde drunq oluph istiqlalde qesebilirim... döfme yaphtırjam qoluma zatem... anne babası boshanmısh bi çocuqun yaphması qereqen tüm çılqınları yapjam...";
           String f6="BiR GüN hOcA dEmİş:\n" +
"\n" +
"İnGiLiZcE 10'a KaDaR sAy\n" +
"\n" +
"OnE, tWo, ThReE, fOuR, FiVe, SiX, eİgHt, NiNe, TeN\n" +
"\n" +
"oĞlUm SeVeN nErDe?\n" +
"\n" +
"SeVeNlEr HeP gİdİyOr... HeRkEs ÇıKaRıP 1 dAl YaKaR,sInIf DuMaNaLtI…(̅̅̅̅(̅̅̅̅̅̅̅̅̅̅_̅()ڪے~~~";
           String f7="otobüste yanımdaki kız feci osurdu beyler. benden başka kimse anlamadı onun osurduğunu çünkü yan yanaydık ve kendi kıç bölgemde titreşimi hissettim çok güzel kızdı aslında böyle bir şey yapması beni çok üzmüştü. daha sonra koku yayılmaya ve kızda kızarmaya başladı tabi ben hiç durur muyum? hemen camı açtım ve ayağa kalkarak hanımlar beyler, az önce talihsiz bir şekilde otobüsün içine osurdum. burnunuza çürük kavun kokusu gelebilir, aldırış etmeyin, siz hiç osurmadınız mı ? sen şoför amca, akşam televizyon karşısına yatıp ntv sporu açtığın zaman, burnunu karıştırırken hiç inletmedin mi ortalığı? çocukların odada gülmedi mi hiç? sen, şişman olan kız, sen hiç deprem etkisi yaratmadın mı zeminde? klozeti parçalamadın mı hiç? beni hor görmeyin arkadaşlar, evet osurdum, ama bilinçli değildim. sadece osurdum diyerek göz yaşlarımla beraber oturdum. yavaştan bir alkış sesiyle beraber yıkıldı otobüs. şoför deli gibi kornaya basıyor ve herkes zart zurt osuruyordu. sonra yanındaki kızla göz göze geldik. gözlerini kapatıp bana doğru eğildi. heyecandan kalbim çıkacak gibi olmuştu. bende gözlerimi hafif kapatıp eğildim. ağzını uzattı hafif araladı, yaklaştık, gaaargh diye bi geğirdi. kendimden geçtim. direk gömdüm kafayı, müsait bir yerde indim.\n" +
"";
           String f8="Beyler intihar edecekseniz direk kendinizi iple asmayın ya da pompalıyla vurmayın amk malmısınız boğaz köprüsünden atlayabilirsiniz havada ölseniz bile heyecanlı olacaktır aşşağı düşerken manzaraya bakın hayatınızı düşünün.intihar ediyorsanız artık kaybedecek birşeyiniz kalmamıştır zaten malmısınız olum bu potansiyeli kullansanıza git ünlü bir banka soy polislerden kaç araba çal yakalanınca kendini vur ya da trumpu felan öldürmeyi dene amk malmısınız olum bu gücü kullansana ölümü göze almışsın ben intihar etmeye karar verirsem dünyanın içinden geçip ölücem.bunu kötü anlamayın tabi masum insanları öldürüp katliam yapmam o günü film gibi yaşarım korkudan yapmadığım herşeyi yaparım ananızı sikerim pompalıyla kendinizi vurmayın";
           String f9="Evet arkadaşlar karı sikmeyide hep beraber öğrenecez hiç acelemiz yok çaylarınızı alın yatağınıza yaslanıp sikişin keyfini çıkarin. Şimdiiiii galiba deliği bulmamız gerek (2 saat bulamaz chate bakar) arkadaşlar acelemiz yok beraber üstesinden gelcez. (İyice sıcar chate sorar) silah yok mu arkadaşlar. Ne yapcaz peki?LordPintiPanda3 tl bağış atmış 'abi amı yok gay bu' demiş. Teşekkürler arkadaşim. Acelemiz yok. Sikmeyi birlikte öğrencez üstesinden gelcez. yarrağa ihtiyacımız yoksa topla(daşşakla)biseyler yapalım o zaman (yapamaz) evet arkadaşlar karıyı da deneyimlemiş olduk. Bana hitap ettiğini pek söyleyemem ama sevdiyseniz gönül rahatlığıyla sikebilirsiniz. Çaylaerrrrr Chat: abi adamsın, en delikanlı porngamer sensin abi ilk bağısımı sana attım";
           String f10="Bir gün eşekle at başlamışlar tartışmaa eşek demiş benim yarrağım daha büyük at demiş hayır benimki daha büyük bir süre böyle tartıştıktan sonra at demiş ki tamam gel ikimizde birbirimizi sikelim en çok bağırtanınki daha büyük olsun önce eşek ata sokmuş at öyle bir inlemiş ki tüm köye yayılmış ses sıra ata gelmiş at eşeğe sokmuş ama eşekten tık yok sonra çıkarıp sormuş eşeğe sen nasıl olurda bağırmadın eşekte demişki orospu çocuğu boğazıma kadar geldi nasıl bağırayım";
            Random rand=new Random();
            int r=rand.nextInt(10);
           String flood []={f1,f2,f3,f4,f5,f6,f7,f8,f9,f10};
           event.getChannel().sendTyping().queue();
            event.getChannel().sendMessage(flood[r]).queue();
           
        }
        }
        }
    

