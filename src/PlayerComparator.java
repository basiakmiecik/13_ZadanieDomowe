import java.util.Comparator;

public class PlayerComparator implements Comparator<ResultsOfGame> {

    @Override
    public int compare(ResultsOfGame o1, ResultsOfGame o2){
        if(o1== null&& o2== null)
            return 0;
        if(o1== null&& o2!= null)
            return-1;
        if(o1!= null&& o2== null)
            return 1;
        if(o1.getPlayer()!=null&&o2.getPlayer()!=null)
            return o1.getPlayer().compareTo(o2.getPlayer());
        if(o1.getPlayer()==null&&o2.getPlayer()!=null)
            return -1;
        if(o1.getPlayer()!=null&&o2.getPlayer()==null);
        return 1;

    }

}
