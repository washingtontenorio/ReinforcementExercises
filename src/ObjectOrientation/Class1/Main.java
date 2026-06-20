package ObjectOrientation.Class1;

public class Main {

    public static void main(String[] args) {

        var male = new Person();
        male.setName("Washington");
        male.setAge(43);

        var female = new Person();
        female.setName("Lilyane");
        female.setAge(39);

        System.out.println("Male name: " + male.getName() + " age: " + male.getAge());
        System.out.println("Female name: " + female.getName() + " age: " + female.getAge());
    }
}