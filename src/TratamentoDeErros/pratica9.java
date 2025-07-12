import java.util.Scanner;
import java.util.InputMismatchException;

public class pratica9 {
    public static void main(String[] args) {
        int numero1;
		int numero2;
        boolean divisaoValida =  false  ;  
        
        while(!divisaoValida){
        
        try {
		Scanner scanner = new Scanner(System.in);

		System.out.println("Digite o primeiro número inteiro: ");
		numero1 = scanner.nextInt();

        System.out.println("Digite o primeiro número inteiro: ");
		numero2 = scanner.nextInt();

    
        int divisao = numero1 / numero2 ; 
        System.out.println("O resultado da divisão é: " + divisao);
        divisaoValida = true ;  

        }catch(ArithmeticException e){
            System.out.println("Erro: Divisão por zero não é permitida. Tente novamente.");
        }catch(InputMismatchException e ){
            System.out.println("Erro: Entrada inválida. Por favor, insira números inteiros.");
        }
}
}
}
 