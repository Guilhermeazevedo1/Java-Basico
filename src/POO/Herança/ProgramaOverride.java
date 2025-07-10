package POO.Herança;

import POO.Herança.Entities.Conta;
import POO.Herança.Entities.ContaEmpresa;
import POO.Herança.Entities.ContaPoupanca;

public class ProgramaOverride {
    public static void main(String[] args) {

        //Programa criado para ver a função Override, ela foi implementada na conta poupança no metodo da conta saque

        Conta conta = new Conta(50, "João", 100.0);
        ContaPoupanca contaPoupanca = new ContaPoupanca(53, "José", 100.00, 0.00);
        ContaEmpresa contaEmpresa = new ContaEmpresa(54, "Mario", 100.00, 1000.00);

        //Override
        // Operação feita na conta normal onde o saque desconta 5 reais
        conta.saque(10.00);
        System.out.println(conta.getValorConta());

        // Operação feita na conta poupança onde o saque não desconta nada
        contaPoupanca.saque(10.00);
        System.out.println(contaPoupanca.getValorConta());

        // Operação feita na conta empresa onde o saque desconta os 5 do saque normal da conta mais 2 reais
        // Operação feita com o super para reaproveitar o codigo do metodo
        contaEmpresa.saque(10.00);
        System.out.println(contaEmpresa.getValorConta());
    }
}
