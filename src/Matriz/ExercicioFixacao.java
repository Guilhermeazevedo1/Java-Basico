package Matriz;

import java.util.Scanner;

public class ExercicioFixacao {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Escolha o tamanho das colunas");
        int n = sc.nextInt();
        System.out.println("Escolha o tamanho das linhas");
        int m = sc.nextInt();

        sc.close();
    }
}
