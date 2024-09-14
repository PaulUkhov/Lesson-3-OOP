public class Group implements Comparable<Group> {
    private String name;
    private Integer countPeople;

    public Group(String name) {
        this.name = name;

    }

    public String getName() {
        return name;
    }



    public void setName(String name) {
        this.name = name;
    }

    public Integer getCountPeople() {
        return countPeople;
    }

    public void setCountPeople(Integer countPeople) {
        this.countPeople = countPeople;
    }

    @Override
    public String toString() {
        return "Group{" +
                "name='" + name + '\'' +
                ", countGroup=" + countPeople +
                '}';
    }

    @Override
    public int compareTo(Group other) {
        return this.countPeople.compareTo(other.countPeople);
    }
}
