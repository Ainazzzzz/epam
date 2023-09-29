import java.util.ArrayList;
import java.util.List;

public class GenericInterfaceImpl implements GenericInterface<Person>{
   private List<Person> people = new ArrayList<>();
    @Override
    public Person getById(Long id) {
        for (Person p:
             people) {
            if(p.getId() == id){
                return p;
            }

        }
  return null;  }

}
