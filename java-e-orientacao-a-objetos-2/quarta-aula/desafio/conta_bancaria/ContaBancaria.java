package conta_bancaria;
public class ContaBancaria {
    
    public String cliente;
    public int numero;
    public double saldo;

    public ContaBancaria(){}

    public ContaBancaria(String cliente, int numero){
        this.cliente = cliente;
        this.numero = numero;
    }

    public ContaBancaria(String cliente, int numero, double saldo){
        this.cliente = cliente;
        this.numero = numero;
        this.saldo = saldo;
    }

    public String getCliente(){
        return cliente;
    }

    public void setCliente(String cliente){
        this.cliente = cliente;
    }

    public int getNumero(){
        return numero;
    }

    public void setNumero(int numero){
        this.numero = numero;
    }

    public Double consultarSaldo(){
        return saldo;
    }

    public void depositar(Double valor){
        this.saldo += valor;
    }

    public void sacar(Double valor){
        this.saldo -= valor;
    }
}
