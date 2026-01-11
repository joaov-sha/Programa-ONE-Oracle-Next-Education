package animal;
public class Gato extends Animal{

    public Gato(String nome) {
        super(nome);
    }
    
    public void arranharMoveis(){
        System.out.println(this.nome + " está arranhando o sofá da sala!");
    }

    @Override
    public void emitirSom(){
        System.out.println(this.nome + " está miando!");
    }
}
