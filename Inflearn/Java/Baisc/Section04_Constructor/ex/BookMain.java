package construct.ex;

public class BookMain {
    public static void main(String[] args) {
        Book book1 = new Book();
        Book book2 = new Book("Hello java", "Seo");
        Book book3 = new Book("java", "Se", 100);

        Book[] books = {book1, book2, book3};

        for (Book b : books) {
            System.out.println("제목:" + b.title + ", 저자:" + b.author + ", 페이지:" + b.page);
        }
    }
}
