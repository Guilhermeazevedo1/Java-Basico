package Matriz;

import java.util.Scanner;

public class ExercicioFixacao {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Escolha o tamanho das colunas: ");
        int m = sc.nextInt();
        System.out.println("Escolha o tamanho das linhas: ");
        int n = sc.nextInt();
        int[][] mat = new int[m][n];
        for(int i = 0; i < mat.length; i++){
            for(int j = 0; j < mat[i].length; j++){
                mat[i][j] = sc.nextInt();
            }
        }

        int numeroEscolhido = sc.nextInt();

        for(int i = 0; i < mat.length; i++){
            for(int j = 0; j < mat[i].length; j++){
                if(mat[i][j] == numeroEscolhido){
                    System.out.println("Posição do número na matriz é: " + i + ", " + j);
                    if(j > 0){
                        System.out.println("Número a esquerda: " + mat[i][j-1]);
                    }
                    if(i > 0){
                        System.out.println("Número acima: " + mat[i-1][j]);
                    }
                    if(j < mat[i].length - 1){
                        System.out.println("Número a direita: " + mat[i][j+1]);
                    }
                    if(i < mat.length - 1){
                        System.out.println("Número abaixo: " + mat[i+1][j]);
                    }
                }
            }
        }

        sc.close();
    }
}
