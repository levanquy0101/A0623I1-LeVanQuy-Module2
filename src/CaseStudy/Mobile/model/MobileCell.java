package CaseStudy.Mobile.model;

public class MobileCell extends MobileModel{
    private String coutry;
    private String status;

    public String getCoutry() {
        return coutry;
    }

    public void setCoutry(String coutry) {
        this.coutry = coutry;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public MobileCell(int id, String name, int price, String producer, String coutry, String status) {
        super(id, name, price, producer);
        this.coutry = coutry;
        this.status = status;
    }

    @Override
    public String toString() {
        return "MobileCell{" +
                "id=" + getId() +
                ", name='" + getName() + '\'' +
                ", price=" + getPrice() +
                ", producer='" + getProducer() + '\'' +
                ", country='" + coutry + '\'' +
                ", status='" + status + '\'' +
                '}';
    }
}
