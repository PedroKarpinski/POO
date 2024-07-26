package Semana04.Biblioteca;

import java.util.ArrayList;

public class Biblioteca {
    ArrayList<Livro> acervo;

    Biblioteca() {
        acervo = new ArrayList<>();
    }

    ArrayList<Livro> listaEmprestados() {
        ArrayList<Livro> emprestados = new ArrayList<>();

        for (Livro livro : acervo) {
            if (livro.emprestado()) {
                emprestados.add(livro);
            }
        }

        return emprestados;
    }

    ArrayList<Livro> listaDisponiveis() {
        ArrayList<Livro> disponiveis = new ArrayList<>();

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
}
