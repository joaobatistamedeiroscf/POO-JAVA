package GestaoDeAnimaisZoo;

public class Elefante extends Animal{

    public Elefante(String nome, int idade,String comida) {
        super(nome, idade,comida);
        
    }

    @Override
    public void emitirSom() {
        System.out.println("Ronco do Elefante "+ getNome() + " fuumm uuuuh");
    }

    
}
