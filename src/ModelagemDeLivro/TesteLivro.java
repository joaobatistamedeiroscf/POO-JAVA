public class TesteLivro {
    public static void main(String[] args) {
        Livro livro = new Livro("978-3-16-148410-0", "Introdução à Programação");

        livro.adicionarCapitulo("Variáveis e Tipos", 12);
        livro.adicionarCapitulo("Estruturas de Decisão", 15);
        livro.adicionarCapitulo("Laços de Repetição", 18);

        livro.exibirRelatorio();
    }
}
