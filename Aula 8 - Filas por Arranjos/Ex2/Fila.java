public class Fila {
    private static final int MAX_SIZE = 1500;
    private int tamanho = 0;
    private int inicio = 0;
    private int fim = 0;
    private Processo array[] = new Processo[MAX_SIZE];

    public void addHandler(Processo p) throws Exception {
        if (isEmpty()) {
            add(p);
        } else if (search(p.id) != -1) {
            throw new Exception("Esse processo já existe.");
        } else {
            add(p);
        }
    }

    public void add(Processo p) throws Exception {
        if (isFull()) {
            throw new Exception("Fila cheia.");
        } else {
            array[fim] = p;
            fim = (fim + 1) % MAX_SIZE;
            tamanho++;
        }
    }

    public Processo remove() throws Exception {
        if (isEmpty()) {
            throw new Exception("Fila vazia.");
        } else {
            Processo tmp = array[inicio];
            inicio = (inicio + 1) % MAX_SIZE;
            tamanho--;
            return tmp;
        }
    }

    public Processo[] print() throws Exception {
        if (isEmpty()) {
            throw new Exception("Fila vazia.");
        } else {
            Processo tmp_array[] = new Processo[tamanho];
            int index = inicio;
            for (int i = 0; i < tamanho; ++i) {
                tmp_array[i] = array[index];
                index = (index + 1) % MAX_SIZE;
            }
            return tmp_array;
        }
    }

    public int search(int id) throws Exception {
        if (isEmpty()) {
            throw new Exception("Fila vazia.");
        } else {
            int index = inicio;
            for (int i = 0; i < tamanho; ++i) {
                if (array[index].id == id) {
                    return i + 1;
                }
                index = (index + 1) % MAX_SIZE;
            }
            return -1;
        }
    }

    public void clear() {
        inicio = 0;
        fim = 0;
        tamanho = 0;
    }

    public boolean isEmpty() {
        return tamanho == 0;
    }

    public boolean isFull() {
        return tamanho == MAX_SIZE;
    }
}