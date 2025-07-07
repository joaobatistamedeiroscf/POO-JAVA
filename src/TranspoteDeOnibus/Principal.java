package TranspoteDeOnibus;

public class Principal {
    public static void main(String[] args) {
        Passagem[] passagem = new Passagem[6];

        passagem[0] = new Passagem("João", 100.0);
        passagem[1] = new Passagem("Maria", 120.0);
        passagem[2] = new Passagem("Olivia", 500);

        passagem[3] = new PassagemEstudante("Arthur", 700);
        passagem[4] = new PassagemEstudante("Dudu", 5.50); 
        passagem[5] = new PassagemEstudante("Gaby", 175.50);

        for (int i = 0; i < passagem.length; i++) {
            System.out.println(passagem[i].toString() + " - Valor: " + passagem[i].calcularValor());
        }
        
    }
    
}
