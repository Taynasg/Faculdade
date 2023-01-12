import java.util.ArrayList;
import java.util.List;

public class RepositorioDeCadastros {
    private List<Aluno> alunos = new ArrayList<Aluno>();
    private List<NotasDosAlunos> listaDeNotas = new ArrayList<NotasDosAlunos>();

    public void cadastrarNovoAluno(Aluno aluno) {
        alunos.add(aluno);
    }

    public List<Aluno> retornarListaDeAlunosCadastrados() {
        return alunos;
    }

    public void lancarNovasNotas(NotasDosAlunos novasNotas) {
        listaDeNotas.add(novasNotas);
    }

    public List<NotasDosAlunos> retornarListaDeNotasCadastradas() {
        return listaDeNotas;
    }





}
