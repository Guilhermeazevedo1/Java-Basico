package Arrays.Exercicios;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio02 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Informe quantos números vão ser digitados: ");
        int n = sc.nextInt();
        double[] vect = new double[n];
        double soma = 0.0;
        for(int i = 0; i < vect.length; i++){
            System.out.println("Digite o número: ");
            vect[i] = sc.nextDouble();
            soma += vect[i];
        }
        System.out.print("Valores: ");
        for(int i = 0; i < vect.length; i++){
            System.out.printf("%.1f ", vect[i]);
        }

        double media = soma / vect.length;
        System.out.println("");
        System.out.printf("Valor da soma: %.2f%n", soma);
        System.out.printf("Media dos números %.2f%n", media);


    }
}
