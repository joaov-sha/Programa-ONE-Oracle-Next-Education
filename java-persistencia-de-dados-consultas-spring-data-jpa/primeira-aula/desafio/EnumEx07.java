public enum EnumEx07 {
    
    DOLAR(0.2),
    EURO(0.16),
    REAL(1.00);

    private Double taxaDeConversao;

    EnumEx07(Double taxaDeConversao){
        this.taxaDeConversao = taxaDeConversao;
    }

    public double converterPara(double valorEmReais){
        return valorEmReais * taxaDeConversao;
    }
}
