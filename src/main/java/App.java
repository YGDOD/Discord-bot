import info.help;
import net.dv8tion.jda.api.JDABuilder;

public class App {

    public static void main(String[] args) throws Exception {
        JDABuilder jda = JDABuilder.createDefault("OTE4NTg5MjkwNzczMDk0NDEw.YbJc8Q.diZxsAcalMVzVs2F616ChZ_Cff4");
        jda.addEventListeners(new help());
        jda.build();
    }
}
