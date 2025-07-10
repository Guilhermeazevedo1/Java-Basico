package POO.Polimorfismo;

import POO.Herança.Entities.Conta;
import POO.Herança.Entities.ContaEmpresa;
import POO.Herança.Entities.ContaPoupanca;

public class ProgramaPolimorfismo {
    public static void main(String[] args) {
        Conta x = new Conta(50, "João", 100.0);
        Conta y = new ContaPoupanca(53, "José", 100.00, 0.00);

        x.saque(50.00);
        y.saque(50.00);
        System.out.println(x.getValorConta());
        System.out.println(y.getValorConta());

    }
}
