import java.util.Comparator;

public class PotokComporatorService implements Comparator<Group> {

    @Override
    public int compare(Group o1, Group o2) {
        int resultOfComparing = o1.getCountPeople().compareTo(o2.getCountPeople());
        if (resultOfComparing == 0){
         return o1.getName().compareTo(o2.getName());
        } else {
            return resultOfComparing;
        }
    }
}
