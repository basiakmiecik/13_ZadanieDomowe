import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class ReadFile {
    List<String> list = new ArrayList<>();

    public void readerFile() throws FileNotFoundException {
        try {
            FileReader file = new FileReader("stats.csv");
            Scanner scanner = new Scanner(file);

            do {
                list.add(scanner.nextLine());
            } while (scanner.hasNextLine());
        }catch (FileNotFoundException e){
            System.err.println("Plik nie istnieje! Nie pobrano żadnych danych!");
        }

    }

    public List<ResultsOfGame> convertData() {

        try {
            readerFile();
        } catch (FileNotFoundException e) {
            System.err.println("Plik nie istnieje! Nie pobrano żadnych danych!");
        }
        List<ResultsOfGame> results = new ArrayList<>();
        for (int i = 0; i < list.size(); i++) {
            String[] parts = list.get(i).split(";");
            String disciplin = parts[1];
            int id = Integer.valueOf(parts[0]);
            String player = parts[2];
            int points = Integer.valueOf(parts[3]);
            boolean won = Boolean.valueOf(parts[4]);
            results.add(new ResultsOfGame(id, disciplin, player, points,won));
        }

        return results;
    }

}


