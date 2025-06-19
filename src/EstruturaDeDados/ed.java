package EstruturaDeDados;

public abstract class ED {
    protected int[] elementos = new int[100];
   protected int tamanho = 0 ; 
   

    public abstract void adicionar(int elemento);
    public abstract int  remover();

    public int  getTamanho(){
        return tamanho;
    }
    public int[] getElementos(){
        return elementos;
    }
    

    
}
