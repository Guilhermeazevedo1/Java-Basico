package POO.Herança;

import POO.Herança.Entities.Conta;
import POO.Herança.Entities.ContaEmpresa;
import POO.Herança.Entities.ContaPoupanca;

public class Programa {
    public static void main(String[] args) {

        Conta conta = new Conta(50, "João", 110.0);
        ContaEmpresa contaEmpresa = new ContaEmpresa(51, "Maria", 0.0, 500.00);

        //UpCasting
        Conta conta1 = contaEmpresa;
        Conta conta2 = new ContaEmpresa(52, "Fabio", 0.0, 500.00);
        Conta conta3 = new ContaPoupanca(53, "José", 100.0, 0.01);

        //DownCasting
        ContaEmpresa contaEmpresa1 = (ContaEmpresa)conta2;
        contaEmpresa1.emprestimo(100.00);

        // tomar cuidado com o DownCasting, pois só da erro no terminal, então usar o instanceOf para saber
        // se aquele objeto está correto, nesse caso a conta3 não é ContaEmpresa, então vai dar erro fazendo dessa forma
        // ela é ContaPoupança
        //ContaEmpresa contaEmpresa2 = (ContaEmpresa)conta3;
        // faça dessa forma com isso, para evitar problemas
        if(conta3 instanceof ContaEmpresa){
            ContaEmpresa contaEmpresa2 = (ContaEmpresa)conta3;
            contaEmpresa2.emprestimo(100.00);
            System.out.println("Emprestimo");
        }

        if(conta3 instanceof ContaPoupanca){
            ContaPoupanca contaEmpresa2 = (ContaPoupanca) conta3;
            contaEmpresa2.atualizacaoSaldo();
            System.out.println("Atualização do saldo");
        }

        //Override
        // Operação feita na conta normal onde o saque desconta 5 reais
        conta.saque(10.00);
        System.out.println(conta.getValorConta());

        // Operação feita na conta poupança onde o saque não desconta nada
        conta3.saque(10.00);
        System.out.println(conta3.getValorConta());
    }
}
