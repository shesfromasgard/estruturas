import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {

            int n = sc.nextInt();

            if (n == 0) 
                break;
            
            while (true) {
                int[] sequence = new int[n];
                sequence[0] = sc.nextInt();
                
                if (sequence[0] == 0) 
                    break;
                
                for (int i = 1; i < n; i++)
                    sequence[i] = sc.nextInt();
                
                if (motherfucker(n, sequence))
                    System.out.println("Yes");
                else
                    System.out.println("No");
            }
        }
        
        sc.close();
    }

    private static boolean motherfucker(int n, int[] sequence) {
        int[] stack = new int[n];
        int top = -1;
        int current = 1;
        
        for (int i = 0; i < sequence.length; ++i) {

            while (current <= n && (top == -1 || stack[top] != sequence[i]))
                stack[++top] = current++;
            
            if (top != -1 && stack[top] == sequence[i])
                top--;
            else
                return false;
            
        }
        
        return true;
    }
}
