package Arrays.Exercicios.ExercicioFixacao;

public class Estudantes {
    private String nome;
    private String email;


    public Estudantes(String nome, String email) {
        this.nome = nome;
        this.email = email;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String toString(){
        return  nome + ", " + email;
    }


}
