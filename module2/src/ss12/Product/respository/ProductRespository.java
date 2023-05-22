package ss12.Product.respository;

import ss11.excercise.controllCodeGym.model.Person;

import java.util.ArrayList;
import java.util.List;

public class ProductRespository implements IProductRespository {
    private static List<Person> persons = new ArrayList<>();

    static {
        persons.add(new Person("1-001","Lê La 1","23/05/1998",true));
        persons.add(new Person("1-002","Lê La 2","23/05/1998",false));
    }

    @Override
    public List<Person> getAll() {
        return persons;
    }
}
