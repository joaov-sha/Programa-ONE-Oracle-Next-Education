package org.joaov_sha.model;

public class Veiculo {
    
    private String modelo;
    private String marca;
    private String anoDeFabricacao;

    public Veiculo(String modelo, String marca, String anoDeFabricacao){
        this.modelo = modelo;
        this.marca = marca;
        this.anoDeFabricacao = anoDeFabricacao;
    }

    public String getModelo(){
        return modelo;
    }

    public void setModelo(String modelo){
        this.modelo = modelo;
    }

    public String getMarca(){
        return marca;
    }

    public void setMarca(String marca){
        this.marca = marca;
    }

    public String getAnoDeFabricacao(){
        return anoDeFabricacao;
    }

    public void setAnoDeFabricacao(String anoDeFabricacao){
        this.anoDeFabricacao = anoDeFabricacao;
    }
}
