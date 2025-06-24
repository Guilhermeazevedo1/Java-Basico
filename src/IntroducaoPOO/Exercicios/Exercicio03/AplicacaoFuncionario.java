package IntroducaoPOO.Exercicios.Exercicio03;

import java.util.Locale;
import java.util.Scanner;

public class AplicacaoFuncionario {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.US);
        Locale.setDefault(Locale.US);

        Funcionario funcionario = new Funcionario();

        System.out.print("Digite o nome do funcionário: ");
        funcionario.nome = sc.nextLine();

        System.out.print("Digite o salário bruto: ");
        funcionario.salarioBruto = sc.nextDouble();

        System.out.print("Digite o valor taxa: ");
        funcionario.taxa = sc.nextDouble();

        System.out.println();
        System.out.println("Funcionário: " + funcionario);

        System.out.println("Qual a porcentagem de aumento: ");
        double aumento = sc.nextDouble();
        funcionario.aumento(aumento);

        System.out.print("Novo salário: " + funcionario);



    }
}
