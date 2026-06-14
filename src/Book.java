public class Book {
    public String name;
    public String description;
    public double value;
    public String isbn;

    public static void main(String[] args) {
        String name;
        String description;
        double value;
        String isbn;

        Book book = new Book();
        book.name = "java 8 practical";
        book.description = "new language features";
        book.value = 59.90;
        book.isbn ="978-85-66250-45-6";

        System.out.println("The name of the book is " + book.name);
    }
}
