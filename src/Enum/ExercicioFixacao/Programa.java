package Enum.ExercicioFixacao;

import Enum.ExercicioFixacao.Entities.Cliente;
import Enum.ExercicioFixacao.Entities.ItemPedido;
import Enum.ExercicioFixacao.Entities.Pedido;
import Enum.ExercicioFixacao.Entities.Produto;
import Enum.ExercicioFixacao.Enum.StatusPedido;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

public class Programa {
    public static void main(String[] args) throws ParseException {
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Dados do cliente");
        System.out.print("Nome: ");
        String nomeCliente = sc.nextLine();
        System.out.print("Email: ");
        String emailCliente = sc.nextLine();
        System.out.print("Aniversário (dd/mm/aaaa): ");
        Date aniversaioCliente = sdf.parse(sc.next());

        Cliente cliente = new Cliente(nomeCliente, emailCliente, aniversaioCliente);

        System.out.println("Dados do pedido");
        System.out.print("Status: ");
        StatusPedido statusPedido = StatusPedido.valueOf(sc.next().toUpperCase());

        System.out.print("Quantos itens foram pedidos: ");
        int n = sc.nextInt();

        Pedido pedido = new Pedido(new Date(), statusPedido, cliente);

        for(int i = 0; i < n; i++){
            System.out.println("Digite os dados do item: " + (i + 1));
            System.out.print("Nome do produto: ");
            sc.nextLine();
            String nomeProduto = sc.nextLine();
            System.out.print("Preço do produto: ");
            double precoProduto = sc.nextDouble();
            System.out.print("Quantidade: ");
            int quantidade = sc.nextInt();
            Produto produto = new Produto(nomeProduto, precoProduto);

            ItemPedido itemPedido = new ItemPedido(quantidade, precoProduto, produto);

            pedido.addPedido(itemPedido);
        }

        System.out.println();
        System.out.println(pedido);

        sc.close();
    }
}
