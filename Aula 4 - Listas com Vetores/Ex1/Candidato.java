public class Candidato {
    private int inscricao;
    private String nome;
    private float nota;

    public Candidato(int inscricao, String nome, float nota) {
        this.inscricao = inscricao;
        this.nome = nome;
        this.nota = nota;
    }

    public Candidato() {

    }

    public int getInscricao() {
        return inscricao;
    }

    public void setInscricao(int inscricao) {
        this.inscricao = inscricao;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public float getNota() {
        return nota;
    }

    public void setNota(float nota) {
        this.nota = nota;
    }

    
}