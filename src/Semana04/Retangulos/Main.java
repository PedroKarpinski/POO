package Semana04.Retangulos;

public class Main {
    public static void main(String[] args) {
        Retangulo a = new Retangulo(2.5, 2.5, 5, 5);
        Retangulo b = new Retangulo(5, 5, 10, 10);

        System.out.println("Perímetro de A: " + a.perimetro());
        System.out.println("Área de A: " + a.area());

        System.out.println("Perímetro de B: " + b.perimetro());
        System.out.println("Área de B: " + b.area());

        System.out.println("A contém ponto (6, 2): " + a.contemPonto(6, 2));
        System.out.println("B contém ponto (6, 2): " + b.contemPonto(6, 2));

        System.out.println("A contém B: " + a.contemRetangulo(b));
        System.out.println("B contém A: " + b.contemRetangulo(a));
        System.out.println("A interseciona B: " + a.intersecionaRetangulo(b));
    }
}
