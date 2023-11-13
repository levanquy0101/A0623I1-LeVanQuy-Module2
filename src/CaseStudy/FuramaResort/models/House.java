package CaseStudy.FuramaResort.models;

public class House extends Facility{
    private String roomStandards;
    private int numberFloors;


    public House(String serviceName, double area, double rentalCost, int maxCapacity, String rentalType, String roomStandards, int numberFloors) {
        super(serviceName, area, rentalCost, maxCapacity, rentalType);
        this.roomStandards = roomStandards;
        this.numberFloors = numberFloors;
    }

    public String getRoomStandards() {
        return roomStandards;
    }

    public void setRoomStandards(String roomStandards) {
        this.roomStandards = roomStandards;
    }

    public int getNumberFloors() {
        return numberFloors;
    }

    public void setNumberFloors(int numberFloors) {
        this.numberFloors = numberFloors;
    }

    @Override
    public void displayInfo() {

    }
}
