public class Ex1 {
    public static void main(String[] args) {
        
        int vet [] = new int[10];
        int n = 0;

        for(int i = 0; i < vet.length; i++) {
            vet[i] = (int) (Math.random() * 100) + 0;
            System.out.println(vet[i] + " ");
        }

        for(int i = 0; i < vet.length; i++) {
            if(vet[i] % 2 == 0) {
                vet[n] = vet[i];
                n++;
            }
        }

        System.out.println("\n");

        for(int i = 0; i < n; i++)
            System.out.println(vet[i]);

    }
}