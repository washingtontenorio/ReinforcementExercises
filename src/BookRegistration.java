public class BookRegistration {
    public static void main(String[] args) {

        Book book = new Book();
        book.name = "java 8 practical";
        book.description = "new language features";
        book.value = 59.90;
        book.isbn ="978-85-66250-45-6";

        System.out.println(book.name);
        System.out.println(book.description);
        System.out.println(book.value);
        System.out.println(book.isbn);

        Book otherBook = new Book();

        otherBook.name = "Lógica de Programação";
        otherBook.description = "Create your first programs";
        otherBook.value = 59.90;
        otherBook.isbn = "978-85-66250-22-0";

        System.out.println(otherBook.name);
        System.out.println(otherBook.description);
        System.out.println(otherBook.value);
        System.out.println(otherBook.isbn);

        



    }
}
