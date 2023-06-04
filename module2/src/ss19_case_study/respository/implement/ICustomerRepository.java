package ss19_case_study.respository.implement;

import ss19_case_study.model.customer.Customer;

import java.util.List;

public interface ICustomerRepository {
    List<Customer> getAll();
    void addCustomer(Customer customer);
    Customer getByIdCustomer(String id);
    void removeCustomer(Customer customer);
    void editEmployee();
    void getByName(String name);
}
