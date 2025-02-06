public class Back {
    private No control = new No();
    private int size = 0;
    private float divida = 0;
    private int numParcelas = 0;

    public void add(int parcelas, float montante) {
        for(int i = 0; i < parcelas; ++i) {
            No tmp = new No(null, null, new Parcela(i + 1, montante / parcelas));
            if(isEmpty()) {
                control.proximo = tmp;
                control.anterior = tmp;
                tmp.anterior = control;
                tmp.proximo = control;
            } else {
                tmp.anterior = control.anterior;
                tmp.proximo = control;
                control.anterior.proximo = tmp;
                control.anterior = tmp;
            }

            size++;
            divida = montante;
            numParcelas = parcelas;
        }
    }

    public Parcela removeFirst() throws Exception {
        if(isEmpty())
            throw new Exception("Não há parcelas disponíveis.");
        else {
            Parcela tmp = control.proximo.elemento;

            control.proximo.proximo.anterior = control;
            control.proximo = control.proximo.proximo;

            size--;

            divida -= divida / numParcelas;

            return tmp;
        }
    }

    public Parcela removeLast() throws Exception {
        if(isEmpty())
            throw new Exception("Não há parcelas disponíveis.");
        else {
            Parcela tmp = control.anterior.elemento;

            control.anterior.anterior.proximo = control;
            control.anterior = control.anterior.anterior;

            size--;

            divida -= divida / numParcelas;

            return tmp;
        }
    }

    public Parcela getFirst() throws Exception {
        if(isEmpty())
            throw new Exception("Vazio.");
        else
            return control.proximo.elemento;
    }

    public Parcela getLast() throws Exception {
        if(isEmpty())
            throw new Exception("Vazio.");
        else
            return control.anterior.elemento;
    }

    public float getDivida() {
        return divida;
    }

    public float calc(float montante, int parcelas) {
        float result = montante;

        for(int i = 1; i <= parcelas; ++i)
            result += (montante / parcelas) * (0.01 * i);

        return result;
    }

    public int getSize() {
        return size;
    }

    public boolean isEmpty() {
        return size == 0;
    }
}
