
//Crie um vetor com 5 elementos inteiros. Solicite ao usuário que informe
// um índice para exibir o valor correspondente. Utilize try-catch para capturar ArrayIndexOutOfBoundsException caso o índice informado seja inválido.

import java.util.Scanner ; 


public class pratica3 {

    public static void main(String[] args) {
      
      try {
        int tamanho;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o tamanho do vetor: ");
        tamanho = scanner.nextInt();

        int[] vetor = new int[tamanho];

        for(int i = 0 ; i < tamanho ; i++)
        {
            System.out.println("Digite o valor do " + i + " elemento: ");
            vetor[i] = scanner.nextInt() ; 
        }
        System.out.println("Vetor preenchido! ");
        for(int i = 0 ; i < tamanho ; i++)
        {
            System.out.println(vetor[i]);
        }
    }catch (ArrayIndexOutOfBoundsException e) {
        System.out.println("Índice inválido! Por favor, informe um índice entre 0 e ");
      } catch (Exception e) {
        System.out.println("Ocorreu um erro: " + e.getMessage());
      } finally {
        System.out.println("Programa finalizado.");

      }
    
    }

}
