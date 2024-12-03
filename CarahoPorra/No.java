public class No {
    public No proximo;
    public No anterior;
    public Cliente elemento;

    public No (Cliente elemento, No anterior, No proximo) {
        proximo = this.proximo;
        anterior = this.anterior;
        elemento = this.elemento;
    }

    public No () {
        
    }
}