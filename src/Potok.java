import java.util.Iterator;
import java.util.List;

public class Potok implements Iterable<Group> {
    private List<Group> groups;

    public Potok(List<Group> groups) {
        this.groups = groups;
    }

    public List<Group> getGroups() {
        return groups;
    }

    public void setGroups(List<Group> groups) {
        this.groups = groups;
    }

    @Override
    public Iterator<Group> iterator() {
        return new StreamGroupIterator(this);
    }
}
