import java.util.Scanner ; 
public class pratica4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numero ; 

        try {
            System.out.println("Digite um número inteiro: ");
            numero = scanner.nextInt();
        }catch (Exception e) {
            System.out.println("Erro: Entrada inválida. Por favor, digite um número inteiro.");
            
        } finally {
            System.out.println("Encerramento do programa.");
            scanner.close(); 
        }

       



        
    }
    
}
