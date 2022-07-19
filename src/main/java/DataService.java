import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class DataService {

    public static List<String> getWords() throws FileNotFoundException {
        BufferedReader words = new BufferedReader(new FileReader("src/main/resources/words.txt"));
        String filePath = "src/main/resources/words.txt";
        List<String> wordsFromFIle = new ArrayList<>();

        String line;
        try (BufferedReader fileReader = new BufferedReader(new FileReader(filePath))) {
            while ((line = fileReader.readLine()) != null) {
                wordsFromFIle.add(line);
            }
        } catch (
                IOException e) {
            e.printStackTrace();
        }
        return wordsFromFIle;
    }

    public static void showTable(List<String> wordsFromFIle){
        Collections.shuffle(wordsFromFIle);

        String[][] wordsArray = new String[4][2];

        wordsArray[0][0] = wordsFromFIle.get(0);
        wordsArray[1][0] = wordsFromFIle.get(1);
        wordsArray[2][0] = wordsFromFIle.get(2);
        wordsArray[3][0] = wordsFromFIle.get(3);
        wordsArray[0][1] = wordsFromFIle.get(0);
        wordsArray[1][1] = wordsFromFIle.get(1);
        wordsArray[2][1] = wordsFromFIle.get(2);
        wordsArray[3][1] = wordsFromFIle.get(3);
        System.out.println(" \n show words from array \n");
        for(int j = 0; j < 2; j++){
            for (String[] strings : wordsArray) {
                System.out.print(strings[j] + " - ");
            }
            System.out.println();
        }
    }
}


