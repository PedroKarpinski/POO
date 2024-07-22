package Atividade03;

public class Racional {
    int numerador;
    int denominador;

    Racional(int numerador, int denominador) {
        if (denominador < 0) {
            this.denominador = -denominador;
            this.numerador = -numerador;
        } else {
            this.numerador = numerador;
            this.denominador = denominador;
        }

    }

    boolean ehPrimo(int x) {
        for (int i = 2; i < x; i++) {
            if (x%i == 0) {
                return false;
            }
        }

        return true;
    }

    int mmc(int x, int y) {
        int i = 2;
        int j = 1;

        while ((x != 1) || (y != 1)) {
            if (!ehPrimo(i)) {
                i++;
                continue;
            }

            if (x%i == 0 && y%i == 0) {
                x = x/i;
                y = y/i;
                j = j*i;
                continue;
            } else if (x%i == 0) {
                x = x/i;
                j = j*i;
                continue;
            } else if (y%i == 0) {
                y = y/i;
                j = j*i;
                continue;
            }

            i++;
        }
    
        return j;
    }

    int mdc(int x, int y) {
        if (x < 0) {
            x = -x;
        }

        if (y < 0) {
            y = -y;
        }

        int i = 2;
        int j = 1;

        while ((x != 1) || (y != 1)) {
            if (!ehPrimo(i)) {
                i++;
                continue;
            }

            if (x%i == 0 && y%i == 0) {
                x = x/i;
                y = y/i;
                j = j*i;
                continue;
            } else if (x%i == 0) {
                x = x/i;
                continue;
            } else if (y%i == 0) {
                y = y/i;
                continue;
            }

            i++;
        }
    
        return j;
    }

    Racional adiciona(Racional x) {
        int novoDenominador = mmc(this.denominador, x.denominador);
        int novoNumerador = (novoDenominador/this.denominador)*this.numerador + (novoDenominador/x.denominador)*x.numerador;
    
        Racional r = new Racional(novoNumerador, novoDenominador);

        return r;
    }

    Racional subtrai(Racional x) {
        int novoDenominador = mmc(this.denominador, x.denominador);
        int novoNumerador = (novoDenominador/this.denominador)*this.numerador - (novoDenominador/x.denominador)*x.numerador;
    
        Racional r = new Racional(novoNumerador, novoDenominador);

        return r;
    }

    Racional multiplica(Racional x) {
        int novoDenominador = this.denominador*x.denominador;
        int novoNumerador = this.numerador*x.numerador;

        Racional r = new Racional(novoNumerador, novoDenominador);

        return r;
    }

    Racional divide(Racional x) {
        int novoDenominador = this.denominador*x.numerador;
        int novoNumerador = this.numerador*x.denominador;

        if (novoDenominador < 0) {
            novoDenominador = -novoDenominador;
            novoNumerador = -novoNumerador;
        }

        Racional r = new Racional(novoNumerador, novoDenominador);

        return r;
    }

    boolean igual(Racional x) {
        if (this.numerador == 0 && x.numerador == 0) {
            return true;
        } else if ((this.numerador == 0 && x.numerador != 0) || (this.numerador != 0 && x.numerador == 0)) {
            return false;
        }

        int mdcThis = mdc(this.numerador, this.denominador);
        int mdcX = mdc(x.numerador, x.denominador);

        this.numerador = this.numerador/mdcThis;
        this.denominador = this.denominador/mdcThis;
        x.numerador = x.numerador/mdcX;
        x.denominador = x.denominador/mdcX;

        return (this.numerador == x.numerador && this.denominador == x.denominador);
    }

    String converteParaString() {
        if (this.numerador != 0) {
            int mdc = mdc(this.numerador, this.denominador);

            return String.format("%d/%d", this.numerador/mdc, this.denominador/mdc);
        }

        return String.format("%d/%d", this.numerador, this.denominador);
    }
}