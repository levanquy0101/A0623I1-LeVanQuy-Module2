package CaseStudy.Phone.model;

public class PhoneModel {
    private int id;
    private String type;
    private String name;
    private int price;
    private String producer;
    private String warrantyPeriod;
    private int warrantyCode;
    private String country;
    private String status;


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getProducer() {
        return producer;
    }

    public void setProducer(String producer) {
        this.producer = producer;
    }

    public String getWarrantyPeriod() {
        return warrantyPeriod;
    }

    public void setWarrantyPeriod(String warrantyPeriod) {
        this.warrantyPeriod = warrantyPeriod;
    }

    public int getWarrantyCode() {
        return warrantyCode;
    }

    public void setWarrantyCode(int warrantyCode) {
        this.warrantyCode = warrantyCode;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public PhoneModel(int id, String name, int price, String producer, String warrantyPeriod, int warrantyCode) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.producer = producer;
        this.warrantyPeriod = warrantyPeriod;
        this.warrantyCode = warrantyCode;
    }

    public PhoneModel(int id, String name, int price, String producer, String country, String status) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.producer = producer;
        this.country = country;
        this.status = status;
    }
}
