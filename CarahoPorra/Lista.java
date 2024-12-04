

public class Lista {
    private No controle;
    int tamanho = 0;

    public Lista() {
        controle = new No(null, null, null);
    }

    public void addInicio(Cliente c) {
        No elemento = new No(c, null, null);
        if(tamanho == 0) {
            controle.proximo = elemento;
            elemento.anterior = controle;
            controle.anterior = elemento;
        } else {
            elemento.proximo = controle.proximo;
            elemento.anterior = controle;
            controle.proximo.anterior = elemento;
            controle.proximo = elemento;
        }
        tamanho++;
    }

    public void addFim(Cliente c) {
        No elemento = new No(c, null, null);

        elemento.anterior = controle.anterior;
        controle.anterior.proximo = elemento;
        controle.anterior = elemento;

        tamanho++;
    }

    public void addMeio(Cliente c, int pos) {
        No elemento = new No(c, null, null);
        No el = controle.proximo;

        for(int i = 1; i < pos; ++i)
            el = el.proximo;

        elemento.proximo = el.proximo;
        elemento.anterior = el;
        el.proximo.anterior = elemento;
        el.proximo = elemento;

        tamanho++;
    }

    public void add(int codigo, String nome, long telefone) throws Exception {
        Cliente elemento = new Cliente(codigo, nome, telefone);
        if(tamanho == 0) {
            addInicio(elemento);
        } else {
            int pos = posicao(codigo);
            if(pos == 0)
                addInicio(elemento);
            else if(pos == tamanho)
                addFim(elemento);
            else
                addMeio(elemento, pos);
        }
    }

    public int posicao(int codigo) {
        No el = controle.anterior;
        int pos = tamanho;
       
        while(el.elemento.codigo > codigo ) {
            el = el.anterior;
            pos--;
            if(el==controle){
                return pos;
            }
        }
        return pos;
    }

    public void print() throws Exception {
        No el = controle;
        while (el.proximo!=null){ 
            System.out.println("Código: " + el.proximo.elemento.codigo);
            System.out.println("Nome: " + el.proximo.elemento.nome);
            System.out.println("Telefone: " + el.proximo.elemento.telefone);

            el = el.proximo;
        }
    }
}