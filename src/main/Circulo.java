package main;

public class Circulo extends Elipse {
    public Circulo(Ponto centro, double raio) {
        super(centro, raio, raio);
    }

    @Override
    public double circunferencia() {
        return 2 * Math.PI * semiEixoA;
    }
}
