package ObjectOrientation;

public class Test {

    public static void main(String[] args) {

        Author author = new Author();
        author.nameOfAuthor = "Rodrigo";

        Book book = new Book();
        book.author = author;

        book.author.nameOfAuthor = "Guilherme";

        System.out.println(author.nameOfAuthor);
    }
}
