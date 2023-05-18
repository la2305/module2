package ss8.codegym_management.respository;

import ss8.codegym_management.model.Student;

public class CodeGymRespository {
    static Student[] studentList = new Student[100];
    static {
        Student student1 = new Student(1,"Quyên",false,"C0323G1");
        Student student2 = new Student(2,"Quỳnh",false,"C0323G1");
        Student student3 = new Student(3,"Hải",true,"C0323G1");
        Student student4 = new Student(4,"Tuấn",true,"C0323G1");
        studentList[0] = student1;
        studentList[1] = student2;
        studentList[2] = student3;
        studentList[3] = student4;
    }
    public Student [] getStudentList (){
        return studentList;
    }
}
