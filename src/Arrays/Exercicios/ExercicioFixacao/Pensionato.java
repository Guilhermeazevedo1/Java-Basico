package Arrays.Exercicios.ExercicioFixacao;

import java.util.Locale;
import java.util.Scanner;

public class Pensionato {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        Estudantes[] vect = new Estudantes[10];
        System.out.println("Quantos quarto vão ser alugados? ");
        int n = sc.nextInt();

        for(int i = 0; i < n; i++){
            System.out.print("Digite o nome: ");
            sc.nextLine();
            String nome = sc.nextLine();
            System.out.print("Digite o email: ");
            String email = sc.next();
            System.out.print("Digite o quarto: ");
            int quarto = sc.nextInt();
            vect[quarto] = new Estudantes(nome, email);
        }

        System.out.println("Quartos alugados: ");
        for(int i = 0; i < vect.length; i++){
            if(vect[i] != null) {
                System.out.println(i + ": " + vect[i]);
            }
        }
    }
}
