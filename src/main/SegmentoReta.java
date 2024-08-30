package main;

public class SegmentoReta extends ObjetoGeometrico {
    private final Ponto p1;
    private final Ponto p2;

    public SegmentoReta(Ponto p1, Ponto p2) {
        this.p1 = new Ponto(p1);
        this.p2 = new Ponto(p2);
    }

    public double comprimento() {
        double distX = Math.abs(p1.getCoordX() - p2.getCoordX());
        double distY = Math.abs(p1.getCoordY() - p2.getCoordY());

        return Math.sqrt(distX*distX + distY*distY);
    }

    public double coeficienteAngular() {
        if (p2.getCoordX()-p1.getCoordX() == 0) {
            return Double.POSITIVE_INFINITY;
        }

        return (p2.getCoordY()-p1.getCoordY())/(p2.getCoordX()-p1.getCoordX());
    }

    public boolean paralelo(SegmentoReta s) {
        return this.coeficienteAngular() == s.coeficienteAngular();
    }

    public double getMaxCoordX() {
        return Math.max(p1.getCoordX(), p2.getCoordX());
    }

    public double getMinCoordX() {
        return Math.min(p1.getCoordX(), p2.getCoordX());
    }

    public double getMaxCoordY() {
        return Math.max(p1.getCoordY(), p2.getCoordY());
    }
    
    public double getMinCoordY() {
        return Math.min(p1.getCoordY(), p2.getCoordY());
    }
}
