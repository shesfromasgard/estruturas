import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Deque<Music> deque = new Deque<Music>();

        try {
            deque.addFirst(new Music("Superman", "Eminem"));
            deque.addFirst(new Music("The Real Slim Shady", "Eminem"));
            deque.addFirst(new Music("Rap God", "Eminem"));
            deque.addFirst(new Music("Business", "Eminem"));
            deque.addFirst(new Music("Mockingbird", "Eminem"));
            deque.addFirst(new Music("Without Me", "Eminem"));
            deque.addLast(new Music("Lose Yourself", "Eminem"));
            deque.addLast(new Music("Forgot About Dre", "Dr. Dre, Eminem"));
            deque.addLast(new Music("Ass Like That", "Eminem"));
            deque.addLast(new Music("Till I Collapse", "Eminem"));
            deque.addLast(new Music("The Way I Am", "Eminem"));

            deque.print();

            deque.removeFirst();
            deque.removeLast();

            System.out.println("------------------------");

            deque.print();
            
        } catch(Exception ex) {
            System.out.println(ex.getMessage());
        }
    }
}
