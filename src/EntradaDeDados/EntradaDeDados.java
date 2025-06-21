package EntradaDeDados;

import java.util.Locale;
import java.util.Scanner;

public class EntradaDeDados {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);
        System.out.println("Qual seu nome? ");
        String nome = scanner.next();
        System.out.println("Qual sua idade? ");
        int idade = scanner.nextInt();
        System.out.printf("Meu nome é %s e eu tenho %d anos%n", nome, idade);
        System.out.println("Quanto você ganha? ");
        double salario = scanner.nextDouble();
        System.out.printf("Você recebe %.2f%n", salario);
        System.out.println("qual seu sexo? ");
        char sexo = scanner.next().charAt(0);
        System.out.printf("Seu sexo é %s", sexo);
        scanner.close();
    }
}
