package main;

public class Paralelogramo extends Trapezio {
    public Paralelogramo(Ponto p1, Ponto p2, Ponto p3, Ponto p4) {
        super(p1, p2, p3, p4);

        if (!existe(p1, p2, p3, p4)) {
            throw new IllegalArgumentException("Nao ha 2 pares de lados paralelos");
        }
    }

    static boolean existe(Ponto p1, Ponto p2, Ponto p3, Ponto p4) {
        return new SegmentoReta(p1, p2).paralelo(new SegmentoReta(p3, p4)) 
            && new SegmentoReta(p1, p4).paralelo(new SegmentoReta(p2, p3));
    }

    @Override
    public double area() {
        return baseMaior().comprimento() * altura();
    }

    @Override
    public double largura() {
        return Math.max(p3.getCoordX() - p1.getCoordX(), p2.getCoordX() - p4.getCoordX());
    }
}
