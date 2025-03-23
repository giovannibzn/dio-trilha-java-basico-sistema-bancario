package Banco;

public class Cliente {

    private String nome;
    private String sobreNome;

    public Cliente(String nome, String sobreNome) {
        this.nome = nome;
        this.sobreNome = sobreNome;
    }

    @Override
    public String toString() {
        return nome + " " + sobreNome;
    }
}
