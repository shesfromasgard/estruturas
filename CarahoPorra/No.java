public class No {
    public No proximo;
    public No anterior;
    public Cliente elemento;

    public No (Cliente elemento, No anterior, No proximo) {
        this.proximo=proximo;
        this.anterior=anterior;
        this.elemento=elemento ;
    }

    public No () {
        
    }
}