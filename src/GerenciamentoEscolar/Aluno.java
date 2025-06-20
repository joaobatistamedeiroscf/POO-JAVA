package GerenciamentoEscolar;

public class Aluno  extends Pessoa implements SistemaUsuario{
    private String matricula ; 

    public Aluno(String nome, String cpf , String matricula) {
        super(nome, cpf);
        this.matricula = matricula ; 
    }

    @Override
    public void exibirDados() {
        System.out.println("Dados do Aluno: ");
        System.out.println("Nome: " + getNome());
        System.out.println("Cpf: " + getCpf());
        System.out.println("Matricula: " + getMatricula());

    }

    public String getMatricula(){
        return matricula ; 
    }

    
}
