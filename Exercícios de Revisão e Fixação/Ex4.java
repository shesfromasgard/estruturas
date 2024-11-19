public class Ex4 {
    static int vet[];
    static int size = 0;
    public static int[] comum(int vet1[], int vet2[], int size1, int size2) {
        vet = new int[size1 + size2];

        for(int i = 0; i < size1; ++i) {
            for(int j = 0; j < size2; ++j) {
                if(vet1[i] == vet2[j])
                    vet[size++] = vet1[i];

            }
        }
        return vet;
    }
    public static void main(String[] args) {
        int[] vet1 = {12, 1, 5, 8, 21, 3, 17, 14, 1, 20, 7, 19, 6, 30, 10, 25, 9, 18, 22, 13, 16, 4, 2, 11, 15, 29, 27, 28, 24, 26, 23};

        int[] vet2 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        int vetor[] = comum(vet1, vet2, vet1.length, vet2.length);

        for(int i = 0; i < size; ++i)
            System.out.println(vetor[i]);
    }
}
