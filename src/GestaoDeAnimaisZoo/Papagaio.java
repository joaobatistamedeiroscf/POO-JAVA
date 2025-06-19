package GestaoDeAnimaisZoo;

public class Papagaio extends Animal {

    public Papagaio(String nome, int idade, String comida) {
        super(nome, idade , comida);
       }

    @Override
    public void emitirSom() {
        System.out.println("Fala do Papagaio " + getNome() + " oi oi oi oi oi oi oi ");
    }
    

    
}
