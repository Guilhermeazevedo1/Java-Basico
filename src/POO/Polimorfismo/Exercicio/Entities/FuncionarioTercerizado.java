package POO.Polimorfismo.Exercicio.Entities;

public class FuncionarioTercerizado extends Funcionario{

    private Double despesaAdicional;

    public FuncionarioTercerizado() {
    }

    public FuncionarioTercerizado(String nome, Integer horas, Double valorHora, Double despesaAdicional) {
        super(nome, horas, valorHora);
        this.despesaAdicional = despesaAdicional;
    }

    public Double getDespesaAdicional() {
        return despesaAdicional;
    }

    public void setDespesaAdicional(Double despesaAdicional) {
        this.despesaAdicional = despesaAdicional;
    }

    @Override
    public Double pagamento(){
        return super.pagamento() + despesaAdicional * 1.1;
    }
}
