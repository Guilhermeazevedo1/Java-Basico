package POO.Abstração.MetodoAbstrato;

public abstract class Forma {
    private Cor cor;

    public Forma(){
    }

    public Forma(Cor cor) {
        this.cor = cor;
    }

    public Cor getCor() {
        return cor;
    }

    public void setCor(Cor cor) {
        this.cor = cor;
    }

    // Esse é um metodo abstrato, se a classe tiver um metodo abstrato ela tem que ser abstrata
    // metodo abstrato funciona como algo generico para outras classes usarem
    // todas as classes que extenderem um classe com metodo abstract são obrigadas a implementarem ele
     public abstract double area();
}
