import java.util.ArrayList;
import java.util.List;

public class CadastroAlunoRepositorio {

    private List<Aluno> alunos = new ArrayList<Aluno>();

    public void cadastrarAluno(Aluno aluno) {
        alunos.add(aluno);

    }
    public List<Aluno> retornarListaDeAlunosCdastrados(){
        return alunos;
    }

}
