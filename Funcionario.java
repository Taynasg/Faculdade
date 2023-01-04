import java.util.Scanner;

public class Funcionario extends Pessoa {

    Scanner scanner = new Scanner(System.in);
    private String setor;
    private boolean trabalhando;


    Funcionario(String nome, String idade, String sexo, String setor, boolean trabalhando) {
        super(nome, idade, sexo);
        this.setor = setor;
        this.trabalhando = trabalhando;
    }

    public Funcionario() {

    }

    public void mudarFuncao() {

        int funcaoAtual;

        do {
            System.out.println("Em qual setor você trabalha atualmente?");
            System.out.println("1 - Porteiro(a)");
            System.out.println("2 - Cozinheiro(a)");
            System.out.println("3 - Faxineiro(a)");
            System.out.println("4 - Professor(a)");
            System.out.println("5 - Secretário(a)");
            funcaoAtual = scanner.nextInt();

            if (funcaoAtual <= 0 || funcaoAtual > 5) {
                System.out.println("Opção inválida! Por favor tente novamente! ");
            }

        } while (funcaoAtual <= 0 || funcaoAtual > 5);

        int novaFuncao;

        do {
            System.out.println("Em qual setor você gostaria de trabalhar?");
            System.out.println("1 - Porteiro(a)");
            System.out.println("2 - Cozinheiro(a)");
            System.out.println("3 - Faxineiro(a)");
            System.out.println("4 - Professor(a)");
            System.out.println("5 - Secretário(a)");
            novaFuncao = scanner.nextInt();

            if ( novaFuncao <= 0 ||  novaFuncao > 5) {
                System.out.println("Opção inválida! Por favor tente novamente! ");
            }

            if (funcaoAtual == novaFuncao) {
                System.out.println("Você já possui essa funçao! Por favor tente novamente!");
            }
        } while (( novaFuncao <= 0 ||  novaFuncao > 5) || (funcaoAtual == novaFuncao));

        System.out.println("Obrigada pelo contato! A diretoria vai avaliar seu pedido.");
    }

    public void ControleDasOpcoesDoFuncionario(int opcaoDeFuncionario) {

        switch (opcaoDeFuncionario) {

            case 1:
                Funcionario funcionario = new Funcionario();
                funcionario.mudarFuncao();
                break;

            case 2:
                System.out.println("Função indisponível no momento ");
                break;
        }

    }

    public String getSetor() {
        return setor;
    }

    public void setSetor(String setor) {
        this.setor = setor;
    }

    public boolean isTrabalhando() {
        return trabalhando;
    }

    public void setTrabalhando(boolean trabalhando) {
        this.trabalhando = trabalhando;
    }
}
