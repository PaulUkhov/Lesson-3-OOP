import java.util.*;

public class PotokService {
    private Potok potok;

    public List<Group> getSortedCountPeople(){
        List<Group> groupList = new ArrayList<>(potok.getGroups());
        Collections.sort(groupList);
        return groupList;
    }

    public List<Group> getSortedComporator(){
        List<Group> groupList = new ArrayList<>(potok.getGroups());
        groupList.sort(new PotokComporatorService());
        return groupList;
    }
}
