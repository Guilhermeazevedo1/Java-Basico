package Arrays.Exercicios;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio04 {
    public static void main(String[] args) {
        //Faça um programa que leia N números inteiros e armazene-os em um vetor. Em seguida, mostre na
        //tela todos os números pares, e também a quantidade de números pares.

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        System.out.println("Informe quantos números vão ser inseridos: ");
        int n = sc.nextInt();
        int[] vect = new int[n];
        int pares = 0;
        for(int i = 0; i < vect.length; i++){
            System.out.printf("Digite o número %d ", i + 1);
            vect[i] = sc.nextInt();
            if(vect[i] % 2 == 0){
                pares++;
            }
        }

        System.out.print("Números pares: ");
        for(int i = 0; i < vect.length; i++){
            if(vect[i] % 2 == 0){
                System.out.print(vect[i] + " ");
            }
        }
        System.out.println("");
        System.out.printf("Total de números pares = %d", pares);
    }
}
