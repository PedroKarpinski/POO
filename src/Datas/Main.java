package Datas;

public class Main {
    public static void main(String[] args) {
        Data a = new Data(30, 11, 2020);
        Data b = new Data(1, 12, 2020);

        System.out.println("Data A: " + a.converteParaTexto());
        System.out.println("Data B: " + b.converteParaTexto());
        System.out.printf("%d é bissexto: %b\n", a.ano, a.anoBissexto(a.ano));
        System.out.println("A é anterior a B: " + a.anterior(b));
        System.out.println("B é anterior a A: " + b.anterior(a));
        System.out.println("B é posterior a A: " + b.posterior(a));
    }
}
