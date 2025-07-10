package POO.Herança.Entities;

public class Conta {
    private Integer numero;
    private String titular;
    protected Double valorConta;

    public Conta(){
    }

    public Conta(Integer numero, String titular, Double valorConta) {
        this.numero = numero;
        this.titular = titular;
        this.valorConta = valorConta;
    }

    public Integer getNumero() {
        return numero;
    }

    public void setNumero(Integer numero) {
        this.numero = numero;
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public Double getValorConta() {
        return valorConta;
    }

    public void saque(Double saque){
        valorConta -= saque + 5;
    }

    public void deposito(Double deposito){
        valorConta += deposito;
    }
}
