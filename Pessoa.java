import java.util.ArrayList;
import java.util.List;

public class Pessoa {

    private String nome;
    private String idade;
    private String sexo;

    private List<Pessoa> pessoa = new ArrayList<Pessoa>();

    Pessoa(String nome, String idade, String sexo) {
        this.nome = nome;
        this.idade = idade;
        this.sexo = sexo;
    }

    public Pessoa() {

    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getIdade() {
        return idade;
    }

    public void setIdade(String idade) {
        this.idade = idade;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

}