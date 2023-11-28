package CaseStudy.Book.seveices;

import CaseStudy.Book.model.BookModel;

import java.util.ArrayList;
import java.util.List;

public class BookServiceImpl implements BookService {
    private List<BookModel> bookModelList = new ArrayList<>();
    public BookServiceImpl() {

    }
    @Override
    public List<BookModel> findALl() {
        return  bookModelList;
    }

    @Override
    public void deleteBook(int id) {

    }

    @Override
    public void findName(String name) {

    }

    @Override
    public List<BookModel> sortBookPrice(int price) {
        return null;
    }

    @Override
    public void writeFileBook(String filePath) {

    }

    @Override
    public void save(BookModel bookModel) {
        if(bookModel.getIdBook() > 0){
            for (int i = 0; i < bookModelList.size(); i++) {
                if(bookModelList.get(i).getIdBook() == bookModel.getIdBook()){
                    bookModelList.set(i, bookModel);
                }
            }
        }
        else {
            int lastId = bookModelList.get(bookModelList.size()-1).getIdBook();
            bookModel.setIdBook(lastId+1);
            bookModelList.add(bookModel);
        }
    }
}
