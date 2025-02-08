public class HashTable {
    public static final int M = 13;
    private Livro[] tabela;
    public HashTable(){
        tabela = new Livro[M];
    }
    private int hash (String chave){
        int h = 0;
        for (int i = 0; i < chave.length(); ++i)
            h = (31 * h + chave.charAt(i)) % M;
        return h;
    }
    public Livro get(String chave){
        int hash = hash(chave);
        int salto;

        for(salto = 0; salto < tabela.length; ++salto) {
            hash = (hash(chave) + salto) % tabela.length;

            if(tabela[hash] != null && tabela[hash].getISBN().equals(chave))
                return tabela[hash];
        }

        return null;
    }

    public void put(Livro l) throws Exception {
        int salto;
        int hash;

        for(salto = 0; salto < tabela.length; ++salto) {
            hash = (hash(l.getISBN()) + salto) % tabela.length;
            if((tabela[hash] == null) || tabela[hash].getISBN().equals(l.getISBN())) {
                tabela[hash] = l;
                break;
            }
        }

        if(salto == tabela.length)
            throw new Exception("Não há espaço disponível");
    }

    public Livro remove(String chave) {
        int hash = hash(chave);
        int salto;

        for(salto = 0; salto < tabela.length; ++salto) {
            hash = (hash(chave) + salto) % tabela.length;
            Livro tmp;

            if(tabela[hash] != null && tabela[hash].getISBN().equals(chave)) {
                tmp = tabela[hash];
                tabela[hash] = null;
                return tmp;
            }
        }

        return null;
    }
    public void status(){
        for (int i = 0; i < M; ++i){
            if (tabela[i]!=null)
                System.out.println("Ocupado " + i);
            else
                System.out.println("Não ocupado " + i);
        }
    }
}
