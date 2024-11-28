public class Lista {
    private int tamanho = 50;
    private Candidato[] A;
    private int ultimo = 0;
    private int codigo = 0;

    public Lista() {
        A = new Candidato[tamanho];
    }

    public void add(String nome, float nota) throws Exception {
        if(isFull())
            throw new Exception("Vetor cheio.");
        else {
            Candidato elemento = new Candidato(codigo, nome, nota);

            A[ultimo] = elemento;

            ultimo++;
            codigo++;
        }
    }

    public Candidato[] search(String nome) throws Exception {
        if(isEmpty())
            throw new Exception("Não há candidatos cadastrados.");
        else {
            Candidato[] vet = new Candidato[ultimo];
            int control = 0;
            boolean found = false;

            for(int i = 0; i < ultimo; ++i)
                if(A[i].getNome().equals(nome)) {
                    vet[control++] = A[i];
                    found = true;
                }

            if(!found) {
                throw new Exception("Não foi encontrado nenhum candidato chamado " + nome);
            } else {
                Candidato[] vet1 = new Candidato[control];
    
                for(int i = 0; i < control; ++i)
                    vet1[i] = vet[i];

                return vet1;

            }

        }
    }

    public void remove(int inscricao) throws Exception {
        if(isEmpty())
            throw new Exception("Não há candidatos cadastrados.");
        else {
            int search = 0;
            boolean found = false;
            for(int i = 0; i < ultimo; ++i)
                if(A[i].getInscricao() == inscricao) {
                    search = i;
                    found = true;
                }

            if(!found)
                throw new Exception("Candidato não encontrado.");
            else {
                for(int j = search; j < ultimo - 1; ++j)
                    A[j] = A[j + 1];
                
                ultimo--;
            }
        }
    }

    public void print() throws Exception {
        if(isEmpty())
            throw new Exception("Não há cadastrados cadastrados.");
        else {
            for(int i = 0; i < ultimo; ++i) {
                System.out.println("Inscrição: " + A[i].getInscricao() + "  |  Nome: " + A[i].getNome() + "  |  Nota: " + A[i].getNota());
            }
        }
    }

    public boolean isFull() {
        return ultimo == tamanho;
    }

    public boolean isEmpty() {
        return ultimo == 0;
    }
}
