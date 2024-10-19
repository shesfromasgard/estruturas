import java.util.Scanner;

public class Fatorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = -1;

        while(n < 0)
            n = sc.nextInt();

        System.out.println(recur(n, 1));

        sc.close();
    }

    public static long recur(int n, long resul) {
        if(n == 0 || n == 1) 
            return resul;
        else 
            return recur(n - 1, resul*=n);
    }
}