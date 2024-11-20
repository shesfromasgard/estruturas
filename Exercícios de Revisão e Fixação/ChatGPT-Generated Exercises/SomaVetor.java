public class SomaVetor {
    public static int soma(int vet[], int index) {
        if(index == 0)
            return vet[0];
        else
            return vet[index] + soma(vet, --index);
    }

    public static int soma(int vet[]) {

        return soma(vet, vet.length - 1);
    }

    public static void main(String[] args) {
        int[] vet = {12, 1, 5, 8, 21, 3, 17, 14, 1, 20, 7, 19, 6, 30, 10, 25, 9, 18, 22, 13, 16, 4, 2, 11, 15, 29, 27, 28, 24, 26, 23};

        System.out.println(soma(vet));
    }
}
