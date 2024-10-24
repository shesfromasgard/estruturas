import java.util.Scanner;

public class Ex1Fatorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();
        
        try {
            System.out.println(fatorial(num));
        }
        catch(Exception ex) {
            System.out.println(ex.getMessage());
        }
        
        sc.close();
    }
    
    public static int fatorial(int num) throws Exception {
        int cont = num - 1;

        if(num < 1)
            throw new Exception("Digite um número positivo maior que zero.");

        if(num == 1 || num == 0)
            return 1;
        
        while(cont != 0) {
            num *= cont;
            cont--;
        }

        return num;

    }
}
