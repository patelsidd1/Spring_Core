package New2;
import org.springframework.jdbc.core.JdbcTemplate;

import java.util.List;

public class BookDaoImpl implements BookDao{

    private JdbcTemplate jdbcTemplate;
    @Override
    public int insert(Book book) {
        String query = "insert into book(title, author,year) values (?,?,?)";
        int r = this.jdbcTemplate.update(query,book.getTitle(),book.getAuthor(),book.getYear());
        return r;
    }

    @Override
    public List<Book> getAllBooks() {
        String query = "select * from book";
        List<Book> books=this.jdbcTemplate.query(query,new RowMapperImpl());

        return books;
    }

    @Override
    public int delete(int bookId) {
        String query = "delete from book where id =?";
        int r = this.jdbcTemplate.update(query, bookId);
        return r;
    }

    @Override
    public int update(Book book) {
        String query = "update  book set title=?, author=?, year=? where id =?";
        int result = this.jdbcTemplate.update(query, book.getTitle(),book.getAuthor(),book.getYear(),book.getId());
        return result;
    }

    public JdbcTemplate getJdbcTemplate() {
        return jdbcTemplate;
    }

    public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }
}
