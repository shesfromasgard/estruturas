public class Ex3 {
    public static int recur(int vet[], int resul, int index) {
        if(index == -1) {
            return resul;
        } else {
            return recur(vet, resul += vet[index], --index);
        }
    }

    public static int recur(int vet[], int size) {
        return recur(vet, 0, size);
    }
    public static void main(String[] args) {
        int[] vet = {12, 1, 5, 8, 21, 3, 17, 14, 1, 20, 7, 19, 6, 30, 10, 25, 9, 18, 22, 13, 16, 4, 2, 11, 15, 29, 27, 28, 24, 26, 23};

        System.out.println(recur(vet, vet.length - 1));
    }
}
