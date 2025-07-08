package Enum.Exercicio2.Entities;

public class Comment {
    private String textoComentario;

    public Comment(){
    }

    public Comment(String textoComentario) {
        this.textoComentario = textoComentario;
    }

    public String getTextoComentario() {
        return textoComentario;
    }

    public void setTextoComentario(String textoComentario) {
        this.textoComentario = textoComentario;
    }
}
