package IntroducaoPOO;

import IntroducaoPOO.Entities.Triangulo;

import java.util.Locale;
import java.util.Scanner;

public class Aplicacao {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.US);
        Triangulo x = new Triangulo();
        Triangulo y = new Triangulo();

        System.out.println("Escolha três números do triângulo X");
        x.a = sc.nextDouble();
        x.b = sc.nextDouble();
        x.c = sc.nextDouble();

        System.out.println("Escolha três números do triângulo Y");
        y.a = sc.nextDouble();
        y.b = sc.nextDouble();
        y.c = sc.nextDouble();

        double areaX = x.area();

        double areaY = y.area();

        System.out.printf("A área do triangulo X é: %.4f%n", areaX);
        System.out.printf("A área do triangulo Y é: %.4f%n", areaY);

        if(areaX > areaY){
            System.out.println("A área X é maior");
        }else{
            System.out.println("A área Y é maior");
        }

        sc.close();
    }
}
