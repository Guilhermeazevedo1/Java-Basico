package POO.Polimorfismo.ExercicioFixacao.Entities;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class ProdutoUsado extends Produto{
    private LocalDate dataVencimento;

    public ProdutoUsado(){
        super();
    }

    public ProdutoUsado(String nome, Double preco, LocalDate dataVencimento) {
        super(nome, preco);
        this.dataVencimento = dataVencimento;
    }

    public LocalDate getDataVencimento() {
        return dataVencimento;
    }

    public void setDataVencimento(LocalDate dataVencimento) {
        this.dataVencimento = dataVencimento;
    }

    @Override
    public String etiquetaPreco(){
        return getNome() +
                " (usado) " +
                " $ " +
                String.format("%.2f", getPreco()) +
                " (Data de vencimento: "+
                dataVencimento.format(DateTimeFormatter.ofPattern("dd/MM/yyyy")) +
                ")";
    }
}
