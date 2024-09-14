import java.util.List;

public class Controller {

   private final PotokService potokGroupService = new PotokService();

   public List<Group> getSortedCountPeople() {
      return potokGroupService.getSortedCountPeople();
   }

   public List<Group> getSortedComporator() {
      return potokGroupService.getSortedComporator();
   }
}