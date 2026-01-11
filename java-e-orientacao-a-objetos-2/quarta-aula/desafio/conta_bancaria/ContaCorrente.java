package conta_bancaria;
public class ContaCorrente extends ContaBancaria{
    
    public ContaCorrente(String cliente, int numero, Double saldo){
        super(cliente, numero, saldo);
    }

    public void cobrarTarifaMensal(Double valorDaTarifa){
        this.saldo -= valorDaTarifa;
    }
}
