import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class GamesResultControllers {
    public void startBoard() throws IOException {
        DataBase dataBase = new DataBase();
        dataBase.tempDataBase();//polecenie przekazujące wczytana baze danych do temp bazy danych
        Scanner scanner = new Scanner(System.in);
        String answer;

        do {

            System.out.println("Witam w programie do archiwizacji wyników. \nCo chcesz teraz zrobić, wpisz odpoweidnie polecenie:"+
                    "\n     'dodaj' - dodaj rekord" +
                    "\n     'usun' - usun rekord" +
                    "\n     'pokaz' - pokaż zapisane dane" +
                    "\n     'koniec' - zakończ - zapisz do pliku");
            answer=scanner.nextLine();
            switch (answer) {
                case "dodaj":
                    dataBase.addRecord();
                    break;
                case "usun":
                    dataBase.removeRecord();
                    break;
                case "pokaz":
                    dataBase.showData();
                    break;
                case "koniec":
                    dataBase.sortData();
                    dataBase.saveData();
                    break;
                default:
                    System.err.println("Wybrano nieprawidłową opcję wybierz ponownie");
            }

        } while (!(answer.equals("koniec")));
    }
}
