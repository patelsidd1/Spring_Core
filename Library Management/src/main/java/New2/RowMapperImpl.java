package New2;


import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class RowMapperImpl implements RowMapper<Book> {

    @Override
    public Book mapRow(ResultSet rS, int i) throws SQLException {
        Book book = new Book();
        book.setId(rS.getInt(1));
        book.setTitle(rS.getString(2));
        book.setAuthor(rS.getString(3));
        book.setYear(rS.getInt(4));
        return book;
    }
}
