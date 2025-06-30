package Listas.Exercicio;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;
import java.util.stream.Collectors;

//Fazer um programa para ler um número inteiro N e depois os
//dados (id, nome e salario) de N funcionários. Não deve haver
//repetição de id.

//Em seguida, efetuar o aumento de X por cento no salário de
//um determinado funcionário. Para isso, o programa deve ler
//um id e o valor X. Se o id informado não existir, mostrar
//uma mensagem e abortar a operação. Ao final, mostrar a
//listagem atualizada dos funcionários, conforme exemplos.

//Lembre-se de aplicar a técnica de encapsulamento para não
//permitir que o salário possa ser mudado livremente. Um
//salário só pode ser aumentado com base em uma operação
//de aumento por porcentagem dada.
public class AplicacaoFuncionario {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        List<Funcionario> list = new ArrayList<>();
        System.out.print("Digite quantos funcionários vão ser informados: ");
        int n = sc.nextInt();

        for(int i = 0; i < n; i++){
            System.out.println();
            System.out.println("Dados Funcionário: " + (i + 1));
            System.out.print("Digite seu id: ");
            int id = sc.nextInt();
            sc.nextLine();
            System.out.print("Digite o seu nome: ");
            String nome = sc.nextLine();
            System.out.print("Digite seu salário: ");
            double salario = sc.nextDouble();
            Funcionario funcionario = new Funcionario(id, nome, salario);
            list.add(funcionario);
        }

        System.out.println("Escreva o id do funcionário que vai receber o aumento salarial");
        int funcionarioId = sc.nextInt();
        Funcionario funcionario = list.stream().filter(x -> x.getId() == funcionarioId).findFirst().orElse(null);
        if(funcionario == null){
            System.out.println("O funcionário não existe");
        }else{
            System.out.print("Digite de quanto vai ser o aumento em porcentagem: ");
            double porcentagem = sc.nextDouble();
            funcionario.aumentoSalario(porcentagem);
        }

        System.out.println("Lista dos funcionários: ");
        for(Funcionario e : list){
            System.out.println(e);
        }

        sc.close();
    }
}
