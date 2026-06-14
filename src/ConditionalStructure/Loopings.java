package ConditionalStructure;//  operador                      equivalente
//    +=                            x = x + x
//    -=                            x = x - x
//    *=
//    /=
//    %=

public class    Loopings {

    public static void main(String[] args) {
        double sum = 0;
        int counter = 0;

        while(counter < 2) {

            double valueOFTheBook = 59.90;
            sum += valueOFTheBook;
            counter ++;

            System.out.println(" The total in stock is " + sum);
            }
        
        if (sum < 150){
            System.out.println("Your stock is very low.");
        } else if (sum >= 2000) {
            System.out.println("Your stock is very high.");
        } else {
            System.out.println("Your stock is good.");
        }
    }
}
