package SaidaDeDados;
import java.util.Locale;

public class SaidaDeDados {
    public static void main(String[] args) {

        int y = 3;
        double x = 10.58486;
        System.out.println("hello");
        System.out.println(y);
        System.out.printf("%.3f%n",x);
        Locale.setDefault(Locale.US);
        System.out.printf("%.3f%n",x);
        System.out.println("Resultado = " + x + " Metros");
        System.out.printf("Resultado %.2f metros%n",x);
        System.out.printf("Resultado %.3f metros%n",x);

        String nome = "Maria";
        int idade = 31;
        double renda = 4000.0;
        System.out.printf("%s tem %d anos e ganha %.2f reais%n", nome, idade, renda);

    }
}
