public class No {
    public Cidade elemento;
    public No anterior;
    public No proximo;
    public No(Cidade elemento, No anterior, No proximo) {
        this.elemento = elemento;
        this.anterior = anterior;
        this.proximo = proximo;
    }

    public No() {
        
    }
}
