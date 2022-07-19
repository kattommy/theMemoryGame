import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MenuController {


    public void run() throws FileNotFoundException {
        Scanner sc = new Scanner(System.in);
        ConsoleMenu consoleMenu = buildMenu();

        while (true) {
            consoleMenu.display();
            int option = sc.nextInt();

            switch (option) {
                case 1:
                    System.out.println("you choose easy level");
                    DataService.game();
                    break;
                case 2:
                    System.out.println("you choose difficultly level");
                    DataService.showHardTable(DataService.getWords());
                    break;
                case 3:
                    System.out.println("You are leaving the game, please come back");
                    return;
                default:
                    System.out.println("Invalid number. Please try again");
            }
        }
    }
    private static ConsoleMenu buildMenu() {

        List<String> options = new ArrayList<>();
        options.add("Choose easy level");
        options.add("choose difficultly level");
        options.add("finish the game");

        String header = "Welcome to the memory game!";

        return new ConsoleMenu(header, options);
    }
}
