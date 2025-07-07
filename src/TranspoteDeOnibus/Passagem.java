package TranspoteDeOnibus;

public class Passagem {
    private String nomePassageiro ; 
    private double valorPassagem ;


    public Passagem(String nomePassageiro , double valorPassagem){
        this.nomePassageiro = nomePassageiro ; 
        this.valorPassagem = valorPassagem;
    }

    public double calcularValor(){
        return getValorPassagem();
    }

    public String toString(){
        return getNomePassageiro();
    }




    public String getNomePassageiro() {
        return nomePassageiro;
    }
    public double getValorPassagem (){
        return valorPassagem ; 
    }
    
}
