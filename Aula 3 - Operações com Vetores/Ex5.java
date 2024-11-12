public class Ex5 {
    public static void print(int vet[]) {
        boolean check[] = new boolean[vet.length];
        int value = -1;
        
        for(int i = 0; i < vet.length; ++i) {
            int minimum = 2147483647;
            for(int j = 0; j < vet.length; ++j) {
                if((vet[j] < minimum) && !check[j]) {
                    minimum = vet[j];
                    value = j;
                }
            }
            check[value] = true;
            System.out.println(minimum);
        }
    }

    public static void main(String[] args) {
        int[] vet = {12, 1, 5, 8, 21, 3, 17, 14, 1, 20, 7, 19, 6, 30, 10, 25, 9, 18, 22, 13, 16, 4, 2, 11, 15, 29, 27, 28, 24, 26, 23};

        print(vet);

    }
}
