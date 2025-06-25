package POO.ConstrutoresEncapsulamento;

public class Conta {

    private int numeroConta;
    private String nomeTitular;
    private double saldo;

    public Conta(int numeroConta, String nomeTitular, double depositoInicial) {
        this.numeroConta = numeroConta;
        this.nomeTitular = nomeTitular;
        deposito(depositoInicial);
    }

    public Conta(int numeroConta, String nomeTitular) {
        this.numeroConta = numeroConta;
        this.nomeTitular = nomeTitular;
    }

    public int getNumeroConta() {
        return numeroConta;
    }

    public String getNomeTitular() {
        return nomeTitular;
    }

    public void setNomeTitular(String nomeTitular) {
        this.nomeTitular = nomeTitular;
    }

    public double getSaldo() {
        return saldo;
    }

    public void deposito(double deposito){
        saldo += deposito;
    }

    public void saque(double saque){
        saldo -= saque + 5.00;
    }

    public String toString(){
        return "Conta "
                + numeroConta
                + ", Titular: "
                + nomeTitular
                + ", saldo: "
                + String.format("%.2f", saldo);
    }
}
