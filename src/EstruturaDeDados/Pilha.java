package EstruturaDeDados;

public class Pilha extends ED {
    
    @Override
    public void adicionar(int elemento) {
        elementos[tamanho++] = elemento ;    
    }    
    
    @Override
    public int remover() {
        if (tamanho == 0) {
            System.out.println("Pilha vazia");
            return -1; 
        } else {
            return elementos[--tamanho];
        }
    }
}
