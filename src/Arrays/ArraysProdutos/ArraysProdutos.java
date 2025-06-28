package Arrays.ArraysProdutos;

import java.util.Locale;
import java.util.Scanner;

public class ArraysProdutos {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        System.out.println("Quantos itens você quer calcular?");
        int n = sc.nextInt();
        ProdutoEntities[] vect = new ProdutoEntities[n];
        double soma = 0.0;
        for (int i = 0; i < vect.length; i++){
            sc.nextLine();
            System.out.println("Digite o item");
            String nome = sc.nextLine();
            double price = sc.nextDouble();
            vect[i] = new ProdutoEntities(nome, price);
            soma += vect[i].getPreco();
        }

        double media = soma / vect.length;
        System.out.printf("O resultado é %.2f%n", media);
    }
}
