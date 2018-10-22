import java.io.IOException;
import java.util.Scanner;

public class GamesResultControllers {
    public void startBoard() throws IOException {
        DataBase dataBase = new DataBase();
        dataBase.tempDataBase();//polecenie przekazujące wczytana baze danych do temp bazy danych
        Scanner scanner = new Scanner(System.in);
        int answer;
        do {
            System.out.println("Witam w programie do archiwizacji wyników. \n Co chcesz teraz zrobić:"
                    + "\n1 - dodaj rekord" +
                    "\n2 - usun rekord" +
                    "\n3 - pokaż zapisane dane" +
                    "\n4 - zakończ - zapisz do pliku");

            answer = scanner.nextInt();
            switch (answer) {
                case 1:
                    dataBase.addRecord();
                    break;
                case 2:
                    dataBase.removeRecord();
                    break;
                case 3:
                    dataBase.showData();
                    break;
                case 4:
                    dataBase.sortData();
                    dataBase.saveData();
                    break;
                default:
                    System.out.println("Wybrano nieprawidłową opcję wybierz ponownie");
            }
        }while (answer!=4);
    }
}
