package Enum;

import java.util.Date;

public class Pedido {
    private  Integer id;
    private Date moment;
    private StatusPedido statusPedido;

    public Pedido(){
    }

    public Pedido(Integer id, Date moment, StatusPedido statusPedido) {
        this.id = id;
        this.moment = moment;
        this.statusPedido = statusPedido;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Date getMoment() {
        return moment;
    }

    public void setMoment(Date moment) {
        this.moment = moment;
    }

    public StatusPedido getStatusPedido() {
        return statusPedido;
    }

    public void setStatusPedido(StatusPedido statusPedido) {
        this.statusPedido = statusPedido;
    }

    @Override
    public String toString() {
        return "Pedido{" +
                "id=" + id +
                ", moment=" + moment +
                ", statusPedido=" + statusPedido +
                '}';
    }
}
