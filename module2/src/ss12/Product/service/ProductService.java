package ss12.Product.service;

import ss11.excercise.controllCodeGym.model.Person;
import ss11.excercise.controllCodeGym.respository.IPersonRespository;
import ss11.excercise.controllCodeGym.respository.PersonRespository;

import java.util.List;
import java.util.Scanner;

public class ProductService implements IProductService {
    protected Scanner scanner = new Scanner(System.in);
    private IPersonRespository personRespository =new PersonRespository();
    @Override
    public void displayAll() {
        List<Person> persons = personRespository.getAll();
        for (Person person:persons) {
            System.out.println(person);
        }
    }
}
