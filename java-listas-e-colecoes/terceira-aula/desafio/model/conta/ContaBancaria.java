package model.conta;

public class ContaBancaria {
    
    private Integer numeroDaConta;
    private double saldo;

    public ContaBancaria(Integer numeroDaConta, double saldo){
        this.numeroDaConta = numeroDaConta;
        this.saldo = saldo;
    }

    public Integer getNumeroDaConta(){
        return numeroDaConta;
    }

    public void setNumeroDaConta(Integer numeroDaConta){
        this.numeroDaConta = numeroDaConta;
    }

    public double getSaldo(){
        return saldo;
    }

    public void setSaldo(double saldo){
        this.saldo = saldo;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((numeroDaConta == null) ? 0 : numeroDaConta.hashCode());
        long temp;
        temp = Double.doubleToLongBits(saldo);
        result = prime * result + (int) (temp ^ (temp >>> 32));
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        ContaBancaria other = (ContaBancaria) obj;
        if (numeroDaConta == null) {
            if (other.numeroDaConta != null)
                return false;
        } else if (!numeroDaConta.equals(other.numeroDaConta))
            return false;
        if (Double.doubleToLongBits(saldo) != Double.doubleToLongBits(other.saldo))
            return false;
        return true;
    }

    
}
