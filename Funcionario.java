import java.util.Scanner;

public class Funcionario extends Pessoa {

    Scanner scanner = new Scanner(System.in);


    Funcionario(String nome, String idade, String sexo) {
        super(nome, idade, sexo);
    }


    Funcionario(){

    }
    int tempoDeContribuicao;
    int outraOpcao;
    int aumento;
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

    public void receberAumento() {
      Funcionario funcionario = new Funcionario();

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

               funcionario.condicoesParaReceberAumento();

            } else {

               funcionario.tempoDeContribuicaoDiferente();

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
            }else {
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

    public void ControleDasOpcoesDoFuncionario(int opcaoDeFuncionario) {

        switch (opcaoDeFuncionario) {

            case 1:
                Funcionario funcionario = new Funcionario();
                funcionario.mudarFuncao();
                break;

            case 2:
                funcionario = new Funcionario();
                funcionario.receberAumento();
                break;
        }

    }
}
