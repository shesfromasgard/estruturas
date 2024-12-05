public class Lista {
    private No controle;
    private int tamanho = 0;

    public Lista() {
        controle = new No(null, null, null);
    }

    
    public void addInicio(Cidade c) {
        No elemento = new No(c, null, null);
        
        if(tamanho == 0) {
            elemento.proximo = controle;
            elemento.anterior = controle;
            controle.proximo = elemento;
            controle.anterior = elemento;
        } else {
            elemento.proximo = controle.proximo;
            elemento.anterior = controle;
            controle.proximo.anterior = elemento;
            controle.proximo = elemento;
        }
        tamanho++;
    }
    
    public void addFim(Cidade c) {
        No elemento = new No(c, null, null);
        
        elemento.anterior = controle.anterior;
        elemento.proximo = controle;
        controle.anterior.proximo = elemento;
        controle.anterior = elemento;
        
        tamanho++;
    }
    
    public void addMeio(Cidade c, int pos) {
        No elemento = new No(c, null, null);
        No el = controle.proximo;
        
        for(int i  = 1; i < pos; ++i) {
            el = el.proximo;
        }
        
        elemento.proximo = el.proximo;
        elemento.anterior = el;
        el.proximo.anterior = elemento;
        el.proximo = elemento;
        
        tamanho++;
    }
    
    public void add(Cidade c) throws Exception {
        if(tamanho == 0) {
            addInicio(c);
        } else {
            if(search(c.nome, c.pais))
                throw new Exception("Esta cidade já está cadastrada.");
            else {
                int posicao = posicao(c.nota);
    
                if(posicao == 0)
                    addInicio(c);
                else if(posicao == tamanho)
                    addFim(c);
                else
                    addMeio(c, posicao);
            }
        }
    }
    public int posicao(float codigo) {
        No el = controle;
        int posicao = 0;
    
        while(el.proximo != controle && codigo <= el.proximo.elemento.nota) {
            el = el.proximo;
            posicao++;
        }

        return posicao;
    }

    public boolean search(String nome, String pais) {
        No el = controle;

        while(el.proximo != controle) {
            if(el.proximo.elemento.nome.equals(nome) && el.proximo.elemento.pais.equals(pais)) {
                return true;
            }
        }

        return false;
    }

    public void remove(String nome, String pais) throws Exception {
        if(tamanho == 0)
            throw new Exception("Não há cidades cadastradas.");
        else {
            if(!search(nome, pais))
                throw new Exception("A cidade " + nome + " - " + pais + " não está cadastrada.");
            else {
                No el = controle;

                while(el.proximo != controle) {
                    if(el.proximo.elemento.nome.equals(nome) && el.proximo.elemento.pais.equals(pais)) {
                        el.proximo.proximo.anterior = el;
                        el.proximo = el.proximo.proximo;

                        tamanho--;
                        return;
                    }
                }
            }
        }
    }

    public Cidade exibir(int posicao) throws Exception {
        if(tamanho == 0)
            throw new Exception("Não há cidades cadastradas.");
        else {
            No el = controle.proximo;

            for(int i  = 0; i < posicao; ++i) {
                el = el.proximo;
            }

            return el.elemento;

        }
    }

    public int tamanho() {
        return tamanho;
    }
}
