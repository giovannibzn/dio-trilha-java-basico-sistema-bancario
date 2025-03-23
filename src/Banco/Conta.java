package Banco;

public interface Conta {

    void depositar(double valor);
    void sacar(double valor);
    void transferir(double valor, Conta destino);
    void extrato();
}
