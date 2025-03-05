import java.util.ArrayList;

public class Back {
    No root = null;

    public void add(No no, int element) {
        if(root == null)
            root = new No(element);
        else
            if(element < no.element)
                if(no.esquerda == null)
                    no.esquerda = new No(element);
                else
                    add(no.esquerda, element);
            else
                if(no.direita == null)
                    no.direita = new No(element);
                else
                    add(no.direita, element);
    }

    public void add(int element) {
        add(root, element);
    }

    public ArrayList<Integer> paradaLa() {
        ArrayList<Integer> array = new ArrayList<>();
        paradaLa(root, array, 0);
        return array;
    }

    private void paradaLa(No no, ArrayList<Integer> array, int altura) {
        if (no == null) return;

        if (altura >= array.size()) {
            array.add(no.element);
        } else {
            for (int i = 0; i < array.size(); i++) {
                if (i == altura) {
                    if (array.get(i) > no.element) {
                        array.set(i, no.element);
                    }
                    break;
                }
            }
        }

        paradaLa(no.esquerda, array, altura + 1);
        paradaLa(no.direita, array, altura + 1);
    }
}
