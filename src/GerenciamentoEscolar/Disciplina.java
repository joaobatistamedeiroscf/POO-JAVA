package GerenciamentoEscolar;

public class Disciplina {
    private String nome ; 
    private Aluno[] alunos ;
    private int contador ; 
    
    public Disciplina(String nome ,  int capacidadeMax){
        this.nome = nome ; 
        this.alunos = new Aluno[capacidadeMax];
        this.contador = 0 ;  
    }

    public void MatricularAlunoNaDisciplina(Aluno aluno){
        if(contador < alunos.length){
            alunos[contador++] = aluno ; 
            System.out.println(aluno.getNome() + " Matriculado na disciplina " + getNome() );
        }else {
            System.out.println("Capacidade Máxima preenchida !!!");
        }
    }



    public String getNome(){
        return nome ;
    }

    public Aluno[] getAlunos(){
        return alunos ; 
    }




    
}
