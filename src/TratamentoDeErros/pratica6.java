import java.io.IOException;

public class pratica6 {
    // Método que simula a leitura de um arquivo e lança IOException
    public static void leituraArquivo() throws IOException {
        // Simulando erro de leitura
        throw new IOException("Erro ao ler o arquivo!");
    }

    public static void main(String[] args) {
        try {
            leituraArquivo();
        } catch (IOException e) {
            System.out.println("Exceção capturada: " + e.getMessage());
        } 
    }
}
