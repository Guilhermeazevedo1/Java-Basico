package POO.Polimorfismo.Exercicio;

import POO.Polimorfismo.Exercicio.Entities.Funcionario;
import POO.Polimorfismo.Exercicio.Entities.FuncionarioTercerizado;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Programa {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        List<Funcionario> funcionarios = new ArrayList<>();

        System.out.print("Quantos funcionários vão ser informados: ");
        int n = sc.nextInt();

        for(int i = 0; i < n; i++){
            System.out.println("Digite os dados do funcionário " + (i + 1));
            System.out.print("É tercerizado (y/n)? ");
            String tercerizado = sc.next();
            System.out.print("Nome: ");
            sc.nextLine();
            String nome = sc.nextLine();
            System.out.print("Horas trabalhadas: ");
            int horas = sc.nextInt();
            System.out.print("Valor hora: ");
            double valorHora = sc.nextDouble();
            if(tercerizado.equals("n")){
                funcionarios.add(new Funcionario(nome, horas, valorHora));
            }else {
                System.out.print("Despesa adicional: ");
                double despesaAdicional = sc.nextDouble();
                funcionarios.add(new FuncionarioTercerizado(nome, horas, valorHora, despesaAdicional));
            }

        }

        System.out.println("Lista de pagamentos:");
        for(Funcionario func : funcionarios){
            System.out.println(func);
        }

        sc.close();
    }
}
