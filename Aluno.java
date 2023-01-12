import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Aluno extends Pessoa {
    Scanner scanner = new Scanner(System.in);
    private String matricula;
    private String curso;

    private List<Aluno> alunos = new ArrayList<Aluno>();


    Aluno(String nome, String idade, String sexo, String matricula, String curso) {
        super(nome, idade, sexo);
        this.matricula = matricula;
        this.curso = curso;
    }

    Aluno() {

    }

    public void cancelarMatricula() {

        System.out.println("Tem certeza que deseja cancelar a matrícula?");
        System.out.println("1 - Sim");
        System.out.println("2 - Não");
        int opcaoAluno = scanner.nextInt();

        if (opcaoAluno == 1) {
            System.out.println("Matrícula cancelada");
        } else {
            System.out.println("Processo encerrado");
        }
    }

    public void cadastrarNovoAluno() {

        System.out.println("Preencha os dados necessários");
        System.out.println();

        System.out.println("Qual o nome do aluno(a)?");

        //aluno.setNome( scanner.nextLine());
        String nomeDoAluno = scanner.nextLine();


        System.out.println("Qual a idade do aluno(a)?");

        //aluno.setIdade( scanner.nextLine());
        String idadeDoAluno = scanner.nextLine();


        System.out.println("Qual o sexo do aluno(a)?");

        //aluno.setSexo( scanner.nextLine());
        String sexoDoAluno = scanner.nextLine();


        System.out.println("Qual o matrícula do aluno(a)?");

        //aluno.setMatricula( scanner.nextLine());
        String matriculaDoAluno = scanner.nextLine();

        System.out.println("Qual o curso do aluno(a)?");

        //aluno.setCurso( scanner.nextLine());
        String cursoDoAluno = scanner.nextLine();


        System.out.println();
        this.setNome(nomeDoAluno);
        this.setIdade(idadeDoAluno);
        this.setSexo(sexoDoAluno);
        this.setMatricula(matriculaDoAluno);
        this.setCurso(cursoDoAluno);

        System.out.println("Cadastro concluído com sucesso!");
    }

    public void controleDasOpçoesDeAluno(int opcaoDeAluno, RepositorioDeCadastros repositorio) {
        Aluno aluno = new Aluno();

        switch (opcaoDeAluno) {
            case 1:
                aluno.cancelarMatricula();
                break;

            case 2:
                System.out.println(repositorio.retornarListaDeNotasCadastradas());
                break;
        }

    }

    public String getMatricula() {

        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getCurso() {

        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public List<Aluno> getAluno() {
        return alunos;
    }

    public void setAluno(Aluno aluno) {
        alunos.add(aluno);
    }

    @Override
    public String toString() {
        return "\n Nome: " + getNome()
                + "\n Idade: " + getIdade()
                + "\n Sexo: " + getSexo()
                + "\n Matrícula: " + this.matricula
                + "\n Cuso: " + this.curso
                + "\n ";
    }
}