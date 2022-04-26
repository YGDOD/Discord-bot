import info.help;
import net.dv8tion.jda.api.JDABuilder;
import tests.buttons;

public class App {

    public static void main(String[] args) throws Exception {
        JDABuilder jda = JDABuilder.createDefault("OTE4NTg5MjkwNzczMDk0NDEw.YbJc8Q.Nd2J-VWQbSaG4edm95IeDT_K6H4");
        jda.addEventListeners(new buttons());
        jda.addEventListeners(new help());
        jda.build();
    }
}
