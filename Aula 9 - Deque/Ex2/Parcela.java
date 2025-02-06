public class Parcela {
    public int mes;
    public float valor;
    public double juros;

    public Parcela(int mes, float valor) {
        this.mes = mes;
        this.valor = valor;
        this.juros = (valor * 0.01) * mes;
    }

    public Parcela() {

    }
}