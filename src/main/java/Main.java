import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) throws IOException {


        BufferedReader words = new BufferedReader(new FileReader("src/main/resources/words.txt"));
        String filePath = "src/main/resources/words.txt";
        List<String> wordsFromFIle = new ArrayList<>();

        String line;
        try (BufferedReader fileReader = new BufferedReader(new FileReader(filePath))) {
            while ((line = fileReader.readLine()) != null) {
                wordsFromFIle.add(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println(wordsFromFIle.get(0));
        System.out.println(wordsFromFIle.get(1));
        System.out.println(wordsFromFIle.get(2));
        System.out.println(wordsFromFIle.get(3));
    }
}
