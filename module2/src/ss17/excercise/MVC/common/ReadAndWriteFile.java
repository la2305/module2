package ss17.excercise.MVC.common;

import ss17.excercise.MVC.model.Product;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ReadAndWriteFile {
    public static final String FILE_PATH ="module2/src/ss17/excercise/MVC/data/coppy.txt";
    public static void writeProductListToFile(List<Product> productList){
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(FILE_PATH);
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
            objectOutputStream.writeObject(productList);
            objectOutputStream.flush();
            objectOutputStream.close();
            fileOutputStream.close();
        }catch (FileNotFoundException e){
            throw new RuntimeException(e);
        }catch (IOException e){
            throw new RuntimeException(e);
        }
    }
    public static List<Product> readProductFromFile(){
        File file = new File(FILE_PATH);
        List<Product> productList = new ArrayList<>();
        try {
            FileInputStream fileInputStream = new FileInputStream(file);
            ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
            productList = (List<Product>) objectInputStream.readObject();
            objectInputStream.close();
            fileInputStream.close();
        }catch (FileNotFoundException e){
            System.out.println("File không tìm thấy");
        }catch (IOException e){
            System.out.println("File rỗng");
        }catch (ClassNotFoundException e){
            System.out.println("Lớp không phù hợp");
        }
        return productList;
    }
}
