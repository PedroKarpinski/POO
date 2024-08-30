package main;

public class Retangulo extends Paralelogramo {
    public Retangulo(Ponto p1, Ponto p2, Ponto p3, Ponto p4) {
        super(p1, p2, p3, p4);

        if (!existe(p1, p2, p3, p4)) {
            throw new IllegalArgumentException("Nao eh retangulo");
        }
    }

    public boolean quadrado() {
        return baseMaior().comprimento() == baseMenor().comprimento()
            && baseMaior().comprimento() == new SegmentoReta(p1, p4).comprimento();
    }

    static boolean existe(Ponto p1, Ponto p2, Ponto p3, Ponto p4) {
        return new SegmentoReta(p1, p2).coeficienteAngular() == 0
            && new SegmentoReta(p1, p4).coeficienteAngular() == Double.POSITIVE_INFINITY;
    }
}
