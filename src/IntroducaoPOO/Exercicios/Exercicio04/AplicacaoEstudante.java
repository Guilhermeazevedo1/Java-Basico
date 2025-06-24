package IntroducaoPOO.Exercicios.Exercicio04;

import java.util.Locale;
import java.util.Scanner;

public class AplicacaoEstudante {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.US);
        Locale.setDefault(Locale.US);

        Estudante estudante = new Estudante();
        System.out.println("Digite o nome do estudante");
        estudante.nome = sc.nextLine();
        System.out.println("Digita as notas do estudante");
        estudante.notaPrimeiro = sc.nextDouble();
        estudante.notaSegundo = sc.nextDouble();
        estudante.notaTerceiro = sc.nextDouble();

        estudante.notaFinal();
    }
}
