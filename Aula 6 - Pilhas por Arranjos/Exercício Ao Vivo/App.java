import java.util.Scanner;

public class App {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        sc.nextLine();

        String array[] = new String[n];

        for(int i = 0; i < n; ++i) {
            array[i] = sc.nextLine();
            System.out.println(pop(array[i]));
        }

        sc.close();
        
    }

    static public char[] push(String word) {
        char array[] = new char[word.length()];
        for(int i = 0; i < array.length; ++i)
            array[i] = word.charAt(i);

        return array;
    }

    static public int pop(String word) {
        char array[] = push(word);
        char stack[] = new char[array.length];

        int current = 0;
        int top = -1;
        int count = 0;

        for(int i = array.length - 1; i >= 0; --i) {
            if(array[current] == '<')
                stack[++top] = array[current++];
            else if(top != -1 && (stack[top] == '<' && array[current] == '>')) {
                count++;
                current++;
                top--;
            } else {
                current++;
            }
        }

        return count;

    }
}
