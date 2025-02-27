package New.DAOLayer;

import New.Model.Book;
import org.springframework.jdbc.core.JdbcTemplate;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

public abstract class BookDaoImpl implements BookDao {

    private JdbcTemplate jdbcTemplate;


    public void addBook(Book book) {
        String query = "INSERT INTO book (title, author, availability) VALUES (?, ?, ?)";
        this.jdbcTemplate.update(query, book.getTitle(), book.getAurthor(), book.isAvailable(true));
    }


//    public void updateBook(Book book) {
//        String query = "UPDATE book SET title = ?, author = ?, availability = ? WHERE id = ?";
//        this.jdbcTemplate.update(query, book.getTitle(), book.getAurthor(), book.isAvailable(true), book.getId());
//    }
//
//
//    public void deleteBook(int bookId) {
//        String query = "DELETE FROM book WHERE id = ?";
//        this.jdbcTemplate.update(query, bookId);
//    }
//
//
//    public List<Book> getAllBooks() {
//        String query = "SELECT * FROM book";
//        return this.jdbcTemplate.query(query, this::mapRowToBook);
//    }
//
//
//    public Book getBookById(int bookId) {
//        String query = "SELECT * FROM book WHERE id = ?";
//        return this.jdbcTemplate.queryForObject(query, this::mapRowToBook, bookId);
//    }
//
//    private Book mapRowToBook(ResultSet rs, int rowNum) throws SQLException {
//        Book book = new Book();
//        book.setId(rs.getInt("id")); // Corrected
//        book.setTitle(rs.getString("title")); // Corrected
//        book.setAurthor(rs.getString("author")); // Corrected
//        book.setAvailable(rs.getBoolean("availability")); // Corrected
//        return book;
//    }

    public JdbcTemplate getJdbcTemplate() {
        return jdbcTemplate;
    }

    public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }
}
