package ss11.excercise.controllCodeGym.service;

import ss11.excercise.controllCodeGym.model.Person;
import ss11.excercise.controllCodeGym.respository.IPersonRespository;
import ss11.excercise.controllCodeGym.respository.PersonRespository;

import java.util.List;
import java.util.Scanner;

public class PersonService implements IPersonService {
    protected Scanner scanner =new Scanner(System.in);
    private IPersonRespository personRespository = new PersonRespository();
    @Override
    public void displayAll() {
        List<Person> persons = personRespository.getAll();
        for (Person person:persons) {
            System.out.println(person);
        }
    }

    @Override
    public void addPerson() {

    }

    @Override
    public void deletePerson() {
        System.out.println("Bạn muốn xóa người nào, vui lòng nhập id");
        String id = scanner.nextLine();
        Person person = personRespository.getById(id);
        if (person == null){
            System.out.println("Mã id không chính xác");
        } else {
            System.out.println("Bạn có muốn xóa sản phẩm với tên"+person.getPersonName());
            System.out.println("1. Xóa");
            System.out.println("2. Suy nghĩ lại");
            int choice =Integer.parseInt(scanner.nextLine());
            if (choice ==1 ){
                personRespository.removePerson(person);
                System.out.println("Xóa thành công");
            }
        }
    }

}
