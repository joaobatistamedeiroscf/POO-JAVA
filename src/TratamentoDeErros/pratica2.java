//Utilize a classe Scanner para ler um número inteiro do usuário. Utilize try-catch para capturar
// InputMismatchException caso o usuário insira dados inválidos. O programa deve continuar pedindo até que uma entrada válida seja fornecida.

import java.util.InputMismatchException;
import java.util.Scanner ; 

public class pratica2 {
    public static void main(String[] args) {
        int valor = 0 ; 
       
       while(valor == 0)
       {
        try 
        {
            Scanner scanner = new Scanner(System.in); 
            int numero; 
            System.out.println("Digite um número inteiro: "); 
            numero = scanner.nextInt() ; 
            valor = 1 ; 
        } catch (InputMismatchException e ) 
        {
            System.out.println("Erro: Entrada inválida.Por favor , insira um número inteiro.");
        }
    }
}
}