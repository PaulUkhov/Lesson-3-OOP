import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.stream.Stream;

public class StreamGroupIterator implements Iterator<Group> {
    private int count;
    private final List<Group> groupList;

    public StreamGroupIterator(Potok potok) {
        this.count = 0;
        this.groupList = potok.getGroups();
    }



    @Override
    public boolean hasNext() {
        return count < groupList.size();
    }

    @Override
    public Group next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        return groupList.get(count++);
    }

    @Override
    public void remove() {
        groupList.remove(count - 1);
    }
}
