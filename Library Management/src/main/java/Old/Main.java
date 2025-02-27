//package Old;
//
//import org.springframework.context.ApplicationContext;
//import org.springframework.context.support.ClassPathXmlApplicationContext;
//
//public class New.Main {
//    public static void main(String[] args) {
//
//        ApplicationContext context = new ClassPathXmlApplicationContext("config.xml");
//        LibraryDao dao1 =  context.getBean("dao",LibraryDao.class);
//        Books book = new Books();
//        book.setTitle("Java");
//        book.setAurthor("James Gosling");
//        book.isAvailability();
//
//        int result = dao1.insert(book);
//        System.out.println("Sysyem updated ");
//
//
//
//    }
//}
