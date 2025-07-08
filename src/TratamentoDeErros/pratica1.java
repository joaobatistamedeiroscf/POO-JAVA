//Crie um programa que peça ao usuário dois números inteiros e exiba o resultado da divisão entre eles.
// Use try-catch para capturar a exceção ArithmeticException em caso de divisão por zero. O programa deve continuar pedindo valores até que uma divisão válida ocorra.

import java.util.Scanner;

public class pratica1 {
	public static void main(String[] args) {
		
        int numero1;
		int numero2;
        boolean divisaoValida = false ; 
        
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

        }

	}
}
}