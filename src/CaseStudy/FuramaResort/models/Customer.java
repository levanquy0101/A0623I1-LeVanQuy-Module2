package CaseStudy.FuramaResort.models;

public class Customer extends Person {
    private int IdCustomer;
    private int CustomerType;
    private String address;


    public Customer(String name, int date, String sex, int cmnd, int phone, String email, int idCustomer, int customerType, String address) {
        super(name, date, sex, cmnd, phone, email);
        IdCustomer = idCustomer;
        CustomerType = customerType;
        this.address = address;
    }

    public int getIdCustomer() {
        return IdCustomer;
    }

    public void setIdCustomer(int idCustomer) {
        IdCustomer = idCustomer;
    }

    public int getCustomerType() {
        return CustomerType;
    }

    public void setCustomerType(int customerType) {
        CustomerType = customerType;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
