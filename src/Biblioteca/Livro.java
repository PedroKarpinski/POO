package Biblioteca;

class Livro {
    String titulo;
    String autor;
    int anoPublicacao;
    boolean emprestado;

    Livro (String titulo, String autor, int anoPublicacao) {
        this.titulo = titulo;
        this.autor = autor;
        this.anoPublicacao = anoPublicacao;
        this.emprestado = false;
    }

    void emprestar() {
        this.emprestado = true;
    }

    void devolver() {
        this.emprestado = false;
    }

    boolean isEmprestado() {
        return this.emprestado;
    }
}