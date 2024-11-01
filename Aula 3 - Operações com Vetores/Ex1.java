public class Ex1 {
    
    static int n = 10;

    static int vet[];

    public static void main(String[] args) {
        
        vet = aleatorio();
        
        System.out.println("Vetor padrão:\n");
        print(vet);

        vet = remove(vet);

        System.out.println("\nVetor sem números pares:\n");
        print(vet);
        
    }
    
    public static int[] aleatorio() {
        int vet [] = new int[10];
        
        for(int i = 0; i < vet.length; i++)
        vet[i] = (int) (Math.random() * 100) + 0;
        
        return vet;
        
    }
    
    public static void print(int vet[]) {
        for(int i = 0; i < n; i++)
            System.out.println(vet[i]);
    }
    
    public static int[] remove(int vet[]) {

        n = 0;

        for(int i = 0; i < vet.length; i++) {
            if(vet[i] % 2 == 1) {
                vet[n] = vet[i];
                n++;
            }
        }

        return vet;
        
    }
}
