package ObjectOrientation;

public class ComparingReferences {

    public static void main(String[] args) {

        Author author = new Author();
        author.nameOfAuthor = "Rodrigo Turini";
        author.emailOfAuthor = "rodrigo.turini@caleum.com";
        author.cpfOfAuthor = "123.456.789-10";

        Author author2 = new Author();
        author2.nameOfAuthor = "Rodrigo Turini";
        author2.emailOfAuthor = "rodrigo.turini@caleum.com";
        author2.cpfOfAuthor = "123.456.789-10";


        if(author == author2){
            System.out.println("same author");
        } else {
            System.out.println("The are not the same");
        }

    }
}
