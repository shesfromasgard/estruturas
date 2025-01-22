public class No {
    public No proximo;
    public Processo elemento;

    public No(No proximo, Processo elemento) {
        this.proximo = proximo;
        this.elemento = elemento;
    }

    public No() {
        this.proximo = null;
        this.elemento = null;
    }
}
