public class Ex5 {
    public static void print(int vet[]) {
        int last = -2147483648;
        for(int j = 0; j < vet.length; ++j) {
            int minimum = 2147483647;
            for(int i = 1; i < vet.length; ++i)
                if((vet[i] > last) && vet[i] < minimum)
                    minimum = vet[i];

            if(minimum != 2147483647) {
                System.out.println(minimum);
                last = minimum;
            }
        }
        
    }
    public static void main(String[] args) {
        int[] vet = {12, 1, 5, 8, 21, 3, 17, 14, 1, 20, 7, 19, 6, 30, 10, 25, 9, 18, 22, 13, 16, 4, 2, 11, 15, 29, 27, 28, 24, 26, 23};

        print(vet);
    }
}
