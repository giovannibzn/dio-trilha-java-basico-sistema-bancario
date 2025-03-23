package Banco;

import java.util.ArrayList;
import java.util.List;

public class Banco {
    private List<Conta> contas;

    public Banco() {
        this.contas = new ArrayList<>();
    }

    public void adicionarConta(Conta conta){
        contas.add(conta);
    }

    public void exibirContas(){
        if(contas.isEmpty()){
            System.out.println("Nenhuma conta cadastrada");
        } else {
            System.out.println("===Lista de Contas===");
            for(Conta conta:contas){
                System.out.println(conta);
            }
        }
    }
}
