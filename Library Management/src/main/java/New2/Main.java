package New2;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

public class Main {
    public static void main(String[] args) {

        ApplicationContext context = new ClassPathXmlApplicationContext("New2config.xml");
        BookDao bd = (BookDao) context.getBean("dao");

        Book book = new Book();
        book.setTitle("Python ");
        book.setAuthor("Guido van Rossum");
        book.setYear(1991);

        int result =  bd.insert(book);
        System.out.println("Item inserted sucessfully  "+result);

        // Deleting the data ...
//        int delete = bd.delete(2);
//        System.out.println("Deleted sucessfully : " +delete);

          // Updating the data...
//        book.setTitle("C++");
//        book.setAuthor("Bjarne Stroustrup");
//        book.setYear(1979);
//        book.setId(4);
//        int update = bd.update(book);
//        System.out.println("Data Updated  " +update);

        // Showing all data ..
        List<Book> books = bd.getAllBooks();
        for (Book b : books){
            System.out.println(b);
        }

    }
}
