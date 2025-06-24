package IntroducaoPOO.Exercicios.Exercicio01;

public class EntitiesProduto {
    public String name;
    public double price;
    public int quantidade;

    public double valorTotalEstoque(){
        return price * quantidade;
    }

    public void addProtudos(int quantidade){
        this.quantidade += quantidade;
    }

    public void removerProtudos(int quantidade){
        this.quantidade -= quantidade;
    }
}
