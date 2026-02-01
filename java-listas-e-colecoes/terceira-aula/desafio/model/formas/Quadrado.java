package model.formas;

public class Quadrado implements Forma{
    
    private double lado;

    public Quadrado(double lado){
        this.lado = lado;
    }

    public double getLado(){
        return lado;
    }

    public void setLado(double lado){
        this.lado = lado;
    }

    @Override
    public double CalcularArea(){
        return Math.pow(lado,2);
    }
}
