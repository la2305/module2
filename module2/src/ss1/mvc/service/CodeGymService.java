package ss1.mvc.service;

import ss1.mvc.model.Student;
import ss1.mvc.respository.CodeGymRespository;

public class CodeGymService {
    private CodeGymRespository codeGymRespository = new CodeGymRespository();

    public void displayStudentList() {
        Student[] studentList = codeGymRespository.getStudentList();
        for (Student student : studentList) {
            if (student != null) {
                System.out.println(student);
            }
        }
    }
}
