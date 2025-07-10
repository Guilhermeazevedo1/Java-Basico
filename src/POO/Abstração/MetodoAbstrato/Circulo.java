package POO.Abstração.MetodoAbstrato;

public class Circulo extends Forma {
    private Double radius;

    public Circulo(){
    }

    public Circulo(Cor cor, Double radius) {
        super(cor);
        this.radius = radius;
    }

    public Double getRadius() {
        return radius;
    }

    public void setRadius(Double radius) {
        this.radius = radius;
    }

    @Override
    public double area(){
        return Math.PI * radius * radius;
    }
}
