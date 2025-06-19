package EstruturaDeDados;

public class Fila extends ED {
    protected int inicio = 0 ;

    @Override
    public void adicionar(int elemento) {
        if (tamanho < elementos.length) {
            elementos[tamanho] = elemento;
            tamanho++;
        } else {
            System.out.println("Fila cheia");
        }
    }
// ...existing code...
@Override
public int  remover() {
    if (tamanho == 0) {
        System.out.println("Fila vazia");
        return -1; // Retorna -1 ou outro valor indicativo de erro
    } else {
        int elementoRemovido = elementos[inicio];
        // Desloca os elementos para a esquerda
        for (int i = 0; i < tamanho - 1; i++) {
            elementos[i] = elementos[i + 1];
        }
        tamanho--; // Diminui o tamanho da fila
        return elementoRemovido;
    }
}
    public int getInicio(){
        return inicio ; 
    }
}
