package CaseStudy.FuramaResort.models;

public abstract class Facility {
    private String serviceName;
    private double area;
    private double rentalCost;
    private int maxCapacity;
    private String rentalType;

    public Facility(String serviceName, double area, double rentalCost, int maxCapacity, String rentalType) {
        this.serviceName = serviceName;
        this.area = area;
        this.rentalCost = rentalCost;
        this.maxCapacity = maxCapacity;
        this.rentalType = rentalType;
    }

    public String getServiceName() {
        return serviceName;
    }

    public void setServiceName(String serviceName) {
        this.serviceName = serviceName;
    }

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }

    public double getRentalCost() {
        return rentalCost;
    }

    public void setRentalCost(double rentalCost) {
        this.rentalCost = rentalCost;
    }

    public int getMaxCapacity() {
        return maxCapacity;
    }

    public void setMaxCapacity(int maxCapacity) {
        this.maxCapacity = maxCapacity;
    }

    public String getRentalType() {
        return rentalType;
    }

    public void setRentalType(String rentalType) {
        this.rentalType = rentalType;
    }

    public abstract void displayInfo();
}
