package GestaoDeAnimaisZoo;

public class App {
    public static void main(String[] args) {
        Animal leao = new Leao("Aquiles", 10,"Carne moida");
        Animal elefante = new Elefante("Dumbo", 15, "Cascas de Arvóres");
        Animal papagaio = new Papagaio("Loiro", 19, "Goiaba");

        Tratador tratador = new Tratador("Yan");
        
        leao.emitirSom();
        elefante.emitirSom();
        papagaio.emitirSom();
        
        tratador.alimentarAnimal(leao);
        tratador.alimentarAnimal(papagaio);
        tratador.alimentarAnimal(elefante);


    }
    
}
