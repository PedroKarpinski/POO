package Semana04.Biblioteca;

import java.util.ArrayList;

public class Biblioteca {
    ArrayList<Livro> acervo;

    Biblioteca() {
        acervo = new ArrayList<Livro>();
    }

    ArrayList<Livro> listaEmprestados() {
        ArrayList<Livro> emprestados = new ArrayList<Livro>();

        for (Livro livro : acervo) {
            if (livro.emprestado()) {
                emprestados.add(livro);
            }
        }

        return emprestados;
    }

    ArrayList<Livro> listaDisponiveis() {
        ArrayList<Livro> disponiveis = new ArrayList<Livro>();

        for (Livro livro : acervo) {
            if (!livro.emprestado()) {
                disponiveis.add(livro);
            }
        }

        return disponiveis;
    }

    void adicionaLivro(Livro livro) {
        acervo.add(livro);
    }

    void removeLivroPeloIsbn(String isbn) {
        for (Livro livro : acervo) {
            if (isbn.equals(livro.isbn)) {
                acervo.remove(livro);
            }
        }
    }
}
