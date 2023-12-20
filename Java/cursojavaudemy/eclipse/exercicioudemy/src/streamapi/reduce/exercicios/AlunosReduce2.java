package streamapi.reduce.exercicios;

public class AlunosReduce2 {
    private String nome;
    private double nota;
    private Boolean isAprovado;


    public AlunosReduce2(String nome, double nota) {
        this.nome = nome;
        this.nota = nota;
        condParaRecuperacao(nota);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getNota() {
        return nota;
    }

    public void setNota(int nota) {
        this.nota = nota;
    }

    public Boolean getAprovado() {
        return isAprovado;
    }

    public void setAprovado(Boolean aprovado) {
        isAprovado = aprovado;
    }

    private void condParaRecuperacao(double nota) {
        setAprovado(nota >= 6);
    }
}
