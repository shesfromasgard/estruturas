import java.util.Scanner;

public class Ex2TresMaiores {
    // Complexidade O(n) ou linear.
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
    
        long vet[] = {850000, 24556, -55441};
    
        try{

        long vetor[] = recur(vet);

        for(int i = 0; i < vetor.length; i++)
            System.out.println(vetor[i]);

        } catch(Exception ex) {
            System.out.println(ex.getMessage());
        }
        
        sc.close();
        
    }
    public static long[] recur(long vet[]) throws Exception {

        Long n1 = null, n2 = null, n3 = null;

        for (int i = 0; i < vet.length; i++) {
            if (n1 == null || vet[i] > n1) {
                n3 = n2;
                n2 = n1;
                n1 = vet[i];
            } else if (n2 == null || (vet[i] > n2 && vet[i] != n1)) {
                n3 = n2;
                n2 = vet[i];
            } else if (n3 == null || (vet[i] > n3 && vet[i] != n2 && vet[i] != n1)) {
                n3 = vet[i];
            }
        }

        if(n1 == null && n2 == null && n3 == null)
            throw new Exception("Erro.");
        else if (n3 == null && n2 == null) {
            long vetor[] = {n1};
            return vetor;
        } else if(n3 == null) {
            long vetor1[] = {n1, n2};
            return vetor1;
        }
        long vetor2[] = {n1, n2, n3};

        return vetor2;

    }
}
