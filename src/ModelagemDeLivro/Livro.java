import java.util.ArrayList;

public class Livro {
    private String isbn;
    private String titulo;
    private ArrayList<Capitulo> capitulos;

    public Livro(String isbn, String titulo) {
        this.isbn = isbn;
        this.titulo = titulo;
        this.capitulos = new ArrayList<>();
    }

    public void adicionarCapitulo(String titulo, int quantidadePaginas) {
        Capitulo capitulo = new Capitulo(titulo, quantidadePaginas);
        capitulos.add(capitulo);
    }

    public void exibirRelatorio() {
        System.out.println("=== RELATÓRIO DO LIVRO ===");
        System.out.println("Editora : " + Constantes.Editora);
        System.out.println("ISBN : " + isbn);
        System.out.println("Título : " + titulo);
        System.out.println("Capítulos :");

        int totalPaginas = 0;
        for (Capitulo cap : capitulos) {
            System.out.println("Capítulo " + cap.getNumero() + " - " + cap.getTitulo() + " (" + cap.getQuantidadePaginas() + " páginas)");
            totalPaginas += cap.getQuantidadePaginas();
        }

        System.out.println("Total de páginas : " + totalPaginas);
    }
}
