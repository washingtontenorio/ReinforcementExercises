package ObjectOrientation;

public class BookRegistration {
    public static void main(String[] args) {

        Author author = new Author();
        author.nameOfAuthor = "Rodrigo Turini";
        author.emailOfAuthor = "rodrigo.turini@caleum.com";
        author.cpfOfAuthor = "123.456.789-10";

        Book book = new Book();
        book.name = "java 8 practical";
        book.description = "new language features";
        book.value = 59.90;
        book.isbn ="978-85-66250-45-6";

        book.author = author;
        book.showDetail();

        Author otherAuthor = new Author();
        otherAuthor.nameOfAuthor ="Paulo Silveira";
        otherAuthor.emailOfAuthor = "paulo.silveira@caleum.com";
        otherAuthor.cpfOfAuthor = "057.893.456-56";


        Book otherBook = new Book();
        otherBook.name = "Programming logic";
        otherBook.description = "Create your first programs";
        otherBook.value = 59.90;
        otherBook.isbn = "978-85-66250-22-0";

        otherBook.author = otherAuthor;
        otherBook.showDetail();








    }
}
