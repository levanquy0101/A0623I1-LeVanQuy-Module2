package CaseStudy.Book.model;

public class Magazine extends BookModel{
    private int numberPH;
    private int monthPH;

    public int getNumberPH() {
        return numberPH;
    }

    public void setNumberPH(int numberPH) {
        this.numberPH = numberPH;
    }

    public int getMonthPH() {
        return monthPH;
    }

    public void setMonthPH(int monthPH) {
        this.monthPH = monthPH;
    }

    public Magazine(int idBook, String nameBook, String author, int year, double price, int numberPH, int monthPH) {
        super(idBook, nameBook, author, year, price);
        this.numberPH = numberPH;
        this.monthPH = monthPH;
    }

    @Override
    public String toString() {
        return "Magazine{" +
                "idBook=" + getIdBook() +
                "nameBook=" + getNameBook() +
                "author=" + getAuthor() +
                "price=" + getPrice() +
                "numberPH=" + numberPH +
                ", monthPH=" + monthPH +
                '}';
    }
}
