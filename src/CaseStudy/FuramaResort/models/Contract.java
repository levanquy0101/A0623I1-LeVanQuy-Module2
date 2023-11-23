package CaseStudy.FuramaResort.models;

public class Contract {
    private int numberConstract;
    private int idBooking;
    private int moneyFrontPile;
    private int totalAmount;
    private int idCustomer;

    public Contract(int numberConstract, int idBooking, int moneyFrontPile, int totalAmount, int idCustomer) {
        this.numberConstract = numberConstract;
        this.idBooking = idBooking;
        this.moneyFrontPile = moneyFrontPile;
        this.totalAmount = totalAmount;
        this.idCustomer = idCustomer;
    }

    public int getNumberConstract() {
        return numberConstract;
    }

    public void setNumberConstract(int numberConstract) {
        this.numberConstract = numberConstract;
    }

    public int getIdBooking() {
        return idBooking;
    }

    public void setIdBooking(int idBooking) {
        this.idBooking = idBooking;
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
        return idCustomer;
    }

    public void setIdCustomer(int idCustomer) {
        this.idCustomer = idCustomer;
    }
}
