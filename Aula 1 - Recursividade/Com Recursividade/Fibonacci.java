import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = -1;

        while(n < 0)
            n = sc.nextInt();

        System.out.println(recur(n));

        sc.close();
    }

    public static long recur(int n) {
        if(n == 0 || n == 1) 
            return n;
        else 
            return recur(n - 1) + recur(n - 2);
    }
}