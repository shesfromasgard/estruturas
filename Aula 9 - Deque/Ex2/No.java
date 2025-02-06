public class No {
    public No proximo;
    public No anterior;
    public Parcela elemento;

    public No(No proximo, No anterior, Parcela elemento) {
        this.proximo = proximo;
        this.anterior = anterior;
        this.elemento = elemento;
    }
    
    public No() {
        this.proximo = null;
        this.anterior = null;
        this.elemento = null;
    }
    
}
