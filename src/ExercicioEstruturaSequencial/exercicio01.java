package ExercicioEstruturaSequencial;

import java.util.Locale;
import java.util.Scanner;

public class exercicio01 {
    public static void main(String[] args) {
        // 1 - soma dois numero inteiros
        Scanner scanner = new Scanner(System.in);
        scanner.useLocale(Locale.US);
        System.out.println("Escola o Primeiro valor: ");
        int num1 = scanner.nextInt();
        System.out.println("Escolha o Segundo Valor: ");
        int num2 = scanner.nextInt();
        int soma = num1 + num2;
        System.out.printf("O Resultado da soma é: %d%n", soma);

        // 2 - Faça um programa para ler o valor do raio de um círculo, e depois mostrar o valor da área com 4 casa decimais

        System.out.printf("Informe o raio do círculo: ");
        double raio = scanner.nextDouble();

        double area = 3.14159 * raio * raio;

        System.out.printf("O valor da área é: %.4f%n", area);



        // 3 - Fazer um programa para ler quatro valores inteiros A, B, C e D. A seguir, calcule e mostre a diferença DIFERENCA = (A * B - C * D).
        // fiz desse modo diferente
        int a, b, c, d, diferenca;
        System.out.println("Escolha 4 números para dar a diferença deles");
        a = scanner.nextInt();
        b = scanner.nextInt();
        c = scanner.nextInt();
        d = scanner.nextInt();
        diferenca = (a * b - c * d);
        System.out.println("O resultado da diferença é: " + diferenca);

        // 4 - Fazer um programa que leia o número de um funcionário, seu número de horas trabalhadas, o valor que recebe por hora e calcula o salário desse funcionário
        System.out.println("Digite o número do funcionário: ");
        int numero = scanner.nextInt();
        System.out.println("Digite as horas trabalhadas: ");
        int horas = scanner.nextInt();
        System.out.println("Digite seu salário: ");
        double salarioHora = scanner.nextDouble();
        double salarioFinal = horas * salarioHora;
        System.out.printf("Numero do colaborador é %d%n", numero);
        System.out.printf("Salário final é R$ %.2f%n", salarioFinal);

        // 5 - Fazer um programa para ler o código de uma peça 1, o número de peças 1, o valor unitário de cada peça 1  Calcule e mostre o valor a ser pago.
        System.out.println("Digite o código da peça 1: ");
        int peca1 = scanner.nextInt();
        System.out.println("Digite a quantidade de peças desejadas: ");
        int qntpecas1 = scanner.nextInt();
        System.out.println("Digite o valor da peça: ");
        double valor1 = scanner.nextDouble();

        System.out.println("Digite o código da peça 2: ");
        int peca2 = scanner.nextInt();
        System.out.println("Digite a quantidade de peças desejadas: ");
        int qntpecas2 = scanner.nextInt();
        System.out.println("Digite o valor da peça: ");
        double valor2 = scanner.nextDouble();

        double valorFinal = ((qntpecas1 * valor1) + (qntpecas2 * valor2));
        System.out.printf("O valor final é de R$ %.2f%n", valorFinal);

        // 6 - Fazer um programa que leia três valores com ponto flutuante de dupla precisão: A, B e C. Em seguida, calcule e
        //mostre:
        //a) a área do triângulo retângulo que tem A por base e C por altura.
        //b) a área do círculo de raio C. (pi = 3.14159)
        //c) a área do trapézio que tem A e B por bases e C por altura.
        //d) a área do quadrado que tem lado B.
        //e) a área do retângulo que tem lados A e B.
        System.out.println("Digite o número A: ");
        double a2 = scanner.nextDouble();
        System.out.println("Digite o número B: ");
        double b2 = scanner.nextDouble();
        System.out.println("Digite o número C: ");
        double c2 = scanner.nextDouble();

        double triangulo = a2 * c2 / 2;
        double circulo = 3.14159 * c2 * c2;
        double trapezio = (a2 + b2) / 2 * c2;
        double quadrado = b2 * b2;
        double retrangulo = a2 * b2;

        System.out.printf("A área do triangulo é de %.3f%n", triangulo);
        System.out.printf("A área do circulo é de %.3f%n", circulo);
        System.out.printf("A área do trapezio é de %.3f%n", trapezio);
        System.out.printf("A área do quadrado é de %.3f%n", quadrado);
        System.out.printf("A área do retangulo é de %.3f%n", retrangulo);

        scanner.close();
    }
}
