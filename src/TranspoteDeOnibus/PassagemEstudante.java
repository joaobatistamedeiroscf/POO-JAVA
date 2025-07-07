package TranspoteDeOnibus;

public class PassagemEstudante extends Passagem{

    public PassagemEstudante(String nomePassageiro , double valorPassagem) {
        super(nomePassageiro , valorPassagem);
    }

    @Override
    public double calcularValor(){
        return getValorPassagem() * 0.5 ; 
    }

} 