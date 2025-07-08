package Enum.ExercicioFixacao.Entities;

import Enum.ExercicioFixacao.Enum.StatusPedido;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Pedido {
    SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");

    private Date momentoPedido;
    private StatusPedido status;

    private Cliente cliente;
    private List<ItemPedido> itemPedidos = new ArrayList<>();

    public Pedido(){
    }

    public Pedido(Date momentoPedido, StatusPedido status, Cliente cliente) {
        this.momentoPedido = momentoPedido;
        this.status = status;
        this.cliente = cliente;
    }

    public Date getMomentoPedido() {
        return momentoPedido;
    }

    public void setMomentoPedido(Date momentoPedido) {
        this.momentoPedido = momentoPedido;
    }

    public StatusPedido getStatus() {
        return status;
    }

    public void setStatus(StatusPedido status) {
        this.status = status;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public List<ItemPedido> getItemPedido() {
        return itemPedidos;
    }

    public void addPedido(ItemPedido itemPedido){
        itemPedidos.add(itemPedido);
    }

    public void removerPedido(ItemPedido itemPedido){
        itemPedidos.remove(itemPedido);
    }

    public double total(){
        double soma = 0.0;
        for(ItemPedido itens : itemPedidos){
            soma += itens.subtotal();
        }
        return soma;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Momento do pedido");
        sb.append(sdf.format(momentoPedido) + "\n");
        sb.append("Status do pedido: ");
        sb.append(status + "\n");
        sb.append("Cliente: ");
        sb.append(cliente + "\n");
        sb.append("Itens pedidos: \n");
        for(ItemPedido it : itemPedidos){
            sb.append(it + "\n");
        }
        sb.append("Preço total: $");
        sb.append(String.format("%.2f", total()));
        return sb.toString();
    }
}
