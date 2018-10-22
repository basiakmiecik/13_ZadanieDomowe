import java.util.Comparator;

public class PointsComparator implements Comparator<ResultsOfGame> {
    @Override
    public int compare(ResultsOfGame o1, ResultsOfGame o2) {
        if(o1.getPoints()>o2.getPoints())
        return -1;
        else if(o1.getPoints()==o2.getPoints())
            return 0;
        else
    return 1;}
}
