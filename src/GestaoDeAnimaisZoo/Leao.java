package GestaoDeAnimaisZoo;

public class Leao extends Animal{

    public Leao(String nome, int idade,String comida) {
        super(nome, idade,comida);
       
    }

    @Override
    public void emitirSom() {
         System.out.println("Rugido do Leão "+ getNome() + " Roar Roar");
    }
    
}
 