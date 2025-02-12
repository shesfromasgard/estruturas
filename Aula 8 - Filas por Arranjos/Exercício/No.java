public class No {
    public No proximo;
    public Processo elemento;

    public No(Processo elemento, No proximo) {
        this.elemento = elemento;
        this.proximo = proximo;
    }

    public No() {
        this.proximo = null;
        this.elemento = null;
    }
}
