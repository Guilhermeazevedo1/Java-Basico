package IntroducaoPOO.Exercicio;

import java.util.Locale;
import java.util.Scanner;

public class AplicacaoProduto {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.US);

        EntitiesProduto produto = new EntitiesProduto();
        System.out.println("Digite os dados do produto");
        System.out.print("Name: ");
        produto.name = sc.next();
        System.out.print("Preço do produto: ");
        produto.price = sc.nextDouble();
        System.out.print("Quantidade do produto: ");
        produto.quantidade = sc.nextInt();

        System.out.printf("O produto %s tem o preço %.2f e a quantidade %d%n%n", produto.name, produto.price, produto.quantidade);

        System.out.printf("Qual o valor do estoque de %s: %n", produto.name);
        System.out.println(produto.valorTotalEstoque());

        System.out.printf("Digite quantos %s deseja remover: ", produto.name);
        int qntRemovido = sc.nextInt();
        produto.removerProtudos(qntRemovido);
        System.out.println("A quantidade de produtos agora é: " + produto.quantidade);

        System.out.printf("Digite quantos(as) %s entrou: ", produto.name);
        int produtoAdd = sc.nextInt();
        produto.addProtudos(produtoAdd);
        System.out.println("A quantidade de produtos agora é: " + produto.quantidade);

        System.out.println("O valor final do estoque é: " + produto.valorTotalEstoque());

        sc.close();
    }
}
