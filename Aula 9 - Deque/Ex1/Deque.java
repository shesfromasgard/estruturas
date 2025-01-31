public class Deque <T> {
    public int tam = 0;
    public NodeDeque<T> cabeca = new NodeDeque<T>();

    public void addFirst(T element) {
        NodeDeque<T> no = new NodeDeque<>();
        no.setInfo(element);
        if(isEmpty()) {
            cabeca.setProximo(no);
            cabeca.setAnterior(no);
            no.setAnterior(cabeca);
            no.setProximo(cabeca);
        } else {
            no.setProximo(cabeca.getProximo());
            no.setAnterior(cabeca);
            cabeca.getProximo().setAnterior(no);
            cabeca.setProximo(no);
        }

        tam++;
    }

    public void addLast(T element) {
        if(isEmpty()) {
            addFirst(element);
        } else {
            NodeDeque<T> no = new NodeDeque<>();
            no.setInfo(element);
            no.setAnterior(cabeca.getAnterior());
            no.setProximo(cabeca);
            cabeca.getAnterior().setProximo(no);
            cabeca.setAnterior(no);

            tam++;
        }
    }

    public T removeFirst() throws Exception {
        if(isEmpty())
            throw new Exception("Deque vazia.");
        else {
            T tmp = cabeca.getProximo().getInfo();
            cabeca.setProximo(cabeca.getProximo().getProximo());
            cabeca.getProximo().setAnterior(cabeca);

            tam--;
            return tmp;
        }
    }

    public T removeLast() throws Exception {
        if(isEmpty())
            throw new Exception("Deuque vazia.");
        else {
            T tmp = cabeca.getAnterior().getInfo();
            cabeca.setAnterior(cabeca.getAnterior().getAnterior());
            cabeca.getAnterior().setProximo(cabeca);

            tam--;
            return tmp;
        }
    }

    public void print() throws Exception {
        if(isEmpty())
            throw new Exception("Deque vazia.");
        else {
            NodeDeque<T> tmp = cabeca.getProximo();
            while(tmp != cabeca) {
                System.out.println(tmp.getInfo());
                tmp = tmp.getProximo();
            }
        }
    }

    public boolean isEmpty() {
        return tam == 0;
    }
}
