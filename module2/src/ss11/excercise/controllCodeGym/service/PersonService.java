package ss11.excercise.controllCodeGym.service;

import ss11.excercise.controllCodeGym.model.Person;
import ss11.excercise.controllCodeGym.model.Student;
import ss11.excercise.controllCodeGym.model.Teacher;
import ss11.excercise.controllCodeGym.respository.IPersonRespository;
import ss11.excercise.controllCodeGym.respository.PersonRespository;

import java.util.List;
import java.util.Scanner;

public class PersonService implements IPersonService {
    protected Scanner scanner = new Scanner(System.in);
    private IPersonRespository personRespository = new PersonRespository();

    @Override
    public void displayAll() {
        List<Person> persons = personRespository.getAll();
        for (Person person : persons) {
            System.out.println(person);
        }
    }

    @Override
    public void addPerson() {
        int number;
        do {
            System.out.println("Bạn muốn nhập thông tin cho học sinh hay giáo viên, nếu muốn nhập cho học sinh thì nhập số 1, giáo viên thì nhập số 2, nhập số 3 nếu bạn không muốn thêm học sinh hay giáo viên");
            number = Integer.parseInt(scanner.nextLine());
            if (number == 1) {
                addStudent();
            } else if (number == 2) {
                addTeacher();
            }
        } while (number == 1 || number == 2);
    }

    public void addStudent() {
        System.out.println("Nhập mã học sinh");
        String id = scanner.nextLine();
        System.out.println("Nhập tên học sinh");
        String name = scanner.nextLine();
        System.out.println("Nhập ngày sinh của học sinh");
        String date = scanner.nextLine();
        System.out.println("Nhập giới tính của học sinh. Nam nhập số 1, nữ nhập số 2");
        boolean gender;
        int genderNumber = Integer.parseInt(scanner.nextLine());
        if (genderNumber == 1) {
            gender = true;
        } else {
            gender = false;
        }
        System.out.println("Nhập lớp của học sinh");
        String className = scanner.nextLine();
        System.out.println("Nhập điểm số của học sinh");
        Float point = Float.valueOf(scanner.nextLine());
        Student student = new Student(id, name, date, gender, className, point);
        personRespository.addPerson(student);
        System.out.println("Thêm mới thành công");
    }


    public void addTeacher() {
        System.out.println("Nhập mã giáo viên");
        String id = scanner.nextLine();
        System.out.println("Nhập tên giáo viên");
        String name = scanner.nextLine();
        System.out.println("Nhập ngày sinh của giáo viên");
        String date = scanner.nextLine();
        System.out.println("Nhập giới tính của giáo viên. Nam nhập số 1, nữ nhập số 2");
        boolean gender;
        int genderNumber = Integer.parseInt(scanner.nextLine());
        if (genderNumber == 1) {
            gender = true;
        } else {
            gender = false;
        }
        System.out.println("Nhập chuyên môn của giáo viên");
        String specialized = scanner.nextLine();
        Teacher teacher = new Teacher(id, name, date, gender, specialized);
        personRespository.addPerson(teacher);
        System.out.println("Thêm mới thành công");
    }

    @Override
    public void deletePerson() {
        System.out.println("Bạn muốn xóa người nào, vui lòng nhập id");
        String id = scanner.nextLine();
        Person person = personRespository.getById(id);
        if (person == null) {
            System.out.println("Mã id không chính xác");
        } else {
            System.out.println("Bạn có muốn xóa sản phẩm với tên" + person.getPersonName());
            System.out.println("1. Xóa");
            System.out.println("2. Suy nghĩ lại");
            int choice = Integer.parseInt(scanner.nextLine());
            if (choice == 1) {
                personRespository.removePerson(person);
                System.out.println("Xóa thành công");
            }
        }
    }

}
