package Enum.Exercicio2;

import Enum.Exercicio2.Entities.Comment;
import Enum.Exercicio2.Entities.Post;

import java.text.ParseException;
import java.text.SimpleDateFormat;

public class Programa {
    public static void main(String[] args) throws ParseException {

        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");

        Comment c1 = new Comment("Boa viagem");
        Comment c2 = new Comment("Muito bom");

        Post p1 = new Post(sdf.parse("07/07/2025 18:41:50"), "Viajando para João Pessoa", "Viagem", 12);
        p1.addComments(c1);
        p1.addComments(c2);

        System.out.println(p1);
    }
}
