public class App {
    static Node raiz = null;
    public static void inserir (Node no, int valor){
        if (no != null){
            if (valor < no.valor){
                if (no.esquerda != null)
                    inserir(no.esquerda, valor);
                else
                    no.esquerda = new Node(valor);
            } else {
                if (no.direita != null)
                    inserir(no.direita, valor);
                else
                    no.direita = new Node(valor);
            }
        } else {
            raiz = new Node(valor);
        }
    }
    public static void print (Node no){
        if (no!=null){
            print(no.esquerda);
            System.out.print(no + " ");
            print(no.direita);
        }
    }
    public static void chama (int vet[]) throws Exception {
        if(vet.length == 0) 
            throw new Exception("Vetor vazio.");
        else
            for(int i = 0; i < vet.length; ++i)
                inserir(raiz, vet[i]);
    }
    public static void main(String[] args) {
        int[] vet = {12, 5, 8, 21, 3, 17, 14, 1, 20, 7, 19, 6, 30, 10, 25, 9, 18, 22, 13, 16, 4, 2, 11, 15, 29, 27, 28, 24, 26, 23};

        try {
            chama(vet);
            print(raiz);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
