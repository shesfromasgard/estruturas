public class Back {
    private No root = null;

    private void add(No no, int matricula, String nome, String curso) {
        if(root == null)
            root = new No(new Aluno(matricula, nome, curso));
        else
            if(matricula < no.elemento.matricula)
                if(no.esquerda == null)
                    no.esquerda = new No(new Aluno(matricula, nome, curso));
                else
                    add(no.esquerda, matricula, nome, curso);
            else
                if(no.direita == null)
                    no.direita = new No(new Aluno(matricula, nome, curso));
                else
                    add(no.direita, matricula, nome, curso);
    }

    public void add(int matricula, String nome, String curso) {
        add(root, matricula, nome, curso);
    }

    private No remove(No no, int matricula) throws Exception {
        boolean ajuste = false;
        if(root == null)
            throw new Exception("Árvore vazia.");
        if(no == null)
            throw new Exception("Valor não encontrado");
        else {
            if(matricula < no.elemento.matricula)
                no.esquerda = remove(no.esquerda, matricula);
            else if(matricula > no.elemento.matricula)
                no.direita = remove(no.direita, matricula);
            else {
                if(no.direita != null && no.esquerda != null) {
                    no.elemento.matricula = min(no.direita).elemento.matricula;
                    no.direita = removeMin(no.direita);
                } else {
                    if(no ==  root)
                        ajuste = true;

                    no = (no.esquerda != null) ? no.esquerda : no.direita;

                    if(ajuste)
                        root = no;
                }
            }

            return no;
        }
    }

    public Aluno remove(int matricula) throws Exception {
        return remove(root, matricula).elemento;
    }

    private No min(No no) throws Exception {
        if(no == null)
            throw new Exception("Raiz nula.");
        if(no.esquerda != null)
            return min(no.esquerda);
        else
            return no;
    }

    private No removeMin(No no) throws Exception {
        if(no == null)
            throw new Exception("Raiz nula.");
        else
            if(no.esquerda != null) {
                no.esquerda = removeMin(no.esquerda);
                return no;
            } else 
                return no.direita;
    }

    private Aluno max(No no) throws Exception {
        if(root == null)
            throw new Exception("Árvore nula.");
        else
            if(no.direita != null)
                max(no.direita);
            else
                return no.elemento;
                
        return no.elemento;
    }

    public Aluno max() throws Exception {
        return max(root);
    }

    private boolean search(No no, int matricula) throws Exception {
        if (no == null) {
            return false;
        }
    
        if (matricula < no.elemento.matricula) {
            return search(no.esquerda, matricula);
        } else if (matricula > no.elemento.matricula) {
            return search(no.direita, matricula);
        } else {
            return true;
        }
    }
    
    public boolean search(int matricula) throws Exception {
        if (root == null) {
            throw new Exception("Árvore vazia.");
        }
        return search(root, matricula);
    }
    

    public void preOrdem() {
        preOrdem(root);
    }

    private void preOrdem(No no) {
        if(no != null) {
            System.out.println(no.elemento.matricula);
            preOrdem(no.esquerda);
            preOrdem(no.direita);
        }
    }
}
