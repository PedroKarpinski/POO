package main;

public class Losango extends Retangulo {
    public Losango(Ponto p1, Ponto p2, Ponto p3, Ponto p4) {
        super(p1, p2, p3, p4);
    }
    
    @Override
    public double altura() {
        return p1.getCoordY() - p3.getCoordY();
    }

    @Override
    public double largura() {
        return p2.getCoordX() - p4.getCoordX();
    }
}
