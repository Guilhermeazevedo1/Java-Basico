package Condicionais;

import java.util.Locale;
import java.util.Scanner;

public class exercicioCondicionais {
    public static void main(String[] args) {
        // 1 - Fazer um programa para ler um número inteiro, e depois dizer se este número é negativo ou não.
          Scanner scanner = new Scanner(System.in);
          scanner.useLocale(Locale.US);
        System.out.println("Escolha um número: ");
        int numero = scanner.nextInt();
        if (numero >= 0){
            System.out.printf("O número %d não é negativo", numero);
        }else {
            System.out.println("O número é negativo");
        }

        // 2 - fazer um programa para ler um número inteiro e dizer se este número é par ou ímpar
        System.out.println("Digite um número para saber se é par ou ímpar");
        int numeroInteiro = scanner.nextInt();
        if(numeroInteiro % 2 == 0){
            System.out.printf("O número %d é par", numero);
        }else{
            System.out.printf("O número %d é impar", numero);
        }

        // 3 - Leia 2 valores inteiros (A e B). Após, o programa deve mostrar uma mensagem "Sao Multiplos" ou "Nao sao
        //Multiplos", indicando se os valores lidos são múltiplos entre si.

        System.out.println("Digite um número");
        int numero1 = scanner.nextInt();
        System.out.println("Digite o segundo número para saber se são multiplos");
        int numero2 = scanner.nextInt();
        if(numero1 % numero2 == 0 || numero2 % numero1 == 0){
            System.out.println("Os números são multiplos");
        }else {
            System.out.println("Os números não são multiplos");
        }

        // 4 - Leia a hora inicial e a hora final de um jogo. A seguir calcule a duração do jogo, sabendo que o mesmo pode
        //começar em um dia e terminar em outro, tendo uma duração mínima de 1 hora e máxima de 24 horas.
        System.out.println("Digite a hora inicial");
        int horaInicial = scanner.nextInt();
        System.out.println("Digite a hora final");
        int horaFinal = scanner.nextInt();

        int duracao;
        if(horaInicial < horaFinal){
            duracao = horaFinal - horaInicial;
        }else{
            duracao = 24 - horaInicial + horaFinal;
        }

        System.out.println("A duração do jogo foi " + duracao);

          // 5 - Com base na tabela abaixo, escreva um programa que leia o código de um item e a quantidade deste item. A
        //seguir, calcule e mostre o valor da conta a pagar.
        System.out.println("Escolha o codigo do produto: ");
        int codigo = scanner.nextInt();
        System.out.println("Escolha a quantidade do produto: ");
        int quantidade = scanner.nextInt();

        double total;
        switch(codigo){
            case 1:
                total = quantidade * 4.00;
                System.out.printf("O valor final foi %.2f%n", total);
                break;
            case 2:
                total = quantidade * 4.50;
                System.out.printf("O valor final foi %.2f%n", total);
                break;
            case 3 :
                total = quantidade * 5.00;
                System.out.printf("O valor final foi %.2f%n", total);
                break;
            case 4 :
                total = quantidade * 2.00;
                System.out.printf("O valor final foi %.2f%n", total);
                break;
            case 5:
                total = quantidade * 1.50;
                System.out.printf("O valor final foi %.2f%n", total);
                break;
            default:
                System.out.println("Numero invalido");
                break;
        }

        // 6 - Você deve fazer um programa que leia um valor qualquer e apresente uma mensagem dizendo em qual dos
        //seguintes intervalos ([0,25], (25,50], (50,75], (75,100]) este valor se encontra.
        System.out.println("Digite um numero para saber o intervalo");
        double valor = scanner.nextDouble();

        if(valor < 0 || valor > 100){
            System.out.println("Fora de intervalo");
        } else if(valor <= 25.00){
            System.out.println("Intervalo [0,25]");
        } else if(valor <= 50.00){
            System.out.println("Intervalo [25, 50]");
        } else if(valor <= 75.0) {
            System.out.println("Intervalo (50,75]");
        } else{
            System.out.println("Intervalo (75,100]");
        }

        // 7 - Leia 2 valores com uma casa decimal (x e y), que devem representar as coordenadas
        //de um ponto em um plano. A seguir, determine qual o quadrante ao qual pertence o
        //ponto, ou se está sobre um dos eixos cartesianos ou na origem (x = y = 0).
        //Se o ponto estiver na origem, escreva a mensagem “Origem”

        System.out.println("Escreva o eixo X");
        double x = scanner.nextDouble();
        System.out.println("Escreva o eixo Y");
        double y = scanner.nextDouble();

        if (x == 0 && y == 0){
            System.out.println("Origem");
        } else if(x > 0 && y > 0){
            System.out.println("esta localizado na coordenada Q1");
        }else if(x > 0 && y < 0){
            System.out.println("esta localizado na coordenada Q4");
        } else if(x < 0 && y > 0) {
            System.out.println("esta localizado na coordenada Q2");
        } else if(x < 0 && y < 0) {
            System.out.println("esta localizado na coordenada Q3");
        }

        // 8 - Em um país imaginário denominado Lisarb, todos os habitantes ficam felizes em pagar seus impostos, pois sabem
        //que nele não existem políticos corruptos e os recursos arrecadados são utilizados em benefício da população, sem
        //qualquer desvio. A moeda deste país é o Rombus, cujo símbolo é o R$.
        //Leia um valor com duas casas decimais, equivalente ao salário de uma pessoa de Lisarb. Em seguida, calcule e
        //mostre o valor que esta pessoa deve pagar de Imposto de Renda, segundo a tabela abaixo.
        System.out.println("Digite seu salário para calcular o imposto: ");
        double salario = scanner.nextDouble();

        double imposto;
        if (salario <= 2000.0){
            imposto = 0.0;
        } else if(salario <= 3000.0){
            imposto = (salario - 2000.0) * 0.08;
        } else if(salario <= 4500.0){
            imposto = (salario - 3000.0) * 0.18 + 1000.0 * 0.08;
        }else {
            imposto = (salario - 4500.0) * 0.28 + 1500.0 * 0.18 + 1000.0 * 0.08;
        }

        if(imposto == 0){
            System.out.println("Isento");
        }else {
            System.out.printf("O total de imposto a pagar é de %.2f%n", imposto);
        }
    }
}
