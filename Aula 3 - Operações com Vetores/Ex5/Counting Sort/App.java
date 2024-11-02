public class App {

    public static void main(String[] args) {
        int[] vet = {12, 1, 5, 8, 21, 3, 17, 14, 1, 20, 7, 19, 6, 30, 10, 25, 9, 18, 22, 13, 16, 4, 2, 11, 15, 29, 27, 28, 24, 26, 23};

        print(vet);
    }

    public static void print(int vet[]) {
        int MAX = returnMax(vet);
        Integer vetor[] = new Integer[MAX + 1];

        for (int i = 0; i < vetor.length; i++) {
            vetor[i] = 0;
        }

        for (int i = 0; i < vet.length; ++i) {
            vetor[vet[i]] += 1;
        }

        for (int i = 0; i < vetor.length; ++i) {
            for (int j = 0; j < vetor[i]; ++j)
                System.out.println(i);
        }
    }

    public static int returnMax(int vet[]) {
        int max = vet[0];
        for (int i = 1; i < vet.length; ++i) {
            if (vet[i] > max) {
                max = vet[i];
            }
        }

        return max;
    }
}
