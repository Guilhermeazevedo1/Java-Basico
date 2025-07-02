package Listas.Exercicio.revisao;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class AplicacaoProduto {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        List<Produto> listaProdutos = new ArrayList<>();

        System.out.print("Digite quantos produtos deseja cadastrar: ");
        int n = sc.nextInt();

        for(int i = 0; i < n; i++){
            System.out.println("");
            System.out.print("Digite o id do produto " + (i + 1) + ": ");
            int id = sc.nextInt();
            sc.nextLine();
            System.out.print("Digite o nome do produto: ");
            String nome = sc.nextLine();
            System.out.print("Digite o preço do produto: ");
            Double preco = sc.nextDouble();
            Produto produto = new Produto(id, nome, preco);

            listaProdutos.add(produto);
        }
        System.out.println("");
        System.out.printf("Digite o id do produto que vai receber desconto: ");
        int desconto = sc.nextInt();
        Produto produto = listaProdutos.stream().filter(x -> x.getId() == desconto).findFirst().orElse(null);
        if(produto == null){
            System.out.println("O id do produto não existe");
        }else{
            System.out.printf("De quantos porcento vai ser o desconto: ");
            double descontoProduto = sc.nextDouble();
            produto.desconto(descontoProduto);
        }
        System.out.println("");
        for(Produto p : listaProdutos){
            System.out.println(p);
        }

        sc.close();
    }
}
