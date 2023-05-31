package ss19_case_study.model.customer;

public class Customer extends Person{
    private String customerType;
    private String location;

    public Customer(String id, String name, String date, boolean gender, String identityCardNumber, String numberPhone, String email, String customerType, String location) {
        super(id, name, date, gender, identityCardNumber, numberPhone, email);
        this.customerType = customerType;
        this.location = location;
    }

    public String getCustomerType() {
        return customerType;
    }

    public void setCustomerType(String customerType) {
        this.customerType = customerType;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "customerType='" + customerType + '\'' +
                ", location='" + location + '\'' +
                '}';
    }
}
