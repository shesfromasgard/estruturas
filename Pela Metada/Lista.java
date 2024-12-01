public class Lista {
    No cabeca = new No(null, null);
    No cauda = cabeca;
    int tamanho = 0;
    //DRY(Don't Repeat Yourself = Não Se Repita)

    public void addInicio(Pessoa p) {
        No el = new No(p, null);
        if(tamanho == 0) {
            cabeca.proximo = el;
            cauda = el;
        } else {
            el.proximo = cabeca.proximo;
            cabeca.proximo = el;
        }
        tamanho++;
    }

    public void addFim(Pessoa p) {
        if(tamanho == 0)
            addInicio(p);
        else {
            No el = new No(p, null);
            cauda.proximo = el;
            cauda = el;
            tamanho++;
        }
    }

    public void addMeio(Pessoa p, int posicao) {
        if(tamanho == 0 || posicao == 0) 
            addInicio(p);
        else if(posicao > tamanho)
            addFim(p);
        else {
            No el = new No(p, null);
            No dummy = cabeca.proximo;

            for(int i = 1; i < pos; ++i)
                dummy = dummy.proximo;

            dummy.proximo = el;
            tamanho++;
        }
    }

    public void removeInicio() throws Exception {
        if(tamanho == 0)
            throws new Exception("Lista vazia.");
        else {
            cabeca.proximo = cabeca.proximo.proximo;
            tamanho--;
        }
    }

    public void removeFim() throws Exception {
        if(tamanho == 0)
            throw new Exception("Lista vazia.");
        else {
            No dummy = cabeca.proximo;

            for(int i = 1; i < tamanho - 1; ++i)
                dummy = dummy.proximo;

            dummy.proximo = null;
            cauda = dummy;
            tamanho--;
        }
    }
}