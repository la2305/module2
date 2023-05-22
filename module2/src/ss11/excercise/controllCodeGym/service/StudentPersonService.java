package ss11.excercise.controllCodeGym.service;

import ss11.excercise.controllCodeGym.controller.PersonController;
import ss11.excercise.controllCodeGym.model.Person;
import ss11.excercise.controllCodeGym.respository.IPersonRespository;
import ss11.excercise.controllCodeGym.respository.StudentPersonRespository;

import java.sql.SQLOutput;
import java.util.List;
import java.util.Scanner;

public class StudentPersonService implements IPersonService {
    protected Scanner scanner = new Scanner(System.in);
    private static IPersonRespository studentPersonRespository = new StudentPersonRespository();

    @Override
    public void displayAll() {
        List<Person> persons = studentPersonRespository.getAll();
        for (Person person : persons) {
            System.out.println(person);
        }
    }

    @Override
    public void addPerson() {
        System.out.println("Nhập mã học sinh");
        String id = scanner.nextLine();
        System.out.println("Nhập tên học sinh");
        String name = scanner.nextLine();
        System.out.println("Nhập ngày sinh của học sinh");
        String date = scanner.nextLine();
        System.out.println("Nhập giới tính của học sinh, nam nhập số 1, nữ nhập số 2");
        int gender = scanner.nextInt();
        boolean flag;
        do {
            if (gender == 1) {
                flag = true;
            } else {
                flag = false;
            }
        } while (gender != 1 || gender != 2);
        System.out.println("Nhập vào lớp của học sinh");
        String className = scanner.nextLine();
        System.out.println("Nhập vào điểm số của học sinh");
        float point = scanner.nextFloat();
        Person person = new Person(id, name, date, flag, className, point);
        studentPersonRespository.addPerson(person);
        System.out.println("Thêm mới thành công");
    }

    @Override
    public void deletePerson() {
        System.out.println("Bạn muốn xóa học sinh nào vui lòng nhập mã học sinh");
        String id = scanner.nextLine();
        Person person =studentPersonRespository.getById(id);
        if (person==null){
            System.out.println("Học sinh bạn nhập không có");
        } else{
            System.out.println("Bạn có muốn xóa hoọc sinh với tên: "+ person.getPersonName());
            System.out.println("1. Xóa");
            System.out.println("2. Suy nghĩ lại");
            int choice = Integer.parseInt(scanner.nextLine());
            if (choice==1){
                studentPersonRespository.removePerson(person);
                System.out.println("Xóa thành công");
            }
        }
    }
}
