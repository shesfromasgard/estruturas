public class BackEnd {

    int array[];
    int remaining[];
    int numero = 0;
    int support = 0;
    int tamanho = 0;
    int fim = 0;
    int inicio = 0;
    int tmp;

    public void start(int num) {
        numero = num;
        array = new int[numero];
        remaining = new int[numero - 1];
        inicio = 0;
        fim = numero - 1;

        enfileirar();

        tmp = metodo();

        support = 0;

    }

    public int number() {
        return tmp;
    }

    public int[] vetor() {
        return remaining;
    }

    public void enfileirar() {
        int blah = 1;
        for(int i = 0; i < numero; ++i) {
            array[i] = blah++;
        }

        tamanho = numero;
    }

    public int metodo() {
        while(true) {
            if(tamanho == 1)
                return array[inicio];
            remaining[support++] = array[inicio++];
            tamanho--;
            if(inicio >= numero)
                inicio = 0;

            if(tamanho == 1)
                return array[inicio];

            fim++;
            if(fim >= numero)
                fim = 0;

            array[fim] = array[inicio++];
            
            if(inicio >= numero)
                inicio = 0;
        }
    }
    
}
