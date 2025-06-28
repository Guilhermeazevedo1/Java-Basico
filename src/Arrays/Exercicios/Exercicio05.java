package Arrays.Exercicios;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio05 {
    //Faça um programa que leia N números reais e armazene-os em um vetor. Em seguida, mostrar na tela
    //o maior número do vetor (supor não haver empates). Mostrar também a posição do maior elemento,
    //considerando a primeira posição como 0 (zero).

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Quantos numeros voce vai digitar?");
        int n = sc.nextInt();
        double[] vect = new double[n];
        for(int i = 0; i < vect.length; i++){
            System.out.printf("Digite o %dº número: ", i + 1);
            vect[i] = sc.nextDouble();
        }

        double maiorValor = vect[0];
        int posicaoMaior = 0;
        for(int i = 0; i < vect.length; i++){
            if(vect[i] > maiorValor){
                maiorValor = vect[i];
                posicaoMaior = i;
            }
        }

        System.out.printf("Maior valor é: %.1f%n ", maiorValor);
        System.out.printf("Posição do maior valor é: %d", posicaoMaior);
    }
}
