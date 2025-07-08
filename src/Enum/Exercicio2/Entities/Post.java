package Enum.Exercicio2.Entities;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Post {

    private static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");

    private Date momentoPost;
    private String titulo;
    private String conteudo;
    private Integer likes;

    private List<Comment> comments = new ArrayList<>();

    public Post(){
    }

    public Post(Date momentoPost, String titulo, String conteudo, Integer likes) {
        this.momentoPost = momentoPost;
        this.titulo = titulo;
        this.conteudo = conteudo;
        this.likes = likes;
    }

    public Date getMomentoPost() {
        return momentoPost;
    }

    public void setMomentoPost(Date momentoPost) {
        this.momentoPost = momentoPost;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getConteudo() {
        return conteudo;
    }

    public void setConteudo(String conteudo) {
        this.conteudo = conteudo;
    }

    public Integer getLikes() {
        return likes;
    }

    public void setLikes(Integer likes) {
        this.likes = likes;
    }

    public List<Comment> getComments() {
        return comments;
    }

    public void addComments(Comment comment){
        comments.add(comment);
    }

    public void removerComments(Comment comment){
        comments.remove(comment);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(titulo + "\n");
        sb.append(likes);
        sb.append(" Likes - ");
        sb.append(sdf.format(momentoPost) + "\n");
        sb.append(conteudo + "\n");
        sb.append("Comentários:\n");
        for(Comment c : comments){
            sb.append(c.getTextoComentario() + "\n");
        }
        return sb.toString();
    }
}
