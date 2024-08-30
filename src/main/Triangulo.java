package main;

public class Triangulo extends Poligono {
    private final Ponto p1;
    private final Ponto p2;
    private final Ponto p3;

    public Triangulo(Ponto p1, Ponto p2, Ponto p3) {
        super(new Ponto[]{new Ponto(p1), new Ponto(p2), new Ponto(p3)});
        this.p1 = this.pontos[0];
        this.p2 = this.pontos[1];
        this.p3 = this.pontos[2];
    }

    @Override
    public double altura() {
        return p1.getCoordY() - Math.min(p2.getCoordY(), p3.getCoordY());
    }

    @Override
    public double area() {
        return this.altura() * this.largura() / 2;
    }

    @Override
    public double largura() {
        return new SegmentoReta(p2, p3).comprimento();
    }

    @Override
    public double perimetro() {
        return new SegmentoReta(p1, p2).comprimento() 
             + new SegmentoReta(p1, p3).comprimento() 
             + new SegmentoReta(p2, p3).comprimento();
    }
    
}
