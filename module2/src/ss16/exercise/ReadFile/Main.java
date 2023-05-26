package ss16.exercise.ReadFile;

import ss16.practice.demo.Nation;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Nation> studentList = readFile("module2/src/ss16/exercise/ReadFile/list.csv");
        for (Nation n:studentList) {
            System.out.println(n);
        }
    }



    public static List<Nation> readFile(String filePath){
        List<Nation> nationList = new ArrayList<>();
        File file = new File(filePath);
        try {
            FileReader fileReader = new FileReader(file);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String line = null;
            while ((line=bufferedReader.readLine()) !=null){
                String[] nationArr = line.split(",");
                Nation nation = new Nation(Integer.parseInt(nationArr[0]),nationArr[1],nationArr[2]);
                nationList.add(nation);
            }
            bufferedReader.close();
            fileReader.close();
        }catch (FileNotFoundException e){
            throw new RuntimeException(e);
        }catch (IOException e){
            throw new RuntimeException(e);
        }
        return nationList;
    }
}
