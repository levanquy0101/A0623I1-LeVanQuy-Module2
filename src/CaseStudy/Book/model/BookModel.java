package CaseStudy.Book.model;

public class BookModel {
    private int idBook;
    private String nameBook;
    private String author;
    private int year;
    private double price;

    public int getIdBook() {
        return idBook;
    }

    public void setIdBook(int idBook) {
        this.idBook = idBook;
    }

    public String getNameBook() {
        return nameBook;
    }

    public void setNameBook(String nameBook) {
        this.nameBook = nameBook;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public BookModel(int idBook, String nameBook, String author, int year, double price) {
        this.idBook = idBook;
        this.nameBook = nameBook;
        this.author = author;
        this.year = year;
        this.price = price;
    }

    @Override
    public String toString() {
        return "BookModel{" +
                "idBook=" + idBook +
                ", nameBook='" + nameBook + '\'' +
                ", author='" + author + '\'' +
                ", year=" + year +
                ", price=" + price +
                '}';
    }
}
