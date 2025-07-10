package POO.Abstração.MetodoAbstrato;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Programa {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        List<Forma> list = new ArrayList<>();
        System.out.print("Quantos Formas vão ser inseridas? ");
        int n = sc.nextInt();

        for(int i = 1; i <= n; i++){
            System.out.println("Informe o dado da forma " + i);
            System.out.print("É um retângulo ou um Circulo (r/c)? ");
            String escolha = sc.next();
            System.out.print("Qual a cor da forma (Preto, Azul, Vermelho): ");
            sc.nextLine();
            Cor cor = Cor.valueOf(sc.nextLine());
            if(escolha.equals("r")){
                System.out.println("Largura: ");
                Double largura = sc.nextDouble();
                System.out.println("Altura: ");
                Double altura = sc.nextDouble();
                list.add(new Retangulo(cor, largura, altura));
            }else{
                System.out.print("Qual o valor do raio: ");
                Double raio = sc.nextDouble();
                list.add(new Circulo(cor, raio));
            }
        }

        System.out.println("Áreas das formas são:");
        for(Forma forma : list){
            System.out.println("A área da forma é " + String.format("%.2f", forma.area()));
        }
    }
}
