package CaseStudy.FuramaResort.models;

public class Room extends Facility {
    private String serviceFree;


    public Room(String serviceName, double area, double rentalCost, int maxCapacity, String rentalType, String serviceFree) {
        super(serviceName, area, rentalCost, maxCapacity, rentalType);
        this.serviceFree = serviceFree;
    }

    public String getServiceFree() {
        return serviceFree;
    }

    public void setServiceFree(String serviceFree) {
        this.serviceFree = serviceFree;
    }

    @Override
    public void displayInfo() {

    }
}
