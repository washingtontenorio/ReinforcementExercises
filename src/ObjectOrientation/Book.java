package ObjectOrientation;

public class Book {
     String name;
     String description;
     double value;
     String isbn;
     Author author;


     void showDetail() {
        String message = "Showing detail of the book.";
        System.out.println(message);
        System.out.println("name: " + name);
        System.out.println("description: " + description);
        System.out.println("value: " + value);
        System.out.println("isbn: " + isbn);
        System.out.println("--");
        System.out.println("Showing detail of the author");
        System.out.println("Name: " + author.nameOfAuthor);
        System.out.println("Email: " + author.emailOfAuthor);
        System.out.println("CPF: " + author.cpfOfAuthor);


    }
}
