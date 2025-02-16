package construct.ex;

public class BookMain {
    public static void main(String[] args) {
        Book book1 = new Book();
        Book book2 = new Book("Hello Java", "Seo");
        Book book3 = new Book("JPA", "kim", 800);

        book1.displayInfo();
        book2.displayInfo();
        book3.displayInfo();
    }
}
