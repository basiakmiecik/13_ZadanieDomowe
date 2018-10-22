import java.util.Comparator;

public class IdComparator implements Comparator<ResultsOfGame> {
    @Override
    public int compare(ResultsOfGame o1, ResultsOfGame o2) {
        if(o1.getId()>o2.getId())
            return 1;
        else if(o1.getId()==o2.getId())
            return 0;
        else
            return -1;}
}
