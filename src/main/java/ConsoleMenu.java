import java.util.List;
import java.util.Locale;

public class ConsoleMenu {
    private String header;
    private List<String> options;

    ConsoleMenu(String header, List<String> options) {
        this.header = header;
        this.options = options;
    }

    public void display() {
        System.out.println(header);

        for (int i = 0; i < options.size(); i++) {
            System.out.format(Locale.ENGLISH, "  %d. %s%n", (i + 1), options.get(i));
        }
        System.out.print("Choose your option: ");
    }
}
