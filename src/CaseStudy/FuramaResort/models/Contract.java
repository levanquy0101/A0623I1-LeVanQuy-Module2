package CaseStudy.FuramaResort.models;

public class Contract {
    private int numberConstract;
    private int IdBooking;
    private int moneyFrontPile;
    private int totalAmount;
    private int IdCustomer;

    public Contract(int numberConstract, int idBooking, int moneyFrontPile, int totalAmount, int idCustomer) {
        this.numberConstract = numberConstract;
        IdBooking = idBooking;
        this.moneyFrontPile = moneyFrontPile;
        this.totalAmount = totalAmount;
        IdCustomer = idCustomer;
    }

    public int getNumberConstract() {
        return numberConstract;
    }

    public void setNumberConstract(int numberConstract) {
        this.numberConstract = numberConstract;
    }

    public int getIdBooking() {
        return IdBooking;
    }

    public void setIdBooking(int idBooking) {
        IdBooking = idBooking;
    }

    public int getMoneyFrontPile() {
        return moneyFrontPile;
    }

    public void setMoneyFrontPile(int moneyFrontPile) {
        this.moneyFrontPile = moneyFrontPile;
    }

    public int getTotalAmount() {
        return totalAmount;
    }

    public void setTotalAmount(int totalAmount) {
        this.totalAmount = totalAmount;
    }

    public int getIdCustomer() {
        return IdCustomer;
    }

    public void setIdCustomer(int idCustomer) {
        IdCustomer = idCustomer;
    }
}
