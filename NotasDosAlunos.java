import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class NotasDosAlunos {
    Scanner scanner = new Scanner(System.in);

    private List<NotasDosAlunos> listaDeNotas = new ArrayList<NotasDosAlunos>();

    private String nomeDoAluno;

    private String matrigulaDoAluno;

    private double primeiraNota;

    private double segundaNota;

    private double terceiraNota;

    private double quartaNota;

    private double media;

    NotasDosAlunos(String nome, String matricula, double primeiraNota, double segundaNota, double terceiraNota, double quartaNota) {
        this.nomeDoAluno = nome;
        this.matrigulaDoAluno = matricula;
        this.primeiraNota = primeiraNota;
        this.segundaNota = segundaNota;
        this.terceiraNota = terceiraNota;
        this.quartaNota = quartaNota;

    }

    NotasDosAlunos() {

    }

    public void lancarNovasNotas() {

        System.out.println("Preencha os dados necessários");
        System.out.println();

        System.out.println("Qual o nome do aluno(a)?");
        String nomeDoAluno = scanner.next();

        System.out.println("Qual matrícula aluno(a)?");
        String matriculaDoAluno = scanner.nextLine();

        scanner.nextLine();

        System.out.println("Qual a primeira nota do aluno(a)?");
        double primeiraNota = scanner.nextDouble();

        System.out.println("Qual a segunda nota do aluno(a)?");
        double segundaNota = scanner.nextDouble();

        System.out.println("Qual a terceita nota do aluno(a)?");
        double terceiraNota = scanner.nextDouble();

        System.out.println("Qual a quarta nota do aluno(a)?");
        double quartaNota = scanner.nextDouble();

        media = (primeiraNota + segundaNota + terceiraNota + quartaNota);

        System.out.println();
        this.setNomeDoAluno(nomeDoAluno);
        this.setMatrigulaDoAluno(matriculaDoAluno);
        this.setPrimeiraNota(primeiraNota);
        this.setSegundaNota(segundaNota);
        this.setTerceiraNota(terceiraNota);
        this.setQuartaNota(quartaNota);

        System.out.println("Notas lançadas com sucesso!");

        System.out.println();
        if(media < 60) {
            System.out.println("Aluno(a) em recuperação");
        }else{
            System.out.println("Aluno(a) eaprovado");
        }
        System.out.println();
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

    public String getMatrigulaDoAluno() {
        return matrigulaDoAluno;
    }

    public void setMatrigulaDoAluno(String matrigulaDoAluno) {
        this.matrigulaDoAluno = matrigulaDoAluno;
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
                + "\n Matrícula: " + this.getNomeDoAluno()
                + "\n Primeira nota: " + this.getPrimeiraNota() + " / 20"
                + "\n Segunda nota: " + this.getSegundaNota() + " / 20"
                + "\n Terceira nota: " + this.getTerceiraNota() + " / 30"
                + "\n Quarta nota: " + this.getQuartaNota() + " / 30"
                + "\n Média: " + this.getMedia() + " / 100"
                + "\n ";
    }

}