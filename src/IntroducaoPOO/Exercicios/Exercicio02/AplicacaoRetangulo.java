package IntroducaoPOO.Exercicios.Exercicio02;

import java.util.Locale;
import java.util.Scanner;

public class AplicacaoRetangulo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.US);
        Locale.setDefault(Locale.US);
        EntitiesRetangulo retangulo = new EntitiesRetangulo();

        System.out.println("Digite a largura do retangulo");
        retangulo.largura = sc.nextDouble();

        System.out.println("Digite a altura do retangulo");
        retangulo.altura = sc.nextDouble();

        double area = retangulo.area();
        System.out.printf("Área = %.2f%n", area);

        double perimetro = retangulo.perimetro();
        System.out.printf("Perimetro = %.2f%n", perimetro);

        double diagonal = retangulo.diagonal();
        System.out.printf("Diagonal = %.2f%n", diagonal);

    }
}
