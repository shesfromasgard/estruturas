    public class Ex2 {

    int vet[] = new int[100];
    int count = 0;
    int last = 0;

    public static void main(String[] args) {
        Ex2 ex2 = new Ex2();
        ex2.principal();
    }

    public void principal() {
        int op;

        for (int i = 0; i < vet.length; i++) {
            op = operator();
            if (op == 1)
                insereInicio();
            else if (op == 2)
                insereFim();
            else
                insereMeio();

        }

        print();
    }

    public void print() {
        for (int i = 0; i < count; i++)
            System.out.println(vet[i]);

    }

    public int operator() {
        return (int) (Math.random() * 3) + 1;
    }

    public int aleatorio() {
        return (int) (Math.random() * 	2147483647) + -2147483648;
    }

    public void insereFim() {
        vet[count] = aleatorio();
        last = count;
        count++;
    }

    public void insereInicio() {
        if (count == 0)
            insereFim();
        else {
            for (int i = count; i > 0; i--)
                vet[i] = vet[i - 1];

            vet[0] = aleatorio();
            last = 0;
            count++;
        }
    }

    public void insereMeio() {
        if (count == 0 || last == 0)
            insereInicio();
        else {
            for (int i = count; i > last; i--)
                vet[i] = vet[i - 1];

            vet[last] = aleatorio();
            count++;
        }
    }
}
