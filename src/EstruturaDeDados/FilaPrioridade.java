package EstruturaDeDados;

public class FilaPrioridade extends Fila {
    @Override

    public void adicionar(int elemento) {
    if (tamanho < elementos.length) {
        int i;
        // Encontra a posição correta para inserir o elemento (ordem crescente)
        for (i = tamanho - 1; i >= 0 && elementos[i] > elemento; i--) {
            elementos[i + 1] = elementos[i]; // Desloca os maiores para frente
        }
        elementos[i + 1] = elemento; // Insere o novo elemento na posição correta
        tamanho++; // Aumenta o tamanho da fila
    } else {
        System.out.println("Fila cheia");

    }

}  
    
}
