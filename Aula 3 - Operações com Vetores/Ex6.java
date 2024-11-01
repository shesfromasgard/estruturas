public class Ex6 {

    static int vet[] = new int[100];
    static int vet1[] = new int[vet.length];
    public static void main(String[] args) {
        
        preencherVetores();

        int vetor[] = algoai(vet, vet1);

        for(int i = 0; i < vetor.length; i++)
            System.out.println(vetor[i]);
        
    }
    
    public static void preencherVetores() {
        for(int i = 0; i < vet.length; i++) {
            vet[i] = aleatorio();
            vet1[i] = aleatorio();
        }
    }
    
    public static int[] algoai(int vet[], int vet1[]) {
        int vet2[] = new int[vet.length];

        int count = 0;
        int count1 = 0;

        for(int i = 0; i < vet2.length; i++) {
            if(aleatorio() % 2 == 0)
                vet2[i] = vet[count++];
            else 
                vet2[i] = vet1[count1++];
        }

        return vet2;

    }

    public static int aleatorio() {
        return (int) (Math.random() * 	2147483647) + 0;
    }
}
