public class No {
    public int element;
    public No esquerda;
    public No direita;

    public No(int element) {
        this.element = element;
        this.esquerda = null;
        this.direita = null;
    }

    public No() {
        this.esquerda = null;
        this.direita = null;
    }
}