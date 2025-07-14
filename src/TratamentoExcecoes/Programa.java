package TratamentoExcecoes;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Programa {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            String[] vetor = sc.nextLine().split(" ");
            int posicao = sc.nextInt();
            System.out.println(vetor[posicao]);
        }
        catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Posição inválida");
        }
        catch (InputMismatchException e){
            System.out.println("Valor digitado não corresponde a um número");
        }

        System.out.println("Fim do programa!");
        sc.close();
    }
}
