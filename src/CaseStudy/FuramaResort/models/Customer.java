package CaseStudy.FuramaResort.models;

public class Customer extends Person {
    private int idCustomer;
    private int customerType;
    private String address;

    public Customer(String name, String date, String sex, int cmnd, int phone, String email, int idCustomer, int customerType, String address) {
        super(name, date, sex, cmnd, phone, email);
        this.idCustomer = idCustomer;
        this.customerType = customerType;
        this.address = address;
    }

    public int getIdCustomer() {
        return idCustomer;
    }

    public void setIdCustomer(int idCustomer) {
        this.idCustomer = idCustomer;
    }

    public int getCustomerType() {
        return customerType;
    }

    public void setCustomerType(int customerType) {
        this.customerType = customerType;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
