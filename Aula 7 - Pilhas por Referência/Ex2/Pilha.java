public class Pilha {
    private int tamanho = 0;
    private No controle;

    public void doIt(int count) throws Exception {
        if (count <= 0)
            throw new Exception("Digite um número maior que 0.");

        for (int i = 1; i <= count; ++i) {
            No elemento;
            if (i == 1 || i == 2) {
                elemento = new No(controle, 1);
            } else {
                int newElement = controle.elemento + controle.proximo.elemento;
                elemento = new No(controle, newElement);
            }
            controle = elemento;
            tamanho++;
        }
    }

    public int[] print() throws Exception {
        if (tamanho == 0)
            throw new Exception("Pilha vazia.");

        int[] array = new int[tamanho];
        No atual = controle;
        int index = 0;

        while (atual != null) {
            array[index++] = atual.elemento;
            atual = atual.proximo;
        }

        return array;
    }
}