package ss16.exercise.CopyFileText;

import com.sun.source.tree.TryTree;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ReadAndCoppy {
    public List<Integer> readFile(String filePath) {
        List<Integer> numbers = new ArrayList<>();
        try {
            File file = new File(filePath);

            if (!file.exists()) {
                throw new FileNotFoundException();
            }
            BufferedReader br = new BufferedReader(new FileReader(file));
            String line = "";
            while ((line = br.readLine()) != null) {
                numbers.add(Integer.parseInt(line));
            }
            br.close();
        } catch (Exception e) {
            System.err.println("File không tồn tại hoặc có nội dung lỗi");
        }
        return numbers;
    }

    public void writeFile(String filePath, List<Integer> integers) {
        try {
            FileWriter writer = new FileWriter(filePath, true);
            BufferedWriter bufferedWriter = new BufferedWriter(writer);
            for (Integer n:integers) {
                System.out.println(n);
               bufferedWriter.write(n + "");
               bufferedWriter.newLine();
            }
            bufferedWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        ReadAndCoppy readAndCoppy = new ReadAndCoppy();
        //Đường dẫn đầu vào file cần coppy
        List<Integer> numbers = readAndCoppy.readFile("module2/src/ss16/exercise/CopyFileText/alo.txt");
        //Đường dẫn đầu ra file được ghi
        readAndCoppy.writeFile("module2/src/ss16/exercise/CopyFileText/alo123.txt", numbers);
    }
}
