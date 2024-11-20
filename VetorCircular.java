public class VetorCircular {
    static int inicio = 0;
    static int fim = 0;
    static int tamanho = 0;
    //fim = próxima posição vazia
    static Integer[] vet = new Integer[10];

    public static boolean isFull() {
        return tamanho == vet.length;
    }

    public static boolean isEmpty() {
        return tamanho == 0;
    }

    public static void addFim(int elemento) throws Exception {

        if(isFull())
            throw new Exception("Vetor cheio");
        else {
            fim++;
            if(fim == vet.length)
                fim = 0;
            vet[fim] = elemento;
            tamanho++;
        }

    }

    public static void addInicio(int elemento) throws Exception {

        if(isFull())
            throw new Exception("Vetor cheio");
        else {
            inicio--;
            if(inicio < 0)
                inicio = vet.length - 1;
            vet[inicio] = elemento;
            tamanho++;
        }

    }

    public static int deleteInicio() throws Exception {
        if(isEmpty()) 
            throw new Exception("Vetor vazio");
        else {
            int aux = vet[inicio];
            inicio++;
            if(inicio == vet.length)
                inicio = 0;
            tamanho--;
            return aux;
        }
    }

    public static int deleteFim() throws Exception {
        if(isEmpty())
            throw new Exception("Vetor vazio");
        else {
            fim--;
            if(fim < 0)
                fim = vet.length - 1;
            int aux = vet[fim];
            tamanho--;
            return aux;
        }
    }

    public static void print() throws Exception {
        if(isEmpty()) 
            throw new Exception("Vetor vazio");
        else {
            int contagem = inicio;
            for(int i = 0; i < tamanho; ++i) {
                System.out.println(vet[contagem]);
                contagem++;
                if(contagem == vet.length)
                    contagem = 0;
            }
        }
    }

    public static void printfodase() throws Exception {
        for(int i = 0; i < vet.length; ++i)
            System.out.println(vet[i]);
    }

    public static void main(String[] args) {
        try {
            printfodase();
            print();
        } catch(Exception ex) {
            System.out.println(ex.getMessage());
        }
    }
}
