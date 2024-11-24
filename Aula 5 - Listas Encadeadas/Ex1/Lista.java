public class Lista {
    private No cabeca = new No();
    private No cauda = cabeca;
    private No elemento;

    private int tamanho = 0;

    public void addInicio(Pessoa p) {
        elemento = new No(p, null, null);

        if(tamanho == 0) {
            cabeca.proximo = elemento;
            elemento.anterior = cabeca;
            elemento.proximo = cauda;
            cauda.anterior = elemento;
        } else {
            elemento.proximo = cabeca.proximo;
            elemento.anterior = cabeca;
            cabeca.proximo.anterior = elemento;
            cabeca.proximo = elemento;
        }
        tamanho++;
    }

    public void addFim(Pessoa p) {
        if(tamanho == 0)
            addInicio(p);
        else {
            elemento = new No(p, null, null);
            elemento.anterior = cauda.anterior;
            elemento.proximo = cauda;
            cauda.anterior.proximo = elemento;
            cauda.anterior = elemento;
            tamanho++;
        }
    }

    public void add(int pos, Pessoa p) {
        if(pos >= tamanho)
            addFim(p);
        else if(pos == 0)
            addInicio(p);
        else {
            elemento = new No(p, null, null);
            No el = cabeca.proximo;
            for(int i = 1; i < pos; ++i)
                el = el.proximo;

            elemento.proximo = el.proximo;
            elemento.anterior = el;
            el.proximo.anterior = elemento;
            el.proximo = elemento;
            tamanho++;
        }
    }

    public void removeInicio() throws Exception {
        if(tamanho == 0)
            throw new Exception("Lista vazia");
        else {
            cabeca.proximo = cabeca.proximo.proximo;
            cabeca.proximo.anterior = cabeca;
            tamanho--;
            if(tamanho == 0)
                cauda = null;
        }
    }

    public void removeFim() throws Exception {
        if(tamanho == 0)
            throw new Exception("Lista vazia");
        if(tamanho == 1)
            removeInicio();
        else {
            cauda.anterior.anterior.proximo = cauda;
            cauda.anterior = cauda.anterior.anterior;
            tamanho--;
        }
    }

    public void remove(int pos) throws Exception {
        if(tamanho == 0)
            throw new Exception("Lista vazia");
        if(pos >= tamanho)
            throw new Exception("Posição inválida");
        if(pos == 0)
            removeInicio();
        else if(pos == tamanho - 1)
            removeFim();
        else {
            No el = cabeca.proximo;

            for(int i = 1; i < pos; ++i)
                el = el.proximo;

            el.proximo.proximo.anterior = el;
            el.proximo = el.proximo.proximo;
            tamanho--;
        }
    }

    public void print() {
        No el = cabeca.proximo;

        while(el != cauda) {
            System.out.println("Nome: " + el.elemento.nome);
            System.out.println("Idade: " + el.elemento.idade);

            el = el.proximo;
        }
    }

    public int tamanho() {
        return tamanho;
    }

}
