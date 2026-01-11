package model;

public class Podcast extends Audio{
    
    private String host;
    private String descricao;

    public Podcast(String titulo, String host, String descricao){
        super(titulo);
        this.host = host;
        this.descricao = descricao;
    }

    public String getHost(){
        return host;
    }

    public void setHost(String host){
        this.host = host;
    }

    public String getDescricao(){
        return descricao;
    }

    public void setDescricao(String descricao){
        this.descricao = descricao;
    }
}
