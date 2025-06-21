package Repeticao;

import java.util.Locale;
import java.util.Scanner;

public class RepeticaoFor {
    public static void main(String[] args) {
        // 1 - exibir os numeros impares
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.US);
        System.out.println("Digite um número para saber os impares");
        int numero = sc.nextInt();
        for(int i = 0; i <= numero; i++){
            if(i % 2 != 0){
                System.out.println(i);
            }
        }

        // 2 - Leia um valor inteiro N. Este valor será a quantidade de valores inteiros X que serão lidos em seguida.
        //Mostre quantos destes valores X estão dentro do intervalo [10,20] e quantos estão fora do intervalo, mostrando
        //essas informações conforme exemplo (use a palavra "in" para dentro do intervalo, e "out" para fora do intervalo).

        System.out.println("Escolha o numero de vezes: ");
        int escolha = sc.nextInt();
        int valorIn = 0;
        int valorOut = 0;

        System.out.printf("Escolha %d números", escolha);
        for(int i = 0; i < escolha; i++){
            int perguntaValor = sc.nextInt();
            if(perguntaValor >= 10 && perguntaValor <= 20){
                valorIn++;
            }else{
                valorOut++;
            }
        }
        System.out.printf("O valores dentro do intervalo foram %d e fora do intervalo %d", valorIn, valorOut);

        // 3 - Faça a média ponderada de um quantidade de 3 números e escolha a quantidade de vezes
        System.out.println("Escolha a quantas vezes você quer calcular: ");
        int quantidade = sc.nextInt();
        double valor1, valor2, valor3, resultado;
        int peso1 = 2;
        int peso2 = 3;
        int peso3 = 5;

        System.out.printf("A quantidade de vezes escolhida foi %d%n", quantidade);
        System.out.println("Escolha três valores");
        for(int i = 0; i < quantidade; i++){
            valor1 = sc.nextDouble();
            valor2 = sc.nextDouble();
            valor3 = sc.nextDouble();

            resultado = ((valor1 * peso1) + (valor2 * peso2) + (valor3 * peso3)) / (peso1 + peso2 + peso3);
            System.out.printf("Resultado %.1f%n", resultado);
        }

        // 4 - Fazer um programa para ler um número N. Depois leia N pares de números e mostre a divisão do primeiro pelo
        //segundo. Se o denominador for igual a zero, mostrar a mensagem "divisao impossivel".

        System.out.println("Escola a quantidade de divisões: ");
        int divisoes = sc.nextInt();
        System.out.printf("A quantidade de divisões escolhida foi %d%n", divisoes);
        System.out.println("Escolha o numerador e depois o denominador");
        for(int i = 0; i < divisoes; i++){
            double numerador = sc.nextInt();
            double denominador = sc.nextInt();

            if(denominador == 0){
                System.out.println("Divisão Impossível");
            }else{
               double resultadoDivisao = numerador / denominador;
                System.out.printf("O resultado foi: %.1f%n", resultadoDivisao);
            }
        }

        // 5 - Ler um valor N. Calcular e escrever seu respectivo fatorial. Fatorial de N = N * (N-1) * (N-2) * (N-3) * ... * 1.
        //Lembrando que, por definição, fatorial de 0 é 1.
        System.out.println("Escolha a quantidade de vezes que vai calcular: ");
        int quantidadeFatorial = sc.nextInt();
        System.out.printf("A quantidade escolhida foi %d%n", quantidadeFatorial);
        int fatorial = 1;
        for(int i = 1; i <= quantidadeFatorial; i++){
            fatorial *= i;
        }
        System.out.printf("O resultado é: %d", fatorial);

        // 6 - Ler um número inteiro N e calcular todos os seus divisores.
        System.out.println("Escolha um número para saber seus divisores: ");
        int numeroDivisores = sc.nextInt();
        for(int i = 1; i <= numeroDivisores; i++){
            if(numeroDivisores % i == 0){
                System.out.println(i);
            }
        }

        // 7 - Fazer um programa para ler um número inteiro positivo N. O programa deve então mostrar na tela N linhas,
        //começando de 1 até N. Para cada linha, mostrar o número da linha, depois o quadrado e o cubo do valor, conforme
        //exemplo.

        System.out.println("Escolha o valor para mostrar o quadrado e o cubo do valor");
        int valorEscolhido = sc.nextInt();
        System.out.printf("valor escolhido foi %d", valorEscolhido);
        for(int i = 0; i < valorEscolhido; i++){

            int valorInicial = i;
            int valorQuadrado = i * i;
            int valorCubo = i * i * i;
            System.out.printf(" Valor inicial: %d valor quadrado: %d valor cubo: %d%n", valorInicial, valorQuadrado, valorCubo);
        }


    }
}
