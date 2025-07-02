package Matriz;

import java.util.Scanner;

public class MatrizExercicio {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Escolha o tamanho da matriz: ");
        int n = sc.nextInt();
        int[][] mat = new int[n][n];
        int negativos = 0;
        for (int i = 0; i < mat.length; i++){
            for (int j = 0; j < mat[i].length; j++){
                mat[i][j] = sc.nextInt();
                if (mat[i][j] < 0){
                    negativos++;
                }
            }
        }

        System.out.println("Números da diagonal");
        for (int i = 0; i < mat.length; i++){
            System.out.print(mat[i][i] + " ");
        }

        System.out.println();
        System.out.println("A quantidade de números negativos são: " + negativos);

        sc.close();
    }
}
