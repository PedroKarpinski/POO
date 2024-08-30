package main;

public class SemiCirculo extends FormaGeometrica {
    private final Ponto centro;
    private final double raio;

    public SemiCirculo(Ponto centro, double raio) {
        this.centro = new Ponto(centro);
        this.raio = raio;
    }

    @Override
    public double altura() {
        return raio;
    }

    @Override
    public double area() {
        return Math.PI * raio * raio / 2;
    }

    @Override
    public double largura() {
        return raio * 2;
    }

    @Override
    public double perimetro() {
        return Math.PI * raio + 2 * raio;
    }
}