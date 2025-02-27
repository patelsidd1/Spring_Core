package New2;


import java.util.List;

public interface BookDao {
    int insert(Book book);
    List<Book> getAllBooks();
    int delete(int bookId);
    int update (Book book);

}
