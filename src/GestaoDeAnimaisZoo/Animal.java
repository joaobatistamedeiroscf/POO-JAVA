package GestaoDeAnimaisZoo;

public  abstract class Animal {
    private String nome ; 
    private int idade ;
    private String comida ; 


    public Animal(String nome, int idade,String comida) {
        this.nome = nome;
        this.idade = idade;
        this.comida = comida ; 
    }

    public abstract void emitirSom();

    public String getNome(){
        return nome ; 
    }

    public int getIdade(){
        return idade ; 
    }

    public String getComida(){
        return comida ; 
    }
    
    
    
    
}
