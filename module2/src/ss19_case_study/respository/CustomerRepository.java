package ss19_case_study.respository;

import ss19_case_study.common.ReadAndWriteFile;
import ss19_case_study.model.customer.Customer;
import ss19_case_study.respository.implement.ICustomerRepository;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CustomerRepository implements ICustomerRepository {
    private static Scanner scanner = new Scanner(System.in);
    private static List<Customer> customers = new ArrayList<>();
    private static final String FILE_PATH = "module2/src/ss19_case_study/data/Customer.csv";

    @Override
    public List<Customer> getAll() {
        List<String> strings = ReadAndWriteFile.readFile(FILE_PATH);
        customers.clear();
        String[] info;
        for (String string : strings) {
            info = string.split(",");
            customers.add(new Customer(info[0], info[1], info[2], Boolean.parseBoolean(info[3]), info[4], info[5], info[6], info[7], info[8]));
        }
        return customers;
    }

    @Override
    public void addCustomer(Customer customer) {
        List<String> strings = new ArrayList<>();
        strings.add(customer.getId()+","+customer.getName()+","+customer.getDate()+","+customer.isGender()+","+customer.getIdentityCardNumber()+","+customer.getNumberPhone()+","+customer.getEmail()+","+customer.getCustomerType()+","+customer.getLocation());
        ReadAndWriteFile.writFile(FILE_PATH,strings,true);
    }

    @Override
    public Customer getByIdCustomer(String id) {
        customers = getAll();
        for (Customer customer:customers) {
            if (customer.getId().equals(id)){
                return customer;
            }
        }
        return null;
    }

    @Override
    public void removeCustomer(Customer customer) {
        customers = getAll();
        customers.remove(customer);
        List<String> strings = new ArrayList<>();
        for (Customer temp : customers) {
            strings.add(temp.getId() + "," + temp.getName() + "," + temp.getDate() + "," + temp.isGender() + "," + temp.getIdentityCardNumber() + "," + temp.getNumberPhone() + "," + temp.getEmail() + "," + temp.getCustomerType() + "," + temp.getLocation());
        }
        ReadAndWriteFile.writFile(FILE_PATH, strings, false);
    }

    @Override
    public void editEmployee() {
        List<String> stringList = new ArrayList<>();
        for (Customer strings: customers) {
            stringList.add(strings.getId()+","+strings.getName()+","+strings.getDate()+","+strings.isGender()+","+strings.getIdentityCardNumber()+","+strings.getNumberPhone()+","+strings.getEmail()+","+strings.getCustomerType()+","+strings.getLocation());
        }
        ReadAndWriteFile.writFile(FILE_PATH, stringList,false);
    }

    @Override
    public void getByName(String name) {
        customers = getAll();
        for (Customer customer : customers) {
            if (customer.getName().contains(name)) {
                System.out.println(customer);
            }
        }
    }
}
