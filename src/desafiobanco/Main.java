package desafiobanco;

import java.util.ArrayList;

public class Main {
    public static void main(String [] args){        
        Cliente rafael = new Cliente();
        Cliente ana = new Cliente();
        Banco banco = new Banco();
        ArrayList<Conta> contas = new ArrayList<>();
        
        ana.setNome("ana");
        rafael.setNome("rafael");        
        
        Conta cc = new ContaCorrente(ana);
        Conta cp = new ContaPoupanca(rafael);
        
        cc.depositar(100);
        cc.transferir(cp, 99);
        contas.add(cp);
        contas.add(cc);       
        banco.setContas(contas);
        
        System.out.println(" ");
        
        cc.imprimirExtrato();
        cp.imprimirExtrato();
        
        System.out.println(" ");
        
        banco.listarContas();
        
        System.out.println(" ");

        banco.pesquisarPorNumeroDaConta(1);

    }        
    
}
