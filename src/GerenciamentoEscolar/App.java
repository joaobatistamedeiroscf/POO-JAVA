package GerenciamentoEscolar;

public class App {
    public static void main(String[] args) {
        Aluno al1 = new Aluno("João", "60942076354", "20241BCC.CAX0032");
        
        al1.exibirDados();

        Disciplina dis1 = new Disciplina("POO", 10);

        dis1.MatricularAlunoNaDisciplina(al1);

        






        
    }
    
}
