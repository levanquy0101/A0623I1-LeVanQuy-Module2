package CaseStudy.FuramaResort.models;

public class Villa extends Facility {
    private String roomStandards;
    private int numberFloors;
    private int areaPool;

    public Villa(String serviceName, double area, double rentalCost, int maxCapacity, String rentalType, String roomStandards, int numberFloors, int areaPool) {
        super(serviceName, area, rentalCost, maxCapacity, rentalType);
        this.roomStandards = roomStandards;
        this.numberFloors = numberFloors;
        this.areaPool = areaPool;
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

    public int getAreaPool() {
        return areaPool;
    }

    public void setAreaPool(int areaPool) {
        this.areaPool = areaPool;
    }

    @Override
    public void displayInfo() {

    }
}
