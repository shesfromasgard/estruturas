import java.util.Scanner;

public class Ex2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = -1;

        while(n < 0)
            n = sc.nextInt();

        System.out.println(recur(n));

        sc.close();
    }

    public static long recur(int n) {
        if(n == 0)
            return 1;
        else if(n == 1)
            return 2;
        else 
            return 2 * recur(n - 1);
    }
}