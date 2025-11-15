public class Carro {
    
    private String modelo;
    private int ano;
    private String cor;

    public Carro(String modelo, int ano, String cor){
        this.modelo = modelo;
        this.ano = ano;
        this.cor = cor;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public void exibirFichaTecnica(){
        System.out.println("Modelo: " + modelo);
        System.out.println("Ano: " + ano);
        System.out.println("Cor: " + cor);
    }

    public void calcularIdadeDoCarro(){
        System.out.println(2025 - ano);
    }

    @Override
    public String toString() {
        return "Carro [modelo=" + modelo + ", ano=" + ano + ", cor=" + cor + "]";
    }

    
}
