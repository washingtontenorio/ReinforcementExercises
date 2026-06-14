package ConditionalStructure;

public class StockCalculator {
    public static void main(String[] args) {
        double bookjava8 = 59.99;
        double livroTDD = 159.99;

        double soma = bookjava8 + livroTDD;

        System.out.println("The total stock is " + soma);

        if (soma < 150) {
            System.out.println("Seu estoque está muito baixo!");
        } else if (soma > 200) {
            System.out.println("O total em estoque está muito alto!");
            
        } else {
            System.out.println("Seu estoque está bom!");
        }

        int numero = 4;
        int outroNumeroIgual = numero;
        numero = numero + 5;

        System.out.println(numero);
        System.out.println(outroNumeroIgual);

        String texto = "Eu sou uma string.";
        System.out.println(texto);

        double livrojava8 = 29.90;
        int numeroInteiro = (int)livrojava8;

        System.out.println(numeroInteiro);

    }
}
