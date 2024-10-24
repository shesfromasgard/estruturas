import java.util.Scanner;

public class Ex3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = -1;

        while(n < 0)
            n = sc.nextInt();

        try {
            System.out.println(recur(n));
        } catch(Exception ex) {
            System.out.println(ex.getMessage());
        }

        sc.close();
    }

    public static boolean recur(int n) throws Exception {
        return recur(n, n - 1);
    }

    public static boolean recur(int n, int d) throws Exception {
        if(n < 0)
            throw new Exception("Digite um número positivo.");
        if(n == 1)
            return false;
        if (d <= 1)
            return true;
        if (n % d == 0)
            return false;

        return recur(n, d - 1);
    }
}
