public class ListaFilme {
    private Filme[] F;
    private int ultimo = 0;

    public ListaFilme() {
        F = new Filme[10];
    }

    public void add(int p, Filme f) throws Exception {
        if(ultimo == F.length)
            throw new Exception("Não há espaço disponível.");
        if(p > ultimo)
            p = ultimo;
        if(p < ultimo)
            for(int i = ultimo; i > p; --i)
                F[i] = F[i - 1];

        F[p] = f;
        ultimo++;
    }

    public Filme get(int p) throws Exception {
        if(p >= ultimo)
            throw new Exception("Não existe este elemento.");
        return F[p];
    }
}
