import java.util.Comparator;

public class WonComparator implements Comparator<ResultsOfGame> {


    @Override
    public int compare(ResultsOfGame o1, ResultsOfGame o2) {
        // TODO Auto-generated method stub
        if (o1.isWon() && !(o2.isWon()))
            return -1;
        else if(o1.isWon()&&o2.isWon())
            return 0;
        else
            return 1;
    }
}
