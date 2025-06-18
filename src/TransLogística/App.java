package TransLogística;

public class App {
    public static void main(String[] args) {
        Frota frota = new Frota();

        Carro carro1 = new Carro("ABC1234", "Toyota", "Corolla", 2020, 4);
        Van van1 = new Van("DEF5678", "Mercedes", "Sprinter", 2022, 15);
        Caminhão caminhao1 = new Caminhão("GHI9012", "Volvo", "FH", 2019, 18.0, 3);

        frota.cadastrarVeiculo(carro1);
        frota.cadastrarVeiculo(van1);
        frota.cadastrarVeiculo(caminhao1);

        frota.listarVeiculos();
        
        System.out.println("Veículos Alugados:");
        carro1.calcularAluguel(2);
        van1.calcularAluguel(2);




        
    }
    
}
