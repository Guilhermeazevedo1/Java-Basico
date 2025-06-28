package Arrays;

import java.util.Locale;
import java.util.Scanner;

public class Arrays {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.US);

        System.out.println("Quantas alturas você vai digitar?");
        int n = sc.nextInt();
        double[] vect = new double[n];
        double soma = 0.0;
        for(int i = 0; i < n; i++){
            System.out.println("Digite a altura: ");
            vect[i] = sc.nextDouble();
            soma += vect[i];
        }

        double media = soma / n;

        System.out.printf("O valor é %.2f%n",media);

        sc.close();
    }
}
