package Semana04.Biblioteca;

public class Livro {
    String titulo;
    String autor;
    int anoPublicacao;
    String isbn;
    boolean emprestado;

    Livro(String titulo, String autor, int anoPublicacao, String isbn) {
        this.titulo = titulo;
        this.autor = autor;
        this.anoPublicacao = anoPublicacao;
        this.isbn = isbn;
        this.emprestado = false;
    }

    void emprestar() {
        this.emprestado = true;
    }

    void devolver() {
        this.emprestado = false;
    }

    boolean emprestado() {
        return this.emprestado;
    }
}