import java.util.Scanner;

public class Ex1Fibonacci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num = -1;

        while(num < 0)
            num = sc.nextInt();

        if(num == 0 || num == 1) 
            System.out.println(num);
        else if(num == 2)
            System.out.println(1);
        else {
            int vet[] = new int[num];
            vet[0] = 1;
            vet[1] = 1;

            for(int i = 2; i < num; i++)
                vet[i] = vet[i - 1] + vet[i - 2];

            System.out.println(vet[num - 1]);
        }

        sc.close();
    }
}
