package IntroducaoPOO.Exercicios.Exercicio04;

public class Estudante {
    String nome;
    double notaPrimeiro;
    double notaSegundo;
    double notaTerceiro;

    public double notaFinal(){
        double notaFinal;
        notaFinal = (notaPrimeiro + notaSegundo +notaTerceiro);

        double notaFalta = 60 - notaFinal;

        if(notaFinal < 60.00){
            System.out.println("Aluno " + nome +" nota final: " + notaFinal);
            System.out.println("Reprovado");
            System.out.println("A quantidade de nota que faltou para aprovação foi " + notaFalta);
        }else{
            System.out.println("Aluno " + nome + " Aprovado com a nota: " + notaFinal);
            System.out.println("Passou");
        }

        return notaFinal;
    }
}
