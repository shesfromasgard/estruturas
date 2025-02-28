public class No {
    public Aluno elemento;
    public No esquerda;
    public No direita;

    public No(Aluno elemento) {
        this.elemento = elemento;
        this.esquerda = null;
        this.direita = null;
    }

    public No() {
        this.elemento = null;
        this.esquerda = null;
        this.direita = null;
    }
}
