package EstruturaDeDados;
public class Principal {
    public static void main(String[] args) {
        ED estrutura;

        estrutura = new Pilha();
        estrutura.adicionar(10);
        estrutura.adicionar(20);
        System.out.println("Pilha: " + estrutura.remover()); // Deve imprimir 20

        estrutura = new Fila();
        estrutura.adicionar(10);
        estrutura.adicionar(20);
        System.out.println("Fila: " + estrutura.remover()); // Deve imprimir 10

        estrutura = new FilaPrioridade();
        estrutura.adicionar(30);
        estrutura.adicionar(10);
        estrutura.adicionar(20);
        System.out.println("FilaPrioridade: " + estrutura.remover()); // Deve imprimir 10 (menor)
    }
}
