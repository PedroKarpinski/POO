package Atividade03;

public class Main {
    
    public static void main(String[] args) {
        Racional a = new Racional(1, -2);
        Racional b = new Racional(1, 2);
        Racional c = a.adiciona(b);
        Racional d = a.subtrai(b);
        Racional e = a.multiplica(b);
        Racional f = a.divide(b);
    
        System.out.println(c.converteParaString());
        System.out.println(d.converteParaString());
        System.out.println(e.converteParaString());
        System.out.println(f.converteParaString());
        System.out.println(a.igual(b));
    }
}
