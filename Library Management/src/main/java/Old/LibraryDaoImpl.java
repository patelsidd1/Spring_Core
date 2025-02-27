//package Old;
//
//import org.springframework.jdbc.core.JdbcTemplate;
//
//import java.util.List;
//
//public abstract class LibraryDaoImpl implements LibraryDao {
//    JdbcTemplate jdbcTemplate = new JdbcTemplate();
//
//    public JdbcTemplate getJdbcTemplate() {
//        return jdbcTemplate;
//    }
//
//    public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
//        this.jdbcTemplate = jdbcTemplate;
//    }
//
//
//
//    public int addBook(Books book) {
//        String query = "insert into table(title,aurthor,isAvailability) values (?,?,?,?)";
//        int result = this.jdbcTemplate.update(query,book.getTitle(),book.getAurthor(),book.isAvailability());
//        return result;
//
//    }
//
//
//    public int  updateBook(Books book) {
//        String query = "update library set  column1=?, column2 =?, column3 =? where id=?";
//        int result = this.jdbcTemplate.update(query,book.getTitle(),book.getAurthor(),book.isAvailability());
//        return result;
//    }
//
//
//    public int  deleteBook(int bookid) {
//        String query = "delete from library where id= ?";
//        int result = this.jdbcTemplate.update(query,bookid);
//        return result;
//
//    }
//
//    @Override
//    public List<Books> getAllBooks() {
//        String query = "select * from library";
//        List<Books> book = this.jdbcTemplate.query(query,new RowMapperImpl());
//
//        return book ;
//    }
//
//}
