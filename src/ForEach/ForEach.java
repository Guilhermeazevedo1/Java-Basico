package ForEach;

public class ForEach {
    public static void main(String[] args) {
        String[] vect = new String[] {"Maria", "João", "Vitor"};

        //com o for
        for(int i = 0; i < vect.length; i++){
            System.out.println(vect[i]);
        }

        System.out.println("--------------------------");
        //com for each no java
        for(String nome : vect){
            System.out.println(nome);
        }
    }
}
