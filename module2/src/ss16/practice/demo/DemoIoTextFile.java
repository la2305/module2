package ss16.practice.demo;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class DemoIoTextFile {
    public static void main(String[] args) {
        List<Nation> studentList = new ArrayList<>();
        Nation student1 = new Nation(1,"Thanh","C0323G1");
        Nation student2 = new Nation(2,"Tri","C0323G1");
        Nation student3 = new Nation(3,"Pháp","C0323G1");
        studentList.add(student1);
        studentList.add(student2);
        studentList.add(student3);
        writeStudentListToFile(studentList,"module2/src/ss16/practice/demo");
        List<Nation> studentListFromFile = readStudentListFromFile("module2/src/ss16/practice/demo");
        for (Nation n:studentListFromFile) {
            System.out.println(n);
        }
    }
    static void writeStudentListToFile(List<Nation> students, String path){
        File file =new File(path);
        try {
            FileWriter fileWriter = new FileWriter(file,false);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            for (int i = 0; i < students.size(); i++) {
                bufferedWriter.write(students.get(i).getInfoToCSV());
                bufferedWriter.newLine();
            }
            bufferedWriter.flush();
            bufferedWriter.close();
            fileWriter.close();
        }catch (IOException e){
            throw new RuntimeException(e);
        }
    }
    static void writeToFile(String path,String message){
        File file = new File(path);
        try {
            FileWriter fileWriter =new FileWriter(file);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            bufferedWriter.write(message);
            bufferedWriter.flush();
            bufferedWriter.close();
            fileWriter.close();
        }catch (IOException e){
            throw new RuntimeException(e);
        }
    }
    static List<Nation> readStudentListFromFile(String path){
        List<Nation> studentList =new ArrayList<>();
        File file =new File(path);
        try{
            FileReader fileReader = new FileReader(file);
            BufferedReader bufferedReader =new BufferedReader(fileReader);
            String line = null;
            while((line =bufferedReader.readLine()) !=null){
                String[] studentArr = line.split(",");
                Nation student = new Nation(Integer.parseInt(studentArr[0]), studentArr[1],studentArr[2]);
                studentList.add(student);
            }
            bufferedReader.close();
            fileReader.close();
        }catch (FileNotFoundException e){
            throw new RuntimeException(e);
        }catch (IOException e){
            throw new RuntimeException(e);
        }
        return studentList;
    }
}
