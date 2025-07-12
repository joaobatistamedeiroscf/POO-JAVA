import java.util.Scanner ; 
import java.util.InputMismatchException;


public class pratica10 {
     public static void main(String[] args) {
        try{
            Scanner src = new Scanner(System.in)  ; 
            int numero  ; 
            System.out.println("Digite um número inteiro: ") ;
            numero = src.nextInt();
        }catch(InputMismatchException e ){
             System.out.println("Erro: Entrada inválida. Por favor, insira números inteiros.");
               System.out.println("Mensagem técnica: " + e.getMessage());

          
            e.printStackTrace();
        }
        }
     
    
    
    
    
    
    
    
    
    }
