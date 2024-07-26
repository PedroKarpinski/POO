package Semana04.Retangulos;

public class Retangulo {
    double centroX;
    double centroY;
    double altura;
    double largura;

    Retangulo(double centroX, double centroY, double largura, double altura) {
        this.altura = altura;
        this.largura = largura;
        this.centroX = centroX;
        this.centroY = centroY;
    }

    double area() {
        return this.largura*this.altura;
    }

    double perimetro() {
        return 2*this.largura + 2*this.altura;
    }

    boolean contemPonto(int x, int y) {
        if (!(x >= this.centroX-this.largura/2 && x <= this.centroX+this.largura/2)) {
            return false;
        }

        else if (!(y >= this.centroY-this.altura/2 && y <= this.centroY+this.altura/2)) {
            return false;
        }

        return true;
    }

    boolean contemRetangulo(Retangulo a) {
        if (!(a.centroX-a.largura/2 >= this.centroX-this.largura/2)) {
            return false;
        }
        else if (!(a.centroX+a.largura/2 <= this.centroX+this.largura/2)) {
            return false;
        }

        if (!(a.centroY-a.altura/2 >= this.centroY-this.altura/2)) {
            return false;
        } 
        else if (!(a.centroY+a.altura/2 <= this.centroY+this.altura/2)) {
            return false;
        }

        return true;
    }

    boolean intersecionaRetangulo(Retangulo a) {
        if ((a.centroX+a.largura/2 < this.centroX-this.largura/2)) {
            return false;
        }
        else if ((a.centroX-a.largura/2 > this.centroX+this.largura/2)) {
            return false;
        }

        if ((a.centroY+a.altura/2 < this.centroY-this.altura/2)) {
            return false;
        } 
        else if ((a.centroY-a.altura/2 > this.centroY+this.altura/2)) {
            return false;
        }

        return true;
    }
}
