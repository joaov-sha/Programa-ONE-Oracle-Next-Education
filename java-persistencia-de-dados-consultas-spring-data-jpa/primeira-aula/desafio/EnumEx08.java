public enum EnumEx08 {
    
    BAD_REQUEST(400, "Erro na aplicação ao receber a requisição!"),
    NOT_FOUND(404, "O recurso solicitado não foi encontrado!"),
    INTERNAL_SERVER_ERROR(500, "Erro interno do servidor!");

    private Integer codigoErro;
    private String descricaoErro;

    EnumEx08(Integer codigoErro, String descricaoErro){
        this.codigoErro = codigoErro;
        this.descricaoErro = descricaoErro;
    }

    public int getCodigo(){
        return codigoErro;
    }

    public String getDescricao(){
        return descricaoErro;
    }
}
