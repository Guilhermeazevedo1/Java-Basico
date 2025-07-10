package POO.Abstração.ClasseAbstrata;

public class ContaEmpresa extends Conta{
    private Double emprestimoLimite;

    public ContaEmpresa(){
        super();
    }

    public ContaEmpresa(Integer numero, String titular, Double valorConta, Double emprestimoLimite) {
        super(numero, titular, valorConta);
        this.emprestimoLimite = emprestimoLimite;
    }

    public Double getEmprestimoLimite() {
        return emprestimoLimite;
    }

    public void setEmprestimoLimite(Double emprestimoLimite) {
        this.emprestimoLimite = emprestimoLimite;
    }

    public void emprestimo(Double emprestimo){
        if(emprestimo <= emprestimoLimite) {
            valorConta += emprestimo - 10.00;
        }
    }

    @Override
    public void saque(Double saque){
        super.saque(saque);
        valorConta -= 02.00;
    }
}
