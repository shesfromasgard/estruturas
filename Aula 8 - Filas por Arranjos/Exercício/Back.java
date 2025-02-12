public class Back {
    private No cabeca = new No();
    private No cauda;
    private int tamanho = 0;
    public void enfileirar(Processo p) {
        No tmp = new No(p, null);
        if(tamanho == 0) {
            cabeca.proximo = tmp;
            cauda = tmp;
        } else {
            cauda.proximo = tmp;
            cauda = tmp;
        }
        tamanho++;
    }
    public Processo desenfileirar() throws Exception {
        if(isEmpty())
            throw new Exception("Fila vazia.");
        else {
            No retorno = cauda;
            No tmp;
            No sla = cabeca.proximo;
            do { 
                tmp = sla;
                sla = sla.proximo;
            } while (sla.proximo != null);

            tmp.proximo = null;
            cauda = tmp;
            tamanho--;
            return retorno.elemento;
        }
    }
    public Processo search(int id) {
        if(isEmpty())
            return null;
        else {
            No tmp = cabeca.proximo;
            while(tmp != null) {
                if(tmp.elemento.id == id)
                    return tmp.elemento;
                tmp = tmp.proximo;
            }
            return null;
        }
    }
    public Processo[] print() {
        Processo array[] = new Processo[tamanho];
        No tmp = cabeca.proximo;
        for(int i = 0; i < tamanho; ++i) {
            array[i] = tmp.elemento;
            tmp = tmp.proximo;
        }
        return array;
    }
    public int getTamanho() {
        return tamanho;
    }
    public boolean isEmpty() {
        return tamanho == 0;
    }
}