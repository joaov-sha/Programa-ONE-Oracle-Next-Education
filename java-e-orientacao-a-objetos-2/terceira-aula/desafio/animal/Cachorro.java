package animal;
public class Cachorro extends Animal{
    
    public Cachorro(String nome){
        super(nome);
    }

    public void abanarRabo(){
        System.out.println(this.nome + " está abanando o rabo!");
    }

    @Override
    public void emitirSom(){
        System.out.println(this.nome + " está latindo!");
    }
}
