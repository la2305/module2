package ss8.codegym_management.service;

import ss8.codegym_management.model.Student;
import ss8.codegym_management.respository.CodeGymRespository;

public class CodeGymService {
    private CodeGymRespository codeGymRespository = new CodeGymRespository();
    public void displayStudentList(){
        Student[] studentList = codeGymRespository.getStudentList();
        for (Student student:
             studentList) {
            if (student !=null){
                System.out.println(student);
            }
        }
    }
}
