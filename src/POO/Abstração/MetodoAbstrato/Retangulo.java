package POO.Abstração.MetodoAbstrato;

public class Retangulo extends Forma {
    private Double tamanho;
    private Double altura;

    public Retangulo(){
    }

    public Retangulo(Cor cor, Double tamanho, Double altura) {
        super(cor);
        this.tamanho = tamanho;
        this.altura = altura;
    }

    public Double getTamanho() {
        return tamanho;
    }

    public void setTamanho(Double tamanho) {
        this.tamanho = tamanho;
    }

    public Double getAltura() {
        return altura;
    }

    public void setAltura(Double altura) {
        this.altura = altura;
    }

    @Override
    public double area(){
        return tamanho * altura;
    }

}
