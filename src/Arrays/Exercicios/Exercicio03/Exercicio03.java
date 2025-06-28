package Arrays.Exercicios.Exercicio03;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio03 {
    public static void main(String[] args) {
        //Fazer um programa para ler nome, idade e altura de N pessoas, conforme exemplo. Depois, mostrar na
        //tela a altura média das pessoas, e mostrar também a porcentagem de pessoas com menos de 16 anos,
        //bem como os nomes dessas pessoas caso houver.

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Informe quantas pessoas vão ser inseridas: ");
        int n = sc.nextInt();
        Pessoa[] vect = new Pessoa[n];
        double soma = 0.0;
        for(int i = 0; i < vect.length; i++){
            System.out.printf("Dados da pessoa %d: %n", i + 1);
            System.out.println("Nome: ");
            String nome = sc.next();
            System.out.println("Idade: ");
            int idade = sc.nextInt();
            System.out.println("Altura: ");
            double altura = sc.nextDouble();
            vect[i] = new Pessoa(nome, idade, altura);
            soma += vect[i].getAltura();
        }

        int nMenores = 0;
        for(int i = 0; i < vect.length; i++){
            if(vect[i].getIdade() < 16){
                nMenores++;
            }
        }

        double porcetagemMenores = ((double)nMenores / vect.length) * 100.0;
        double media = soma / vect.length;
        System.out.printf("A média de altura é: %.2f%n", media);
        System.out.printf("Pessoas com menos de 16 anos: %.1f%%n", porcetagemMenores);
        for(int i = 0; i < vect.length; i++){
            if(vect[i].getIdade() < 16){
                System.out.printf("%s%n", vect[i].getNome());
            }
        }

    }
}
