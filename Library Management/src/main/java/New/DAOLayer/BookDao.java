package New.DAOLayer;

import New.Model.Book;

import java.util.List;

public interface BookDao {
    void addBook();
    void updateBook();
    void deleteBook();
    List<Book> getAllBooks();
    Book getBookById(int bookId);


}
