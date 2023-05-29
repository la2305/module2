package ss17.practice;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class DemoIOBinaryFile {
    private static final String CUSTOMER_LIST_PATH = "module2/src/ss17/practice/alo/alo123.dat";

    public static void main(String[] args) {
        List<Customer> customerList = new ArrayList<>();
        Customer customer1 = new Customer(1, "Trung", "trung.trang@cg.vn");
        Customer customer2 = new Customer(2, "Chanh", "trung.trang@cg.vn");
        Customer customer3 = new Customer(3, "Hai", "trung.trang@cg.vn");
        customerList.add(customer1);
        customerList.add(customer2);
        customerList.add(customer3);
        writeCustomerListToFile(customerList,CUSTOMER_LIST_PATH);
        List<Customer> customersListFromFile = readCustomerListToFile(CUSTOMER_LIST_PATH);
        for (Customer n:customersListFromFile) {
            System.out.println(n);
        }
    }

    private static void writeCustomerListToFile(List<Customer> customerList, String path) {
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(path);
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
            objectOutputStream.writeObject(customerList);
            objectOutputStream.flush();
            objectOutputStream.close();
            fileOutputStream.close();
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
    public static List<Customer> readCustomerListToFile(String path){
        List<Customer> customerList = null;
        try {
            FileInputStream fileInputStream = new FileInputStream(path);
            ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
            customerList =(List<Customer>) objectInputStream.readObject();
            objectInputStream.close();
            fileInputStream.close();
        }catch (FileNotFoundException e){
            throw new RuntimeException(e);
        }catch (IOException e){
            throw new RuntimeException(e);
        }catch (ClassNotFoundException e){
            throw new RuntimeException(e);
        }
        return customerList;
    }
}
