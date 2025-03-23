import Banco.Banco;
import Banco.ContaCorrente;
import Banco.ContaPoupanca;

public class Main {
    public static void main(String[] args) {
        Banco banco = new Banco();

        var neymar = new ContaCorrente("Neymar", "Junior");
        var messi = new ContaPoupanca("Lionel", "Messi");
        var cristiano = new ContaCorrente("Cristiano", "Ronaldo");
        var vini = new ContaPoupanca("Vinicius", "Jr");

        banco.adicionarConta(neymar);
        banco.adicionarConta(messi);
        banco.adicionarConta(cristiano);
        banco.adicionarConta(vini);

        banco.exibirContas();
        System.out.println();

        neymar.depositar(500);
        messi.depositar(800);
        cristiano.depositar(1000);
        neymar.transferir(300, vini);
        cristiano.transferir(250, neymar);
        vini.sacar(50);

        neymar.extrato();
        System.out.println();
        messi.extrato();
        System.out.println();
        cristiano.extrato();
        System.out.println();
        vini.extrato();
    }
}