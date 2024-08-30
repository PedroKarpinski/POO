package main;

public class Trapezio extends Quadrilatero {
    public Trapezio(Ponto p1, Ponto p2, Ponto p3, Ponto p4) {
        super(p1, p2, p3, p4);

        if (!existe(p1, p2, p3, p4)) {
            throw new IllegalArgumentException("Bases nao paralelas");
        }
    }

    public SegmentoReta baseMenor() {
        if (new SegmentoReta(p1, p2).comprimento() <= new SegmentoReta(p3, p4).comprimento()) {
            return new SegmentoReta(p1, p2);
        }

        return new SegmentoReta(p3, p4);
    }

    public SegmentoReta baseMaior() {
        if (new SegmentoReta(p1, p2).comprimento() <= new SegmentoReta(p3, p4).comprimento()) {
            return new SegmentoReta(p3, p4);
        }

        return new SegmentoReta(p1, p2);
    }

    static boolean existe(Ponto p1, Ponto p2, Ponto p3, Ponto p4) {
        return new SegmentoReta(p1, p2).paralelo(new SegmentoReta(p3, p4));
    }

    @Override
    public double altura() {
        return p2.getCoordY() - p3.getCoordY();
    }

    @Override
    public double area() {
        return (baseMaior().comprimento() + baseMenor().comprimento()) * altura() / 2;
    }

    @Override
    public double largura() {
        return baseMaior().comprimento();
    }

    @Override
    public double perimetro() {
        return baseMaior().comprimento() + baseMenor().comprimento() 
               + new SegmentoReta(p1, p4).comprimento() 
               + new SegmentoReta(p2, p3).comprimento();
    }
}
