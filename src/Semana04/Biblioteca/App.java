package Semana04.Biblioteca;

public class App {
    public static void main(String[] args) {
        Biblioteca biblioteca = new Biblioteca();

        Livro livro1 = new Livro("O Senhor dos Anéis", "J. R. R. Tolkien", 1954, "123");
        
        Livro livro2 = new Livro("Dom Quixote", "Miguel de Cervantes", 1605, "456");
        
        Livro livro3 = new Livro("Guerra e Paz", "Lev Tolstói", 186, "325");
        
        Livro livro4 = new Livro("O Hobbit", "J. R. R. Tolkien", 1937, "173");
        
        Livro livro5 = new Livro("100 anos de solidão", "Gabriel Garcia Marques", 1967, "961");

        biblioteca.adicionaLivro(livro1);
        biblioteca.adicionaLivro(livro2);
        biblioteca.adicionaLivro(livro3);
        biblioteca.adicionaLivro(livro4);
        biblioteca.adicionaLivro(livro5);

        livro1.emprestar();
        livro3.emprestar();
        livro1.devolver();

        System.out.println("Livros emprestados");
        for (var livro : biblioteca.listaDisponiveis()) {
            System.out.println(livro.titulo);
        }
    }
}
