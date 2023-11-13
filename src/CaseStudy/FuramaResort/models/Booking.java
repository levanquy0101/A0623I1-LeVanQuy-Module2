package CaseStudy.FuramaResort.models;

public class Booking {
    private int IdBooking;
    private int dateStart;
    private int dateEnd;
    private int IdCustomer;
    private String serviceName;
    private String ServiceType;

    public Booking(int idBooking, int dateStart, int dateEnd, int idCustomer, String serviceName, String serviceType) {
        IdBooking = idBooking;
        this.dateStart = dateStart;
        this.dateEnd = dateEnd;
        IdCustomer = idCustomer;
        this.serviceName = serviceName;
        ServiceType = serviceType;
    }
}
