package Enum;

import java.util.Date;

public class ProgramaPedido {
    public static void main(String[] args) {
        Pedido pedido = new Pedido(1080, new Date(), StatusPedido.AGUARDANDO_PAGAMENTO);
        System.out.println(pedido);


    }
}
