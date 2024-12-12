public class Pilha {
    private int tamanho = 0;
    private No controle;

    public void doIt(int count) throws Exception {
        if(count <= 0)
            throw new Exception("Digite um número maior que 0.");
        else {

            for(int i = 1; i <= count; ++i) {
                No elemento;
                if(i == 1 || i == 2) {
                    elemento = new No(null, 1);
                } else {
                    int newElement = controle.elemento + controle.proximo.elemento;
                    elemento = new No(controle, newElement);
                }
                controle = elemento;

                tamanho++;
            }
        }
    }

    public int[] print() throws Exception {
        if(tamanho == 0)
            throw new Exception("Pilha vazia.");
        else {
            int[] array = new int[tamanho];
            No el = controle.proximo;
    
            for(int i = 0; i < tamanho; ++i) {
                array[i] = el.elemento;
                el = el.proximo;
            }
            return array;
        }
    }
}