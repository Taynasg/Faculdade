import java.util.Scanner;

public class Professor extends Pessoa {
    Scanner scanner = new Scanner(System.in);


    Professor(String nome, String idade, String sexo) {
        super(nome, idade, sexo);
    }

    public Professor() {

    }

    int tempoDeContribuicao;
    int outraOpcao;
    int aumento;

    public void receberAumento() {
        Professor professor = new Professor();

        do {

            System.out.println("Você trabalha aqui a quantos meses?");
            System.out.println("1 - 1 mês");
            System.out.println("2 - 4 meses");
            System.out.println("3 - 8 meses");
            System.out.println("4 - 12 meses");
            System.out.println("5 - mais de 1 ano ");
            System.out.println("6 - Outra opção");
            tempoDeContribuicao = scanner.nextInt();

            if (tempoDeContribuicao < 1 || tempoDeContribuicao > 6) {
                System.out.println("Opção inválida! Tente novamente");
            } else if (tempoDeContribuicao < 4) {
                System.out.println("Sinto muito! Você não pode receber um aumento no momento, pois trabalha aqui a menos de 1 ano");

            } else if (tempoDeContribuicao == 5 || tempoDeContribuicao == 4) {

                professor.condicoesParaReceberAumento();

            } else {

                professor.tempoDeContribuicaoDiferente();

            }

        } while (tempoDeContribuicao < 1 || tempoDeContribuicao > 6);
    }


    public void condicoesParaReceberAumento() {
        do {
            System.out.println("Você já recebeu aumento esse ano?");
            System.out.println("1 - Sim");
            System.out.println("2 - Não");
            aumento = scanner.nextInt();

            if (aumento <= 0 || aumento > 2) {
                System.out.println("Opção inválida! Tente novamente!");
            } else if (aumento == 1) {
                System.out.println("Sinto muito! Você não pode receber um aumento no momento, pois já recebeu esse amo");
            } else {
                System.out.println("Obrigada pelo contato! A diretoria vai avaliar seu pedido.");
            }

        } while (aumento <= 0 || aumento > 2);

    }

    public void tempoDeContribuicaoDiferente() {
        Professor professor = new Professor();

        do {
            System.out.println("A quantos meses você trabalha aqui?");
            outraOpcao = scanner.nextInt();
            if (outraOpcao == 0) {
                System.out.println("Opção inválida! Por favor tente novamente!");
            }
        } while (outraOpcao == 0);

        if (outraOpcao < 12) {
            System.out.println("Sinto muito! Você não pode receber um aumento no momento, pois trabalha aqui a menos de 1 ano");

        } else {
            System.out.println("Obrigada pelo contato! A diretoria vai avaliar seu pedido.");
        }
    }

    public void ControleDasOpcoesDoProfessor(int opcaoDeProfessor, RepositorioDeCadastros repositorio) {

        switch (opcaoDeProfessor) {
            case 1:
                Professor professor = new Professor();
                professor.mudarDeTurma();
                break;

            case 2:
                professor = new Professor();
                professor.receberAumento();
                break;

            case 3:
                Aluno aluno = new Aluno();
                aluno.cadastrarNovoAluno();
                repositorio.cadastrarNovoAluno(aluno);
                break;

            case 4:
                System.out.println(repositorio.retornarListaDeAlunosCadastrados());
                break;

            case 5:
                NotasDosAlunos novasNotas = new NotasDosAlunos();
                novasNotas.lancarNovasNotas();
                repositorio.lancarNovasNotas(novasNotas);
                break;

                case 6:
                    System.out.println(repositorio.retornarListaDeNotasCadastradas());
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

}