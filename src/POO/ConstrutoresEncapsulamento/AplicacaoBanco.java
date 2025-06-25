package POO.ConstrutoresEncapsulamento;

import java.util.Locale;
import java.util.Scanner;

public class AplicacaoBanco {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.US);
        Conta conta;

        System.out.print("Número da sua conta: ");
        int numero = sc.nextInt();

        System.out.print("Nome do titular da conta: ");
        sc.nextLine();
        String nome = sc.nextLine();

        System.out.println("Deseja fazer um deposito inicial? (y/n)");
        char resposta = sc.next().charAt(0);
        if(resposta == 'y'){
            System.out.println("Qual valor inicial?");
            double depositoInicial = sc.nextDouble();
            conta = new Conta(numero, nome, depositoInicial);
        }else{
            conta = new Conta(numero, nome);
        }

        System.out.println();
        System.out.println("Dados da conta:");
        System.out.println(conta);

        System.out.println();
        System.out.print("Digite um valor para deposito: ");
        double valorDeposito = sc.nextDouble();
        conta.deposito(valorDeposito);
        System.out.println("Atualização dos dados da conta: ");
        System.out.println(conta);

        System.out.println();
        System.out.print("Digite um valor para saque: ");
        double valorSaque = sc.nextDouble();
        conta.saque(valorSaque);
        System.out.println("Atualização dos dados da conta: ");
        System.out.println(conta);



        sc.close();
    }
}
