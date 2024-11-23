public class ListaFilmes {
    private int tam = 50;
    private Filme[] A;
    private int ultimo = 0;
    private int codigo = 0;

    public ListaFilmes() {
        A = new Filme[tam];
    }

    public void add(String nome, String genero) throws Exception {
        if(isFull())
            throw new Exception("Vetor cheio, redimencione o vetor");
        else {
            Filme elemento = new Filme(codigo++, nome, genero);
            int i;
            for(i = ultimo; i > elemento.codigo; --i)
                A[i] = A[i - 1];

            A[i] = elemento;
            ultimo++;
        }
    }

    public void remove(int cod) throws Exception {
        if(isEmpty())
            throw new Exception("Vetor vazio.");
        else {
            boolean found = false;
            int i;
            for(i = 0; i < ultimo; ++i)
                if(A[i].codigo == cod) {
                    found = true;
                    break;
                }

            if(found == false)
                throw new Exception("Elemento não existe no vetor.");
            else {
                for(int j = i; j < ultimo - 1; ++j)
                    A[j] = A[j + 1];

                ultimo--;
            }
        }
    }

    public void rearrange(int size) throws Exception {
        if(size <= A.length)
            throw new Exception("Tamanho novo informado é menor que a quantidade ");
        else {
            Filme array[] = new Filme[size];

            for(int i = 0; i < ultimo; ++i)
                array[i] = A[i];
        }
    }

    public Filme search(String elemento) throws Exception {
        if(isEmpty())
            throw new Exception("Vetor vazio.");
        else {
            for(int i = 0; i < ultimo; ++i) 
                if(A[i].nome.equals(elemento))
                    return A[i];

            throw new Exception("Filme não encontrado");
        }
    }

    public boolean isEmpty() {
        return ultimo == 0;
    }

    public boolean isFull() {
        return ultimo == A.length;
    }


}
