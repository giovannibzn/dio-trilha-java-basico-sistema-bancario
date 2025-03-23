package Banco;

public abstract class ContaBase implements Conta{

    private static final int AGENCIA = 1;
    private static int SEQUENCIA = 1;

    protected int agencia;
    protected int contaNumero;
    protected double saldo;
    protected Cliente cliente;
    protected String tipo;

    public ContaBase(String nome, String sobrenome, String tipo){
        this.agencia = AGENCIA;
        this.contaNumero = SEQUENCIA++;
        this.cliente = new Cliente(nome, sobrenome);
        this.tipo = tipo;
    }

    @Override
    public void depositar(double valor) {
        if(valor > 0) {
            saldo += valor;
        } else {
            System.out.println("Valor de depósito inválido");
        }
    }

    @Override
    public void sacar(double valor) {
        if(valor > 0 && saldo >= valor) {
            saldo -= valor;
        } else {
            System.out.println("Saldo insuficiente ou valor inválido");
        }
    }

    @Override
    public void transferir(double valor, Conta destino) {
        if(valor > 0 && saldo >= valor) {
            sacar(valor);
            destino.depositar(valor);
        }else {
            System.out.println("Transferencia não realizada, verifique o saldo ou o valor");
        }
    }

    @Override
    public void extrato(){
        System.out.printf("""
                ===Extrato===
                Cliente: %s
                Agencia: %d
                %s: %d
                Saldo: R$ %.2f
                """, cliente, agencia, tipo, contaNumero, saldo);
    }

    @Override
    public String toString() {
        return String.format("Cliente: %-20s | Agencia: %d | Número: %d | Tipo: %s"
                , cliente, agencia, contaNumero, tipo);
    }
}

