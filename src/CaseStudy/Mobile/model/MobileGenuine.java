package CaseStudy.Mobile.model;

public class MobileGenuine extends MobileModel{
    private String warrantPeriod;
    private int warrantyCode;

    public String getWarrantPeriod() {
        return warrantPeriod;
    }

    public void setWarrantPeriod(String warrantPeriod) {
        this.warrantPeriod = warrantPeriod;
    }

    public int getWarrantyCode() {
        return warrantyCode;
    }

    public void setWarrantyCode(int warrantyCode) {
        this.warrantyCode = warrantyCode;
    }

    public MobileGenuine(int id, String name, int price, String producer, String warrantPeriod, int warrantyCode) {
        super(id, name, price, producer);
        this.warrantPeriod = warrantPeriod;
        this.warrantyCode = warrantyCode;
    }

    @Override
    public String toString() {
        return "MobileGenuine{" +
                "id=" + getId() +
                ", name='" + getName() + '\'' +
                ", price=" + getPrice() +
                ", producer='" + getProducer() + '\'' +
                ", warrantPeriod='" + warrantPeriod + '\'' +
                ", warrantyCode=" + warrantyCode +
                '}';
    }
}
