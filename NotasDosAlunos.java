import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class NotasDosAlunos {
    Scanner scanner = new Scanner(System.in);

    private List<NotasDosAlunos> listaDeNotas = new ArrayList<NotasDosAlunos>();
    private String nomeDoAluno;
    private String matriculaDoAluno;
    private double primeiraNota;
    private double segundaNota;
    private double terceiraNota;
    private double quartaNota;
    private double media;

    NotasDosAlunos() {

    }

    public void lancarNovasNotas() {
        double primeiraNota;
        double segundaNota;
        double terceiraNota;
        double quartaNota;

        System.out.println("Preencha os dados necessários");
        System.out.println();

        System.out.println("Qual o nome do aluno(a)?");
        String nomeDoAluno = scanner.nextLine();

        System.out.println("Qual matrícula aluno(a)?");
        String matriculaDoAluno = scanner.nextLine();

        do {

            System.out.println("Qual a primeira nota do aluno(a)?");
            primeiraNota = scanner.nextDouble();
            if (primeiraNota > 20) {
                System.out.println("Valor inválido! O valor dessa nota deve ser de até 20 pontos Por favor tente novamente!");
            }
        } while ( primeiraNota > 20);


        do {
            System.out.println("Qual a segunda nota do aluno(a)?");
            segundaNota = scanner.nextDouble();
            if (segundaNota > 20) {
                System.out.println("Valor inválido! O valor dessa nota deve ser de até 20 pontos Por favor tente novamente!");
            }
        } while (segundaNota > 20);


        do {
            System.out.println("Qual a terceita nota do aluno(a)?");
             terceiraNota = scanner.nextDouble();
            if (terceiraNota > 30) {

                System.out.println("Valor inválido! O valor dessa nota deve ser e de até 30 pontos Por favor tente novamente!");
            }
        } while (terceiraNota > 30);


        do {
            System.out.println("Qual a quarta nota do aluno(a)?");
             quartaNota = scanner.nextDouble();
            if (quartaNota > 30) {
                System.out.println("Valor inválido! O valor dessa nota deve ser de até 30 pontos Por favor tente novamente!");
            }
        } while (quartaNota > 30);

        media = (primeiraNota + segundaNota + terceiraNota + quartaNota);

        System.out.println();
        this.setNomeDoAluno(nomeDoAluno);
        this.setMatriculaDoAluno(matriculaDoAluno);
        this.setPrimeiraNota(primeiraNota);
        this.setSegundaNota(segundaNota);
        this.setTerceiraNota(terceiraNota);
        this.setQuartaNota(quartaNota);

        System.out.println("Notas lançadas com sucesso!");

    }


    public List<NotasDosAlunos> getListaDeNotas() {
        return listaDeNotas;
    }

    public void setListaDeNotas(List<NotasDosAlunos> listaDeNotas) {
        this.listaDeNotas = listaDeNotas;
    }

    public String getNomeDoAluno() {
        return nomeDoAluno;
    }

    public void setNomeDoAluno(String nomeDoAluno) {
        this.nomeDoAluno = nomeDoAluno;
    }

    public String getMatriculaDoAluno() {
        return matriculaDoAluno;
    }

    public void setMatriculaDoAluno(String matriculaDoAluno) {
        this.matriculaDoAluno = matriculaDoAluno;
    }

    public double getPrimeiraNota() {
        return primeiraNota;
    }

    public void setPrimeiraNota(double primeiraNota) {
        this.primeiraNota = primeiraNota;
    }

    public double getSegundaNota() {
        return segundaNota;
    }

    public void setSegundaNota(double segundaNota) {
        this.segundaNota = segundaNota;
    }

    public double getTerceiraNota() {
        return terceiraNota;
    }

    public void setTerceiraNota(double terceiraNota) {
        this.terceiraNota = terceiraNota;
    }

    public double getQuartaNota() {
        return quartaNota;
    }

    public void setQuartaNota(double quartaNota) {
        this.quartaNota = quartaNota;
    }

    public double getMedia() {
        return media;
    }

    public void setMedia(double media) {
        this.media = media;
    }

    @Override
    public String toString() {
        return "\n Nome: " + getNomeDoAluno()
                + "\n Matrícula: " + getMatriculaDoAluno()
                + "\n Primeira Nota: " + getPrimeiraNota()
                + "\n Segunda Nota:: " + getSegundaNota()
                + "\n Terceira Nota: " + getTerceiraNota()
                + "\n Quarta Nota: " + getQuartaNota()
                + "\n Média: " + getMedia()
                + "\n ";
    }


}