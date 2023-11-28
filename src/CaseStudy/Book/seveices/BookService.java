package CaseStudy.Book.seveices;

import CaseStudy.Book.model.BookModel;
import java.util.List;

public interface BookService {
   // List<BookModel>
    List<BookModel> findALl();
    void deleteBook(int id);
    void findName(String name);
    List<BookModel> sortBookPrice(int price);
    void writeFileBook(String filePath);
    void save(BookModel bookModel);
}
