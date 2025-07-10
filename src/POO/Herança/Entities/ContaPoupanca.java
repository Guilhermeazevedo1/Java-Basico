package POO.Herança.Entities;

// a palavra final antes da classe não permite outras classes use essa classe como herança, essa classe não pode ser extendida
public final class ContaPoupanca extends Conta{
    private Double taxaJuros;

    public ContaPoupanca(){
        super();
    }

    public ContaPoupanca(Integer numero, String titular, Double valorConta, Double taxaJuros) {
        super(numero, titular, valorConta);
        this.taxaJuros = taxaJuros;
    }

    public Double getTaxaJuros() {
        return taxaJuros;
    }

    public void setTaxaJuros(Double taxaJuros) {
        this.taxaJuros = taxaJuros;
    }

    public void atualizacaoSaldo(){
        valorConta += valorConta * taxaJuros;
    }

    @Override
    public void saque(Double saque){
        valorConta -= saque;
    }
}
