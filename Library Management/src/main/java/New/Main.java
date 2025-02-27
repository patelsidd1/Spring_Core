package New;

import New.DAOLayer.BookDao;
import New.Model.Book;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
//         AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext("configNew.xml");
//        LibraryService ls= (LibraryService) context.getBean("jdbcTemplate");

//        //Add a book
//        Book book = new Book();
//        book.setTitle("Java");
//        book.setAurthor("james Gosling");
//        book.isAvailable(true);
//
//        ls.addNewBook(book);
//
//        // Showing all book
//        System.out.println("Showing all the books ");
//        ls.listAllBooks().forEach(b -> System.out.println(book.getTitle()));

        ApplicationContext context = new ClassPathXmlApplicationContext("confignew.xml");
        BookDao bd = (BookDao) context.getBean("jdbctemplate");

        Book book = new Book();
        book.setTitle("Java ");
        book.setAurthor("James Gosling ");
        book.setAvailable(true);





    }
}
