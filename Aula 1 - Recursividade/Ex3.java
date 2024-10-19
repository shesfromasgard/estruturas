import java.util.Scanner;

public class Ex3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = -1;

        while(n < 0)
            n = sc.nextInt();

        System.out.println(recur(n, n - 1));

        sc.close();
    }

    public static boolean recur(int n, int d) {
        if(n == 1)
            return false;
        if (d <= 1)
            return true;
        if (n % d == 0)
            return false;

        return recur(n, d - 1);
    }
}