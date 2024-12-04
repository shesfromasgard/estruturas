public class No {
    public Veiculo elemento;
    public No proximo;
    public No anterior;

    public No(Veiculo elemento, No proximo, No anterior) {
        this.elemento = elemento;
        this.proximo = proximo;
        this.anterior = anterior;
    }

    public No() {
        
    }
}
