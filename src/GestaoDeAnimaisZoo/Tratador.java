package GestaoDeAnimaisZoo;

public class Tratador implements Cuidador {
    private String nome ; 

    public Tratador(String nome){
        this.nome = nome ;

    }

    @Override
    public void alimentarAnimal(Animal animal) {
        System.out.println("Tratador " + getNome() + " Alimentando " + animal.getNome() + " com " + animal.getComida());
    }

    public String getNome(){
        return nome ; 
    }


    
}
