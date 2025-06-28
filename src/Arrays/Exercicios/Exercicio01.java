package Arrays.Exercicios;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio01 {
    public static void main(String[] args) {

        //Faça um programa que leia um número inteiro positivo N (máximo = 10) e depois N números inteiros
        //e armazene-os em um vetor. Em seguida, mostrar na tela todos os números negativos lidos.
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        System.out.println("Informe quantos números você vai digitar");
        int n = sc.nextInt();
        int[] vect = new int[n];
        System.out.printf("Digite %d números%n", n);
        for(int i = 0; i < vect.length; i++){
            vect[i] = sc.nextInt();
        }
        System.out.println("Os números negativos são: ");
        for(int i = 0; i < vect.length; i++){
            if(vect[i] < 0){
                System.out.print(vect[i]);
            }
        }
    }
}
