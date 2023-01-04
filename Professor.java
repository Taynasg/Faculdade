import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Professor extends Pessoa {
    Scanner scanner = new Scanner(System.in);

    private List<Aluno> alunos = new ArrayList<Aluno>();
    private String especialidade;
    private float salario;


    Professor(String nome, String idade, String sexo, String especialidade, float salario) {
        super(nome, idade, sexo);
        this.especialidade = especialidade;
        this.salario = salario;
    }

    public Professor() {

    }


    public void receberAumento() {
        System.out.println("Você trabalha aqui a quanto tempo?");
        int tempoDeContribuicao = scanner.nextInt();


    }


    public void ControleDasOpcoesDoProfessor(int opcaoDeProfessor) {

        switch (opcaoDeProfessor) {
            case 1:
                //Professor professor = new Professor(String nome, int idade, String sexo, String especialidade,float salario);

                Professor professor = new Professor();
                professor.mudarDeTurma();
                break;

            case 2:
                System.out.println("Função indisponível no momento ");
                break;

            case 3:
                Aluno aluno = new Aluno();
                aluno.cadastrarNovoAluno();
                break;

            case 4:
                aluno = new Aluno();
                System.out.println(aluno.toString());
                break;

            case 5:
                System.out.println("Função indisponível no momento");
                break;
        }
    }

    public void mudarDeTurma() {

        int turma;
        int novaTurma = 0;

        do {

            System.out.println("Para qual turma você da aula atualmente?");
            System.out.println("1 - Engenharia");
            System.out.println("2 - Direito");
            System.out.println("3 - Turismo");
            System.out.println("4 - Programação");
            System.out.println("5 - Medicina");
            System.out.println("6 - Artes Cenicas");
            System.out.println("7 - Cinema");
            System.out.println("8 - Moda");
            turma = scanner.nextInt();
            if (turma <= 0 || turma > 8) {
                System.out.println("Opção inválida! Por favor tente novamente!");
            }
        } while (turma <= 0 || turma > 8);


        do {
            System.out.println("Para qual turma você gostria de dar aula?");
            System.out.println("1 - Engenharia");
            System.out.println("2 - Direito");
            System.out.println("3 - Turismo");
            System.out.println("4 - Programação");
            System.out.println("5 - Medicina");
            System.out.println("6 - Artes Cenicas");
            System.out.println("7 - Cinema");
            System.out.println("8 - Moda");
            novaTurma = scanner.nextInt();
            if (novaTurma <= 0 || novaTurma > 8) {
                System.out.println("Opção inválida! Por favor tente novamente!");
            }

            if (turma == novaTurma) {
                System.out.println("Você já possui essa função!! Por favor tente novamente!");
            }
        } while ((novaTurma <= 0 || novaTurma > 8) || (turma == novaTurma));

        System.out.println("Obrigada pelo contato! A diretoria vai avaliar seu pedido.");

    }

    public String getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }

    public float getSalario() {
        return salario;
    }

    public void setSalario(float salario) {
        this.salario = salario;
    }


}
