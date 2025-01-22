public class Fila {
    private static final int MAX_SIZE = 50;
    private Senha[] array = new Senha[MAX_SIZE];
    private int tamanho = 0;
    private int inicio = 0;
    private int codigo = 0;

    public void add(String nome) throws Exception {
        Senha s = new Senha(nome, ++codigo);
        if(isFull())
            throw new Exception("Fila cheia");
        else
            array[tamanho++] = s;
    }

    public Senha remove() throws Exception {
        if(isEmpty())
            throw new Exception("Fila vazia.");
        else if(inicio == tamanho)
            throw new Exception("Todos os pacientes foram chamados.");
        else
            return array[inicio++];
    }

    public boolean isEmpty() {
        return inicio == tamanho;
    }
    public boolean isFull() {
        return tamanho == MAX_SIZE;
    }
    public int getTamanho() {
        return tamanho;
    }
}
