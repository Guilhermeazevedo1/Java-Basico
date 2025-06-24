package IntroducaoPOO.Exercicios.Exercicio03;

public class Funcionario {
    public String nome;
    public double salarioBruto;
    public double taxa;

    public double salarioLiquido(){
        return salarioBruto - taxa;
    }

    public void aumento(double porcentagem){
        salarioBruto += salarioBruto * porcentagem / 100;
    }

    public String toString(){
        return nome + ", $" + String.format("%.2f", salarioLiquido());
    }
}
