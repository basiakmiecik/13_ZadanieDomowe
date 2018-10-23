import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class DataBase {
    Scanner scanner= new Scanner(System.in);
    String answer;
    int answerNum;
    List<ResultsOfGame>temp;

   public void tempDataBase(){//dopisuje tymczsowa baze danych - na podstawie tej z pliku

       ReadFile readFile= new ReadFile();
       temp=readFile.convertData();
   }


   public void addRecord(){
       do{
           System.out.print("Podaj id pod ktorym chcesz zapisac rekord:");
           int id=scanner.nextInt();
           scanner.nextLine();
           System.out.print("Podaj dyscyplinę: ");
           String disciplin=scanner.nextLine();
           System.out.println("Podaj imię i nazwisko zawodnika badź nazwę zespołu: ");
           String player= scanner.nextLine();

           System.out.println("Wygrana? true/false");
           boolean won= scanner.nextBoolean();
           System.out.println("Ilość zdobytych punktów");
           int points= scanner.nextInt();
           scanner.nextLine();
           temp.add(new ResultsOfGame(id,disciplin,player,points,won));


           System.out.println("Czy chcesz dodać następny rekord? (tak/nie)");
           answer=scanner.nextLine();

       }while(!(answer.equals("nie")));
   }

   public void removeRecord(){

       do{
           System.out.println("Podaj id rekordu jaki chcesz usunąć");
           int idRemove=scanner.nextInt();
           scanner.nextLine();
           for (int i = 0; i < temp.size(); i++) {
               if(temp.get(i).getId()==idRemove){
                   temp.remove(i);
                   break;
               }
           }
           System.out.println("Czy chcesz usunąć zapisany rekord? tak/nie");
           answer=scanner.nextLine();

       }while(!(answer.equals("nie")));

   }

   public void sortData(){
       do{
               System.out.print("W jak sposób chcesz posortować dane?"+
                       "\n1 - po id"+
                       "\n2 - po dyscyplinie"+
                       "\n3 - po nazwie zawodnika/drużyny"+
                       "\n4 - po wygranej"+
                       "\n5 - po punktacji"+
                       "\n0 - zakończ"+
                       "Podaj numer opcji: ");
               answer= scanner.nextLine();
               switch (answer) {
                   case "1":
                       IdComparator idComparator= new IdComparator();
                       Collections.sort(temp,idComparator);
                       break;
                   case "2":
                       DisciplinComparator disciplinComparator= new DisciplinComparator();
                       Collections.sort(temp,disciplinComparator);
                       break;
                   case "3":
                       PlayerComparator playerComparator= new PlayerComparator();
                       Collections.sort(temp,playerComparator);
                       break;
                   case "4":
                       WonComparator wonComparator= new WonComparator();
                       Collections.sort(temp,wonComparator);
                       break;
                   case "5":
                       PointsComparator pointsComparator= new PointsComparator();
                       Collections.sort(temp,pointsComparator);
                       break;
                   case "0":
                       break;
                   default:
                       System.err.println("Wybrano niesprawidłową opcję");
               }
               }while (!(answer.equals("0")));

   }

   public void showData(){
       for (ResultsOfGame resultsOfGame : temp) {

           System.out.println(resultsOfGame.toString());
       }

   }

    public void saveData() throws IOException {


        FileWriter fileWriter = new FileWriter("stats.csv");

        BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);

        for (int i = 0; i < temp.size(); i++) {
            String line =temp.get(i).toString();
            bufferedWriter.write(line);
            bufferedWriter.newLine();
        }
        bufferedWriter.close();
    }


}

