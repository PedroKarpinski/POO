package Descontos;

public class Cliente {
    private final String nome;
    private final String email;
    private boolean fidelidade;

    public Cliente(String nome, String email) {
        this.nome = nome;
        this.email = email;
        this.fidelidade = false;
    }

    public void fidelizar() {
        this.fidelidade = true;
    }

    public void desfidelizar() {
        this.fidelidade = false;
    }

    public String getEmail() {
        return this.email;
    }

    public String getNome() {
        return this.nome;
    }

    public boolean isFidelidade() {
        return this.fidelidade;
    }
}