import java.util.Scanner;

public class Ex4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = 0;
        int n1 = 0;
        
        n = sc.nextInt();
        n1 = sc.nextInt();

        try {
            System.out.println(recur(n, n1));
        } catch(Exception ex) {
            System.out.println(ex.getMessage());
        }

        sc.close();
    }

    public static long recur(int n, int n1) throws Exception {
        if (n == 0 || n1 == 0)
            return 0;
        else if(n1 < 0 || n < 0)
            throw new Exception("Digite um número positivo.");
        else
           return n1 + recur(n - 1, n1);
    }
}
