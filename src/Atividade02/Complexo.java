package Atividade02;

public class Complexo {
    double real;
    double imaginario;

    Complexo(double real, double imaginario) {
        this.real = real;
        this.imaginario = imaginario;
    }

    Complexo adiciona(Complexo c2) {
        Complexo c3 = new Complexo(this.real + c2.real, this.imaginario + c2.imaginario);

        return c3;
    }

    Complexo subtrai(Complexo c2) {
        Complexo c3 = new Complexo(this.real - c2.real, this.imaginario - c2.imaginario);

        return c3;
    }

    Complexo multiplica(Complexo c2) {
        Complexo c3 = new Complexo(this.real*c2.real - this.imaginario*c2.imaginario,
        this.real*c2.imaginario + this.imaginario*c2.real);

        return c3;
    }

    Complexo divide(Complexo c2) {
        Complexo c3 = new Complexo((this.real*c2.real + this.imaginario*c2.imaginario)/(c2.real*c2.real + c2.imaginario*c2.imaginario),
        (this.imaginario*c2.real - this.real*c2.imaginario)/(c2.real*c2.real + c2.imaginario*c2.imaginario));

        return c3;
    }

    String converteParaString() {
        return String.format("%.2f + %.2fi", this.real, this.imaginario);
    }
}
