package POO.Polimorfismo.ExercicioFixacao;

import POO.Polimorfismo.ExercicioFixacao.Entities.Produto;
import POO.Polimorfismo.ExercicioFixacao.Entities.ProdutoImportado;
import POO.Polimorfismo.ExercicioFixacao.Entities.ProdutoUsado;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Programa {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        List<Produto> produtos = new ArrayList<>();
        System.out.print("Quantos produtos vão ser passados: ");
        int n = sc.nextInt();

        for(int i = 1; i <= n; i++){
            System.out.print("O produto é normal, importado ou usado (c/u/i)? ");
            String tipoProduto = sc.next();
            System.out.print("Nome: ");
            sc.nextLine();
            String nome = sc.nextLine();
            System.out.print("Preço: ");
            double preco = sc.nextDouble();
            if(tipoProduto.equals("i")){
                System.out.print("Qual o valor da taxa: ");
                double taxaImportacao = sc.nextDouble();
                produtos.add(new ProdutoImportado(nome, preco, taxaImportacao));
            } else if(tipoProduto.equals("u")) {
                System.out.print("Data de vencimento (DD/MM/AAAA): ");
                LocalDate data = LocalDate.parse(sc.next(), DateTimeFormatter.ofPattern("dd/MM/yyyy"));
                produtos.add(new ProdutoUsado(nome, preco, data));
            }else{
                produtos.add(new Produto(nome, preco));
            }
        }

        System.out.println();
        System.out.println("Preço dos itens:");
        for(Produto p : produtos){
            System.out.println(p.etiquetaPreco());
        }
    }
}
