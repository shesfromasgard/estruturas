public class Back {
    private int tamanho = 0;
    private No control = new No('y', null);

    public void push(char elemento) {
        No p = new No(elemento, null);

        if(tamanho != 0) {
            p.proximo = control.proximo;
        } else{}

        control.proximo = p;

        tamanho++;
    }

    public char pop() throws Exception {
        if(isEmpty())
            throw new Exception("Empty");
        else {
            No tmp = control.proximo;

            control.proximo = control.proximo.proximo;
            tamanho--;
            return tmp.elemento;
        }
    }

    public char top() throws Exception {
        if(isEmpty())
            throw new Exception("Empty");
        else {
            return control.proximo.elemento;
        }
    }

    public void clear() {
        tamanho = 0;
        control.proximo = null;
    }

    public boolean isEmpty() {
        return tamanho == 0;
    }

    public String check(int n, char input[], char target[]) throws Exception {
        char[] operations = new char[2 * n];
        int inputIndex = 0;
        int opIndex = 0;

        for (char t : target) {
            while (inputIndex < n && (tamanho == 0 || top() != t)) {
                push(input[inputIndex++]);
                operations[opIndex++] = 'I';
            }

            if (tamanho != 0 && top() == t) {
                pop();
                operations[opIndex++] = 'R';
            } else {
                System.out.println("Impossible");
                break;
            }
        }

        return new String(operations, 0, opIndex);
    }
}