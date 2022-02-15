package desafiobanco;

public interface ContaInterface {
    
    void depositar(double valor);
    void sacar(double valor);
    void transferir(Conta conta, double valor);
    void imprimirExtrato();
}
