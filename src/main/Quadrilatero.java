package main;

public abstract class Quadrilatero extends Poligono {
    protected final Ponto p1;
    protected final Ponto p2;
    protected final Ponto p3;
    protected final Ponto p4;

    public Quadrilatero(Ponto p1, Ponto p2, Ponto p3, Ponto p4) {
        super(new Ponto[]{new Ponto(p1), new Ponto(p2), new Ponto(p3), new Ponto(p4)});
        this.p1 = this.pontos[0];
        this.p2 = this.pontos[1];
        this.p3 = this.pontos[2];
        this.p4 = this.pontos[3];
    }
}
