package POO.Abstração.ClasseAbstrata;

public class ContaPoupanca extends Conta{
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
