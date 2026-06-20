package ConditionalStructure;


public class TenaryOperator {

        public static void main(String[] args) {

            double nota1 = 7.5;
            if (nota1 >= 6) {
                System.out.println("Aprovado");
            } else {
                System.out.println("Reprovado");
            }

            double nota = 8;
            System.out.println(nota <= 5.5 ? "Aprovado" : "Reprovado");
        }
    }