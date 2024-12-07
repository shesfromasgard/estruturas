import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) { 
            int n = sc.nextInt();

            if(n == 0)
                break;

            char array[] = new char[n];

            for(int i = 0; i < n; ++i)
                array[i] = sc.next().charAt(0);

            char array1[] = new char[n];

            for(int i = 0; i < n; ++i)
                array1[i] = sc.next().charAt(0);

            System.out.println(check(n, array, array1));

        }

        sc.close();
    }

    static public String check(int n, char input[], char target[]) {
        char[] stack = new char[n];
        char[] operations = new char[2 * n];
        int top = -1;
        int inputIndex = 0;
        int opIndex = 0;

        for (char t : target) {
            while (inputIndex < n && (top == -1 || stack[top] != t)) {
                stack[++top] = input[inputIndex++];
                operations[opIndex++] = 'I';
            }

            if (top != -1 && stack[top] == t) {
                top--;
                operations[opIndex++] = 'R';
            } else
                return "Impossible";
        }
        return new String(operations, 0, opIndex);
    }
}
