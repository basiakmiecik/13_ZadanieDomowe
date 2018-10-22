import java.util.Comparator;

public class DisciplinComparator implements Comparator<ResultsOfGame> {


    @Override
    public int compare(ResultsOfGame o1, ResultsOfGame o2){
        if(o1== null&& o2== null)
            return 0;
        if(o1== null&& o2!= null)
            return-1;
        if(o1!= null&& o2== null)
            return 1;
        if(o1.getName()!=null&&o2.getName()!=null)
            return o1.getName().compareTo(o2.getName());
        if(o1.getName()==null&&o2.getName()!=null)
            return -1;
        if(o1.getName()!=null&&o2.getName()==null);
        return 1;

    }

}
