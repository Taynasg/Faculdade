import java.util.Scanner;

public class TestaFaculdade {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        RepositorioDeCadastros repositorio = new RepositorioDeCadastros();
        NotasDosAlunos novasNotas = new NotasDosAlunos();

        System.out.println("===========================");
        System.out.println("        Faculdade");
        System.out.println("============================");

        int opcaoDeFuncao;
        int opcaoDeAluno;
        int opcaoDeProfessor;
        int opcaoDeFuncionario;

        do {

            System.out.println("Qual função você exerce dentro desta instituição?");
            System.out.println("1 - Aluno ");
            System.out.println("2 - Professor");
            System.out.println("3 - Funcionário ");
            System.out.println("4 - Sair");

            opcaoDeFuncao = scanner.nextInt();

            switch (opcaoDeFuncao) {

                case 1:

                    Aluno aluno = new Aluno();
                    do {
                        System.out.println("O que você deseja?");
                        System.out.println("1 - Cancelar matrícula");
                        System.out.println("2 - Consultar nota(Em implementação)");
                        System.out.println("3 - Voltar");
                        opcaoDeAluno = scanner.nextInt();
                        aluno.controleDasOpçoesDeAluno(opcaoDeAluno);
                        if (opcaoDeAluno <= 0 || opcaoDeAluno > 3) {
                            System.out.println("Opção inválida tente novamente!");
                        }

                    } while (opcaoDeAluno <= 0 || opcaoDeAluno <= 2 ||opcaoDeAluno > 3);
                    break;

                case 2:

                    Professor professor = new Professor();

                    System.out.println();
                    do {
                        System.out.println("O que você deseja?");
                        System.out.println("1 - Mudar de turma");
                        System.out.println("2 - Solicitar aumento ");
                        System.out.println("3 - Registrar novo(a) aluno(a)");
                        System.out.println("4 - Ver lista de alunos");
                        System.out.println("5 - Lançar notas (Em implementação)");
                        System.out.println("6 - sair");
                        opcaoDeProfessor = scanner.nextInt();

                        professor.ControleDasOpcoesDoProfessor(opcaoDeProfessor,repositorio,novasNotas);
                        if ((opcaoDeProfessor == 0) || (opcaoDeProfessor > 6)) {
                            System.out.println("Opção inválida! Por favor, tente novamente!");
                        }
                        System.out.println();

                    } while (opcaoDeProfessor == 1 || opcaoDeProfessor <= 5 || (opcaoDeProfessor > 6));

                    break;

                case 3:

                    do {
                        System.out.println();
                        Funcionario funcionario = new Funcionario();
                        System.out.println("O que você deseja?");
                        System.out.println("1 - Mudar de função");
                        System.out.println("2 - Solicitar aumento(Em implementação)");
                        System.out.println("3 - Voltar");
                        opcaoDeFuncionario = scanner.nextInt();
                        funcionario.ControleDasOpcoesDoFuncionario(opcaoDeFuncionario);
                        System.out.println();

                        if (opcaoDeFuncionario <= 0 || opcaoDeFuncionario > 3) {
                            System.out.println("Opção inválida tente novamente!");
                        }

                    } while (opcaoDeFuncionario <= 0 || opcaoDeFuncionario <= 2 || opcaoDeFuncionario > 3);
                    break;

                case 4:

                    System.out.println("Programa encerrado com sucesso!");
                    break;

                default:
                    System.out.println("Opção inválida por favor tente novamente!");
            }

        } while (opcaoDeFuncao <= 3 || opcaoDeFuncao > 4);
    }
}