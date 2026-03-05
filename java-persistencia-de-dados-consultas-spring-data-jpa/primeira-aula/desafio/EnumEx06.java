public enum EnumEx06 {
    JANEIRO(31),
    FEVEIRO(28),
    MARÇO(31),
    ABRIL(30),
    MAIO(31),
    JUNHO(30),
    JULHO(31),
    AGOSTO(31),
    SETEMBRO(30),
    OUTUBRO(31),
    NOVEMBRO(30),
    DEZEMBRO(31);

    private Integer quantidadeDeDias;

    EnumEx06(Integer quantidadeDeDias){
        this.quantidadeDeDias = quantidadeDeDias;
    }

    public int getNumeroDeDias(){
        return quantidadeDeDias;
    }
}
