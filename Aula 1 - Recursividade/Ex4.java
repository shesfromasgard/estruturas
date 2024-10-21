import java.util.Scanner;

public class Ex4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = 0;
        int n1 = 0;

        while(n < 0)
            n = sc.nextInt();

        while(n1 < 0)
            n1 = sc.nextInt();

        System.out.println(recur(n, n1));

        sc.close();
    }

    public static long recur(int n, int n1) {
        if (n == 0 || n1 == 0)
            return 0;
        else
           return n1 + recur(n - 1, n1);
    }
}
