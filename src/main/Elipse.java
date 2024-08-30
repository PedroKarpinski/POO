package main;

public class Elipse extends FormaGeometrica {
    protected final Ponto centro;
    protected final double semiEixoA;
    protected final double semiEixoB;

    public Elipse(Ponto centro, double semiEixoA, double semiEixoB) {
        this.centro = new Ponto(centro);
        this.semiEixoA = semiEixoA;
        this.semiEixoB = semiEixoB;
    }

    public double getSemiEixoMenor() {
        return Math.min(this.semiEixoA, this.semiEixoB);
    }

    public double getSemiEixoMaior() {
        return Math.max(this.semiEixoA, this.semiEixoB);
    }

    public double circunferencia() {
        return 2 * Math.PI * Math.sqrt((semiEixoA*semiEixoA + semiEixoB*semiEixoB) / 2);
    }

    @Override
    public double altura() {
        return semiEixoB * 2;
    }

    @Override
    public double area() {
        return Math.PI * semiEixoA * semiEixoB;
    }

    @Override
    public double largura() {
        return semiEixoA * 2;
    }

    @Override
    public double perimetro() {
        return circunferencia();
    }
}
