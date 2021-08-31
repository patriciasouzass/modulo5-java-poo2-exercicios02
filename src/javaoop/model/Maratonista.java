package javaoop.model;

public class Maratonista {

    private String rg, nome, sobrenome, telefone, numEmergencia, grupoSanguineo;
    private int idade;
    double valorInscricao;

    public Maratonista(String rg, String nome, String sobrenome, String telefone, String numEmergencia, String grupoSanguineo, int idade) {
        this.rg = rg;
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.telefone = telefone;
        this.numEmergencia = numEmergencia;
        this.grupoSanguineo = grupoSanguineo;
        this.idade = idade;
    }

    @Override
    public String toString() {
        return "Maratonista{" +
                "rg='" + rg + '\'' +
                ", nome='" + nome + '\'' +
                ", sobrenome='" + sobrenome + '\'' +
                ", telefone='" + telefone + '\'' +
                ", numEmergencia='" + numEmergencia + '\'' +
                ", grupoSanguineo='" + grupoSanguineo + '\'' +
                ", idade=" + idade +
                ", valorInscricao=" + valorInscricao +
                '}';
    }

    public String getRg() {
        return rg;
    }

    public String getNome() {
        return nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public String getTelefone() {
        return telefone;
    }

    public String getNumEmergencia() {
        return numEmergencia;
    }

    public String getGrupoSanguineo() {
        return grupoSanguineo;
    }

    public int getIdade() {
        return idade;
    }

    public double getValorInscricao() {
        return valorInscricao;
    }

    public void setValorInscricao(double valorInscricao) {
        this.valorInscricao = valorInscricao;
    }
}
