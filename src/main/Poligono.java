package main;

public abstract class Poligono extends FormaGeometrica {
    protected final Ponto[] pontos;

    public Poligono(Ponto[] pontos) {
        this.pontos = new Ponto[pontos.length];
        for (int i = 0; i < pontos.length; i++) {
            this.pontos[i] = new Ponto(pontos[i]);
        }
    }

    public Ponto[] getPontos() {
        Ponto[] ret = new Ponto[this.pontos.length];
        for (int i = 0; i < this.pontos.length; i++) {
            ret[i] = new Ponto(this.pontos[i]);
        }

        return ret;
    }
}