package desafiobanco;

import java.util.ArrayList;

public class Banco {
    
    private String nome;
    private ArrayList<Conta> contas;    
    
    public Banco() {
    }

    public Banco(ArrayList<Conta> contas) {
        this.contas = contas;
    }
           
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public ArrayList<Conta> getContas() {
        return this.contas;
    }

    public void setContas(ArrayList<Conta> contas) {
        this.contas = contas;
    }                
    
    public void pesquisarPorNumeroDaConta(int numero){       
        
        for(int i = 0; i <= this.getContas().size();i++){
            if(this.getContas().get(i).getNumero()==numero){
                 getContas().get(i).imprimirInfosComuns();
                 break;
            }
        }
        
    }
    
    public void listarContas(){
        System.out.println(String.format("********LISTA DE CONTAS********"));
        for(Conta conta : this.contas){                
        System.out.println(String.format("Titular: %s", conta.getCliente().getNome()));
        System.out.println(String.format("Agência: %d", conta.getAgencia()));
        System.out.println(String.format("Número: %d", conta.getNumero()));
        System.out.println(String.format("*******************************"));

        }
    }
    
}
