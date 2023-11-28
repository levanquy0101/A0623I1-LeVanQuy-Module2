package CaseStudy.Book.model;

public class Textbook extends BookModel{
    private int levelClass;
    private int semester;

    public int getLevelClass() {
        return levelClass;
    }

    public void setLevelClass(int levelClass) {
        this.levelClass = levelClass;
    }

    public int getSemester() {
        return semester;
    }

    public void setSemester(int semester) {
        this.semester = semester;
    }

    public Textbook(int idBook, String nameBook, String author, int year, double price, int levelClass, int semester) {
        super(idBook, nameBook, author, year, price);
        this.levelClass = levelClass;
        this.semester = semester;
    }

    @Override
    public String toString() {
        return "Textbook{" +
                "idBook=" + getIdBook() +
                "nameBook=" + getNameBook() +
                "author=" + getAuthor() +
                "price=" + getPrice() +
                "levelClass=" + levelClass +
                ", semester=" + semester +
                '}';
    }
}
