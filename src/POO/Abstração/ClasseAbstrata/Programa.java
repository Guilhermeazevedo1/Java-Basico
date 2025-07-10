package POO.Abstração.ClasseAbstrata;

import java.util.ArrayList;
import java.util.List;

public class Programa {
    public static void main(String[] args) {

        // Classse Abstrata não pode ser instanciada
        // Conta conta1 = new Conta(50, "Maria", 50.00);

        // SubClasses da classe abstrata conseguem ser instanciadas
        // Conta conta2 = new ContaEmpresa(51, "Mário", 50.00, 500.00);
        // Conta conta3 = new ContaPoupanca(50, "Maria", 50.00, 0.05);


        List<Conta> contas = new ArrayList<>();
        contas.add(new ContaPoupanca(50, "Maria", 50.00, 0.00));
        contas.add(new ContaEmpresa(51, "Mário", 50.00, 500.00));
        contas.add(new ContaPoupanca(52, "Bruno", 50.00, 0.00));
        contas.add(new ContaEmpresa(53, "Fernanda", 50.00, 600.00));

        double soma = 0.0;
        for (Conta conta : contas){
            soma += conta.getValorConta();
        }

        System.out.printf("Valor de todas as conta %.2f", soma);

        for (Conta conta : contas){
            conta.deposito(10.00);
        }

        for (Conta conta : contas){
            System.out.println("Atualização do valor de todas as conta " + conta.getValorConta());
        }

    }
}
