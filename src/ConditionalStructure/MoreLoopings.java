package ConditionalStructure;

public class MoreLoopings {
    public static void main(String[] args) {

        double sum = 50;
        for(double i = 0; i < 10; i ++){
            System.out.println("The total in stock is " + sum);
            sum += 10;
            }
        if(sum < 150){
            System.out.println("Your stock is very low.");
        } else if (sum >= 2000) {
            System.out.println("Your stock is very high.");
        }else {
            System.out.println("Your stock is good.");

        }
    }
}
