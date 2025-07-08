package Enum.Exercicio;

import Enum.Exercicio.Entities.ContratoHora;
import Enum.Exercicio.Entities.Departamento;
import Enum.Exercicio.Entities.Enum.NivelProfissional;
import Enum.Exercicio.Entities.Trabalhador;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

public class Programa {
    public static void main(String[] args) throws ParseException {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

        System.out.print("Fale o nome do departamento: ");
        String departamento = sc.nextLine();

        System.out.println("Escreva os dados do trabalhador");
        System.out.print("Digite o nome do trabalhador: ");
        String nome = sc.nextLine();

        System.out.print("Digite o nome do trabalhador: ");
        String nivel = sc.nextLine();

        System.out.print("Digite o nome do trabalhador: ");
        double salarioBase = sc.nextDouble();

        Trabalhador trabalhador = new Trabalhador(nome, NivelProfissional.valueOf(nivel.toUpperCase()), salarioBase, new Departamento(departamento));

        System.out.print("Escreva a quantidade de contratos");
        int n = sc.nextInt();

        for(int i = 0; i < n; i++){
            System.out.println("Entre com os dados do contrato: " + (i + 1));
            System.out.print("Data (DD/MM/AAAA): ");
            Date date = sdf.parse(sc.next());
            System.out.print("Valor hora: ");
            Double valorHora = sc.nextDouble();
            System.out.print("Duração em horas: ");
            int hora = sc.nextInt();
            ContratoHora contratoHora = new ContratoHora(date, valorHora, hora);
            trabalhador.addContrato(contratoHora);
        }

        System.out.println();
        System.out.print("Digite o mês para saber o valor ganho neste mês: ");
        String mesAno = sc.next();
        int mes = Integer.parseInt(mesAno.substring(0, 2));
        int ano = Integer.parseInt(mesAno.substring(3));
        System.out.println("Nome: " + trabalhador.getNome());
        System.out.println("Departamento: " + trabalhador.getDepartamento().getNome());
        System.out.println("Quanto o trabalhador ganhou no mês e ano informados: " + mesAno + ": " + String.format("%.2f", trabalhador.quantoGanhou(mes, ano)));

        sc.close();
    }
}
