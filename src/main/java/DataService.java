import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

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

    public static void showTableWithWords(String[][][] wordsTable) {

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 9; j++) {
                if (wordsTable[i][j][1].equals("0")) {
                    System.out.print(wordsTable[i][j][0] + " - ");
                } else {
                    System.out.print("X" + " - ");
                }
            }
            System.out.println("\n");
        }
    }


    public static void showEasyTable(List<String> wordsFromFIle) {

        String[][][] wordsTable = new String[3][5][2];

        wordsTable[0][0][0] = "";
        wordsTable[1][0][0] = "1";
        wordsTable[2][0][0] = "2";
        wordsTable[0][1][0] = "A";
        wordsTable[0][2][0] = "B";
        wordsTable[0][3][0] = "C";
        wordsTable[0][4][0] = "D";

        wordsTable[0][0][0] = "0";
        wordsTable[1][0][0] = "0";
        wordsTable[2][0][0] = "0";
        wordsTable[0][1][0] = "0";
        wordsTable[0][2][0] = "0";
        wordsTable[0][3][0] = "0";
        wordsTable[0][4][0] = "0";


        Random random = new Random();
        int maxRandomInt = wordsFromFIle.size() - 1;
        List<String> wordsToShow = new ArrayList<>();

        for (int i = 0; i < 4; i++) {
            int tmp = random.nextInt(maxRandomInt);
            wordsToShow.add(wordsFromFIle.get(tmp));
            wordsToShow.add(wordsFromFIle.get(tmp));
        }
        Collections.shuffle(wordsToShow);
        int listIterator = 0;
        for (int i = 1; i < 3; i++) {
            for (int j = 1; j < 5; j++) {
                wordsTable[i][j][0] = wordsToShow.get(listIterator);
                wordsTable[i][j][1] = "0";
                listIterator += 1;
            }
        }

       showTableWithWords(wordsTable);

    }


    public static void showHardTable(List<String> wordsFromFIle) {

        String[][][] wordsTable = new String[3][9][2];

        wordsTable[0][0][0] = "";
        wordsTable[1][0][0] = "1";
        wordsTable[2][0][0] = "2";
        wordsTable[0][1][0] = "A";
        wordsTable[0][2][0] = "B";
        wordsTable[0][3][0] = "C";
        wordsTable[0][4][0] = "D";
        wordsTable[0][5][0] = "E";
        wordsTable[0][6][0] = "F";
        wordsTable[0][7][0] = "G";
        wordsTable[0][8][0] = "H";

        wordsTable[0][0][1] = "0";
        wordsTable[1][0][1] = "0";
        wordsTable[2][0][1] = "0";
        wordsTable[0][1][1] = "0";
        wordsTable[0][2][1] = "0";
        wordsTable[0][3][1] = "0";
        wordsTable[0][4][1] = "0";
        wordsTable[0][5][1] = "0";
        wordsTable[0][6][1] = "0";
        wordsTable[0][7][1] = "0";
        wordsTable[0][8][1] = "0";

        Random random = new Random();
        int maxRandomInt = wordsFromFIle.size() - 1;
        List<String> wordsToShow = new ArrayList<>();

        for (int i = 0; i < 8; i++) {
            int tmp = random.nextInt(maxRandomInt);
            wordsToShow.add(wordsFromFIle.get(tmp));
            wordsToShow.add(wordsFromFIle.get(tmp));
        }
        Collections.shuffle(wordsToShow);
        int listIterator = 0;
        for (int i = 1; i < 3; i++) {
            for (int j = 1; j < 9; j++) {
                wordsTable[i][j][0] = wordsToShow.get(listIterator);
                wordsTable[i][j][1] = "0";
                listIterator += 1;
            }
        }
        showTableWithWords(wordsTable);


    }

        public void compareTwoWords(String[][][] wordsTable, String firstWord, String secondWord){
            for (int i = 1; i < 3; i++) {
                for (int j = 1; j < 9; j++) {
                    if (firstWord.equals(secondWord)) {
                        System.out.println(wordsTable[i][j][0]);
                    } else {
                        System.out.println("X");
                    }
                }
        }
    }

    public List<Integer> getCoordinates(){
        int firstNumber = 0;
        int secondNumber;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the coordinates ex. \"A1\" ");
       String coordinates = sc.next().trim();
       if(coordinates.length() != 2){
           System.out.println("Wrong coordinate, it must be one letter and one number");
       }
      String letter = Arrays.toString(coordinates.split("[A-Za-z]"));
      String number = Arrays.toString(coordinates.split("[0-9]"));


       switch(letter){
           case "A":
               firstNumber = 1;
               break;
           case "B":
               firstNumber = 2;
               break;
           case "C":
               firstNumber = 3;
               break;
           case "D":
               firstNumber = 4;
               break;
       }

       secondNumber = Integer.parseInt(number) -1;
       List<Integer> coordinatesList = new ArrayList<>();
       coordinatesList.add(firstNumber);
       coordinatesList.add(secondNumber);

       return coordinatesList;
       }



    // przelącznik czy wyswietlic slowo czy x
    // metoda przyjmuje slowo i zwraca slowo labo x


}



